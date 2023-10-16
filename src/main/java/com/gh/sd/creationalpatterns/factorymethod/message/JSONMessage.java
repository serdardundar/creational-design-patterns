package com.gh.sd.creationalpatterns.factorymethod.message;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
