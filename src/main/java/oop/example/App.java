package oop.example;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner getQuote = new Scanner(System.in);
        Scanner getAuthor = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = getQuote.nextLine();

        System.out.print("Who said it? ");
        String author = getAuthor.nextLine();

        String output = author + " says \""  + quote + "\"";

        System.out.println(output);


    }
}
