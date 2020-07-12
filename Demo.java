package com.company;

class Demo {
    public static void main(String[] args) {
        int x = 0;
        if (x == 0) System.out.println("zonder {} 1e statement geldig");
        else if (x == 1) {
            System.out.println("else if");
        } else {
            System.out.println("else statement");
        }

        String a = x == 0 ? "true" : "false";
        System.out.println("Korte if notitie: " + a);

        int y = 0;
        switch (y) {
            default:
                System.out.println("default can be anywhere.");
            case 1:
                System.out.println("without break it keeps going");
            case 2:
                System.out.println("See!!!");
                break;
            case 4:
            case 3:
            case 5:
                System.out.println("doesn't print");
        }

        //for loops
        for (int i = 0; i < 3; i++) {
            System.out.println("repeats " + i + " times.");
        }

        //enhanced for loops
        String[] strArray = new String[2];
        for (String element : strArray) {
            System.out.println("enhanced loops: " + element);
        }

        int z = 0;
        while (z < 2) {
            System.out.println("while loops: " + z);
            z++;
        }

        int w = 0;
        do {
            System.out.println("do-while loops: " + w);
            w++;
        } while (w != 2);

        LABEL1:
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break LABEL1;
            }
            System.out.println("Labels: "+i);
        }
    }
}
