package DataStructures;

public class LinkedList {
    private Node nodes;
    private int size;
    private Object well;

    public int size() {
        return size;
    }

    public Node get(int index) {
        Node accessNode = null;
        if (index == 0) accessNode = this.nodes;
        else if (index == 1) accessNode = this.nodes.getNext();
        else {
            accessNode = this.nodes.getNext();
            for (int i = 0; i < index; i++) {
                accessNode = accessNode.getNext();

            }
        }
        return accessNode;
    }

    public Node getLast() {
        return get(size - 1);
    }

    public Node getFirst() {
        return this.nodes;
        //        return get(size++); }
    }

    public void add(Object items) {
        if (size == 0) {
            addFirst(items);
        } else {
            addFirst(items);
        }
    }


    public void addFirst(Object item) {
        nodes = new Node(0, item);
        size++;
//        this.well = item;
    }

    public void addLast(Object items) {
        nodes = new Node(size, items);
        getLast().setNext(nodes);
        size++;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <size ; i++) {
            build.append(get(i).getContent());
            if(i < size - 1){
                build.append(" ");
            }

        }
        return String.valueOf(build);
      /*  return "LinkedList{" +
                "nodes=" + nodes +
                ", size=" + size +
                ", well=" + well +
                '}';
       */

   }

    public void remove(int index){
        get(index - 1).setNext(get(index).getNext());
    for (int i = index; i < size; i++) {
        get(i).setNext(get(i+1));

    }
    size--;

}
    public void removeFirst(){
        nodes = nodes.getNext();
        for (int i = 0; i < size; i++) {
            get(i).setNext(get(i +1));
        }
        size--;

    }
    public void removeLast(){
        get(size - 2).setNext(get(size - 1).getNext());
        size--;
    }
    }
