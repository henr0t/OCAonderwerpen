package com.company;

class Demo {
    public static void main(String[] args) {
        //Operators
        int operator1 = 0;                   //assignment operators, first add/subtract/multiply/etc. then assign
        operator1 += 2;                      //ex. +=,-=,*=
        System.out.println("First add then assign " + operator1);

        String alfabet = "abc";             //+= werkt ook met Strings op te "appenden"
        alfabet += "def";
        System.out.println(alfabet);

        //Assignement starts from right, this prints 8
        int a = 7, b = 10, c = 8;
        a = b = c;
        System.out.println("a = " + a);

        //unary increments ++ and decrements --operators
        //prefix and postfix determens when its used in an expression pre = before, post = after

        int d = 10;
        d = d++ + d + d-- - d-- + ++d;
        //  10  +11 + 11  - 10  +  10 = 32;
        System.out.println("After unary increments--> " + d);

        //relational operators
        //>=,>,<=,<,==,!=, result is always a boolean value

        //logical operators
        // && and || are short circuit operators, if the first operator returns false,
        // therefore && does not evaluate the second. Similar ||, first true, then second won't evaluate
        // single & and | are not short circuit operators!!!
        // ! is NOT

        int x = 10;
        int y = 10;

        //play around with operators
        if (++x > y++ || x++ == y++) {
            System.out.println("It's true!");
        }
        System.out.println(x + "<-x , y->" + y);
    }
}