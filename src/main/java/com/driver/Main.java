package com.driver;

public class Main {

     public class Product{
        public int product(int x, int y) {
            return 0;
        }
        public int product(int x, int y, int z) {
            return 1;
        }
        public double product(double x, double y) {
            return 0.0;
        }

    }
    public static void main(String args[]){
        Main m=new Main();

        Main.Product p=m.new Product();
        p.product(0,0);
        p.product(0,0,0);
        p.product(0.0,0.0);

    }

}