package com.testAutomation.Java;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array1={10,20,30,40,50};

        int[] result=reverseArray(array1);

        for(int res:result){
            System.out.print(res+" " );
        }

    }
    public static int[] reverseArray(int[] array2){

        int[] array3=new int[array2.length];

        for(int i=0,j=array3.length-1;i<array2.length;i++,j--){

            array3[j]=array2[i];
        }
        return array3;

    }
}
