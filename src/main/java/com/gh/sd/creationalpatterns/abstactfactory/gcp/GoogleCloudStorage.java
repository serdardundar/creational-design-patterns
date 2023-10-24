package com.gh.sd.creationalpatterns.abstactfactory.gcp;

import com.gh.sd.creationalpatterns.abstactfactory.Storage;

// Represents a concrete product in a family "Amazon Web Services"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMb) {
        // Use aws s3 api
        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcps1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
