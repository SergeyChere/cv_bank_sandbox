package com.cvbank.application.DTO.implement;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginImpl implements com.cvbank.application.DTO.Login {

    private String login;
    private String password;

}
