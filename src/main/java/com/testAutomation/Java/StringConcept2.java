package com.testAutomation.Java;

public class StringConcept2 {

    //output
    public static void main(String[] args) {

        String s1="tarun";
        String s2="Teja";

       // s1=s1.toLowerCase();

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        String output="";

        for( int i=0;i<c1.length;i++){
            int count =0;
            for( int j=0;j<c2.length;j++){
                if(c1[i]==c2[j]){ //T ,t //
                    count ++;
                }
            }
            if(count>=1){//0
                output+=c1[i];
            }else{
                output+="+"; //+
            }

        }

        System.out.println(output);

    }

}
