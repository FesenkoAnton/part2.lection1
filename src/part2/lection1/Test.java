package part2.lection1;

import java.util.Random;



﻿class Soup2{

private Soup2(){System.out.println("Test");}

private static Soup2 ps1 = new Soup2();

public static Soup2 access(){return ps1; }

public void f(){System.out.println("Test2");}

}

public class Test {

public static void main (String[] args){

 Soup2 s = new Soup2();

s.f();

}

}
