package com.company;

class Demo {
    static int variable2;                           //class variable
    int variable;                                   // instance variable/fields
    String se = "big";

    public static void main(String[] args) {
        //Scope of variables
        // Local variables (also known as method-local variables)
        // Method parameters (also known as method arguments)
        // Instance variables (also known as attributes, fields, and nonstatic variables)
        // Class variables (also known as static variables)

        int variable;                               //local variable
        int variable2;

        Demo.variable2 =10;                         //to call class variable

        new Demo().shadowingexample();
    }

    void methodparameters(int variable){            //method parameter
        this.variable = 10;                         //reach field with .this (can't be done in a static class)
    }

    void shadowingexample(){                        //shadowing is when the variable with the smallest scope is used
        String se = "small";                        //over the bigger scope (see String se)
        System.out.println(se);
    }
}
