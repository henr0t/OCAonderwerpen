package com.company;

class Demo {
    public static void main(String[] args) {
        //Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods)
        // together as a single unit. In encapsulation, the variables of a class will be hidden from other classes,
        // and can be accessed only through the methods of their current class.

        Encapsulation test1 = new Encapsulation();

        test1.setNaam("Harry Handrem");
        System.out.println(test1.getNaam());

    }
}

class Encapsulation{
    private String naam;

    public void setNaam(String newNaam){        //setter
        naam = newNaam;
    }

    public String getNaam(){                    //getter
        return naam;
    }

}