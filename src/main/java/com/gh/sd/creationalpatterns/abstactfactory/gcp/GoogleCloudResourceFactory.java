package com.gh.sd.creationalpatterns.abstactfactory.gcp;

import com.gh.sd.creationalpatterns.abstactfactory.ResourceFactory;
import com.gh.sd.creationalpatterns.abstactfactory.Instance;
import com.gh.sd.creationalpatterns.abstactfactory.Storage;

// Factory implementation for Google Cloud Service
public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleCloudStorage(capacityInMb);
    }
}
