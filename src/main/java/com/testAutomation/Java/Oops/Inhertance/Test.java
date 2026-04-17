package com.testAutomation.Java.Oops.Inhertance;

public class Test {

    //Inhertance it is amechanism in which one class acquires the properties and behaviours of another class with specefic relationship
    //Multilevel inheritence
    //multiple inheritence is not possible , to make it possible we have to use interfaces

    //Method overloading - when same method with differnt set of arguments presnt in same class
    //Method overriding - When the same method is present in parent and child class with same signature/ same set of variables
    //This is called static or compile time polymorhisam
    //Child calss object can be referred by a parent class reference variable is called dynamic polymorphsam or runtime Polymorphsm
    //has- a - relationship
    public static void main(String[] args) {
//        Developer d=new Developer();
//        d.read();

        //d.write();
        //d.read();
//        Admin a=new Admin();
//        a.read();
//        a.write();
//        a.delete();
//        a.update();
User u=new User();
u.read();
//        User u=new Developer();//Top casting
//        u.read();
        //Developer d=new User(); //Down casting - this is not possible

        //dynamic polymorphisam //Top casting
    }

}
