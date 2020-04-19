package Tree;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	void insertItem(int i) {
		Node newNode = new Node();
		newNode.value = i;
		if (root == null) {
			root = newNode;
			return;
		}
		Node p = root;
		Node c = root;
		while (c != null) {
			p = c;
			if (i < c.value)
				c = c.leftnode;
			else
				c = c.rightnode;
		}
		if (i < p.value)
			p.leftnode = newNode;
		else
			p.rightnode = newNode;
	}

	void print(Node n) {
		Node p = n;
		if (p != null) {
			System.out.println(p.value);
			print(p.leftnode);
			print(p.rightnode);
		}
	}

	Node findNode(int i) {
		Node c = root;
		while (c != null) {
			if (c.value == i) {
				return c;
			} else if (i < c.value) {
				c = c.leftnode;
			} else {
				c = c.rightnode;
			}
		}
		System.out.println("Not found " + i);
		return null;
	}

	Node findParent(int val) {
		Node p = root;
		Node c = root;
		while (c != null) {
			if (val == c.value) {
				break;
			}
			p = c;
			if (val < c.value) {
				c = c.leftnode;
			} else {
				c = c.rightnode;
			}
		}
		System.out.println("Parent of " + val + " is : " + p.value);
		if (c != null)
			return p;
		else
			return null;
	}

	public void delete(Integer data) {

		deleteNode(this.root, data);
	}

	private Node deleteNode(Node root, int data) {

		if (root == null)
			return root;

		if (data < root.value) {
			root.leftnode = (deleteNode(root.leftnode, data));
		} else if (data > root.value) {
			root.rightnode = (deleteNode(root.rightnode, data));
		} else {
			// node with no leaf nodes
			if (root.leftnode == null && root.rightnode == null) {
				System.out.println("deleting " + data);
				return null;
			} else if (root.leftnode == null) {
				// node with one node (no leftnode)
				System.out.println("deleting " + data);
				return root.rightnode;
			} else if (root.rightnode == null) {
				// node with one node (no right node)
				System.out.println("deleting " + data);
				return root.leftnode;
			} else {
				// find the (minimum in the right subtree) / (maximum in left subtree) 
				// copy that minimum/maximum value in the targeted node 
				// delete the duplicate from the
				int minValue = minValue(root.rightnode);
				root.value = (minValue);
				root.rightnode = (deleteNode(root.rightnode, minValue));
				System.out.println("deleting " + data);
			}
		}

		return root;
	}

	private Integer minValue(Node node) {

		if (node.leftnode != null) {
			return minValue(node.leftnode);
		}
		return node.value;
	}

	public void inOrderTraversal() {
		doInOrder(this.root);
	}

	private void doInOrder(Node root) {

		if (root == null)
			return;
		doInOrder(root.leftnode);
		System.out.print(root.value + " ");
		doInOrder(root.rightnode);
	}

	Node findMinimum(Node n) {
		int v = n.value;
		Node temp = n;
		while (n != null) {
			if (v > n.value) {
				v = n.value;
				temp = n;
			}
			n = n.rightnode;
		}
		return temp;
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insertItem(8);
		binaryTree.insertItem(4);
		binaryTree.insertItem(5);
		binaryTree.insertItem(10);
		binaryTree.insertItem(19);
		binaryTree.insertItem(9);
		binaryTree.insertItem(11);
		binaryTree.insertItem(23);
		binaryTree.insertItem(20);
		binaryTree.insertItem(28);

//		binaryTree.print(binaryTree.findNode(4));

//		binaryTree.findParent(5);

		binaryTree.delete(19);
		binaryTree.print(binaryTree.findNode(8));

	}

	class Node {
		Node leftnode;
		int value;
		Node rightnode;
	}
}
/*
 * void deleteNode(int i) { Node p = root; Node c = root; while (c != null) { if
 * (i == c.value) break;
 * 
 * p = c; if (i < c.value) c = c.leftnode; else c = c.rightnode; }
 * 
 * // node with no leaf nodes if (c.leftnode == null && c.rightnode == null) {
 * if (p.leftnode != null && p.leftnode.value == i) p.leftnode = null; else if
 * (p.rightnode != null && p.rightnode.value == i) p.rightnode = null;
 * System.out.println("deleteing data : " + i); } // node with one leaf node on
 * LEFT else if (c.rightnode == null) { p.leftnode = c.leftnode;
 * System.out.println("deleteing data with one leaf node on LEFT: " + i); } //
 * node with one leaf node on RIGHT else if (c.leftnode == null) { p.rightnode =
 * c.rightnode;
 * System.out.println("deleteing data with one leaf node on RIGHT: " + i); }
 * else { // find the (minimum in the right subtree) / (maximum in left sub
 * tree) Node min = findMinimum(c.rightnode); // copy that minimum/maximum value
 * in the targeted node c.value = min.value; // delete the duplicate from the
 * node deleteNode(c.rightnode); } }
 * 
 * void deleteNode(Node n) { System.out.println(n); }
 */
