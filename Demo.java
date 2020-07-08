package com.company;

class Demo {
    public static void main(String[] args) {
        System.out.println(args[0]);    //java Demo [0] [1] [2]

    //De vier access modifiers
        //public        iedereen kan erbij
        //protected     package en subclasses kunnen extended naar ander packages
        //default       package only
        //private       class only

        Konijn dier1 = new Konijn();
        dier1.naam = "flappie";

        // dier1.leeftijd; kan niet bij leeftijd want int is private in klasse Dier

        //static
        System.out.println(Konijn.soort);
        Konijn.springen();


    //De drie non-access modifiers die je moet kennen
        //abstract
        //final
        //static
    }
}

abstract class Dier{                //abstract klasse kan niet geinstantieerd worden
    public String naam;
    protected boolean levend;
    private int leeftijd;
    String zwemmen;                 //impliciet default      //abstract variable niet mogelijk


    abstract void ademen();         //abstract methode heeft geen body en moet gedeclareerd worden in de child class
}

final class Konijn extends Dier implements Wortel{    //Niet mogelijk om een final class te extended
    static final String soort = "Konijn";   //final variable kan geen nieuwe waarde toewijzen
                                            //static heeft een constante waarde die door voor alle objecten gelijk is

    static void springen(){
        System.out.println("ik spring!");
    }

    @Override
    void ademen() {
        System.out.println("ik adem");
    }

    @Override
    public void eten() {                    //public!!

    }
}

//class BabyKonijn extends Konijn{}

interface Wortel{                           //default abstract, final interface niet mogelijk
    public static final boolean tasty = true;   //fields van interface zijn impliciet public static final (redundant)
    public abstract void eten();                //methode zijn impliciet public abstract (redundant)
}