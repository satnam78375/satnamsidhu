/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satnam
 */
public class FixedBasedParttime extends Parttime{
   private float fixedamount;
 private Float  calcearnnings;

    public void setFixedamount(float fixedamount) {
        this.fixedamount = fixedamount;
    }

    public float setCalcearnnings(Float calcearnnings) {
        this.calcearnnings = calcearnnings;
        return((rate*hourworked)+fixedamount);
    }
 
    
}
