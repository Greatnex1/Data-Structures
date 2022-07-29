package DataStructures;
import java.util.EmptyStackException;
import java.util.Objects;
public class Stack {
    private  int arrange =  10;

    private ArrayList stackEntries = new ArrayList();

    public boolean isEmpty(){
        return stackEntries.isEmpty();
    }
    public void push(String element){
        if(isEmpty()) throw new EmptyStackException();
        else
            stackEntries.remove(element);
        }

    public void pull(String elements){
        if(size() != arrange){
            stackEntries.add(elements);
        }
        else throw new StackOverflowError();
    }

    private int size() {
        return stackEntries.size();
    }
    public void show(String element){
        if(isEmpty()) throw new EmptyStackException();
        else stackEntries.remove(element);
    }
    public int search (String searches){
        boolean isInStack = false;
        int i = size();
        for(; i > 0; i--){
            if(Objects.equals(stackEntries.get(i), searches)){
                isInStack = true;
                break;
            }
        }
        return i ;
    }
    public String zen(){
return stackEntries.get(size() - 1);
    }
}

