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
public class Main {
    
     public static void main(String args[]) 
    { 
        // create objects for testing 
        AverageScoreDisplay averageScoreDisplay = 
                          new AverageScoreDisplay(); 
        CurrentScoreDisplay currentScoreDisplay = 
                          new CurrentScoreDisplay(); 
  
        // pass the displays to Cricket data 
        CricketData cricketData = new CricketData(); 
  
        // register display elements 
        cricketData.registerObserver(averageScoreDisplay); 
        cricketData.registerObserver(currentScoreDisplay); 
  
        // in real app you would have some logic to 
        // call this function when data changes 
        cricketData.dataChanged(); 
  
        //remove an observer 
        cricketData.unregisterObserver(averageScoreDisplay); 
  
        // now only currentScoreDisplay gets the 
        // notification 
        cricketData.dataChanged(); 
    } 
    
}
