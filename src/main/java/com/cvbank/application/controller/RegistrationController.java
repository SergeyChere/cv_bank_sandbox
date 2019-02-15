package com.cvbank.application.controller;

import com.cvbank.application.DTO.implement.RegistrationHeadHunterImpl;
import com.cvbank.application.DTO.implement.RegistrationJobSeekerImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public interface RegistrationController {

    @PostMapping
    void RegistrationSeeker(RegistrationJobSeekerImpl request);

    @PostMapping
    void RegistrationHunter(RegistrationHeadHunterImpl request);
}
