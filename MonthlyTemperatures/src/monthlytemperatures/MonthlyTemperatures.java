/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthlytemperatures;
import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class MonthlyTemperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char choice;
        double[][]temperature= new double[4][7];//create 2D array
        //offer menu
        do{
            System.out.println();
            System.out.println("[1]Enter temperatures");
            System.out.println("[2]Display all");
            System.out.println("[3]Display one week");
            System.out.println("[4]Display day of the week");
            System.out.println("[5]Display maximum and minimum temperature");
            System.out.println("[6]Exit");
            System.out.print("enter choice {1-6]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
           //process choice by calling additional methods
           switch(choice){
               case '1': enterTemps(temperature);
                   break;
               case '2': displayAllTemps(temperature);
                   break;
               case '3': displayWeek(temperature);
                   break;
               case '4': displayDays(temperature);
                   break;
               case '5': maxTemp(temperature);
                        minTemp(temperature);
                   break;
               case '6':System.out.println("Goodbye");
                   break;
               default :System.out.println("ERROR: options 1-5 only!");            
           }
        }while(choice!='6');
    }
    
    //method to enter temperatures into  the 2D array requires a nested loop
    static void enterTemps(double [][]temperatureIn){
        Scanner keyboard = new Scanner (System.in);
        //the outer loop controls the week number
        for(int week=1; week<=temperatureIn.length; week++){
            for (int day=1; day<=temperatureIn[0].length; day++){
            System.out.println("enter temperature for week "+week+" and day "
                    + day);
            temperatureIn[week-1][day-1]= keyboard.nextDouble();
            }
        }
    }
    
    //method to display all temperatures in the 2D array requires a nested loop
    static void displayAllTemps(double [][]temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        //the outer loop controls the week number
        for(int week=1; week<=temperatureIn.length;week++){
            //inner loop controls the day number
            for (int day=1; day<=temperatureIn[0].length; day++){
                System.out.println("week "+week+" day "+day+": "
                        +temperatureIn[week-1][day-1]);
            }
        }
    }
    static void displayWeek(double [][]temperatureIn){
        Scanner keyboard= new Scanner(System.in);
        int week;
        //enter week number
        System.out.println("Enter week number (1-4): ");
        week= keyboard.nextInt();
        //input vaidation: week number should be between 1 and 4
        while(week<1 || week>4){
            System.out.println("Invalid week number!!");
            System.out.println("Enter again (1-4): ");
            week= keyboard.nextInt();
        }
        //display temperatures for given week
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED FOR WEEK "+week+"***");
        System.out.println();
        //week number is fixed so loop required to process day number only
        for(int day=1; day<=temperatureIn[0].length;day++){
            System.out.println("week "+week+" day "+day+":"+
                    temperatureIn[week-1][day-1]);
        }
    }

    /*method to  display temperatures for a single day of each week 
    requires a single loop*/
    static void displayDays(double [][]temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        int day;
        //enter day number
        System.out.print("Enter day number (1-7): ");
        day= keyboard.nextInt();
        //Input validation: day number should be between 1 and 7
        while(day<1 || day>7){
            System.out.println("Invalid day number!!");
            System.out.print("Enter again (1-7 only): ");
            day= keyboard.nextInt();
        }
        //display temperqatures for given day of the week
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED  FOR DAY"+day+"***");
        System.out.println();
        //day number is fixed so loop required to process week numbers only
        for(int week=1; week<=temperatureIn.length; week++){
            System.out.println("week "+week+" day "+day+":"
                    +temperatureIn[week-1][day-1]);
        }
    }
    
    //display maximum
    static void maxTemp(double[][]temperatureIn){
        double result= temperatureIn[0][0];//set result to the first value in the array
        //this loops run from the second item to the last item in the array
        for(int i=1;i<temperatureIn.length;i++){
            for(int j=1;j<temperatureIn[0].length;j++){
             if(temperatureIn[i][j]>result){
                result= temperatureIn[i][j];
                System.out.println("max= "+result+" week "+i+" day "+j);
                }   
            }
            
        }
    }
    
    //display minimum
    static void minTemp(double[][]temperatureIn){
        double result= temperatureIn[0][0];//set result to the first value in the array
        //this loops run from the second item to the last item in the array
        for(int i=1;i<temperatureIn.length;i++){
            for(int j=1;j<temperatureIn[0].length;j++){
             if(temperatureIn[i][j]<result){
                result= temperatureIn[i][j];
                System.out.println("minimum temperature= "+result+" week "+i
                        +" day "+j);
                } 
             
            }
            
        }
    }
}
