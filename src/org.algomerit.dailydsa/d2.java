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

        int[] solution = new int[aa.length];
        // Trivial Solution
        
        for(int i=aa.length-1; i>=0 ;i-- ){
            solution[(aa.length-1) - i] = aa[i];
        }

        // another Solution

        //  //Optimal Solutions

        //  Stack<Integer>  s = new Stack<>();
        //  int i = 0;
        //  while(i<solution.length){
        //      s.add(solution[i]);
        //      i++;
        //  }
        //  while(!s.isEmpty()){
        //     solution[i] = s.pop();
        //  }

        return solution;
    }

   
}






















