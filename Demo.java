package com.company;

class Demo {
    public static void main(String[]args) {
        //Wrapper classes
        // wrapper classes are used to wrap primitives in an object, so they can be added to a collection of object.
        //wrapper classes are immutable-classes

        //Numeric wrapper classes:
        int whatever = 12;

        Byte byte1 = 10;                //This is the autoboxing method for wrapper classes
        Short short1 = 10;              //
        Integer int1 = whatever;        //
        Long long1 = 108456798L;        //
        Float float1 = 10.12345f;       //
        Double double1 = 10.98;         //

        //auto unboxing
        long long2 = long1;

        //Object wrapper classes
        Boolean bool1 = true;           //
        Character char1 = 'a';          //

        //Constructor method
        Boolean bool2 = new Boolean(true);
        Boolean bool3 = new Boolean("true");

        //static method valueOf()
        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf("TrUE");

        System.out.println(">>>>"+(bool4 == bool5));

        //None of these classes define a no-argument constructor.
        //wrapper classes are immutable, so it doesn't make sense to initialize with the default primitive value
        //all wrapper classes (except character) define a constructor that accepts a String argument
        //constructors always create new instances,
        // valueOf returns a cached copy for applicable value, same goes for autoboxing

        //(exceptions based on the cached range of said value)
//        Cached instances exist for the wrapper Boolean class for the values
//        true and false. The Character class caches instances with values from 0 to
//        127. Classes Byte, Short, Integer, and Long cache instances for values -127 to
//        128. No cached instances exist for the Float and Double wrapper classes.

        Integer int3 = Integer.valueOf(200);
        Integer int4 = Integer.valueOf(200);

        System.out.println("== method: "+(int3 == int4));
        System.out.println("equals method: "+int3.equals(int4));
        //.equals  compares the primitive value stored by a wrapper
        //checking whether they refer to the same instance

        //objects of different wrapper classes with the same values are not equal
        //equals() will return false, == won't compile


    }
}
