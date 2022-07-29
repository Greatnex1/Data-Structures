package DataStructures;

public interface Set {
    boolean isEmpty();
    void add (String item);

    void remove(String item);

    int size();

    boolean contains(String item);

    String get(int key);
}

