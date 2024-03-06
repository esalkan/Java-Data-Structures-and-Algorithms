package JDSA_06_Tree_Data_Structure.Examples.BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		int[] bst_array = {25,20,36,10,22,30,40,5,12,28,38,48};
		
		BinarySearchTree tree = new BinarySearchTree(bst_array,12);

		System.out.println(tree.rotatedDepict());

		Node result1 = tree.findMaxSmaller(5);
		if (result1 != null){
			System.out.println(result1.element);
		}else {
			System.out.println("Verilen sayidan kucuk eleman bulunamadi.");
		}

		Node result2 = tree.findMaxSmaller(28);
		if (result2 != null){
			System.out.println(result2.element);
		}

		Node result3 = tree.findMaxSmaller(38);
		if (result3 != null){
			System.out.println(result3.element);
		}
	}
}
