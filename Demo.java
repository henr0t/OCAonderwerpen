package com.company;

class Demo{

    public static void main(String[] args) {
        byte varbyte = 0;
        char varchar = 0;
        short varshort = 0;
        int varint = 0;
        String string = "0";
        //enums

        //Not accepted by switch
        //  double vardouble = 0.0;
        //  long varlong = 0;
        //  float varfloat = 0.0f;


        switch (varint){
            case 0:
                System.out.println("prints!");
                break;
            default:
                System.out.println("prints default");
                break;

        }
    }
}

enum Numbers {ONE,TWO,THREE}
