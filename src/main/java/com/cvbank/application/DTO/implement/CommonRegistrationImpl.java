package com.cvbank.application.DTO.implement;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CommonRegistrationImpl {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate birthday;

    CommonRegistrationImpl() {
    }

    CommonRegistrationImpl(String firstName, String lastName, String email, String phone, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }
}
