package dsa_cwk_resit;
/**
 *
 * @author liammccann
 */
public class TestBookClass {
   
    /**
  * This is the test book method which is a test harness which creates different objects 
  * showing the use of the getters and setters in the Book class.
  * Two new book objects are created and their data for each field is set and retrieved using 
  * the getters and setters and displayed in an appropriate way.
  */ 
    
    public void testBook(){
    
        
            //Creates two new objects of Book class
            Book HarryPotter = new Book();
            Book TreasureIsland = new Book();
            
            HarryPotter.setISBN("9780747532743");
             HarryPotter.setTitle("Harry Potter and the Philosopher's Stone");
            HarryPotter.setAuthor("J.K Rowling");
            HarryPotter.setPublisher("Bloomsbury");
            HarryPotter.setNoOfPages(223);
            HarryPotter.setPublicationDate("26/06/97");
            HarryPotter.setFormat("Paperback");
            HarryPotter.setGenre("Fantasy Fiction");
            HarryPotter.setNoOfBorrows(22);
     
            TreasureIsland.setISBN("9781593082475");
            TreasureIsland.setTitle("Treasure Island");
            TreasureIsland.setAuthor("Robert Louis Stevenson");
            TreasureIsland.setPublisher("Barnes & Noble");
            TreasureIsland.setNoOfPages(304);
            TreasureIsland.setPublicationDate("01/03/05");
            TreasureIsland.setFormat("Hardback");
            TreasureIsland.setGenre("Adventure Fiction");
            TreasureIsland.setNoOfBorrows(34);
            
            System.out.println("==================================");
            
            System.out.println("ISBN: " + HarryPotter.getISBN());
            System.out.println("Title: " + HarryPotter.getTitle());
            System.out.println("Author: " + HarryPotter.getAuthor());
            System.out.println("Publisher: " + HarryPotter.getPublisher());
            System.out.println("Number of Pages: " + HarryPotter.getNoOfPages());
            System.out.println("Publication date: " + HarryPotter.getPublicationDate());
            System.out.println("Format: " + HarryPotter.getFormat());
            System.out.println("Genre: " + HarryPotter.getGenre());
            System.out.println("Number of Borrows: " + HarryPotter.getNoOfBorrows());
            
            System.out.println("==================================");
            
            System.out.println("ISBN: " + TreasureIsland.getISBN());
            System.out.println("Title: " + TreasureIsland.getTitle());
            System.out.println("Author: " + TreasureIsland.getAuthor());
            System.out.println("Publisher: " + TreasureIsland.getPublisher());
            System.out.println("Number of Pages: " + TreasureIsland.getNoOfPages());
            System.out.println("Publication date: " + TreasureIsland.getPublicationDate());
            System.out.println("Format: " + TreasureIsland.getFormat());
            System.out.println("Genre: " + TreasureIsland.getGenre());
            System.out.println("Number of Borrows: " + TreasureIsland.getNoOfBorrows());
            System.out.println("================================="); 
            
            

  
    }
    
}
