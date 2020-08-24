
package dsa_cwk_resit;

/**
 *
 * @author liammccann
 */
public class LinkedList {

    Node head;
   Object data;
    int size = 0;     

// Add a book to the list.
public void addBook(Object data){
        
   Node new_node = new Node(data);
   
   new_node.next = head;
   head = new_node;
   size++;

    
}
    
//Display a book on screen in an appropriate way.
    public void displayBook()
{

}
//Search for a specific book by Title.
   public void searchByTitle()
   {
   
   }
// Search for a book(s) by a specific Author.
    public void searchByAuthor()
    {
    }
//Display all the books for a given genre in the list.
    
    public void displayByGenre()
    {
    
    }
    
 //Display all the books in the list. 
public void displayAllBooks()
{
 
Node node = head;

while(node.next != null)
    {
        System.out.println(node.data);
        node = node.next;
        System.out.println("==========================");
    }
    System.out.println(node.data);
  
}

//traverses through linked list and prints out data
public void Traverse(){
    
 Node tmp = head;

while(tmp != null) 
  System.out.println(data);  
    tmp = tmp.next;

    }
}

