package com.testAutomation.Java;
import java.util.Arrays;

public class ArraysConcept {

    public static void main(String[] args) {
        //java is not 100 percent object oriented language
        int i=100;
        int j=20;
        int k=30;
        //System.out.println(i);

        //The necessity is to store multiple values
        //Arrays are fixed in size
        //Arrays store same type of data
        //Arrays index starts from 0
        //length of an array is arraylength and in loops for accessing loops from 0 to arrayLength-1
        //Array is a non primtive data type ,it can hold fixed number of values of same type
        //Default value of an integer array  is zero

        //Datatype dataref=new datatype[size]
//Integer array
        int[] array1=new int[5];
        array1[0]=25;
        array1[1]=30;
        array1[2]=25;
        array1[3]=30;
        System.out.println(array1[3]);//30
        System.out.println(array1[4]);//
        System.out.println("size of an array "+array1.length);//

        int[] array2=new int[] {10,20,50,62,73};

        int[] array3={10,20,30,55,78,83};

        System.out.println(array3);
        for(int s:array3){
            System.out.println(s);
        }

        boolean[] b1=new boolean[10];
        b1[0]=true;
        b1[1]=false;
        System.out.println(b1[1]);
        System.out.println(b1[2]);

        String[] str1=new String[5];
        str1[0]="Tarun";
        str1[1]="Praveen";
        System.out.println(str1[1]);
        System.out.println(str1[2]);

        double[] d1=new double[3];
        d1[0]=10.023;
        d1[1]=89.25;
        System.out.println(d1[1]);
        System.out.println(d1[2]);

        char[] ch1=new char[3];
        ch1[0]='a';
        ch1[2]='b';
        System.out.println(ch1[0]);
        System.out.println(ch1[1]);

        int[] arraySort={23,11,54,91,15,2,78};

         Arrays.sort(arraySort);

        for(int e: arraySort){
            System.out.print(e+" ");
        }

        int[] arrayTe={10,20,30};
        int[] arraySe={10,20,30};
        System.out.println();
        System.out.println(Arrays.equals(arrayTe,arraySe));

        //Size is fixed //ArrayList(dyanamic)
        //It stores same type//Object Array

        Object[] obj=new Object[5];
        obj[0]="Praveen";
        obj[1]=30;
        obj[2]=5.8;

        System.out.println(obj[1]);
        System.out.println(obj[2]);
        System.out.println(obj[0]);


        int[][] twoDArray=new int[2][5];
        twoDArray[0][0]=10;
        twoDArray[0][1]=20;
        twoDArray[0][2]=30;
        twoDArray[1][0]=40;
        twoDArray[1][1]=50;
        twoDArray[1][2]=60;

        /*{

        {10,20,30}
        {40,50,60}

        }
         */

        int rowLength=twoDArray.length;
        int colLength=twoDArray[0].length;

        System.out.println("row length "+rowLength);
        System.out.println("col length "+colLength);

        for(int a = 0; a <rowLength; a++){
            for(int h=0;h<colLength;h++){
                System.out.print(twoDArray[a][h]+" ");
            }
            System.out.println();
        }


        int[][] array5={{10,20,30},
                {30,40,50},
                {30,40,50}
        };

        int rowLength1=array5.length;
        int colLength1=array5[0].length;
        System.out.println("row length "+rowLength1);
        System.out.println("col length "+colLength1);
        String[][] mystr={
                {"I","Love","India"},

                {"Hi","How","world"}
        };

    }
}
