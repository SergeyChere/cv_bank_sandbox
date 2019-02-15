package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.implement.RegistrationHeadHunterImpl;
import com.cvbank.application.DTO.implement.RegistrationJobSeekerImpl;
import com.cvbank.application.controller.RegistrationController;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationControllerImpl implements RegistrationController {


    public void RegistrationSeeker(@RequestBody RegistrationJobSeekerImpl request) {

    }

    public void RegistrationHunter(@RequestBody RegistrationHeadHunterImpl request) {

    }
}
