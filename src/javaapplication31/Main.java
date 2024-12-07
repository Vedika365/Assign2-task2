/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

/**
 *
 * @author Vedika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //display the titles
        String One ="Side 1";
        String Two = "Side 2";
        String Three = "Hypotenus";

        System.out.printf("%10s %8s %10s ", One, Two, Three);

        //decalare the variables
        int SideOne=0;
        int SideTwo=0;
        int hypo=0;

        //calcualate all possibilties of the 3 variables
        for(SideOne=1;SideOne<=500;SideOne++){
            for( SideTwo=1; SideTwo<=500;SideTwo++){
                for ( hypo=1; hypo <=500;hypo++){

                    //check if it satisfies the condition of Pythagorean Triple
                    if (Math.pow(SideOne, 2)+Math.pow(SideTwo,2)==Math.pow(hypo, 2)){

                        //print the 3 sides
                        System.out.printf("\n %7d %7d %7d ", SideOne, SideTwo, hypo);
                    }

                }
            }
        }
    }
}





















