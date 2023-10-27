package com.gh.sd.creationalpatterns.singleton;

/**
 * This class demonstrates singleton pattern using Double-Checked Locking or "classic" singleton.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {}

    private static volatile LazyRegistryWithDCL INSTANCE;

    public static synchronized LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
