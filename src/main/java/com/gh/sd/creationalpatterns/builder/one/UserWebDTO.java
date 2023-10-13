package com.gh.sd.creationalpatterns.builder.one;

//A product in builder pattern
public record UserWebDTO(String name, String address, String age) implements UserDTO {

    @Override
    public String toString() {
        return "\nname=" + name + "\nage=" + age + "\naddress=" + address;
    }
}
