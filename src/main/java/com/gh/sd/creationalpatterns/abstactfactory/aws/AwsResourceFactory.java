package com.gh.sd.creationalpatterns.abstactfactory.aws;

import com.gh.sd.creationalpatterns.ResourceFactory;
import com.gh.sd.creationalpatterns.abstactfactory.Instance;
import com.gh.sd.creationalpatterns.abstactfactory.Storage;

// Factory implementation for Amazon Web Services
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
