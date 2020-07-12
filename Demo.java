package com.company;

class Demo {
    static String test2 = "test1";
    public static void main(String[] args) {

        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println("prints false because they are separate objects: " + (str1 == str2));             //prints false because they are separate objects
        System.out.println("prints true because of equal value: " + str1.equals(str2));

        String str3 = "test";
        String str4 = "test";
        System.out.println("Refers to the same string in pool: " + (str3 == str4));             //same sequence of character that are stored in a pool
                                                                                                //of string objects

        String test1 = "test1";
        System.out.println("Refers to the same string object in pool: " + ("test1" == test1));       //refers to the same string object in pool
        System.out.println("Static String are also in the String pool: "+("test1"==test2));

        String methods = "Hello, World ";
        System.out.println(methods + ".");

        System.out.println("\ncharAt(): " + methods.charAt(0));
        System.out.println("indexOf(): " + methods.indexOf("World"));
        System.out.println("substring(): " + methods.substring(7, 12));        //starts at, ends to
        System.out.println("trim(): " + methods.trim() + ".");
        System.out.println("replace(): " + methods.replace('o', 'U'));
        System.out.println("length(): " + methods.length());
        System.out.println("startsWith(): " + methods.startsWith("H"));
        System.out.println("ensWith(): " + methods.endsWith("d"));           //notice the space at the end of string

        System.out.println("\n");

        //String is immutable, which helps the JVM reuse String objects, reducing memory overhead and increase performance
        String a = "abc";
        a.replaceAll("ab", "AB");
        System.out.println("example of immutability: " + a);

        String b = "def";
        b += null;          //is same as b = b null
        System.out.println("concatenate: "+b);

    }
}

