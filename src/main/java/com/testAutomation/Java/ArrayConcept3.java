package com.testAutomation.Java;

public class ArrayConcept3 {

    public static void main(String[] args) {

        int[] array1={10,20,30,99,78,2,1,25};
        //output=99
        int max=array1[0];

        for(int i=1;i<array1.length;i++){
            if(array1[i]>max){
                max=array1[i];
            }
        }
        System.out.println(max);
    }
}
