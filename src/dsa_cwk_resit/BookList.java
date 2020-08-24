package dsa_cwk_resit;
import java.util.Scanner;


/**
 *
 * @author liammccann
 * This class holds a collection of books which are stored using a linked list.
 * this class also provides methods which implement the abstract methods defined in the IADTbookList interface.
 */
public class BookList implements IADTbookList {
 
   //Link list object created 
    LinkedList LL = new LinkedList();
    Scanner s = new Scanner(System.in); // scanner object created
    
    //Five different Book objects created(As part of test harrness)
   
     Book HarryPotter = new Book();
     Book TreasureIsland = new Book();
     Book ToKillAMockingbird = new Book();
     Book TheGreatGatsby = new Book();
     Book LordOfTheFlies = new Book();
      Book newBook = new Book();
    
    
     
     /**
      * This method is used to create 5 different objects and set each of their variables.
      * We can test each method using these objects.
      */
  public  void testHarness()
  {


            TreasureIsland.setISBN("9781593082475");
            TreasureIsland.setTitle("Treasure Island");
            TreasureIsland.setAuthor("Robert Louis Stevenson");
            TreasureIsland.setPublisher("Barnes & Noble");
            TreasureIsland.setNoOfPages(304);
            TreasureIsland.setPublicationDate("01/03/05");
            TreasureIsland.setFormat("Hardback");
            TreasureIsland.setGenre("Adventure Fiction");
            TreasureIsland.setNoOfBorrows(34);
  
            ToKillAMockingbird.setISBN("9780847910779");
            ToKillAMockingbird.setTitle("To Kill a Mockingbird");
            ToKillAMockingbird.setAuthor("Harper Lee");
            ToKillAMockingbird.setPublisher("J. B. Lippincott & Co.");
            ToKillAMockingbird.setNoOfPages(281);
            ToKillAMockingbird.setPublicationDate("11/07/1960");
            ToKillAMockingbird.setFormat("Hardcover");
            ToKillAMockingbird.setGenre("Domestic Fiction");
            ToKillAMockingbird.setNoOfBorrows(32);

            TheGreatGatsby.setISBN("9780130641434");
            TheGreatGatsby.setTitle("The Great Gatsby");
            TheGreatGatsby.setAuthor("F. Scott Fitzgerald");
            TheGreatGatsby.setPublisher("Charles Scribner's Sons");
            TheGreatGatsby.setNoOfPages(218);
            TheGreatGatsby.setPublicationDate("10/07/1925");
            TheGreatGatsby.setFormat("Hardcover");
            TheGreatGatsby.setGenre("Tragedy Fiction");
            TheGreatGatsby.setNoOfBorrows(17);
     
            LordOfTheFlies.setISBN("9788520904459");
            LordOfTheFlies.setTitle("Lord of The Flies");
            LordOfTheFlies.setAuthor("William Golding");
            LordOfTheFlies.setPublisher("Faber and Faber");
            LordOfTheFlies.setNoOfPages(224);
            LordOfTheFlies.setPublicationDate("17/09/1954");
            LordOfTheFlies.setFormat("PaperBack");
            LordOfTheFlies.setGenre("Psychological Fiction");
            LordOfTheFlies.setNoOfBorrows(23);
            
            HarryPotter.setISBN("9780747532743");
            HarryPotter.setTitle("Harry Potter and the Philosopher's Stone");
            HarryPotter.setAuthor("J.K Rowling");
            HarryPotter.setPublisher("Bloomsbury");
            HarryPotter.setNoOfPages(223);
            HarryPotter.setPublicationDate("26/06/97");
            HarryPotter.setFormat("Paperback");
            HarryPotter.setGenre("Fantasy Fiction");
            HarryPotter.setNoOfBorrows(22);
  
            LL.addBook(HarryPotter);
            LL.addBook(TreasureIsland);
            LL.addBook(ToKillAMockingbird);
            LL.addBook(TheGreatGatsby);
            LL.addBook(LordOfTheFlies);
         
  }
    


/**
 * This method allows the user to create a new book object, set each of its variables and add the new book to the linked list.
 *
 */

    @Override
  public void addNewBook(){
        //Double check that all data entered is there and...
         //that temp and num are implemented properly
   
    
    //Sets appropriate variables for new book object.
    
         
         String temp;
         int num;
         
         System.out.println("Please enter Your Books ISBN");
         temp =  s.nextLine();
         newBook.setISBN(temp);
            
         System.out.println("Please enter Your Books Title");
         temp =  s.nextLine();
         newBook.setTitle(temp);
            
         System.out.println("Please enter Your Books Author");
         temp =  s.nextLine();
         newBook.setAuthor(temp);
            
         System.out.println("Please enter Your Books Publisher");
         temp =  s.nextLine();
         newBook.setPublisher(temp);
     
         System.out.println("Please enter Your Books Publication Date");
         temp =  s.nextLine();
         newBook.setPublicationDate(temp);
            
         System.out.println("Please enter Your Books Format");
         temp =  s.nextLine();
         newBook.setFormat(temp);
            
         System.out.println("Please enter Your Books genre");
         temp =  s.nextLine();
         newBook.setGenre(temp);
 
       System.out.println("Please enter the number of pages your book has");   
       while(!s.hasNextInt()){
       System.out.println("Please only enter numbers");
       s.next();
 }
      num = s.nextInt();
      newBook.setNoOfPages(num);
        
    
     System.out.println("Please enter Your Books Number Of Borrows");
      while(!s.hasNextInt()){
     System.out.println("Please only enter numbers");
     s.next();
 }   
      num =  s.nextInt();
      newBook.setNoOfBorrows(num);
            
      
      
         LL.addBook(newBook); //adds new book object to linked list
           
   
  }
     
/**
 * This method allows the user to select a book they want to see and displays it and its attributes in an 
 * appropriate way.
 */

 public void displayBook(){
        
        
     }
 
 /**
  * This method allows the user to search for a specific book by its title. 
  */

public void searchSpecificBookByTitle(){
     
     }
/**
 *  This method allows the user to search for a specific book/s by its Author. 
 */


public void searchBooksByAuthor(){
     
     }

 /**
 * This method allows the user to display all books by a genre.
 */
 public void DisplayAllBooksByGenre(){
     
     
     
     }
 
 /**
  * This method displays all books in the linked list in an appropriate way.
  */

public void DisplayAllBooks(){
     
     LL.displayAllBooks();
         
      
        
            
            
     }

}



     
      