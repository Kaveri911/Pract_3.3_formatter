package ru.mirea.kvbo01.senkov;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Formatter fmt= new Formatter();
        Value a = new Value();
        a.sum=150;
        System.out.println("Конвертер валют приветствует вас!");
        System.out.println("Введите исходную валюту (пример: USD,EUR,KRW,GBP,JPY,RUB)");
        Scanner sc=new Scanner(System.in);
        String s1 =sc.nextLine();
        System.out.println("Введите валюту, в которую нужно перевести (пример: USD,EUR,KRW,GBP,JPY,RUB)");
        String s2 =sc.nextLine();
        System.out.println("Введите сумму денег в исходной валюте ( "+s1+" )");
        a.sum=Double.parseDouble(sc.nextLine());
        double x= a.convTo(s1,s2);
        NumberFormat numberFormatUSD=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatGBP=NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat numberFormatEUR=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numberFormatJPY=NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat numberFormatKRW=NumberFormat.getCurrencyInstance(Locale.KOREA);

        System.out.print("При переводе вы получите: ");
        switch (s2) {
            case "USD": System.out.println(numberFormatUSD.format(x)); break;
            case "KRW":System.out.println(numberFormatKRW.format(x)); break;
            case "GBP": System.out.println(numberFormatGBP.format(x)); break;
            case "EUR": System.out.println(numberFormatEUR.format(x)); break;
            case "JPY":System.out.println(numberFormatJPY.format(x)); break;
            case "RUB": System.out.println(x+" руб"); break;
        }

    }

}
