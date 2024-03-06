package JDSA_06_Tree_Data_Structure.Examples.BinarySearchTree;

class Node
{
	public int element;
	public Node left;
	public Node right;

	Node(int element)
	{
		this.element = element;
		this.left = this.right = null;
	}

	Node(int element, Node left, Node right)
	{
		this.element = element;
		this.left = left;
		this.right = right;
	}
}

public class BinarySearchTree
{
	Node root;

	public BinarySearchTree()
	{
		root = null;
	}

	public BinarySearchTree(int[] arr, int n)
	{
		if(n == 0)
			root = null;
		else
			for(int i = 0; i < n; i++)
				insert(arr[i]);
	}

	public void insert(int element)
	{
		if(root == null)
			root = new Node(element);
		else
			recursiveInsert(root, element);
	}

	private void recursiveInsert(Node node, int element)
	{
		if(element > node.element)
		{
			if(node.right != null)
				recursiveInsert(node.right, element);
			else
				node.right = new Node(element);
		}else if(element < node.element)
		{
			if(node.left != null)
				recursiveInsert(node.left, element);
			else
				node.left = new Node(element);
		}
	}

	public String rotatedDepict() {
		return rotatedDepict(root, 0);
	}

	private String rotatedDepict(Node root, int depth) {
		StringBuilder result = new StringBuilder();
		if (root != null) {
			result.append(rotatedDepict(root.right, depth + 1));
			for (int i = 0; i < depth; i++) {
				result.append("\t");
			}
			result.append(root.element).append("\n");
			result.append(rotatedDepict(root.left, depth + 1));
		}
		return result.toString();
	}

	public Node findMaxSmaller(int number) {
		return findMaxSmaller(root, number);
	}

	private Node findMaxSmaller(Node root, int number) {
		if (root == null) {
			return null;
		}

		if (root.element < number) {
			Node rightResult = findMaxSmaller(root.right, number);
			return (rightResult != null) ? rightResult : root;
		} else {
			return findMaxSmaller(root.left, number);
		}
	}
}
