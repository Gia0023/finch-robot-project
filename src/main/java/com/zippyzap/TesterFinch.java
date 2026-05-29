package com.zippyzap;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch zippy = new FinalFinch("A");


        zippy.squareZippy();
         zippy.colorOn();
         zippy.print("Hi");
         zippy.playNote(80,0.5);
         
         zippy.stopAll();
    }
}