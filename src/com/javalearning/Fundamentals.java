package com.javalearning;

public class Fundamentals {
    public static void main(String[] args) {
        /*
        whole numbers: byte, short, int, long
        decimals: float, double
        char, boolean
        */

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        float a = 12.236f;
        double b = 12365489854.6565;

        System.out.println(a);
        System.out.println(b);

        char t = 'a';
        System.out.println((int) t);
        System.out.println((char) 2309);

        for (int i = 0; i <= 127; i++) {
            //System.out.print((char) i + " ");
        }

        //WIDENING/IMPLICIT/AUTO CONVERSION => small datatype stored into larger one
        byte byteValue = 10;
        short shortValue = byteValue;
        System.out.println(shortValue);

        //Narrowing Conversion/Explicit typecasting: from large to small datatype
        double doubleValue = 10;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

    }

}
