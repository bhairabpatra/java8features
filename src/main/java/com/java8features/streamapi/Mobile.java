package com.java8features.streamapi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class Mobile {

    @Autowired
    MobileService mobileService;
    public void getMobileInfo() {

        MobileService mobileService = new MobileService();
        List<MobileModel> mobiles = mobileService.getMobileData();
        List<MobileModel> nameStartWithA  = mobiles.stream().filter(name -> name.getMobileName().startsWith("a")).toList();



        nameStartWithA.forEach(name -> System.out.println(name.getMobileName() + " - length - " + name.getMobileName().length()));
//        System.out.println(nameStartWithA);

    }

    public static void main(String[] args) {
        System.out.println("This is mobile app");
        Mobile mobile = new Mobile();
        mobile.getMobileInfo();
    }
}
