package com.testAutomation.Java;

public class JaggedArrays {

    //column size is not fixed for jagged

    public static void main(String[] args) {

        int[][] array1=new int[3][];//declaration of jagged array

        array1[0]=new int[3]; //first row 3 elements

        array1[1]=new int[5];

        array1[2]=new int[4];

        System.out.println(array1.length);
        System.out.println(array1[0].length);
        System.out.println(array1[1].length);
        System.out.println(array1[2].length);

        array1[0][0]=10;
        array1[0][1]=20;
        array1[0][2]=30;

        array1[1][0]=110;
        array1[1][1]=210;
        array1[1][2]=310;
        array1[1][3]=210;
        array1[1][4]=310;

        array1[2][0]=31;
        array1[2][1]=320;
        array1[2][2]=330;
        array1[2][3]=340;
//
//        int[][] array2={
//                {10,20},
//                {11,12,13},
//                {14,15,16,17}
//        };

    for(int i=0;i<array1.length;i++){

        for(int j=0;j<array1[i].length;j++){

            System.out.print(array1[i][j]+" ");

        }
        System.out.println();

    }



    }
}
