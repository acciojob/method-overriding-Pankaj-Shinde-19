package com.driver;

public class Main {
    class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public void main(String[] args) {
            // Task 3
            B obj = new B();

            // Task 5
            String result = obj.meth();
            System.out.println(result);
    }
}