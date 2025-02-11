import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class game {

ArrayList<room> rooms = new ArrayList<room>();




    
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    File room1 = new File("room1txt");

    try {
        scan = new Scanner(room);
    } catch (FileNotFoundException e) {
      System.out.println("pooop");
    }

    System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
    String command = scan.nextLine();
    if (command.equals("n")) {



    }
  }
}