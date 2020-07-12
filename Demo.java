package com.company;

class Demo {
    public static void main(String[] args) {

        Dier dier1 = new Dier();

        //overloading examples
        dier1.eten(1, 1);
        dier1.eten(1.0, 1.0);
        dier1.eten(1.0f, "carrot", 2);

        System.out.println(new Demo().hop());

        new BabyKonijn().doen();

    }

    int getal() {
        return 0;
        //System.out.println("werkt niet");         //unreachable code, compile error
    }

    Dier hop() {
        BabyKonijn baby = new BabyKonijn();
        return baby;                                //hetgeen dat gereturned wordt MOET covariant returntype zijn
    }

}

class Dier {

    public void eten(int a, int b) {
        int eten;                                   //Een field mag dezelfde naam hebben als een methode
    }

    public double eten(double c, double d) {
        return c + d;
    }

    public float eten(float x, String y, int z) {
        return x;
    }

}

class Konijn extends Dier {
    public int leeftijd;

    public String spring() {
        return "nomnom";
    }


    Konijn() {                                       //constructor
        this("");                             //met this() kun je een andere constructor van eigen klasse aanroepen
        System.out.println("I'm a bigger bunny");
    }

    Konijn(String naam) {
        System.out.println("I'm a " + naam);
    }
}

class BabyKonijn extends Konijn {
    public void doen() {
        System.out.println(super.spring());         //roept methode aan in de parent/super class
        super.leeftijd = 10;
    }

    public String toString() {
        return "I'm a little bunny";
    }

    BabyKonijn() {
        super("BABY");                      //roept constructor aan van de superclass
    }
}