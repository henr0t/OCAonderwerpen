package com.company;

class Demo {
    public static void main(String[] args) {

        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10l;

        char c = 'a';

        l = i;              //smaller primitives fits in bigger ones
        i = (int) l;         //to go the other way around you have to cast

        i = c;              //char fits in int and bigger
        b = (byte) c;        //from short and smaller char needs to be cast

        float f1 = 20.0F;
        float f2 = 5.0f;
        double d = f1 + f2;   //float auto converts to double

        int i1 = 10;
        long l1 = 40;
        long i2 = i1 + l1;    //when long is involved in an arithmetic operator it auto widens to lon

        byte b1 = 5;
        short s1 = 5;
        int x = b1 + s1;      //arithmetic operators with byte and short widens to int

        double d1 = 50.0;
        short s2 = 50;
        double x1 = d1 + s2;  //widens to double
        

    }
}
