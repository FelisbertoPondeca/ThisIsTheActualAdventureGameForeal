import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class game {
static int location = 1;
static String name;
static String path;



Boolean[] things = {false, false, false, false, false, false, true, false, false, false};
ArrayList<Boolean> has = new ArrayList<Boolean>(Arrays.asList(things));

static ArrayList<room> rooms = new ArrayList<room>();

static room cell = new room(1, "\nCell", "\nXESX", "\nThis hardened cell was made specifically for no other than the worst of the worst, but you know you can get out of here. \nWould you like to go East and try to break through the bars? Or South through the sewer?", "\n\nThe magical cuffs that encompass your wrists requires the answer to a dastardly puzzle: \nWhat has a neck but no head?", "bottle");
static room sewer = new room(2, "\nSewer", "\nNXSX", "\nRats scurry and sewage plops. No smell has been so rancid. \nWould you like to go North to the cell? Or South to the depths?", "\n\nBefore passing, a wise rat asks you a question: \nI'm not a blanket, yet I cover the ground; a crystal from heaven that doesn't make a sound. What am I?", "snow");
static room depths = new room(3, "\nThe Depths", "\nNXSX", "\nA cold chill takes on the surroundings. You can see the frost on the walls and vapor from your breath. \nDo you want to go deeper South into the prison? Or back North where you came from?", "\n\nBefore you can go a burly man with a mean look on his face stops you, he has a question. \nI have a neck, but no head. I have two arms, but no hands. What am I?", "shirt");
static room support = new room(4, "\nTremendous Help", "\nNXXX", "\nThe steps seem endless but finally a small wooden door with a small wooden torch on the side is reached. \nInside sits alone a small troll in a wooden chair. \nHe has something to say to you. Do your listen? \nY/N", "\n\nBefore you leave the troll wants to ask you a question: \nThe more you take, the more you leave behind. What am I?", "step");
static room hallway = new room(5, "\nHallway", "\nXESW", "\nThe hall is long and tall, fit for a palace. \nDo you wish to go West to the jail cell, South to the warden's office, or East to the cafeteria?", "\n\nBefore you are able to leave, the carpet below you contorts into a barrier blocking your escape. A face seems to appear from the fabric and it asks you as question: \nDavid's father has three sons: Snap, Crackle and _____. Who is the third son?", "david");
static room warden = new room(6, "\nWarden's Office", "\nNEXW", "\nAs you quietly creep in you find the warden asleep at his desk. Hoping to make a quick escape you must decide. \nDo you go East through the crawl space? West out the open window? Or North to the hallway?", "\n\nBefore you go, the Warden's parrot squawks out a question for you to answer: \nWhat goes up, but never comes down?", "age");
static room window = new room(7, "\nDeath", "\nXXXX", "\nIs that the ground?", "null", "null");
static room treasure = new room(8, "\nHidden Treasure", "\nXXXW", "\nNever before have you seen so much treasure in your life. Should you snag a gold coin before leaving? \nY/N", "What has hands but cannot clap? Asks the pile of money before you leave.", "clock");
static room cafeteria = new room(9, "\nCafeteria", "\nXEXW", "\nThe smell of breakfast being made fills the room. You think it's pancakes and bacon today, so sad that you'll be missing it. Where do you want to go? East to the outside? Or West to the hallway?", "\n\nBefore you leave the cafeteria lady stops you and asks you a question: \nThrow away the outside and cook the inside, then eat the outside and throw away the inside. What is it?", "corn");
static room freedom = new room(10, "\nFreedom", "\nYN", "\nFreedom has never looked so in reach. But something stops you in your tracks. \nA guard holds a baton above his head, ready to swing down onto you. \nWhat shall you say to him?\n", "\n\nBefore you can go, the Warden steps infront of you and asks a question: \nWhat is always in front of you, but can’t be seen?", "future");

static player user = new player();

public static void thing(room x){
  Scanner scan = new Scanner(System.in);
  String prompt;
  System.out.println(x.getRoomName());
  System.out.println(x.getRoomDescription());
  System.out.println(x.getDoorPath());

  prompt = scan.nextLine();
  path = prompt;

  System.out.println(x.getPuzzle());
  prompt = scan.nextLine();
  if (!(prompt.toLowerCase()).contains(x.getAnswer())){
    user.setLife(false);
    //System.out.println("'INCORRECT!' bellows a mysterious, invisible force. \nWithout warning the forces of nature cause you to immediately combust. \nYOU DIE");
  }

}

public static boolean roomChecker(String direction, room place){
  if((!(place.getDoorPath()).contains(direction.toUpperCase()))){
    System.out.println("\nInvalid Direction");
    return true;
  }
  return false;
}







  public static void main(String[] args) {
  System.out.println("hi");


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
    System.out.println("hi");



    



    System.out.println("\nType all answers in lowercase and choose a direction to go by typing n,e,s, or w\nEnter a name to continue: ");
    String prompt = scan.nextLine();
    name = prompt;
    user.setName(name);

    System.out.println("\nWould you like to play through with all the answers? Y/N");
    prompt = scan.nextLine();

    if((prompt.toLowerCase()).contains("y")){
      System.out.println("1/Cell:  Bottle \n2/Sewer:  Snow \n3/Depths:  Shirt \n4/Support:  step \n5/Hallway:  david \n6/Warden's Office:  age \n7/Window:  null \n8/Treasure:  clock \n9/Hallway:  corn \n10/Freedom:  future \nP.S. You must retrieve the gold coin from the treasure room and tell the guard that you are willing to pay him in order to escape");
    }

    thing(cell);
    while (!prompt.equals("q")){
      //System.out.println("start");

      if (!(user.getLife())){
        System.out.println("'INCORRECT!' bellows a mysterious, invisible force. \nWithout warning the forces of nature cause you to immediately combust. \nYOU DIE\n");
        break;
      }
      
      /*prompt = scan.nextLine();
      path = prompt;

      System.out.println(cell.getPuzzle());
      prompt = scan.nextLine();
      if ((prompt.toLowerCase()).contains(cell.getAnswer())){
        System.out.println("yeay");
      }else{
        System.out.println("Incorrect");
        break;
      }*/
      


      //location 1, cell
      if (location == 1){
        if(path.equals("e")){
          thing(hallway);
          location = 5;
          continue;


        }
        if(path.equals("s")){
          thing(sewer);

          location = 2;
          //System.out.println("hi");
          //System.out.println(location);
          //System.out.println(path);


          continue;
          
        }
        else if(roomChecker(path, cell)){
        break;
        }
      }
      
      

      //location 2, sewer
      if (location == 2){
        if(path.equals("n")){
          thing(cell);

          location = 1;
          continue;
        }
        if(path.equals("s")){
          thing(depths);
          location = 3;
          continue;
        }
        else if(roomChecker(path, sewer)){
          break;
          }
      }

      //location 3, depths
      if (location == 3){
        if(path.equals("n")){
          thing(sewer);
          location = 2;
          continue;
        }
        if(path.equals("s")){
          System.out.println(support.getRoomName());
          System.out.println(support.getRoomDescription());
          prompt = scan.nextLine();
          if((prompt.toLowerCase()).contains("y")){
            System.out.println(name + "! In order to get out of here you must tell the man you're willing to pay!");
          }
          System.out.println("\nYou quickly turn around and make a leave for the door.");
          System.out.println(support.getDoorPath());

          prompt = scan.nextLine();
          path = prompt;

          System.out.println(support.getPuzzle());
          prompt = scan.nextLine();
          if (!(prompt.toLowerCase()).contains(support.getAnswer())){
            user.setLife(false);
            //System.out.println("you die");
          }

          location = 4;
          continue;
        }
        else if(roomChecker(path, depths)){
          break;
          }
      }

      //location 4, support
      if (location == 4){
        if(path.equals("n")){
          thing(depths);

          location = 3;
          continue;
        }
        
        else if(roomChecker(path, support)){
          break;
          }
      }

      //location 5, hallway
      if (location == 5){
        if(path.equals("w")){
          thing(cell);
          location = 1;
          continue;
        }
        if(path.equals("s")){
          thing(warden);
          location = 6;
          continue;

        }
        if(path.equals("e")){
          thing(cafeteria);
          location = 9;
          continue;

        }
        else if(roomChecker(path, hallway)){
          break;
          }
      }

      //location 6, Warden
      if (location == 6){
        if(path.equals("n")){
          thing(hallway);
          location = 5;
          continue;

        }
        if(path.equals("e")){
          System.out.println(treasure.getRoomName());
          System.out.println(treasure.getRoomDescription());
          prompt = scan.nextLine();
          if((prompt.toLowerCase()).contains("y")){
            user.setCoin(true);
          }
          System.out.println("Anyway, only way out is back West where you came from.");
          System.out.println(treasure.getDoorPath());

          prompt = scan.nextLine();
          path = prompt;

          System.out.println(treasure.getPuzzle());
          prompt = scan.nextLine();
          if (!(prompt.toLowerCase()).contains(treasure.getAnswer())){
            user.setLife(false);
            System.out.println("you die");
          }

          location = 8;
          continue;

        }
        if(path.equals("w")){
          location = 7;
          continue;

        }
        else if(roomChecker(path, warden)){
          break;
          }
      }

      //location 7, Window
      if (location == 7){
        System.out.println("\nYou see the ground below you.");
        System.out.println("'Well that didn't workout well.' You think to yourself.");
        user.setLife(false);
        break;
      }

      //location 8, Treasure
      if (location == 8){
        if(path.equals("w")){
          thing(warden);
          location = 6;
        }
        
        else if(roomChecker(path, treasure)){
          break;
          }
      }

      //location 9, Cafeteria
      if (location == 9){
        if(path.equals("e")){
          System.out.println(freedom.getRoomName());
          System.out.println(freedom.getRoomDescription());
          prompt = scan.nextLine();
          if(((prompt.toLowerCase()).contains("pay")||(prompt.toLowerCase()).contains("money")||(prompt.toLowerCase()).contains("coin")||(prompt.toLowerCase()).contains("gold"))&& user.getCoin()){
            System.out.println("The guard lowers his baton. \nMotivated solely by money he takes your gold coin and makes a run for it!\n");
          }else if((prompt.toLowerCase()).contains("pay")||(prompt.toLowerCase()).contains("money")||(prompt.toLowerCase()).contains("coin")){
            System.out.println("The guard lowers his baton. \nMotivated solely by money he asks for your gold coin. \nRealizing you lied to him he angrily grabs the gun from his holster and points it at you!\n");
            user.setLife(false);
            break;
          }else{
            System.out.println("The guard slams his baton down onto your skull. \nThe dirty bastard was motivated only by money\n");
            user.setLife(false);
            break;
          }

          System.out.println("This is it! You get ready to run! \nDo you wanna get out of here?? Y/N");

          prompt = scan.nextLine();
          path = prompt;

          System.out.println(freedom.getPuzzle());
          prompt = scan.nextLine();
          if (!(prompt.toLowerCase()).contains(freedom.getAnswer())){
            user.setLife(false);
            System.out.println("you die");
          }

          location = 10;
          continue;
        }
        if(path.equals("w")){
          thing(hallway);
          location = 5;
        }
        else if(roomChecker(path, cafeteria)){
          break;
          }
      }

      //location 10, Freedom
      if (location == 10){
        if(path.contains("n")){
          thing(cafeteria);
          location = 9;
        }
        
        else if(roomChecker(path, freedom)){
          break;
          }
          else{
            System.out.println("\n'I guess this is freedom.' You say to yourself. \nEnjoy it " + name);
            break;
          }
      }
      




    }
  }
}
