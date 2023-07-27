public class Kth_Level_Nodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            Node left,right=null;
        }
    }

public static void l(Node root, int level,int k){
    if(root==null)return;
    if(level==k){
        System.out.println(root.data);
        return;
    }
    l(root.left,level+1,k);
    l(root.right,level+1,k);
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k=3;
    l(root,1,k);
    }
}
