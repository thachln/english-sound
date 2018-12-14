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
public class AverageScoreDisplay implements Observer {
    
     private float runRate; 
    private int predictedScore; 
  
    public void update(int runs, int wickets, 
                       float overs) 
    { 
        this.runRate =(float)runs/overs; 
        this.predictedScore = (int)(this.runRate * 50); 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nAverage Score Display: \n"
                           + "Run Rate: " + runRate + 
                           "\nPredictedScore: " + 
                           predictedScore); 
    } 
    
}
