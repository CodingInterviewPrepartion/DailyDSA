package org.algomerit.dailydsa;

import java.util.Stack;

public class d2{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arr =  findReverseArray(arr);
        for(int i : arr){
        System.out.print( i + " ");
        }
    }
    static int[] findReverseArray(int[] aa){

        int[] solution = aa;
        // Trivial Solution
        
        for(int i=strArray.length-1; i>=0 ;i-- ){
            solution = solution + strArray[i];
            
        }
        
        // another Solution

        int i=0;
        while(i<strArray.length){   //O(n)
            s.push(strArray[i]);
            i++;
        }
        
        while (!s.isEmpty()){  //O(n)
            solution = solution+s.pop();
        }
       

        return solution;
    }

   
}






















//  //Optimal Solutions

//  Stack<Integer>  s = new Stack<>();
//  int i = 0;
//  while(i<solution.length){
//      s.add(solution[i]);
//      i++;
//  }
//  i=0;
//  while(!s.isEmpty()){
//     solution[i] = s.pop();
//     i++;
//  }