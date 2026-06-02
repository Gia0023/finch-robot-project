package com.zippyzap;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch zippy = new FinalFinch("A");

        zippy.colorOn();
        zippy.kiteZippy();
        zippy.pause(1.5);
         zippy.print("Hi");
         zippy.pause(1.5);
         zippy.playNote(80,0.5);
         zippy.colorOff();
         

         zippy.stopAll();
    }
}