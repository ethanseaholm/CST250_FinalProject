package com.mycompany.finalproject;
import java.util.Random;

public class LandFall {
    
    Random landFall = new Random();
    
    public String chance(){
        
        int chance = landFall.nextInt(2);
        if (chance == 1){
            return "Landed it!";
        } else {
            return "Missed it!";
        }
        
    }
}