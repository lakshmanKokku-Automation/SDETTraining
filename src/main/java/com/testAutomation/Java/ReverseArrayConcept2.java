package com.testAutomation.Java;

public class ReverseArrayConcept2 {

    public static void main(String[] args) {

        int[] array1={10,20,30,40,50};

        int[] array2=new int[array1.length];

        int j=0;
        for(int i=array1.length-1;i>=0;i--){

            array2[j]=array1[i];

               j++;

            }


        for(int k:array2){

            System.out.print(k+" ");
        }

    }
}
