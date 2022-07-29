package DataStructures;

import javax.naming.LimitExceededException;
import java.util.Objects;

public class Queues implements Queue{
    int number = 10;
    boolean isInQueue = true;
    ArrayList queue = new ArrayList();
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();

    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void add(String item){
            queue.add(item);
//        else


    }

    @Override
    public void set(int index, String item) {
      queue.add(item);

    }

    @Override
    public void remove(String item) {
        queue.remove(item);

    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < queue.size() ; i++) {
            if(Objects.equals(get(1),item)){
                isInQueue = false;
                break;
            }

        }
        return isInQueue;
    }


    @Override
    public String get(int i) {
        return queue.get(i);
    }

    @Override
    public String peek() {
        return (get(0));
    }

    @Override
    public void clear() {
        for (int i = 0; i < queue.size() ; i++) {
            remove(get(i));

        }

    }

    }
