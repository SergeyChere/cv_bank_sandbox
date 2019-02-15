package com.cvbank.application.DTO.implement;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

/*
 *       TODO: Need rename this class. I don't understand by his name what he does
 *                                                                        Denis
 */

public class SearchCvResponse {

    private String userName;
    private String phone;
    private String email;
    private String position;
    private String city;
    private Integer age;
    private List <String> skills;
}
