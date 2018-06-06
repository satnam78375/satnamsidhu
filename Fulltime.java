/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satnam
 */
public class Fulltime extends Employee {
   private float salary;
  private  float bonus;
   private float  calcearning;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float setCalcearning(float calcearning) {
        this.calcearning = calcearning;
   return(salary+bonus);
    }
    
}
