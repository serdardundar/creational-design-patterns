package com.gh.sd.creationalpatterns.abstactfactory.aws;

import com.gh.sd.creationalpatterns.abstactfactory.Instance;
import com.gh.sd.creationalpatterns.abstactfactory.Storage;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        // Map capacity to ec2 instance types. Use aws API to create instances
        System.out.println("Created a " + capacity + " Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
