import java.util.ArrayList;
import java.util.Scanner;
class GameMenu{

private ArrayList <String> actions;




public GameMenu(ArrayList<String> actions){

 this.actions = actions;




}



public void displayMenu(){

for(String action: actions)

System.out.println(action);

}

public String getAction(){
System.out.println("Typa a number to choose an action");


displayMenu();

Scanner scan = new Scanner(System.in);

String choice = scan.nextLine();
	return choice;



}


}