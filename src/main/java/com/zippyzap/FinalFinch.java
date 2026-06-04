package com.zippyzap;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    public FinalFinch(String device) {
        super(device);
    }

    public void squareZippy(){
        int count = 0;
        while(count<4){
            setMove("F",5,100);
            setTurn("R",90,100);
             count++;    
        }
    }

    public void colorOn(){
        setTail(1, 40, 20, 60);
        setTail(2, 3, 73, 25);
        setTail(3, 40, 20, 60);
        setTail(4, 3, 73, 25);  
        setBeak(255,255,0);  
        }

    public void colorOff(){
        setTail(1, 0, 0, 0);
        setTail(2, 0, 0, 0);
        setTail(3, 0, 0, 0);
        setTail(4, 0, 0, 0);  
        setBeak(255,255,0);  
        }

    public void kite(){
        setTurn("R", 45, 100);
        setMove("F", 10, 30);
        setTurn("L", 45, 100);
        setMove("F", 10, 30);
        setTurn("L", 135, 100);
        setMove("F", 10, 30);
        setTurn("L", 45, 100);
        setMove("F", 10, 30);
        pause(0.5);
        setTurn("L", 160, 100);
        setMove("F", 18, 30);
        setMove("B", 9, 30);
        setTurn("L", 90, 100);
        setMove("F", 4, 30);
        setMove("B", 9, 30);
        setMove("F", 5, 30);
        setTurn("L", 90, 100);
        setMove("F", 10, 30);
    }

    public void squiggle(){
        for(int i = 0; i <= 2; i++){
         setTurn("L", 30, 100);
         setMove("F", 5, 30);
         setTurn("R", 30, 100);
         setMove("F", 5, 30);
        }
    }



    }
