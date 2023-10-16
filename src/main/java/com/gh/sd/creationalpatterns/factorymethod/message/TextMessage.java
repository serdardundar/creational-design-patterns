package com.gh.sd.creationalpatterns.factorymethod.message;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text";
    }
}
