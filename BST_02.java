import java.util.*;
public class BST_02 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node mirror(Node root){
        if(root==null)return null;
        Node leftsubtree=mirror(root.left);
        Node rightsubtree=mirror(root.right);
        root.left=rightsubtree;
        root.right=leftsubtree;
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node balanced(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=balanced(arr, st, mid-1);
        root.right=balanced(arr, mid+1, end);
        return root;

    }
public static void getinorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
}
public static Node createBST(ArrayList<Integer>inorder,int st,int end){
    if(st>end){
        return null;
    }
    int mid=(st+end)/2;
    Node root=new Node(inorder.get(mid));
    root.left=createBST(inorder, st, mid-1);
    root.right=createBST(inorder, mid+1, end);
    return root;
}
    public static Node balancedBST(Node root){
        ArrayList<Integer>inorder=new ArrayList<>();
        getinorder(root, inorder);
       root= createBST(inorder, 0, inorder.size()-1);
        return root;
         
    }
    public static void main(String[] args) {
        // Node root=new Node(8);
        // root.left=new Node(5);
        // root.right=new Node(10);
        // root.left.left=new Node(3);
        // root.left.right=new Node(6);
        // root.right.right=new Node(11);
        // Node sample=mirror(root);
        // preorder(sample);
        // int arr[]={3,5,6,8,10,11,12};
        // Node sample02=balanced(arr, 0, arr.length-1);
        //  preorder(sample02);

        //second
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=balancedBST(root);
        preorder(root);
    }
}
