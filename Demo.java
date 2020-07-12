package com.company;

import java.util.ArrayList;
import java.util.ListIterator;

class Demo {
    public static void main(String[] args) {
        //Array
        //An array is an object itself; it stores references to the data it stores.

        int intArray[] = new int[] {1,2,3,4,5}; //Array of primitive data, collection of primitive values
        A objArray[] = {new A(),new A()}; //Array of Objects, collection of references

        int multiArr[][] = new int [2][3]; //2 dimensional array, 2 vertical, 3 horizontal

        //use nested for loops to initialize its array elements
        for (int i=0; i<multiArr.length; i++){
            for (int j=0; j<multiArr[i].length; j++){
                multiArr[i][j] = i+j;
            }
            System.out.println("|"+multiArr[i][0]+"|"+multiArr[i][1]+"|"+multiArr[i][2]+"|");
        }
        // System.out.println(multiArr[1][5]); //ArrayIndexOutOfBoundsException when accessing nonexistent array index
        //it will compile, but throw exception at runtime

//        Code to access an array index will throw a runtime exception if
//        you pass it an invalid array index value. Code to access an array index will fail
//        to compile if you don’t use a char, byte, short, or int.

        //asymetrical multidimensional array
        int multiArr2[][] = {{1,2,3},null,{1,2,3,4}};   //0- 1 2 3
                                                        //1- null
                                                        //2- 1 2 3 4

        //System.out.println(multiArr2[1][1]); nullpointerexception
        System.out.println(multiArr2.length);   // Array—Determine element count using the variable length

//        As opposed to an array, you’ll invoke
//        a lot of methods on String objects. So you use the method length() to retrieve the
//        length of String and the variable length to retrieve the length of an array.

        String stringArray [] = new String[2];
        for (String print: stringArray){
            System.out.println(print);      //default of null or 0 if int
        }

        System.out.println("\n");

        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("one");
        myArrList.add("two");
        myArrList.add("four");
        myArrList.add(2,"three"); //puts it in index 2, shifts "four" one place forward to 3

        System.out.println(myArrList);

        //This method used to return a list iterator over the elements in this list (in proper sequence),
        // starting at the specified position in the list.
        ListIterator<String> iterator = myArrList.listIterator(0);
        while (iterator.hasNext()) System.out.println(iterator.next());

        myArrList.set(3,"WHATEVER");
        System.out.println("set(): "+ myArrList);
        System.out.println("remove(): "+myArrList.remove(3));
        System.out.println("contains(): "+myArrList.contains("one"));
        System.out.println("indexOf(): "+myArrList.indexOf("two"));
        System.out.println("lastIndexOf(): "+myArrList.lastIndexOf("three"));
        System.out.println("size(): "+myArrList.size());
        myArrList.clear();
        System.out.println("clear(): "+myArrList);


        ArrayList <String> myArrList2 = new ArrayList<>();
        myArrList2.add("1");
        myArrList2.add("2");
        myArrList2.add("3");

        //AddAll to add an entire ArrayList to another
        ArrayList <String> yourArrList = new ArrayList<>();
        yourArrList.add("2.5");
        yourArrList.add("2.7");

        myArrList2.addAll(2,yourArrList);
        System.out.println(myArrList2);

    }
}

class A {}