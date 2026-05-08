package com.testAutomation.Java;

public class ReverseStringArray {

    public static void main(String[] args) {

        int[] array1={10,20,2,3,78,99,44,12,10,9,100};

        //output 78 (second height number)

        int max1=0,max2=0;

        if(array1[0]>array1[1]){
            max1=array1[0];
            max2=array1[1];
        }else{
            max1=array1[1];
            max2=array1[0];

        }

        for(int i=2;i<array1.length;i++){

            if(array1[i]>max1){
                max2=max1;
                max1=array1[i];
            }else if(array1[i]>max2){
                max2=array1[i];

            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
