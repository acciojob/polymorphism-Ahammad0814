package com.driver;

public class Main {
  public static class Product{
    public int product(int z, int y){
      return z * y;
    }
    public int product(int x, int z, int y){
      return x * z * y;
    }
    public double product(double z, double y){
      return z * y;
    }
  }

  public static void main(Strings[] args){
    Product p = new Product();
    
    int result1 = p.product(10, 20);
    System.out.println(result1);
    
    int result2 = p.product(10, 20, 30);
    System.out.println(result2);
    
    double result3 = p.product(10.10, 20.20);
    System.out.println(result3);
    
  }
}
