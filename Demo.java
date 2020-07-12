package com.company;

class Demo {
    public static void main(String[] args) {
        new B();                            //volgorde is static, non static, constructor (van boven naar beneden)
        System.out.println("\n");
        new B();                            //statische initializer blocks worden slechts 1x aangeroepen
    }
}

class A {
    static {
        System.out.println("1: static initialiser block A");
    }

    {
        System.out.println("4: Initialiser block A");
    }

    A() {
        System.out.println("5: Constructor A");
        ;
    }

    static {
        System.out.println("2: static initialiser block A2");
    }
}

class B extends A {
    static {
        System.out.println("3: static initialiser block B");
    }

    {
        System.out.println("6: Initializer block B");
    }

    B() {
        System.out.println("7: Constructor B");
    }
}