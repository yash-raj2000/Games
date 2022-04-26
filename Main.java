/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissor Game: \nPlease Enter Your Name: ");
		String Name = sc.nextLine();
		System.out.println("Welcome " +Name);
		Random number  = new Random();
		int computer=number.nextInt(3);
		System.out.println("Enter 0 for Rock,Enter 1 for paper,Enter 2 for Scissor");
		
		System.out.println("Enter the number: ");
		int player = sc.nextInt();
		
		 if(player==0 && computer==1 ){
		     System.out.println("You have taken Rock and Computer has taken Paper");
		     System.out.println("You Won");
		     
		 }
		 else if( player==2 && computer==1){
		     System.out.println("You have taken Scissor and Computer has taken Paper");
		     System.out.println("You Won");
		 }
		 else if(player==0 && computer==2 ){
		     System.out.println("You have taken Rock and Computer has taken Scissor");
		     System.out.println("You Won & Computer Lose");
		 }
		 else if(player==1 && computer==2){
		     System.out.println("You have taken Paper and Computer has taken Scissor");
		     System.out.println("You Lose & Computer Won");
		 }
		 else if(player ==1 && computer==0){
		     System.out.println("You have taken Paper and Computer has taken Rock");
		     System.out.println("You Lose & Computer Won");
		 }
		 else if(player==1 && computer==2 ){
		     System.out.println("You have taken Paper and Computer has taken Scissor");
		     System.out.println("You Lose & Computer Won");
		 }
		 else if(player ==2 && computer==0){
		     System.out.println("You have taken Scissor and Computer has taken Rock");
		     System.out.println("You Lose & Computer Won");
		 }
		 else if(player>=3){
		     System.out.println("Wrong Number Inserted,Please Check Rules and re enter the number");
		     
		 }
		 else{
		     System.out.println("It's a Tie");
		 }
		 
		}
}
