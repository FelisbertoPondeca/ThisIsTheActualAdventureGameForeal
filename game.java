import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class game {
static int location = 1;
static String name;


boolean[] things = {false, false, false, false, false, false, true, false, false, false};
ArrayList<Boolean> has = new ArrayList<Boolean>(Arrays.asList(things));

static ArrayList<room> rooms = new ArrayList<room>();

static room cell = new room(1, "Cell", "XESX", "\nThis hardened cell was made specifically for no other than the worst of the worst, but you know you can get out of here. \n Would you like to go East and try to break through the bars? Or South through the sewer?", "\n\nThe magical cuffs that encompass your wrists requires the answer to a dastardly puzzle: \nWhat has a neck but no head?", "bottle");
static room sewer = new room(2, "Sewer", "NXSX", "\nRats scurry and sewage plops. No smell has been so rancid. \n Would you like to go North to the cell? Or South to the depths?", "\n\nBefore passing, a wise rat asks you a question: \nI'm not a blanket, yet I cover the ground; a crystal from heaven that doesn't make a sound. What am I?", "snowflake");
static room depths = new room(3, "The Depths", "NXSX", "\nA cold chill takes on the surroundings. You can see the frost on the walls and vapor from your breath. \n Do you want to go deeper South into the prison? Or back North where you came from?", "\n\nBefore you can go a burly man with a mean look on his face stops you, he has a question. \n I have a neck, but no head. I have two arms, but no hands. What am I?", "shirt");
static room support = new room(4, "Tremendous Help", "NXXX", "\nThe steps seem endless but finally a small wooden door with a small wooden torch on the side is reached. Inside sits alone a small troll in a wooden chair.", "\n\nBefore you leave the troll wants to ask you a question: \nThe more you take, the more you leave behind. What am I?", "footstep");
static room hallway = new room(5, "Hallway", "XESW", "\nThe hall is long and tall, fit for a palace. \nDo you wish to go West to the jail cell, South to the warden's office, or East to the cafeteria?", "\n\nBefore you are able to leave the carpet below you contorts into a barrier blocking your escape. A face seems to appear from the fabric and it asks you as question: \nDavid's father has three sons: Snap, Crackle and _____. Who is the third son?", "david");
static room warden = new room(6, "Warden's Office", "NEXW", "\nAs you quietly creep in you find the warden asleep at his desk. Hoping to make a quick escape you must decide. \n Do you go East through the crawl space? West out the open window? Or North to the hallway?", "\n\nBefore you go, the Warden's parrot squawks out a question for you to answer: \nWhat goes up, but never comes down?", "age");
static room window = new room(7, "Death", "XXXX", "\nIs that the ground?", "null", "null");
static room treasure = new room(8, "Hidden Treasure", "XXXW", "\nNever before have you seen so much treasure in your life. You snag a gold coin before leaving.", "What has hands but cannot clap?", "clock");
static room cafeteria = new room(9, "Cafeteria", "XEXW", "\nThe smell of breakfast being made fills the room. You think it's pancakes and bacon today, so sad that you'll be missing it. Where do you want to go? East to the outside> Or West to the hallway?", "\n\nBefore you leave the cafeteria lady stops you and asks you a question: \nThrow away the outside and cook the inside, then eat the outside and throw away the inside. What is it?", "corn");
static room freedom = new room(10, "Freedom", "XXXX", "\nFreedom has never looked so in reach. But something stops you in you're tracks.", "\n\nBefore you can go the Warden steps infront of you and asks a question: \nWhat is always in front of you, but can’t be seen?", "future");



public static void thing(room x){
  System.out.println(x.getRoomName());
  System.out.println(x.getRoomDescription());
  System.out.println(x.getDoorPath());
}

public static void roomChecker(String direction, room place){
  if((!(place.getDoorPath()).contains(direction.toUpperCase()))){
    System.out.println("Invalid Direction");
  }
}







  public static void main(String[] args) {

    rooms.add(cell);
    rooms.add(sewer);
    rooms.add(depths);
    rooms.add(support);
    rooms.add(hallway);
    rooms.add(warden);
    rooms.add(window);
    rooms.add(treasure);
    rooms.add(cafeteria);
    rooms.add(freedom);




    Scanner scan = new Scanner(System.in);

    File room = new File("room1txt");
    try {
        scan = new Scanner(room);
    } catch (FileNotFoundException e) {
      System.out.println("woop");
    }

    File player = new File("player1txt");
    try {
        scan = new Scanner(player);
    } catch (FileNotFoundException e) {
      System.out.println("woop");
    }

    



    System.out.println("\n Type all answers in lowercase and choose a direction to go by typing n,e,s, or w\nEnter a name to continue: ");
    thing(cell);
    String prompt = scan.nextLine();
    while (!prompt.equals("q")){
      name = prompt;

      thing(cell);
      continue;



      //location 1, cell
      if (location == 1){
        if(prompt == "e"){
          location = 5;
          thing(hallway);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

    

        prompt = scan.nextLine();
        continue;
      }
      }

      //location 2, sewer
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, sewer);

        prompt = scan.nextLine();
        continue;
      }

      //location 3, depths
      if (location == 2){
        if(prompt == "n"){
          location = 2;
          thing(sewer);
        }
        if(prompt == "s"){
          location = 4;
          thing(support);
        }
        roomChecker(prompt, cafeteria);

        prompt = scan.nextLine();
        continue;
      }

      //location 4, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 5, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 6, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 7, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 8, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 9, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      //location 10, depths
      if (location == 2){
        if(prompt == "n"){
          location = 1;
          thing(cell);
        }
        if(prompt == "s"){
          location = 2;
          thing(sewer);
        }
        roomChecker(prompt, cell);

        prompt = scan.nextLine();
        continue;
      }

      System.out.println("h");
      break;




    }
  }
