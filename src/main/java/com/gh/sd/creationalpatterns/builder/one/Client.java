package com.gh.sd.creationalpatterns.builder.one;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .withBirthDate(user.getBirthDate())
            .withAddress(user.getAddress())
            .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthDate(LocalDate.of(1985, 10, 15));
        user.setFirstName("Serdar");
        user.setLastName("Dundar");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("Sesame Street");
        address.setCity("Istanbul");
        address.setState("Turkey");
        address.setZipcode("34000");
        user.setAddress(address);
        return user;
    }
}
