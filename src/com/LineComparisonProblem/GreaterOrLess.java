package com.LineComparisonProblem;

public class GreaterOrLess {
    public static void main(String[] args) {
        String String1= new String("Tanuja");
        String String2= new String("Tanuja");
        String String3= new String("ovi");
        String String4= new String("oju");
        String String5= new String("Priyanka");

        System.out.println("String1 =" +String1);
        System.out.println("String2 =" +String2);
        System.out.println("String3 =" +String3);
        System.out.println("String4 =" +String4);
        System.out.println("String5 =" +String5);

        System.out.println("String1 is Equal to String2 =" +(String1==String2));

        System.out.println("String3 is greater than String4 =" +(String3 == String4));

        System.out.println("String1 is less than String2 =" +(String5 == String1));
    }
}
