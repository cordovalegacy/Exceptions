import java.util.ArrayList;
import static java.lang.System.out;

class App {
    public static void main(String[] args){

        out.println("<----Running App---->");

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++){
            // out.println("Values in Array List: " + myList.get(i));
            try{
                Integer castedValue = (Integer)myList.get(i);
                out.println("<---Casted Value--->" + castedValue);
            }
            catch(ClassCastException e){
                out.println("Can't do that!" + e);
            }
        }

    } 
}