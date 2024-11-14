/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maxmin;

/**
 *
 * @author USER
 */
public class Min {
        
    // Method to find the minimum value among three numbers
    public int findMin(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
