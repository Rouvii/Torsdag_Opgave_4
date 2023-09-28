import java.util.Scanner;
class Main{
	
	private static String name;
	private int age;
	private static int rAge = 67;

public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Please type your name");

String input = scan.nextLine();

System.out.println("Welcome! "+ input);

System.out.println("Please type your age");

int age = Integer.parseInt(scan.nextLine());

System.out.println("Your Age: "+age);

rAge = rAge - age;

System.out.println(input+","+ " You have: "+(rAge)+" Years left before retiring");





}




}