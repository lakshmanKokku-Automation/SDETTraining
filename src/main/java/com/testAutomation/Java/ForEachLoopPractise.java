package com.testAutomation.Java;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopPractise {

    public static void main(String[] args) {

        int[] array1={1,2,3,4,5,6,7};
        int sum=0;

        //for(Datatype varaible:collection)
        //enhanced for loop
        for(int value:array1){
            sum=sum+value;

        }

        System.out.println(sum);

        List<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for(String animal :animals){

            System.out.println(animal);
        }
    }



}
