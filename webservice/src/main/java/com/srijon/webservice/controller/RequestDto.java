package com.srijon.webservice.controller;

import java.util.ArrayList;
import java.util.List;

public class RequestDto {
    List<Integer>numbersList = new ArrayList<>();
    Integer numberToFind;


    public List<Integer> getNumbersList() {
        return numbersList;
    }

    public void setNumbersList(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public Integer getNumberToFind() {
        return numberToFind;
    }

    public void setNumberToFind(Integer numberToFind) {
        this.numberToFind = numberToFind;
    }
}

