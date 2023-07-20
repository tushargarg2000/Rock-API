package com.acciojob.RockApis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class ControllerClass {

    @Autowired
    private ServiceClass serviceClassObj;

    @PostMapping("/addTravelItem")
    public String addTravelItem(@RequestBody TravelList travelList){

        String ans = serviceClassObj.addTravelListItem(travelList);
        return ans;
    }

    @GetMapping("/getTravelPlacesList")
    public List<String> getTravelPlacesList(@RequestParam("userId")Integer userId){



    }



}
