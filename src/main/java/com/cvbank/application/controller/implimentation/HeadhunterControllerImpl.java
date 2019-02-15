package com.cvbank.application.controller.implimentation;

import com.cvbank.application.DTO.implement.SearchCvRequest;
import com.cvbank.application.DTO.implement.SearchCvResponse;
import com.cvbank.application.controller.HeadHunterController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class HeadhunterControllerImpl implements HeadHunterController {


    public List <SearchCvResponse> searchCvByCriteria(@RequestBody SearchCvRequest request){
        return null;
    }


    public void saveListCv(List <Integer> cvs) {

    }


}
