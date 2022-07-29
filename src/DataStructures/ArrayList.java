package DataStructures;

import java.util.Objects;

public class ArrayList implements List {

    private int size;
    private int capacity = 5;
    private String[] element = new String[capacity];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        int count = 0;
        for (String str : element) {
            if (str != null) {
                count++;
            }
        }
        if(count== capacity-1){
            int old = capacity;
            capacity *=2;
            String[] freshArray = new String[capacity];
            if (old >= 0) System.arraycopy(element, 0, freshArray, 0, old);
            element = freshArray;
        }
        element[size] = item;
        size++;

    }
    public void print(){
        for (String e : element){
            System.out.println(e);
        }
    }

//    @Override
//    public void add(int i, String value) {
//
//    }

    @Override
    public void remove(String item) {
        String[] tempArray = new String[element.length];
        for (int i = 0; i < tempArray.length; i++) {
            for (String str : element) {
                if (!Objects.equals(str, item)) {
                    tempArray[i] = str;
                    i++;
                }
            }
        }
        element = tempArray;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return element[index];
    }


    @Override
    public int capacity() {
        return capacity;
    }
}


//   int size;
//    private boolean isEmpty = true;
//
//    String[] elements = new String [8];
////    a typical string array contains 16 elements
//
//    @Override
//    public boolean isEmpty() {
//
//    }
//
//   @Override
//    public void add(String item){
//       elements[size++] = item;
//    }
//    @Override
//    public void remove(String item){
//        for (int i = 0; i < elements.length ; i++) {
//            if(item == elements[i]){
//                for (int j = 0; j < elements.length ; j++) {
//                    elements[i]
//
//                }
//
//        }
//                    }
//    }
//        public static Integer[] removeElementUsingCollection( Integer[] arr, int index ){
//            List<> tempList = new ArrayList<String>(Arrays.asList(arr));
//            tempList.remove(index);
//            return tempList.toArray(new Integer[0]);
////        --size;
////         elements[]
////        n effect by this increament because it is not passed into a method
//    }
//    @Override
//    public int size(){
//
//        return size;
//    }
//    @Override
//    public String get[int index]


//size++ when passed in a method increases by +1 affecting the change and when iterated
//adds first before effecting size++
//effects first before adding ++size