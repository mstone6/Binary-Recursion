package Week6;

/**
 * @author Mushka Stone
 * Week 6 Recursive Binary
 * 11/7/2023
 * 
 * Question 2: Add Nodes to a Binary Tree and Print In-Order Recursively
 * Create a binary tree data structure and write two recursive functions:
 * Add nodes to the binary tree 
 *Print the values of nodes in the binary tree in an in-order traversal using a recursive algorithm.
 *In an in-order traversal, you should print the values of nodes in the following order: left child, current node, 
 *right child.
 
 */

public class RecursiveBinaryTree <T extends Comparable<T>, E>{
		
	public class TreeNode<T>{
		private T data;
		private TreeNode<T> left;
		private TreeNode<T> right;
		
		public TreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

		private TreeNode<T>root;
		
		public void insert(T data) {
			root = addRecursive(root, data);
		}
		
		//Lets add nodes to the Binary Tree
		private TreeNode<T> addRecursive(TreeNode<T>root, T data){
			if(root == null) {
				
				return new TreeNode<>(data);
			}
			
			//Lets make a comparator
			int comparison = data.compareTo(root.data);
			if(comparison < 0) {
				root.left = addRecursive(root.left, data);
		} 
			else if(comparison > 0) {
			root.right = addRecursive(root.right, data);
		}
			
				
		
	return root;
	}



	//Now lets call the traversal to print 
	public void printInOrder() {
		printRecursive(root);
	}
	
	private void printRecursive(TreeNode<T> node) {
		if(node !=null) {
			printRecursive(node.left);
			System.out.println(node.data);
			printRecursive(node.right);
		}
	
	}
	//Now lets do main
	public static void main(String[]args) {
		RecursiveBinaryTree binary = new RecursiveBinaryTree();
		
		//Lets add to it
		binary.insert(5);
		binary.insert(6);
		binary.insert(7);
		binary.insert(8);
		binary.insert(9);
		binary.insert(10);
		binary.insert(11);
		binary.insert(12);
	
		binary.printInOrder();
	}

}
