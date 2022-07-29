package DataStructures;

public interface Map {
    boolean isEmpty();
    void keep(String key, int value);
    int size();

    void remove(String key);
    String get(String key);
    boolean containsKey(String value);
    Sets entrySet();
    Sets keySet();
    ArrayList values();


}
