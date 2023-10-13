package com.gh.sd.creationalpatterns.builder.two;

import static java.util.Calendar.OCTOBER;
import com.gh.sd.creationalpatterns.builder.one.Address;
import com.gh.sd.creationalpatterns.builder.one.User;

import java.time.LocalDate;
import java.util.Calendar;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        // Client has to provide director with concrete builder
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);


        //java native builder pattern example
        Calendar calendar = new Calendar.Builder().setDate(1985, OCTOBER, 15).build();
        System.out.println(calendar.getTime());
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .withBirthday(user.getBirthDate())
            .withAddress(user.getAddress()).build();
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
