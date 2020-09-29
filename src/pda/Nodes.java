/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import java.util.LinkedList;
import static pda.PDA.state;

/**
 *
 * @author Ameer Ayman
 */
public class Nodes {
    // initializing variable member of the class 
    //this variable holds the current state of the linked list
    private String currentState; 

    //set function to access the current state variable and store the value by it
    public String getCurrentState() {
        return currentState;
    }
    //get function to access the current state variable and retrive the value from the variable
    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }
    // to check if the current state is the accept state or not
     public void validation(String state)
    {
        if("acceptState".equals(state))
            System.out.println("the string is accepted");
        else
            System.out.println("the string is rejected");
    }
     
     // class that has the linked list
     public void linkedNodes() {
        state = new LinkedList();
        state.add("q1");  // start state of the list
        state.add("q2");
        state.add("q3");
        state.add("acceptState"); /// accept state 
        state.add("rejectState"); 

    }
    
}
