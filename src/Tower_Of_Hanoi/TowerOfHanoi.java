package Tower_Of_Hanoi;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {
    
        static Stack Tower_A = new Stack();
        static Stack Tower_B = new Stack();
        static Stack Tower_C = new Stack();
        
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        int discs;
        System.out.println("Enter number of discs : ");
        discs = s.nextInt();
        for (int i = discs; i > 0; i++) {
            Tower_A.push(i);
        }
        
    }
    
    public static void move(){
        Tower_B = (Stack) Tower_A.pop();
        Tower_C = (Stack) Tower_A.pop();
        
    }
}
