package com.zippyzap;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch zippy = new FinalFinch("A");

         zippy.setMove("F", 70, 100);
         zippy.setTail(1, 100, 0, 100);
         zippy.setTail(2, 0, 100, 100);
         zippy.setTail(3, 100, 0, 100);
         zippy.setTail(4, 0, 100, 100);
         
    }
}