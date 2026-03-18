package com.testAutomation.Java;

public class ReverseNumber {

    public static void main(String[] args) {

        int num=123456; //654321 //%10 /
        int temp=0;
        int rem=0;
        int res=num;
        //6*1
        //5*10
        //4*100
        while(num>0){
         rem=num%10;//6//5
         temp=temp*10+rem;//6
         num=num/10;//12345
        }
        System.out.println(temp);
        if(temp==res){

            System.out.println("Given number is pallindrome");

        }else
        {
            System.out.println("Given number is not  pallindrome");
        }

    }



    //123 = 3*3*3+2*2*2+1*1*1

    //armstromng number



}
