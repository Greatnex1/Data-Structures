package DataStructures;

import javax.naming.LimitExceededException;

public interface Queue {
    boolean isEmpty();

    void add (String item) throws LimitExceededException;
    void remove (String item);
    int size();
    void set(int index, String item);
    boolean contains(String item);
    String get(int i);
    String peek();

    void clear();


}
