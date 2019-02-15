package com.cvbank.application.DTO.implement;

import com.cvbank.application.DTO.SearchCV;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

/*
 *       TODO: Need rename this class. I don't understand by his name what he does
 *                                                                      Denis
 */

public class SearchCvRequest implements SearchCV {

    private String position;
    private String profArea;
    private List <String> regions;
    private List <String> skills;
    private Double minSalary;
    private Double maxSalary;
    private String city;
    private String citizenship; //todo think about Type

}
