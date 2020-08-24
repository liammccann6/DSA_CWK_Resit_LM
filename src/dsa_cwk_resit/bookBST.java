
package dsa_cwk_resit;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author liammccann
 */
public class bookBST {
 
Scanner x = new Scanner(System.in); //scanner inttialised

    /**
     * Loads external file form location.
     * if file can not be found catches exception and prompts user informing them file cannot be found
     */
public void LoadData(){
try{
x = new Scanner(new File("/Users/liammccann/NetBeansProjects/DSA_CWK_Resit/src/dsa_cwk_resit/Books.txt"));

}
catch(Exception e){
    System.out.println("Could not find file");
}
}

/**
 * reads file that has been loaded. 
 * tries to reads each line and stores data in fields in new book object.
 * If data cant be read then exception is thrown prompting user that data was no read and stored in appropriate location.
 */
public void readFile(){

   

Book book1 = new Book();

try{
   

book1.setISBN(x.nextLine());
book1.setTitle(x.nextLine());
book1.setAuthor(x.nextLine());
book1.setPublisher(x.nextLine());
book1.setNoOfPages(x.nextInt());
book1.setPublicationDate(x.nextLine());
book1.setFormat(x.nextLine());
book1.setGenre(x.nextLine());
book1.setNoOfBorrows(x.nextInt());

    
  
System.out.println(book1.getNoOfPages());
}

catch(Exception z)
        {
        System.out.println("data could not be read/ stored in appropriate location");
        }



}
/** 
 * Method closes file that has been loaded and read from.
 */
public void closeFile(){
    
    try{
        x.close();
    
    }
    catch(Exception e){
        System.out.println("File could not be closed");
    }
    
}

}







