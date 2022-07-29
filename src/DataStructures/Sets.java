package DataStructures;
import java.util.Objects;


public class Sets implements Set {
    private boolean isInList;
    private  boolean isEmpty = true;
private  ArrayList elements = new ArrayList();

    @Override
    public boolean isEmpty() {
        if(elements.size()!= 0 ) isEmpty = false;
        return isEmpty;
    }

    @Override
    public void add(String item) {
        if(!contains(item))
            elements.add(item);

    }

    @Override
    public void remove(String item) {
        elements.remove(item);

    }

    @Override
    public int size() {
        return elements.size();
    }
    @Override
    public boolean contains(String item){
        for (int i = 0; i < elements.size() ; i++) {
            if (Objects.equals(elements.get(i), item)){
                isInList = true;
                        break;
            } else isInList = false;

        }
        return isInList;
    }

    @Override
    public String get(int key) {
        return null;
    }

}