/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.exercises;
/**
 *
 * @author user
 */
public class perfectSquare {
public static int perfectSquares(int length, int width){

        if (width < length)
        {
            int temp = length;
            length = width;
            width = temp;
        }

        return width * (width + 1) * (3 * length - width + 1) / 6;
    }
     public static void main(String[] args){

        int length = 4;
        int width = 5;
        System.out.print(" perfect square is " + perfectSquares(length, width));
    }
}
