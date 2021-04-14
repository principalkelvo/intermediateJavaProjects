/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menudrivenmeasuretemperature;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class MenuDrivenMeasureTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*This program demonstrates how methods can be used in a 
        menu-driven program*/
        Scanner keyboard = new Scanner (System.in);
        /*The variable below is local to the main method, if the values
        is needed by another method, it must be passed in as a parameter*/
        //c for Celcius f for Fahrenheit
        double c= -999, f=-999;//initialize with a dummy value to show that nothing has been entered
        char choice;//to store menu choice
        do{
            System.out.println();
            System.out.println("***TEMPERATURE MEASUREMENTS***");
            System.out.println();
            System.out.println("1. Enter the temperature in celcius");
            System.out.println("2. Enter the temperature in Fahrenheit");
            System.out.println("3. Quit");
            System.out.println();
            System.out.println("Enter a number from 1-3");
            System.out.println();
            choice= keyboard.next().charAt(0);
            
            switch(choice){
                case '1':c=option1();//call method option1
                        option2(c);
                        break;
                case '2':f=option3();//call method option2
                        option4(f);
                        break;
                case '3':break;
                default :System.out.println("Enter only numbers from 1-3");
                    System.out.println();
            }
        }while(choice !='3');
    }
        //option1 gets the user to enter temperature in celcius and displays it
    static double option1(){
        double cIn;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter temperature in celcius: ");
        cIn=keyboard.nextDouble();
        return cIn;
    }
    //option2 calculates temperature from celcius to Fahrenheit
    static void option2(double cIn){
        if(cIn<=-273.15){
            System.out.println("you are not allowed to enter a temperature blow absolute zero");
        }else{
        double fOut;
        fOut= ((9*cIn)/5)+32;
        System.out.println("Fahrenheit= "+fOut+"F");
        }
    }
    //option3 gets the user to enter temperature in Fahrenheit and displays it
    static double option3(){
        double fIn;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter temperature in Fahrenheit: ");
        fIn=keyboard.nextDouble();
        return fIn;
    }
    //option2 calculates temperature from Fahrenheit to celcius
    static void option4(double fIn){
        if(fIn<=-459.67){
            System.out.println("you are not allowed to enter a temperature blow absolute zero");
        }else{
        double cOut;
        cOut= (5*(fIn-32))/9;
        System.out.println("Celcius= "+cOut+"'C");
        }
    }
}
    
