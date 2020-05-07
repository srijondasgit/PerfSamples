package com.srijon.webservice.utils;

import org.springframework.stereotype.Service;

@Service
public class ValidateUtil {
    public boolean isValueUnder5000(Integer value){
        return value<5000;
    }
}
