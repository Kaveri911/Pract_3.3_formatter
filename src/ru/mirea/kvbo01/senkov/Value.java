package ru.mirea.kvbo01.senkov;

public class Value {
    double sum;

    public double convTo(String s1,String s2)
    {
        double t=0;
        switch (s1) {
            case "USD": t=sum*60.03; break;
            case "KRW": t=sum*0.04325; break;
            case "GBP": t=sum*68.98; break;
            case "EUR": t=sum*59.87; break;
            case "JPY": t=sum*0.4197; break;
            case "RUB":t=sum; break;
        }
        switch (s2) {
            case "USD": t=t/60.03; break;
            case "KRW": t=t/0.04325; break;
            case "GBP": t=t/68.98; break;
            case "EUR": t=t/59.87; break;
            case "JPY": t=t/0.4197; break;
            case "RUB":t=t; break;
        }
        return(t);
    }

}
