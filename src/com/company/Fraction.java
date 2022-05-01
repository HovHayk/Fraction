package com.company;

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction() {
        denumerator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenumerator(int denumerator) {
        this.denumerator = denumerator;
    }


    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public Fraction sum (Fraction a) {
        int gcd =  this.denumerator * a.denumerator;
        int n1 = gcd / this.denumerator;
        int n2 = gcd / a.denumerator;
        this.numerator = this.numerator * n1 + n2 * a.numerator;
        this.denumerator = gcd;
        normalize();
        return this;
    }

    private int GCD(int a,int b){
        while(a > 0 && b > 0)
            if(a > b)
                a %= b;
            else
                b %= a;

        return a + b;
    }

    private void normalize() {
        int g = GCD(numerator,denumerator);
        numerator /= g;
        denumerator /= g;
    }

    public void print() {
        System.out.println(numerator + "/" + denumerator);
    }
}