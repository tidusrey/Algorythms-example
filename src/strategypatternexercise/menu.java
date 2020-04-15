/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    
    
      
public static void choice(){
      int choiceentry;
ArrayList<Tshirt> tshirt=new ArrayList<Tshirt>();
     Scanner sc=new Scanner (System.in);

do {
    System.out.println("");
    System.out.println("Please enter");
    System.out.println("Press 1. For the lists of students"
          );
    System.out.println("Press 2. For printing out the list of our students");
    System.out.println("Press 3. Current students in each class");
    System.out.println("Press 4. For printing out the list of our trainers or adding another");
    System.out.println("Press 5. For printing our courses or adding another");
    System.out.println("Press 6. For printing which course has each trainer inside"); 
    System.out.println("Press 7. For printing the list of assigments or adding another");
    System.out.println("Press 8. For printing the list of which assigment exist in each course");
    System.out.println("Press 9..For printing which assigment has each student");
    System.out.println("Press 10.Dates");
    System.out.println("Press 11.For terminating the programm");
    choiceentry = sc.nextInt();
int x;
      OUTER:
      switch (choiceentry) {
          
          
          case 1://μαθητες και λιστες
                       
            
           Tshirt a=new Tshirt();

ArrayList <Tshirt> aram=a.makeManyTShirts(40);
for(Object o:aram){
        System.out.println(o);
    }System.out.println("--------");
    System.out.println("");
                      
                      break;
    
       default:
              
              System.out.println("\"Choice must be a value between 1 and .11\"");
      }
    
} while (choiceentry != 11);
      }}

