package com.cvbank.application.controller;

import com.cvbank.application.DTO.implement.LoginImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface LoginController {
    void login(LoginImpl request);

    void logout(String token);
}
