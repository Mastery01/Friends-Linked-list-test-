/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and ope5tg n the template in the editor.
 */
package friends;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author amanda
 */
public class Friends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, ArrayList<String>> friends = new HashMap<>();
        ArrayList<String> SueFriends = new ArrayList<>();
        
        SueFriends.add("Bob");
        SueFriends.add("Jose");
        SueFriends.add("Alex");
        SueFriends.add("Cathy");
        
       ArrayList<String> CathyFriends = new ArrayList<>();

       CathyFriends.add("Bob");
       CathyFriends.add("Alex");

       ArrayList<String> BobFriends = new ArrayList<>();

       BobFriends.add("Alex");
       BobFriends.add("Jose");
       BobFriends.add("Jerry");
       
       friends.put("Sue",SueFriends );
       friends.put("Cathy", CathyFriends);
       friends.put("Bob", BobFriends);

       
       Scanner sc = new Scanner(System.in);

       while(true) {

           System.out.print("Enter a name ('quit' to end): ");

           String name = sc.next();
           
           if("quit".equalsIgnoreCase(name))

               break;

           if(friends.containsKey(name)) {

               System.out.println("Here are the friends of "+name+":");

               System.out.println(friends.get(name));

           }else{

               System.out.println("Awww, "+name+" has no friends :(");

           }
       }

       sc.close();

       System.out.println("OK, bye for now!");
    }
    
}
