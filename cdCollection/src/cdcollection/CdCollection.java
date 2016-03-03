package cdcollection;

/**
 *
 * @author Insert your name here
 */
public class CdCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CDCollection1 list = new CDCollection1();
        list.addCD(new CD("Runaway", "Bob Jones", 5.70, 1));
        list.addCD(new CD("Different", "Caroline King", 12.40, 2));
        list.addCD(new CD("LOLOL", "Fun", 12.40, 3));
        list.addCD(new CD("Under Pressure", "Logic", 11.30, 4));
        list.addCD(new CD("Runaway", "Bob Jones", 2.40, 5));
        
        System.out.println(list);
    }
    
}
