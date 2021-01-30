package com.aiods.java8tojava15;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
       // Java 8 to Java 15 New feature

       // Java 8 : Functional Programming ,Streams ,Optional
         //Stream.of("hello","hi").map(st->st+" there").forEach(System.out::println); //:: method reference

//        Optional<User> user = Optional.empty();//Create an empty Optional
//
//         if (user.isPresent()){
//             User userP=user.get();
//             String name = userP.getName();
//         }else {
//             System.out.println("User is empty");
//         }
        User user1 = new User("Sunil");
        Optional<User> userOptional = Optional.ofNullable(user1);

        if (userOptional.isPresent()){
            User userP=userOptional.get();
            String name = userP.name();
            System.out.println("user name is "+name);
        }else {
            System.out.println("User is empty");
        }


       // Java 9 : JShell (),Factory Methods for Immutable Collections
          //jshell
        //List<String> list = Arrays.asList("hello", "there"); //List,Set,Map
        //List<String> list1 =List.of("hello", "there");



       // Java 10: Type Inference with var

        var list2 =List.of("hello", "there");

        // Java 11: Single Source File Launch
          // Directly  run with java without running  javac
       // System.out.println("hello java 11");
       // Java 14: Switch Expression
//        int i =1;
//        var switchValue=switch (i){
//            case 1,2->"one or 2";
//            default -> "no match";
//
//        };
       // System.out.println(switchValue);
       // Java 15: Multi-line Strings
        String multiline= """
                hi
                there
                """;
        System.out.println(multiline);
        // instanceof without Cast,
//        Double a=45.0;
//        if (a instanceof Double){
//            a=a+90;
//        }
        // Data Classes: record(preview),Sealed(preview) classes
         //User class can we make record
      //  java --enable-preview --source 15  Main.java
        //With the sealed keyword,
        // we  can restrict which classes can extend a given class or interface

    }
}
record User(String name){}

//class  User{
//    private  String name;
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

