package com.gh.sd.creationalpatterns.factorymethod;

import com.gh.sd.creationalpatterns.factorymethod.message.JSONMessage;
import com.gh.sd.creationalpatterns.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
