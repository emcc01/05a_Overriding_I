package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Child child = new Child();   //3. neues Objekt
        output(child.sayHello());  //4. prüfen, dass output erfolgt
     
       
       

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

