import java.util.*;

public class TreesExample {
	static Node root; 
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int d){
			data = d;
			left=right=null;
		}
	}
	
	
	//Prints tree inorder traversal
	public void inorder(Node root){
		if(root == null)
			return;
		
		if(root.left != null){
			inorder(root.left);
		}
		System.out.print(root.data + " ");
		if(root.right != null)
			inorder(root.right);
	}
	
	//Prints tree pre-order traversal
		public void preorder(Node root){
			if(root == null)
				return;
			System.out.print(root.data + " ");
			if(root.left != null){
				preorder(root.left);
			}
			if(root.right != null)
				preorder(root.right);
		}
		
		//Prints tree post-order traversal
		public void postorder(Node root){
			if(root == null)
				return;
			
			if(root.left != null){
				postorder(root.left);
			}
			
			if(root.right != null)
				postorder(root.right);
			System.out.print(root.data + " ");
		}
		
		public int getSize(Node root){
			if(root == null)
				return 0;
			int leftSize = getSize(root.left);
			int rightSize = getSize(root.right);
			return leftSize + rightSize + 1;
		}
		
		public boolean isValidBST(Node root){
			return isValidBSTUtil(root, Integer.MIN_VALUE , Integer.MAX_VALUE);
		}
		private boolean isValidBSTUtil(Node root , int min , int max){
			if(root == null)
				return true;
			
			if(root.data < min || root.data > max)
				return false;
			
			return (isValidBSTUtil(root.left , min , root.data -1 ) && isValidBSTUtil(root.right , root.data + 1 , max));
		}
	
	public static void main(String args[]){
		TreesExample tl = new TreesExample();
		root = new Node(5); 
        root.left = new Node(4); 
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(7); 
        root.right.left = new Node(6); 
        root.right.right = new Node(9);
        
        System.out.println("Inorder traversal : ");
        tl.inorder(root);
        System.out.println();
        System.out.println("Preorder traversal : ");
        tl.preorder(root); 
        System.out.println();
        System.out.println("Postorder traversal : ");
        tl.postorder(root);
        
        System.out.println();
        int s = tl.getSize(root);
        System.out.println("Size of tree  : "+s);
        
        System.out.println();
        boolean isBST = tl.isValidBST(root);
        System.out.println("Is the tree valid BST ?  : "+ isBST);
	}
}
