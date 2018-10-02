package com.company;
public class Calculation {
        int result;

        public void addition(int x, int y){
            result = x + y;
            System.out.println("The total sum of the integers is: "+result);
        }

        public void subtraction(int x, int y){
            result = x - y;
            System.out.println("The subtraction of the integers gives: " +result);
        }
        public void multiplication(int x, int y){
            result = x*y;
            System.out.println("The multiplication of the integers gives: " +result);
        }
        public void division(int x, int y){
            result = x/y;
            System.out.println("The subtraction of the integers gives: " +result);
        }
}


