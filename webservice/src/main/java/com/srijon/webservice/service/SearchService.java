package com.srijon.webservice.service;

import com.srijon.webservice.controller.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srijon.webservice.utils.*;

@Service
public class SearchService {


    @Autowired
    private ValidateUtil validateUtil;

    public String searchValue(RequestDto requestDto){
        if(!validateUtil.isValueUnder5000(requestDto.getNumberToFind())){
            return "bad request";
        }
        //if(requestDto.getNumbersList().stream().filter(a -> a == requestDto.getNumberToFind()).findAny().isPresent()){
        Integer numberToFind = requestDto.getNumberToFind();
        if(requestDto.getNumbersList()
                .stream().parallel()
                .anyMatch(a -> a.equals( numberToFind ))){ //  filter(a -> a == requestDto.getNumberToFind()).findAny().isPresent()){
            return "Found";
        }else {
            return "Not Found";
        }
     /*   if(requestDto.getNumbersList().contains(requestDto.getNumberToFind()))
        {
            return "Found";
        }else{
            return "Not Found";
        }*/
    }


}
