
import java.util.Random;
import java.util.Scanner;
public class GameShow {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    Random generator = new Random();

    
    int user_door,
        open_door,
        other_door,
        prize_door;

   
    prize_door = generator.nextInt(3)+1;
    open_door = prize_door;

    while(open_door == prize_door){
        open_door = generator.nextInt(3)+1;
    }

    other_door = open_door;

    while (other_door == open_door || other_door == prize_door){
        other_door = generator.nextInt(3)+1;
    }

    
    System.out.println("Welcome to the game show!");  
    System.out.println("Select the door (1, 2, or 3): ");
    user_door = scan.nextInt();


    
        if (user_door > 3 || user_door < 0) {
            System.out.println("Please select door 1, 2, or 3");
            user_door = scan.nextInt();
        } else if(user_door == 1 || user_door == 2 ||  user_door == 3) {

    
    System.out.println("\nThe prize is located:");
    
    
    System.out.println("\nBehind door number " + open_door + " are goats!");
    System.out.println("You selected door number " + user_door);
    System.out.println("\nWould you like to switch your door(y/n)? ");

   
    char userReply = scan.next().charAt(0);

   
        if (userReply == 'y'){
                user_door = other_door;
                } while(userReply != 'y' && userReply != 'n')
                {
                    
                    System.out.println("Please enter either y/n");
                    userReply = scan.next().charAt(0);
                } 

    System.out.println("The prize is behind door number: " + prize_door); 

   
        if(user_door == prize_door){
            System.out.println("Congratulations! You won the prize!");
            } else {
                    System.out.println("Sorry. You lost.");
                    }       

        }
    }
}


