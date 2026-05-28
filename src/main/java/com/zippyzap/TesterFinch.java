package com.zippyzap;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch zippy = new FinalFinch("A");

         zippy.setMove("F", 20, 50);
         zippy.setTail(1, 40, 20, 60);
         zippy.setTail(2, 3, 73, 25);
         zippy.setTail(3, 40, 20, 60);
         zippy.setTail(4, 3, 73, 25);
         zippy.setBeak(255,255,0);
    }
}