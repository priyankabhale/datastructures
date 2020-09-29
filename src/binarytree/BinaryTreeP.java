package binarytree;

import java.util.Iterator;
import java.util.Stack;

public class BinaryTreeP {
	Node root = null;
	Stack<Integer> stack = new Stack<>();
	
	
	public void name() {
		System.out.println("Binary Tree P");
	}
	
	public BinaryTreeP() {
		System.out.println("BinaryTreeP");
	}

	public BinaryTreeP(int v) {
		Node n = new Node();
		n.value = v;
		root = n;
	}

	public void add(Integer value) {
		Node n = new Node();
		n.value = value;
		addNode(n);
	}

	private void addNode(Node n) {
		Node focus = root;

		while (true) {
			if (n.value < focus.value) {
				if (focus.left == null) {
					focus.left = n;
					return;
				} else {
					focus = focus.left;
				}
			} else {
				while (true) {
					if (focus.right == null) {
						focus.right = n;
						return;
					} else {
						focus = focus.right;
					}
				}
			}
		}
	}

	// Utitlity function to create a new node
	static Node newNode(int data) {
		Node temp = new Node();

		temp.value = data;

		temp.left = null;
		temp.right = null;

		return temp;
	}

	// A utility function to insert a new
	// Node with given key in BST
	static Node insert(Node root, int key) {
		// Create a new Node containing
		// the new element
		Node newnode = newNode(key);

		// Pointer to start traversing from root and
		// traverses downward path to search
		// where the new node to be inserted
		Node x = root;

		// Pointer y maintains the trailing
		// pointer of x
		Node y = null;

		while (x != null) {
			y = x;
			if (key < x.value)
				x = x.left;
			else
				x = x.right;
		}

		// If the root is null i.e the tree is empty
		// The new node is the root node
		if (y == null)
			y = newnode;

		// If the new key is less then the leaf node key
		// Assign the new node to be its left child
		else if (key < y.value)
			y.left = newnode;

		// else assign the new node its right child
		else
			y.right = newnode;

		// Returns the pointer where the
		// new node is inserted
		return y;
	}

	private void inOrderTraversal(Node curr) {
		try {
//			check if the node is null
			if (curr == null)
				return;

//			add it to the stack
			stack.add(curr.value);

//			check if it is a leaf node
			if (curr.left == null && curr.right == null) {

//				print the elements in stack
				Iterator<Integer> itr = stack.iterator();
				while (itr.hasNext()) {
					Integer integer = (Integer) itr.next();
					System.out.print(integer + " ");
				}

//				pop out the last element from stack
				stack.pop();
				System.out.println();
			} else {

//				iterate left side & recurrsive call
				inOrderTraversal(curr.left);

//				iterate right side & recurrsive call
				inOrderTraversal(curr.right);

//				after left and right comeplete iteration pop out stack
				stack.pop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void preOrderTraversal(Node curr) {
		if (curr == null)
			return;

		System.out.print(curr.value + " ");

		preOrderTraversal(curr.left);
		preOrderTraversal(curr.right);
		System.out.println();
	}

	private Node deleteANode(Node curr, int value) {
		if (curr == null)
			return curr;
		if (value < curr.value)
			curr.left = deleteANode(curr.left, value);
		else if (value > curr.value)
			curr.right = deleteANode(curr.right, value);
		else if (curr.value == value) {
//			 case 1 : No child
			if (curr.left == null && curr.right == null) {
				curr = null;
			}
//			case 2 :
			else if (curr.left == null) {
//				 One child to right is present
				Node temp = curr;
				curr = curr.right;
				temp = null;
			} else if (curr.right == null) {
//				 One child to left is present
				Node temp = curr;
				curr = curr.left;
				temp = null;
			}
//			case 3: 2 child are present
			else {
				Node temp = findMinimumInRightSubTree(curr.right);
				curr.value = temp.value;
				curr.right = deleteANode(curr.right, curr.value);
			}
		}
		return curr;
	}

	private Node findMinimumInRightSubTree(Node n) {
		Node curr;
		while (true) {
			if (n.right == null && n.left == null) {
				curr = (n);
				break;
			} else {
				n = n.left;
			}
		}
		return curr;
	}

	// A utility function to do inorder
	// traversal of BST
	static void Inorder(Node root) {
		if (root == null)
			return;
		else {
			Inorder(root.left);
			System.out.print(root.value + " ");
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {
		BinaryTreeP b = new BinaryTreeP(12);

//		Let us create following BST  
//		        50  
//		      /   \  
//		    30     70  
//		    / \    / \  
//		   20 40  60 80 

		Node root = null;
		root = insert(root, 15);
		insert(root, 10);
		insert(root, 30);
		insert(root, 22);
		insert(root, 20);
		insert(root, 45);
		insert(root, 40);
		insert(root, 50);
		insert(root, 25);
		insert(root, 32);
		b.deleteANode(root, 30);
//		b.Inorder(root);
		b.inOrderTraversal(root);
//		b.printPaths(b.root);
//		b.name(10.0f);

	}

	public void name(char a) {
		System.out.println("INT");
	}
	
	public void name(int a) {
		System.out.println("INT");
	}

	public void name(byte b) {
		System.out.println("BYTE");
	}

	public void name(float b) {
		System.out.println("FLOAT");
	}

	public void name(double b) {
		System.out.println("DOUBLE");
	}
}

class Node {
	Integer value;
	Node left;
	Node right;

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}