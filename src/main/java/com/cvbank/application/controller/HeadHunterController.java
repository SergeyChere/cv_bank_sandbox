package com.cvbank.application.controller;

import com.cvbank.application.DTO.implement.SearchCvRequest;
import com.cvbank.application.DTO.implement.SearchCvResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hh")
public interface HeadHunterController {

    @PostMapping("/search_cv_by_criteria")
    List <SearchCvResponse> searchCvByCriteria(SearchCvRequest request);

    @PostMapping("/save_list_cv")
    void saveListCv(List <Integer> cvs);

}
