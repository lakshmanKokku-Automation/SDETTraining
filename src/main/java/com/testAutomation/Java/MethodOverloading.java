package com.testAutomation.Java;

public class MethodOverloading {
    //It happens in same class
    //It happens when the class is having same method name with different set of arguments or parameters
    //class variables or instance variables
    String name="tharun";
    String password;

    //Main method can be overloaded


    public static void main(String[] args) {
        System.out.println("Inside Main Method");

        MethodOverloading load=new MethodOverloading();
//        boolean b=load.login(10);
//        System.out.println("Booleab value is " +b);
       load.login("anjad","anckjan");

    }

    public static void main(int val) {

        System.out.println(val);

    }

    public Boolean login(int id ){

        System.out.println("Logging in using id ");

        return  true;
    }


    public void login(int id ,int val ){

        System.out.println("Logging in using id nd val ");
    }


    public  void login(String username ,String password){

        System.out.println("logging using credentails ");
       // this.username=username;
        this.password=password;
        System.out.println(name);
        //this.classVariable=localVariable;
        System.out.println(username);
        System.out.println(password);

    }

}
