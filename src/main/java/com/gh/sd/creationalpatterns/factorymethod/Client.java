package com.gh.sd.creationalpatterns.factorymethod;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        // Check the concrete Message class   
        System.out.println(creator.getMessage().getContent());
    }
}
