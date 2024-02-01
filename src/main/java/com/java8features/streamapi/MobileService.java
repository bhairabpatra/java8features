package com.java8features.streamapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MobileService {

    List<MobileModel> mobileModel = new ArrayList<>();

    public List<MobileModel> getMobileData() {
        mobileModel.add(new MobileModel(1, "a12pro", "apple", 34567, 10));
        mobileModel.add(new MobileModel(2, "13", "apple", 34567, 10));
        mobileModel.add(new MobileModel(3, "14pro", "apple", 34567, 10));
        mobileModel.add(new MobileModel(4, "11pro", "apple", 34567, 10));
        mobileModel.add(new MobileModel(5, "15pro", "apple", 34567, 10));
        mobileModel.add(new MobileModel(6, "a10", "apple", 34567, 10));
        return mobileModel;
    }
}
