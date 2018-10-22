/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment21;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 1794147
 */
public class Assignment21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Random rd=new Random();
        int count=0;
        int Low = 1;
        int High = 11;
        int randomNumber = rd.nextInt(High-Low) + Low;
        System.out.println("*****************************");
        System.out.println("Welcome to the Guessing Game");
        System.out.println("*****************************");
        
        System.out.println("Enter a number from 1 to 10:");
        int inputNumnber=sc.nextInt();
        while(randomNumber!=inputNumnber)
        {
            System.out.println("Enter a number from 1 to 10:");
            inputNumnber=sc2.nextInt();
            count++;
        }
        System.out.println("You won! The number was"+" "+randomNumber);
        System.out.println("It took you "+count+" guesses to win.");
    }
    
}
