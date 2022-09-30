package DataStructures;

public class IntTreeNode {
    /* a data structure type that is composed of interconnected nodes
    Binary trees are a natural structure for storing data relationships
     */
    public int data;
    public  IntTreeNode left;
    public  IntTreeNode right;

    public  IntTreeNode(int data){
        this(data,null,null);
    }
    public  IntTreeNode(int data,IntTreeNode left, IntTreeNode right){
        this.data= data;
        this.left = left;
        this.right = right;

    }
}
