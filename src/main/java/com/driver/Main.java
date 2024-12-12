package com.driver;

public class Main {
  public static void main(String[] args){
    product(10, 20);
    product(10, 20, 30);
    product(10.00000, 20.00000);
  }
  static int product(int z, int y){
    return z * y;
  }
  static int product(int x, int z, int y){
    return x * z * y;
  }
  static double product(double z, double y){
    return (double) (z * y);
  }
}
