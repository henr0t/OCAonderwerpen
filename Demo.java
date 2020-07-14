package com.company;

class Demo {
    public static void main(String[] args) throws Exception{

        ZZZ u = new CCC();

        System.out.println(u.x);
        CCC d = (CCC)u;
        d.methodC();

        System.out.println(d.a);

        BBB b = new AAA();
        b.methodB();
        System.out.println(b.x);

        try{b.yyy();
            System.out.println("TRIED");
        }catch(RaRaError rara){
            System.out.println("CAUGHT");
        }
        System.out.println("Doesn't print");
    }

    public ZZZ uuu(ZZZ b){
        return new CCC();
    }

}

class AAA extends BBB{
    int x = 10;
    public int yyy() throws RaRaError{
        System.out.println("I'm yyy in AAA"+x);
        throw new RuRuError();
    }

    public void methodA(){
        System.out.println("AAA");
    }

    AAA(){
        super("Super");
        System.out.println("Construct AAA");
    }

    private String kkk;

    public String ttt(String kkk){
        this.kkk = kkk;
        return kkk;
    }

    public void iii(){
        System.out.println("My name is: "+kkk);
    }

}

class BBB extends CCC{
    int x = 20;
    public int yyy() throws RaRaError{
        System.out.println("I'm yyy in BBB"+x);
        return x;
    }
    public void methodB(){
        System.out.println("BBB");
    }

    BBB(String s){
        System.out.println("Construct BBB"+s);
    }
}

class CCC implements ZZZ{
    static String d = QQQ();

    int x = 30;
    public int yyy() throws RaRaError{
        System.out.println("I'm yyy in CCC"+x);
        return x;
    }
    static{
        System.out.println("JJJ");
    }

    public void methodC(){
        System.out.println("CCC");
    }

    static String QQQ(){
        System.out.println("QQQ");
        return "QQQ";
    }
}

interface ZZZ extends PPP{
    int x = 99;
    int yyy() throws RaRaError;

}

interface PPP{
    String a = "PPP";
}

class RaRaError extends Exception{}
class RuRuError extends RaRaError{}