package com.gh.sd.creationalpatterns.factorymethod;

import com.gh.sd.creationalpatterns.factorymethod.message.Message;
import com.gh.sd.creationalpatterns.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
