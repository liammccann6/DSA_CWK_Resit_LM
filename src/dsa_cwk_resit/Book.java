
package dsa_cwk_resit;

/**
 *
 * @author liammccann
 * This class outlines the attributes a Book object should have and allows the program to set and get each field when needed
 * 
 * 
 */
public class Book {
 
    /**
     * Variable declaration
     */
    
  private String ISBN; 
  private String Title;
  private String Author;
  private String Publisher;
  private int NoOfPages;
  private String PublicationDate; 
  private String format;
  private String Genre;
  private int NoOfBorrows;
  

/**
 * 
 * @return ISBN
 */
    public String getISBN() {
        return ISBN;
    }
/**
 * 
 * @return Title
 */
    public String getTitle() {
        return Title;
    }
/**
 * 
 * @return Author
 */
    public String getAuthor() {
        return Author;
    }
/**
 * 
 * @return Publisher
 */
    public String getPublisher() {
        return Publisher;
    }
/**
 * 
 * @return NoOfPages
 */
    public int getNoOfPages() {
        return NoOfPages;
    }
/**
 * 
 * @return PublicationDate
 */
    public String getPublicationDate() {
        return PublicationDate;
    }
/**
 * 
 * @return format
 */
    public String getFormat() {
        return format;
    }
/**
 * 
 * @return genre
 */
    public String getGenre() {
        return Genre;
    }
/**
 * 
 * @return NoOfBorrows
 */
    public int getNoOfBorrows() {
        return NoOfBorrows;
    }
/**
 * 
 * @param ISBN 
 */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
/**
 * 
 * @param Title 
 */
    public void setTitle(String Title) {
        this.Title = Title;
    }
/**
 * 
 * @param Author 
 */
    public void setAuthor(String Author) {
        this.Author = Author;
    }
/**
 * 
 * @param Publisher 
 */
    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
/**
 * 
 * @param NoOfPages 
 */
    public void setNoOfPages(int NoOfPages) {
        this.NoOfPages = NoOfPages;
    }
/**
 * 
 * @param PublicationDate 
 */
    public void setPublicationDate(String PublicationDate) {
        this.PublicationDate = PublicationDate;
    }
/**
 * 
 * @param format 
 */
    public void setFormat(String format) {
        this.format = format;
    }
/**
 * 
 * @param Genre 
 * 
 */
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
/**
 * 
 * @param NoOfBorrows 
 */
    public void setNoOfBorrows(int NoOfBorrows) {
        this.NoOfBorrows = NoOfBorrows;
    }
/*
   ToString method used for displaying a specific book in an appropriate way.
    */
  @Override
    public String toString(){

      return "ISBN: " + ISBN  + "\n" + "Title: " +  Title  + "\n" +"Author: "+ Author   + "\n" +"Publisher: "+ Publisher   + "\n"+"Number of pages: " + NoOfPages  + "\n" + "Publication date:" + PublicationDate   + "\n"+ "Format: " + format  + "\n" + "Genre: " + Genre  + "\n" + "Number of borrows: " + NoOfBorrows;
    }
  
    
}
