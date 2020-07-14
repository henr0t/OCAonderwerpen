package com.company;

class Demo {
    public static void main(String[] args) {

        B a = new B();
        a.example();

    }
}

class A{
    void example() throws BiggerException
    {
        if (true){
            throw new smallerException();
        }
    }
}

class B extends A{
    void example() {
        try{
            super.example();

        }
        catch(smallerException a){
            System.out.println("smaller exception caught!");
        }
        catch(BiggerException b){
            System.out.println("exception caught!");
        }

        finally{
            System.out.println("final prints regardless");
        }
    }
}


class BiggerException extends Exception{}               //checked exceptions need to be handled
class smallerException extends BiggerException{}