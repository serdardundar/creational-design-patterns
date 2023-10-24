package com.gh.sd.creationalpatterns.abstactfactory.aws;

import com.gh.sd.creationalpatterns.abstactfactory.Storage;

// Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMb) {
        // Use aws s3 api
        System.out.println("Allocated " + capacityInMb + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
