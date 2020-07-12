package com.company;

class Demo {
    public static void main(String[] args) {
        //override
        Voertuig voertuig1 = new Voertuig();
        voertuig1.verplaatsen();

        Voertuig auto1 = new Auto();
        auto1.verplaatsen();

        Voertuig SUV1 = new SUV();
        SUV1.verplaatsen();

        //polymorphism (field links, methode rechts)
        System.out.println("Door polymorphism wordt x van voertuig aangeroepen: " + SUV1.x);

        System.out.println("instanceof: " + (SUV1 instanceof Fabriek));

        //casting
        Auto mijnAuto = new SUV();
        //mijnAuto.fourwheeldrive();            //kan niet bij methode van SUV
        SUV nieuwSUV = (SUV) mijnAuto;          //op de belofte dat mijnAuto een SUV is
        nieuwSUV.fourwheeldrive();              //na casting wel

        //aanroep van static methode in interface
        Bestuurbaar.sturen();
    }
}

abstract class Fabriek {                         //can't be instantiated, just extended
    abstract void maakVoertuig();               //no body, must be called in child class
}

class Voertuig extends Fabriek {
    String x = "voertuig";

    public String verplaatsen() {
        System.out.println("Ik verplaats me. Ben " + x);
        return "Voertuig";
    }

    void maakVoertuig() {
    }
}

class Auto extends Voertuig implements Bestuurbaar {
    String x = "Auto";

    @Override
    public String verplaatsen() {
        System.out.println("Ik ben override in " + x);
        return "Auto";
    }

    public void besturen() {
    }                    //must have public!!
}

class SUV extends Auto {
    String x = "SUV";

    @Override
    public String verplaatsen() {
        System.out.println("Ik override in " + x);
        return "SUV";
    }

    public void fourwheeldrive() {
        System.out.println("SUV met 4WD");
    }
}

interface Bestuurbaar extends Motor {
    public static final boolean bestuurbaar = true; //interface fields zijn impliciet public static final!!!

    public static void sturen() {               //static methode aan te roepen door Bestuurbaar.sturen();
        System.out.println("statische methode in interface");
    }

    public abstract void besturen();            //abstract verplicht te implementeren

    public default void draaien() {             //default niet verplicht te implementeren
    }
}

interface Motor {
}