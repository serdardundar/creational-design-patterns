package com.gh.sd.creationalpatterns.singleton;

/**
 * Lazy singleton using lazy initialization holder class. This ensures that we have a lazy initialization
 * without worrying about synchronization.
 *
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static final class RegistryHolder {
        private static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
