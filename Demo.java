package com.company;

class Demo {
    public static void main(String[] args) {
        //primitive vs object references
        //primitives slaan de waarde op en object references refereren naar een object
        //Er zijn slechts 8 type primitives
        //objecten kunnen een groothoeveelheid methoden op worden toegepast, daarvoor zijn wrappers handig
        //veel operators werken niet met objecten, wel op primitives


        //numeric-->signed-->integers
        byte variablebyte;                  //8 bits
        short variableshort;                //16 bits
        int variableint;                    //32 bits
        long variablelong;                  //64 bits

        //numeric-->signed-->Floating Point
        float variablefloat;                //32 bits
        double variabledouble;              //64 bits

        float average = 20.129F;            //suffixing literal value with F or f tells the compiler that the literal value
        float orbit = 1765.65f;             //should be treated like a float, not a double
                                            //decimal number is by default double, so suffixing D or d is redundant

        //numeric-->Unsigned-->Character
        char variablechar;

        //variablechar = 'z';
        //variablechar = 122;               //char data stored as unsigned integer value
        // variablechar = '\u0122';         //unicode
        variablechar = (char)-122;          //casting: forces conversion from one data type to another
        System.out.println(variablechar);

        //Boolean
        boolean varialbeboolean;            //true or false
                                            //The category Boolean is not the same as the primitive data type boolean
                                            //or wrapper class Boolean. Java primitive data types and class names are displayed
                                            //using code font.

        //decimal value of 267
        int decVal = 267;                   //decimal
        int octVal = 0413;                  //octal
        int hexVal = 0x10_B;                //hexadecimal
        int binVal = 0b100001011;           //binary
        System.out.println(hexVal);

        //byte, short and char values are automatically widened to int when used as as operands for arithmetic operations
        // if long value is involved somewhere then everything widens to long
        //this explains why you can't assign the sum of two byte values to a short (unless final is used)
        //if it includes float or double, it is widened to double
    }
}