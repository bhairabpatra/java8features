package com.java8features.streamapi;

import com.java8features.functionalinterface.UserModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public void users(){
        List<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel(1, "zbhairab", "bhairab@gmail.com"));
        userModels.add(new UserModel(2, "priyanka", "priyanka@gmail.com"));
        userModels.add(new UserModel(3, "kuna", "Kuna@gmail.com"));
        userModels.add(new UserModel(4, "gugi", "Gugi@gmail.com"));
        userModels.add(new UserModel(5, "shree", "Shree@gmail.com"));

//        Example of forEach
//        userModels.stream().forEach(users -> System.out.println(users.getName()));
//        Example of for loop
//        for (UserModel userModel:userModels){
//            System.out.println(userModel);
//        }
//       Stream<UserModel> userModelList =  userModels.stream().filter(user -> user.getName().startsWith("s"));
//        userModelList.forEach(user -> System.out.println(user.getName()));

//        List<UserModel> userModelList =  userModels.stream().filter(user -> (user.getName().startsWith("s") && user.getName().endsWith("e")) ).toList();
//        System.out.println(userModelList);

//        Collections.sort(userModels, new myComp());
//        System.out.println(userModels);

        Collections.sort(userModels, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        userModels.forEach(System.out::println);
//        System.out.println(userModels);
    }

    public static void main(String args[]){
        System.out.println("This is call");
        StreamAPIExample streamAPIExample = new StreamAPIExample();
        streamAPIExample.users();
    }


//    class  myComp implements Comparator<UserModel> {
//        @Override
//        public int compare(UserModel o1, UserModel o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    }
}


