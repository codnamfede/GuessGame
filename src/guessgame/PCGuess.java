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
public class PCGuess {
    private int smaller=0;
    private int bigger=101;
    private int number;
    
    public String GuessHumanNumber(int opcion){
        String mensaje="";
        switch(opcion){
            case 1: //Menor
                this.bigger = this.number;
                this.number=this.Randomizenumber();
                mensaje="Maybe it's the "+this.number;
                break;
            case 2: //Igual
                mensaje= "YEAH! I I'm a genius!";
                this.number=0;
                this.bigger=101;
                this.smaller=0;
                this.smaller = this.number;
                break;
            case 3: //Mayor
                this.smaller=this.number;
                this.number=this.Randomizenumber();
                mensaje="Maybe it's the "+this.number;
                break;
                }
        return mensaje;
            }
    public void thinknumber(){
        Random random = new Random();
        this.number = random.nextInt(100)+1;
        
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
}
