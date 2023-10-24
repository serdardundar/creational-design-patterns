package com.gh.sd.creationalpatterns.abstactfactory;

import com.gh.sd.creationalpatterns.ResourceFactory;
import com.gh.sd.creationalpatterns.abstactfactory.aws.AwsResourceFactory;
import com.gh.sd.creationalpatterns.abstactfactory.gcp.GoogleCloudResourceFactory;

public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory resourceFactory) {
        this.factory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity cap, int storageInMb) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageInMb);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.MICRO, 100);
        i1.start();
        i1.stop();

        System.out.println("***********************************************");

        Client gcp = new Client(new GoogleCloudResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.SMALL, 150);
        i2.start();
        i2.stop();
    }
}
