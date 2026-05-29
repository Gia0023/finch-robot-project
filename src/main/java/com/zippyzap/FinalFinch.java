package com.zippyzap;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    public FinalFinch(String device) {
        super(device);
    }

    public void squareZippy(){
        int count = 0;
        while(count<4){
            setMove("F",5,20);
            setTurn("R",90,50);
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

    }
