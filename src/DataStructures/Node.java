package DataStructures;

public class Node {
    private Object contents;
    private Node view;
    private int index;

    public Node() {}
    public Node(int index, Object contents){
        this.index = index;
        this.contents = contents;
       view = new Node();

        view.setContent(index);
        view.setIndex(this.index + 1);

    }

    private void setIndex(int index) {
        this.index = index;
    }

    public void setContent(Object content) {
        this.contents = content;
    }
public Object getContent(){
        return contents;
}
public void setNext(Node next){
        this.view = next;

}
public Node getNext(){
        return view;
}


@Override
    public String toString(){
        return String.format("%s", getContent());
}

}
