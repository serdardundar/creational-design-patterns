package com.gh.sd.creationalpatterns.abstactfactory;
// Represents an abstract product
public interface Instance {

    enum Capacity {MICRO, SMALL, LARGE}

    void start();
    void attachStorage(Storage storage);
    void stop();
}
