package com.gh.sd.creationalpatterns.abstactfactory.gcp;

import com.gh.sd.creationalpatterns.abstactfactory.Instance;
import com.gh.sd.creationalpatterns.abstactfactory.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute Engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute Engine instance stopped");
    }
}
