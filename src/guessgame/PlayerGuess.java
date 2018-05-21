/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.util.Random;

/**
 *
 * @author federico
 */
public class PlayerGuess {
    private int smaller=0;
    private int bigger=101;
    private int number;
    
    public int getnumber(){
        return this.number;
    }
    
    public String Guessnumber(int number){
        if (number == this.number)
        return "YES!. "+number+" is my number! You win!\n";
        else
        if(number>this.number)
        return "My number is smaller\n";
        else
        return "My number is bigger\n";
    }
    public int Randomizenumber(){
        Random r = new Random();
        try{
        this.number=r.nextInt(this.bigger-this.smaller)+this.smaller;
        return this.number;
        }
        catch(IllegalArgumentException e){
            System.out.println(this.smaller+"=<"+this.number+"=<"+this.bigger);
            return this.number;
        }
    }
        public void thinknumber(){
        Random random = new Random();
        this.number = random.nextInt(100)+1;
        
    }
    
}


