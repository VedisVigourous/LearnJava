package AdvancedJava;

import java.util.ArrayList;

class MyGenericClass1<Type1>{
    int value;
    private Type1 type1;

    public MyGenericClass1(int value, Type1 type1) {
        this.value = value;
        this.type1 = type1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Type1 getType1() {
        return type1;
    }

    public void setType1(Type1 type1) {
        this.type1 = type1;
    }
}

// Created a Generic class including type : Type1 and included getter , setters and Constructors.

class MyGenericClass2<Val1 , Val2>{
    private Val1 val1;
    private Val2 val2;

    public MyGenericClass2(Val1 val1, Val2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Val1 getVal1() {
        return val1;
    }

    public void setVal1(Val1 val1) {
        this.val1 = val1;
    }

    public Val2 getVal2() {
        return val2;
    }

    public void setVal2(Val2 val2) {
        this.val2 = val2;
    }
}

public class AdvJava_Ch19_22_JavaGenerics {
    public static void main(String[] args) {
        System.out.println();

        /* If in an arraylist we keep different types of data.
           Ex. int , bool , scanner etc. or in layman language we do not specify the type of array list.
           \
           And asks to print a specific type of Element at specified index.
           -> int element = arraylist.get(index);

           Java highlights the error as it doesn't know what type of element doest the specified index has.
           */

        // ***************** //

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        myArrayList1.add(13);
        int firstElement = myArrayList1.getFirst();
        System.out.println(firstElement); // Works because the ArrayList is of a specified integer type.

        ArrayList<Object> myArrayList2 = new ArrayList<>(); // Here the type of object is not specified hence we cannot store any index as a specific data type.
        myArrayList2.add("Vedant");
        // String element1 = myArrayList2.get(0); -- //Highlights error ! [ Java doesn't know the type of stored element ] -- Commented out

        // Now to make this as a String and print it we need to typecast it :-
        String element1 = (String) myArrayList2.getFirst();
        System.out.println(element1);

        // Therefore : Java Generics are used to disclose the type of object we have stored in the ArrayList by typecasting it. Helpful with list of different types of objects.

        // **************************************************** //

        /* Creation of a Generic Class:
           * Syntax:
           * class Name<Type>{} -- Refer line 5 */

        MyGenericClass1 <String> gen1 = new MyGenericClass1<>(2007 , "Ved--DOB"); // Here we are defining the value of Type 1 as String and making a new object for it.
        String define = gen1.getType1();
        int year = gen1.getValue();
        System.out.print(year + " : ");
        System.out.println(define); // It prints the String values defined.

        // Generics minimizes the user error which could occur

        System.out.println("***********************");

        // We can also add more than one Types and denote it while making an object.

        MyGenericClass2 <String , Integer> gen2 = new MyGenericClass2<>("Vedant-DOB" , 2007); // Takes up two different type of value as defined
        String definedVal = gen2.getVal1();
        int definedYear = gen2.getVal2();
        System.out.print(definedVal + " : ");
        System.out.println(definedYear);
    }
}
