package com.gh.sd.creationalpatterns;

import com.gh.sd.creationalpatterns.abstactfactory.Instance;
import com.gh.sd.creationalpatterns.abstactfactory.Storage;

//Abstract factory with methods defined for each object type
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMb);
}
