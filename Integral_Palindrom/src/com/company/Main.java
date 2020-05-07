package com.company;

public class Main {

    public static void main(String[] args) {
        //--- INTEGRAL   ----------------------

        int n = 10;
        double a = 0;
        double b = Math.PI;
        System.out.println("Результат вычисления интеграла: "+ CalcIntegral(a,b,n));





        //--- PALINDROME   ----------------------

        String str = "Аргентина манит негра";

        String str2 = str.toLowerCase();

        System.out.println(str2);

        String str3 = str2.replaceAll(" ", "");

        System.out.println(str3);

        String str4 = "";

        for (int i = str3.length()-1; i >= 0; i--)
        {
            str4 += str3.charAt(i);
        }

        System.out.println(str4);

        if (str3.equals(str4)) System.out.println("Палиндром");

    }

    public static double CalcIntegral(double a, double b, int n)
    {

        double result = 0;
        double h = (b - a) / n;

        for(int i = 0; i < n; i++)
        {
            result += InFunction(a + h*(i + 0.5));
        }
        result *= h;
        return result;
    }
    public static double InFunction(double x) //Подинтегральная функция
    {
        return Math.sin(x);
    }
}
