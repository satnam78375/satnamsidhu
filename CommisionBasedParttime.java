/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satnam
 */
public class CommisionBasedParttime extends Parttime{
   private String commisionperc;
   private float calcearnings;

    public void setCommisionperc(String commisionperc) {
        this.commisionperc = commisionperc;
    }

    public float setCalcearnings(float calcearnings) {
        this.calcearnings = calcearnings;
        return(rate*hourworked);
    }

 
    
    
}
