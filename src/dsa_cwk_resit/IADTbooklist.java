
package dsa_cwk_resit;

/**
 *
 * @author liammccann
 */
 interface IADTbookList {
    
  //Add a book to the list.
    /**
     *
     */
      void addNewBook();
     //Display a book on screen in an appropriate way. 
    /**
     *
     */
       void displayBook();
      //Search for a specific book by Title.
    /**
     *
     */
       void searchSpecificBookByTitle();
     //Search for a book(s) by a specific Author.

    /**
     *
     */
       void searchBooksByAuthor();
     //Display all the books for a given genre in the list.
    /**
     *
     */
    void DisplayAllBooksByGenre();
    
     //Display all the books in the list.
    /**
     *
     */
      void DisplayAllBooks();
 

}
