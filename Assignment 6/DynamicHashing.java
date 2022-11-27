// Name:        Jonathan Tarrant
// Class:       CS 4306/2
// Term:        Fall 2022
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE:         Visual Studio Code

import java.util.ArrayList;
import java.util.Scanner;
public class DynamicHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        boolean run = true;
        String question = "";
        int userInput = 0;
        String userString = "";
        String token = "";
        ArrayList<ArrayList<String>> hashTable = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 24; i++){
            hashTable.add(new ArrayList<String>());
        }
        System.out.println(hashTable.size());

        while(run){
            Menu();
            question = "Enter Option Number: ";
            userInput = input(input, question);

            switch(userInput){
                case 1:
                    System.out.print("Text to hash: ");
                    userString = stringInput(inputString);
                    userString += ' ';
                    System.out.println("User String: " + userString);
                    break;
                case 2:
                    for (int i = 0; i < userString.length(); i++){
                        if (userString.charAt(i) == ' '){
                            token = token.toLowerCase();
                            System.out.println(token);
                            hashFunction(token, hashTable);
                            token = "";
                            i++;
                        }
                        if (i < userString.length()) {
                            token += userString.charAt(i);
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    run = false;
                    break;
                default:
                    System.out.println("Please input a valid menu option (1-5).");
                    break;
            }
        }

        input.close();
        
    }   
    
    /*Method to print the menu for user
     * Input: none
     * Output: Prints the menu in the console
     */
    static void Menu(){
        System.out.print("\n\n---------------MAIN MENU---------------\n"
                       + "1. Read Text Input\n"
                       + "2. Hash Input Text to Hash Table\n"
                       + "3. Display Words and Occurences\n"
                       + "4. Display Efficiency Outputs\n" 
                       + "5. Exit Program\n" 
                       + "\nEnter option number: ");
    }

    /*Take user input and make sure it's an integer
     * Input: scanner
     * Output: integer to be used for input
     */
    static int input(Scanner input, String question){
        while(!input.hasNextInt()) { //Checks if the entered input is an integer
            input.next();
            System.out.println("Please enter an Integer\n");
            System.out.print(question); 
        }
        int userInput = input.nextInt(); //Get int input
        return userInput;
    }

    static String stringInput(Scanner input){
        String userInput = input.nextLine();
        return userInput;
    }
    
    static void hashFunction(String key, ArrayList<ArrayList<String>> hashTable){
        int index = (int)(key.charAt(0)) - 97;
        ArrayList<String> list = hashTable.get(index);

        for(int i = 0; i < list.size(); i++)
    }
}
