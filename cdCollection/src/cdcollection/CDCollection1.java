
package cdcollection;
import java.text.NumberFormat;
/**
 * AP Computer Science
 * @author Spencer Cheng
 * 
 */
public class CDCollection1 {
    private ListNode collection;
    private int count;
    private double totalCost;
    
    public CDCollection1()
    {
        collection = null;
    }
    public void addCD (CD cd)
    {
        ListNode node = new ListNode (cd, null);
        ListNode current;
        
        if( collection ==null){
            collection = node;
        }
        else{
            current = collection;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(node);
        }
    }
    public String toString()
    {
      String result = "";
      ListNode current = collection;
      while (current != null){
          result += current.getValue().toString() + "\n";
          current = current.getNext();
        }
      return result;
    }
    
    
}
