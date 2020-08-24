
package dsa_cwk_resit;


import java.util.Scanner; //imports Scanner

/**
 *
 * @author liammccann
 */
public class RunProject {
    
    /**
     * This is the main menu method which allows the user to see what their options are.
     * It also allows the user to select what they want to do by entering valid inputs.
     * If an invalid input is entered they are re-prompted with the same menu and informs them they must enter an appropriate value.
     */
public  void mainMenu() {
        
        int userInputMain;
        Scanner scan = new Scanner(System.in);
        
         //provides main menu to user by printing a series of strings
        System.out.println("Main Menu:Please enter number between 1 - 5");
        System.out.println("============================================");
        System.out.println("1.Book Test Harness");
        System.out.println("2.Book List ");
        System.out.println("3.Binary Search Tree");
        System.out.println("4.Help");
        System.out.println("5.Quit");
        System.out.println("====================");
         
             
     /* scans users input and decides what to do based on the input. 
        Depending on the number entered the user will be navigated to either a different menue, help screen or quit's the program.
        if number is other than 1,2,3,4,5 / user enters an ivalid character/string 
        then the method is run again and user is promt'ed with the same menu */
             
             if(scan.hasNextInt())
             {
        userInputMain = scan.nextInt();
          
        switch(userInputMain){
          
         case 1:  
                 
                 TestBookClass test1 = new TestBookClass();
                 test1.testBook();
                 mainMenu();
             break;
            
         case 2: 
                 System.out.println("===============");
                 bookListMenu();
             break;
             
         case 3: 
                 System.out.println("===============");
                 binarySearchTree();
              break;
          case 4:
                  System.out.println("===============");
                  Help();
             break;
          case 5: System.out.println("===============");
                      Quit();
              
                 default: 
                          System.out.println("=============================");
                     mainMenu();
                     
                   }
             }
             else
             {
                 System.out.println("============================");
                 System.out.println("Please enter an appropriate value");
                 mainMenu();
                 
             }
                     
         }
    
/**
 * This is the book list menu which allows the user to see their options related to the BookList class and also allows them to select 
 * what option they want the program to perform.
 */
public  void bookListMenu() {
    
    BookList blist1 = new BookList();
                
    blist1.testHarness(); //runs test harness method which add's 5 books to a linked list
    int userInputList = 0; //initialises userInputList variable
   
      
           System.out.println("Book List: Please enter number between 1 - 7");
           System.out.println("==========");
           System.out.println("1.Add a book to list");
           System.out.println("2.Display a book on screen");
           System.out.println("3.Search for a specific book by Title.");
           System.out.println("4.Search for a book(s) by a specific Author.");
           System.out.println("5.Display all the books for a given genre in the list.");
           System.out.println("6.Display all the books in the list.");
           System.out.println("7.Return to main Menu");
           System.out.println("====================");
 
            Scanner scan = new Scanner(System.in);
         
            
            /*
            *Validates that user has entered an integer and then based on the value entered runs appropriate code.
            */
            if(scan.hasNextInt())
            {
                
           userInputList = scan.nextInt();
        switch(userInputList){
            
           case 1: 
           blist1.addNewBook();
           bookListMenu();
           
               break;
            case 2: System.out.println("You've picked Display a book on screen");
                
            break;
            case 3: System.out.println(" You've picked Search for a specific book by Title");
                break;
            case 4: System.out.println("You've picked Search for a book(s) by a specific Author");
                break;
            case 5: System.out.println("You've picked Display all the books for a given genre in the list");
                break;
            case 6: System.out.println("You've picked Display all the books in the list");
                   blist1.DisplayAllBooks();
                   bookListMenu();
            
                break;
            case 7: System.out.println("You've picked Return to main Menu");
                    mainMenu();
                     break;
                       
                default: System.out.println("please pick option between 1 - 7");
                System.out.println("=============================");
                     bookListMenu();
        }
            }
            else
            {
                System.out.println("please pick a number between 1 - 7");
                bookListMenu();
                
            }

   }
   
/**
 * This is the binary search tree menu which allows the user to see their options related to bookBST class.
 * Initially loads data from external file, reads file and then closes the file.
 * 
 */
public  void binarySearchTree() {
            
  int userInputBSTree;
  Scanner scan = new Scanner(System.in);
  
   bookBST r = new bookBST();
      r.LoadData();
      r.readFile();
      r.closeFile();
       
  //runs until user enters valid input
    
          System.out.println("BSTree:");
          System.out.println("==========");
          System.out.println("1.Display a list of all the books in ascending Author order");
          System.out.println("2.Display a list of all the books in descending Author order");
          System.out.println("3.Display a list of all the books that are available");
          System.out.println("4.Display a list of all the Author names for all the books");
          System.out.println("5.Return to Main Menu");
          System.out.println("====================");
                
          
              
            if(scan.hasNextInt())
            {
                
           userInputBSTree = scan.nextInt();
        
            
           //switch statment used for executing different lines of code based on users input.
    switch(userInputBSTree){
                
        case 1: System.out.println("You've picked Add a book to list");
            break;
               
        case 2: System.out.println("You've picked Display a book on screen");
            break;
               
        case 3: System.out.println(" You've picked Search for a specific book by Title");
            break;
                
        case 4: System.out.println("You've picked Search for a book(s) by a specific Author");
            break;
                
        case 5: System.out.println("You've picked Display all the books for a given genre in the list");
                mainMenu();
            break;
        case 6: System.out.println("You've picked Display all the books for a given genre in the list");
                Quit();
            break;
                           
            default: System.out.println("please pick option between 1 - 6");
            System.out.println("======================================");
                binarySearchTree();

            }
            }
            
        else{
                 System.out.println("please pick a number between 1 - 6");
                binarySearchTree();
                
                }
        
//woking here
           
   

}

/**
 * This is the quit method that terminates program when called.
 */
 public  void Quit() {
     System.out.println("Goodbye");
     System.exit(0);
}
 
 /**
  * This is the help method which displays varying different options for the user to understand 
  * more about each section of the program.
  */
 public  void Help() {
   int userinput = 0;
    Scanner scan = new Scanner(System.in);
   /*
    Displays prompts describing each of the different options in more detail.
    */
        System.out.println("Enter '1': To Show test Harness showing use of appropriate getters and setters ");
        System.out.println("Enter '2': To navigate to bookListMenu for more options related to the BookList Class. i.e. part 2 of project. ");
        System.out.println("Enter '3': To naviigate to binarySearchTree menu for more options related to bookBST class. i.e. part 3 of the project.  ");
        System.out.println("Enter '4': To navigate you to the help menu(Here) which shows you what to enter.");
        System.out.println("Enter '5': To end the program.");
        
       
         System.out.println("Please Enter 1 to return to main menu.");
        /*
         validates that the user enters appropriate value
         */

            if(scan.hasNextInt())
            {
        userinput = scan.nextInt();
            }
            else
            {
            System.out.println("please enter 1 to return to main menu.");
            Help();
            
            }
         if(userinput == 1){
              mainMenu();
            }
        else
         {
              System.out.println("please enter 1 to return to main menu.");
            Help();
         }
        
  
    }
 
}
