package com.testAutomation.Java;

public class RoundingAnArray {
    public static void main(String[] args) {
        int[] array1={10,20,30,4,5,6};
        //output = 20,30,4,5,6,10

        int temp=array1[0];

        for(int i=1;i<array1.length;i++){

            array1[i-1]=array1[i];

        }

        array1[array1.length-1]=temp;

        for(int i:array1){

            System.out.print(i+" ");

        }

    }


}
