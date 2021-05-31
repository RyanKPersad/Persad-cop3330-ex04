package org.example;
import java.util.Scanner;
/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println( "Enter a noun" );
        //Input
        String noun =  myObj.nextLine();
        System.out.println( "Enter a verb" );
        //Input
        String verb =  myObj.nextLine();
        System.out.println( "Enter a adjective" );
        //Input
        String adj  =  myObj.nextLine();
        System.out.println( "Enter adverb" );
        //Input
        String adv =  myObj.nextLine();
        //Output
        String mad_lib = String.format("Do you %s your %s %s %s? That's hilarious!", verb,adj,noun,adv );
        System.out.println(mad_lib);

    }
}
