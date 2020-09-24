package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

class Demo {
    public static void main(String[] args) {
        //lambda expressions
        Eet a = x -> x + 12;
        System.out.println(a.nomnom(0));

        Eet b = x -> {
            System.out.println("lambda>>" + (x + 20));
            return x;
        };
        System.out.println(b.nomnom(0));

        //LocalDateTime
        LocalDateTime datetime = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDate later = LocalDate.of(2020, 12, 31);
        LocalTime before = LocalTime.of(12, 30, 30);
        LocalDateTime different = LocalDateTime.of(later, before);

        System.out.println(different + "<<<<");

        System.out.println(datetime);
        System.out.println(time);
        System.out.println(date);

        Period ldt = Period.between(LocalDate.now(), LocalDate.of(2020, 10, 24));

        System.out.println(ldt);
    }
}

abstract class Dier {
    public void hop() throws RabbitstewException {
        System.out.println("Hop dier");
    }
}

class Konijn extends Dier implements Eet {
    public void hop() throws RabbitstewException { //als deze throws moet de parent ook throwsen, vice versa niet
        System.out.println("Hop konijn");
    }

    public int nomnom(int x) {
        System.out.println(x);
        return x;
    }
}

interface Eet {
    int nomnom(int x);
}

class RabbitstewException extends Exception {
}