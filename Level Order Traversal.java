import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root)    
    {
    if(root == null)
        return;
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while(q.size()!=0){
        System.out.print(q.peek().data +" ");

        Node temp = q.poll();
        if(temp.left!=null)
            q.add(temp.left);
        if(temp.right!=null)
            q.add(temp.right);

    }        
            
    }
    
	public static Node insert(Node root, int data) {