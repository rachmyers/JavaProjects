
/*
Author: Rachel Myers
Date: 10/1/19
Purpose: Create a method to sort an array using a counter sort algorithm. Rigorously test the counter sort in the main method: loop through an array of 100,000 random integers 1000 times. Then test if the array is sorted. If it is not sorted, break out of the loop and print an error message.
*/

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaMyers
 */
public class CounterSort {

    public static void main(String[] args) {
        //loop through 1000 times
        for(int i = 0; i < 1000; i++) {
            int[] testArray = new int[100000];
            //loop to create an array of 100,000 random integers
            for (int j = 0; j < testArray.length; j++) {
                testArray[j] = (int) (Math.random() * 50 + 1);
            }

            //test if array is sorted using the counterSort method
            //Print error message if not sorted and break out of loop
            if(!isArraySorted(counterSort(testArray))) {
                System.out.println("Error: Array is not sorted");
                break;
            }
        }



    }

    //method to counter sort an array
    public static ArrayList<Integer> counterSort(int[] N) {
        int[] M = new int [51];
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        for (int i = 0; i < N.length; i++) {
            int tempNum = N[i];
            ++M[tempNum];


        }
        for (int j = 0; j < M.length; j++) {
            int count = 0;
            while(count< M[j]) {
                if(M[j] > 0) {
                    sortedArray.add(j);
                    System.out.print(j + ", ");
                }
                count++;
            }

        }
        //added println so returned array prints on a separate line each time the method is called
        System.out.println();
        return sortedArray;

    }

    //method to test that array is sorted
    public static boolean isArraySorted(ArrayList<Integer> N) {
        for(int i = 0; i < N.size() -1; i++) {
            if(N.get(i)> N.get(i+1))
                return false;
        }
        return true;
    }
    
}
