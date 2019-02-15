package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.implement.LoginImpl;
import com.cvbank.application.controller.LoginController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


public class LoginControllerImpl implements LoginController {

    public void login(@RequestBody LoginImpl request) {

    }

    public void logout(@RequestHeader("token") String token) {

    }
}
