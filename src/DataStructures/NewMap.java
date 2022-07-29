package DataStructures;

import java.util.NoSuchElementException;
import java.util.Objects;

public class NewMap implements  Map{
//    creating an object of Set and Arraylist
    Sets place = new Sets();
    ArrayList item = new ArrayList();


    @Override
    public boolean isEmpty() {
        return place.isEmpty();
    }

    @Override
    public void keep(String key, int value) {
        if(!containsKey(key)){
            place.add(key);
        }
        else{
            for (int i = 0; i < place.size() ; i++) {
                if(Objects.equals(place.get(i), key)){
//                    item.add(i, value);
                    break;
                }

            }
        }

    }

    @Override
    public int size() {
        return place.size();
    }

    @Override
    public void remove(String key) {

        if(!containsKey(key)){
            for (int i = 0; i < place.size() ; i++) {
                if(Objects.equals(place.get(i), key)){
                    place.remove(key);
                    item.remove(key);
                    break;

                }



            }
        }
    }

    @Override
    public String get(String key) {
        int i = 0;
        if(!containsKey(key)) throw new NoSuchElementException("Key does not exist in map");
        else{
            for(; i < place.size(); i++){
                if(Objects.equals(place.get(i), key))
                    break;
            }
        }
        return item.get(i);
    }

    @Override
    public boolean containsKey(String key) {
        return place.contains(key);
    }
    public boolean containsValue(String value) {
        boolean isInsideList = false;
        for (int i = 0; i < item.size() ; i++) {
            if(Objects.equals(item.get(i), item)){
                isInsideList = true;

                break;


            }

        }
        return isInsideList;
    }

    @Override
    public Sets entrySet() {
        Sets entrySet = new Sets();
        for (int i = 0; i < place.size() ; i++) {
            entrySet.add(place.get(i) + "="+ item.get(i));

        }
        return entrySet;
    }

    @Override
    public Sets keySet() {
        Sets keySet = new Sets();
        for (int i = 0; i <place.size(); i++) {
            keySet.add(place.get(i));

        }
        return keySet;
    }

    @Override
    public ArrayList values() {
        ArrayList valueEntries = new ArrayList();
        for (int i = 0; i < item.size() ; i++) {
            valueEntries.add(item.get(i));

        }
        return valueEntries;
    }
}
