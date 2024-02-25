package stackdemo;

import java.util.ArrayList;
import java.util.List;

public class LifoManager {

    public static final int MAX_STACK_SIZE = 5;


 //   List<String> stringList = new ArrayList<>(MAX_STACK_SIZE);

String[] stringArray = new String[MAX_STACK_SIZE];


    // Put element on the top
    public boolean push(String newElement) {
       // stringArray.add(newElement);
        return true;
    }



    // Pop element from the top
    public String pop() {
     //   stringArray.remove(stringArray.length);
        return "";
    }

    // Remove all elements from stack
    public void clear() {
      //  stringArray.clear();
    }

// Stack status operations
// Is stack empty?
    public boolean isEmpty() {
        return true;
    }

    // Is stack full?
    public boolean isFull() {  return true;}

    // How many elements in stack?
    public int size() {return 0;}
    // Capacity of stack?
    public int getCapacity() {return 0;}
    // Outputs the elements in the stack
    public void showElements() {}
}
