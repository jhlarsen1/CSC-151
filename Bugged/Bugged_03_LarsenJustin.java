package Bugged_03_LarsenJustin;

import java.util.Scanner;

public class Bugged_03_LarsenJustin1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");        
        double dollars = keyboard.nextDouble();        
        System.out.print("What is the euros-per-dollar exchange rate? ");        
        double eurosPerDollar = keyboard.nextDouble();        
        double grossEuros = dollars * eurosPerDollar;        
        
        System.out.println(dollars + "Dollars =>" + grossEuros + "Gross Euros.");
        
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ?");        
        double rate = keyboard.nextDouble();     
        double fee = grossEuros * rate / 100;
        double neteuros = grossEuros - fee;
        System.out.println("Thank you for using the Dollars to Euros Converter.\n");
        System.out.println("Please check your Math.\n");	
        System.out.println(dollars + "\tDollars\n " + eurosPerDollar + "\tEuros Per Dollar Exchange Rate\n" 
        + grossEuros + "\tGross Euros\n" + rate + "\tFee Percentage %\n" + fee + " \tFee in Euros\n" + neteuros 
        + " \tNet Euros\n");        
        
    }
   
}