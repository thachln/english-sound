/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsum2number;

/**
 *
 * @author 51600104
 */
public class CurrentScoreDisplay implements Observer {
    
     private int runs, wickets; 
    private float overs; 
  
    public void update(int runs, int wickets, 
                       float overs) 
    { 
        this.runs = runs; 
        this.wickets = wickets; 
        this.overs = overs; 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nCurrent Score Display:\n"
                           + "Runs: " + runs + 
                           "\nWickets:" + wickets + 
                           "\nOvers: " + overs ); 
    } 
    
}
