package com.srijon.webservice.controller;

import com.srijon.webservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(method=RequestMethod.GET, value="/")
    public String getHelloWorld(){
        return "Webservice says hello";
    }

    @RequestMapping(method=RequestMethod.POST, value="/findSomething")
    //[123,112,332, ....], 112  ---> found
    // 333 ---> not found
    public String findSomething(@RequestBody RequestDto request){
        System.out.println("request" + request.numberToFind + ", "+ request.numbersList );
        return searchService.searchValue(request);
        //return "Webservice says hello";
    }

}
