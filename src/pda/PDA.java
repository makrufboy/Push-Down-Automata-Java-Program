/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Ame er Ayman
 */
public class PDA {

    static LinkedList state;
    public static void main(String[] args) {
        Nodes n = new Nodes();
        Stack st = new Stack();
        Scanner input = new Scanner(System.in);
        //char symbol;
        
            System.out.println("Enter the string");
            String str = input.next();
            n.linkedNodes();
            char[] inputString = str.toCharArray();
            st.push('$');
            n.setCurrentState((String) state.get(0));
            for (int i = 0; i <  inputString.length; i++) {
                if("q1".equals(n.getCurrentState())){
                    if(inputString[i]=='0'){
                        st.push('0');
                    }else if(inputString[i]=='1'){
                        st.pop();
                        st.push('1');
                        n.setCurrentState((String) state.get(1));
                    }
                }
                else if("q2".equals(n.getCurrentState())){
                    if(inputString[i]=='1' && !(st.empty())){
                        st.pop();
                        n.setCurrentState((String) state.get(2));
                    }
                    //if(i<)
                }
                
                else if("q3".equals(n.getCurrentState())){
                    if(inputString[i]=='1' && !(st.empty())){
                        st.pop();
                        st.push('1');
                        n.setCurrentState((String) state.get(1));
                    }else
                        n.setCurrentState((String) state.get(1));
                }
              
            }
            if("q3".equals(n.getCurrentState())&&st.empty()){
                n.setCurrentState((String) state.get(3));}
            else
                n.setCurrentState((String) state.get(4));
            
            n.validation(n.getCurrentState());
            
        
        
    }
    
}
