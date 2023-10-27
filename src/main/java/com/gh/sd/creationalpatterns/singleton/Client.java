package com.gh.sd.creationalpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry == registry2);

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistryWithDCL2 == lazyRegistryWithDCL);

        // class not initialized yet
        LazyRegistryIODH lazyRegistryIODH;
        System.out.println("****************************");
        // class is initialized here
        LazyRegistryIODH.getInstance();
        System.out.println("**************-----------**************");
        lazyRegistryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();
        // constructor will be called only once
        System.out.println(lazyRegistryIODH == lazyRegistryIODH2);
    }
}
