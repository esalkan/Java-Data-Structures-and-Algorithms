package JVYA_06_Tree_Data_Structure;
import java.util.*;

public class _01_Tree_Data_Structure {

    /*
     * Ağaç yapısı genellikle bir hiyerarşik veri yapısı olarak kullanılır.
     * İkili ağaçlar (BinaryTrees) en temel ağaç yapısıdır.
     * İkili ağaçlar, her düğümün en fazla iki çocuğa sahip olduğu bir ağaç yapısıdır.
     * Bu çocuklar genellikle sol ve sağ olarak adlandırılır.
     *
     * Ağaç yaısı genellikle "Node" adında bir sınıf kullanılarak temsil edilir.
     *
     * Bu sınıfın her bir örneği bir ağaç düğümünü temsil eder.
     *
     * "Node" sınıfı genellikle aşağıdaki özelliklere sahiptir:
     *      1. Element: Düğümün değerini temsil eden bir değişken.
     *      2. Left child: Düğümün sol çocuğunu temsil eden bir referans.
     *      3. Right child: Düğümün sağ çocuğunu temsil eden bir referans.
     *
     * Ağaç yapısının temel işlevleri şunlardır:
     *      1. Ekleme (Insertion): Ağaca yeni bir düğüm ekler.
     *      2. Silme (Deletion): Ağaçtan bir düğümü siler.
     *      3. Arama (Search): Ağaçta belirli bir düğümü arar.
     *      4. Dolaşma (Traversal): Ağaçtaki düğümleri belirli bir sırayla ziyaret eder.
     *      5. Düğüm sayısı (Number of nodes): Ağaçtaki düğüm sayısını döndürür.
     *      6. Yükseklik (Height): Ağacın yüksekliğini döndürür.
     *      7. Minimum değer (Minimum value): Ağaçtaki en küçük değeri döndürür.
     *      8. Maksimum değer (Maximum value): Ağaçtaki en büyük değeri döndürür.
     *      9. Denge (Balance): Ağacın dengeli olup olmadığını kontrol eder.
     *      10. Ağaç oluşturma (Tree creation): Ağaç oluşturur.
     *      11. Ağaç temizleme (Tree clearing): Ağacı temizler.
     *      12. Ağaç birleştirme (Tree merging): İki ağacı birleştirir.
     *      13. Ağaç kopyalama (Tree copying): Ağacı kopyalar.
     *      14. Ağaç karşılaştırma (Tree comparison): İki ağacı karşılaştırır.
     *      15. Ağaç dönüşümü (Tree conversion): Ağacı farklı bir veri yapısına dönüştürür
     *      16. Ağaç sıralama (Tree sorting): Ağacı sıralar.
     *      17. Derinlik Ölçekli Dolaşma (Depth-First Traversal): Ağacı derinlik öncelikli olarak dolaşır.
     *      18. Genişlik Ölçekli Dolaşma (Breadth-First Traversal): Ağacı genişlik öncelikli olarak dolaşır.
     *      19. Düzgün Ağaç Oluşturma (Balanced Tree Creation): Düzgün bir ağaç oluşturur.
     *      20. Alt Ağaçları Bulma (Finding Subtrees): Belirli bir düğümün alt ağaçlarını bulur.
     *      21. Ağaçta Tekrarlanan Elemanları Bulma (Finding Duplicate Elements in a Tree): Ağaçta tekrarlanan elemanları bulur.
     *      22. Ağacın Yükseklik Dengesini Düzeltme (Balancing) (Balancing the Height of a Tree): Ağacın yükseklik dengesini düzeltir.
     *      23. Belirli Bir Derinlikteki Düğümleri Listeleme (Listing Nodes at a Specific Depth): Belirli bir derinlikteki düğümleri listeler.
     *      24. Derinlik Hesaplama (Depth Calculation): Ağacın derinliğini hesaplar.
     *      25. Kardeş Düğümleri Bulma (Finding Sibling Nodes): Belirli bir düğümün kardeş düğümlerini bulur.
     *
     */

    class Node {
        int element; // Düğümün değerini temsil eden bir değişken.
                     // Variable representing the value of the node
        Node left;  // Düğümün sol çocuğunu temsil eden bir referans.
                    // Reference to the right child
        Node right; // Düğümün sağ çocuğunu temsil eden bir referans.
                    // Reference to the left child

        // Düğüm yapıcı (constructor) işlevi | Node constructor function
        public Node(int element) {
            this.element = element; // Düğümün değerini ayarla | Set the value of the node
            this.left = null;     // Sol çocuğu null yap | Make left child null
            this.right = null;  // Sağ çocuğu null yap | Make right child null
        }
    }

    /*
        * BinarySearchTree sınıfı, bu "Node" sınıfını kullanarak bir ikili arama ağacını temsil eder.
        * Bu sınıf genellikle ağacın kök düğümünü tutar ve ağaç üzerinde çeşitli işlemler gerçekleştirmek için
        * gerekli yöntemleri sağlar.
     */

    static class BinarySearchTree {
        static class Node {
            int data;
            Node left, right;

            public Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        Node root;

        // 1. Ekleme (Insertion)
        public void insert(int data) {
            root = insertRecursive(root, data);
        }

        private Node insertRecursive(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data)
                root.left = insertRecursive(root.left, data);
            else if (data > root.data)
                root.right = insertRecursive(root.right, data);

            return root;
        }

        // 2. Silme (Deletion)
        public void delete(int data) {
            root = deleteRecursive(root, data);
        }

        private Node deleteRecursive(Node root, int data) {
            if (root == null)
                return root;

            if (data < root.data)
                root.left = deleteRecursive(root.left, data);
            else if (data > root.data)
                root.right = deleteRecursive(root.right, data);
            else {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                root.data = minValue(root.right);
                root.right = deleteRecursive(root.right, root.data);
            }
            return root;
        }

        private int minValue(Node root) {
            int minVal = root.data;
            while (root.left != null) {
                minVal = root.left.data;
                root = root.left;
            }
            return minVal;
        }

        // 3. Arama (Search)
        public boolean search(int data) {
            return searchRecursive(root, data);
        }

        private boolean searchRecursive(Node root, int data) {
            if (root == null)
                return false;

            if (root.data == data)
                return true;

            if (data < root.data)
                return searchRecursive(root.left, data);

            return searchRecursive(root.right, data);
        }

        // 4. Dolaşma (Traversal)
        public void inorderTraversal() {
            inorderTraversalRecursive(root);
        }

        private void inorderTraversalRecursive(Node root) {
            if (root != null) {
                inorderTraversalRecursive(root.left);
                System.out.print(root.data + " ");
                inorderTraversalRecursive(root.right);
            }
        }

        // 5. Düğüm sayısı (Number of nodes)
        public int numberOfNodes() {
            return numberOfNodesRecursive(root);
        }

        private int numberOfNodesRecursive(Node root) {
            if (root == null)
                return 0;
            else
                return numberOfNodesRecursive(root.left) + numberOfNodesRecursive(root.right) + 1;
        }

        // 6. Yükseklik (Height)
        public int height() {
            return heightRecursive(root);
        }

        private int heightRecursive(Node root) {
            if (root == null)
                return 0;
            else {
                int leftHeight = heightRecursive(root.left);
                int rightHeight = heightRecursive(root.right);

                return Math.max(leftHeight, rightHeight) + 1;
            }
        }

        // 7. Minimum değer (Minimum value)
        public int minValue() {
            return minValue(root);
        }

        // 8. Maksimum değer (Maximum value)
        public int maxValue() {
            return maxValue(root);
        }

        private int maxValue(Node root) {
            int maxVal = root.data;
            while (root.right != null) {
                maxVal = root.right.data;
                root = root.right;
            }
            return maxVal;
        }

        // 9. Denge (Balance)
        public boolean isBalanced() {
            return isBalancedRecursive(root);
        }

        private boolean isBalancedRecursive(Node root) {
            if (root == null)
                return true;

            int leftHeight = heightRecursive(root.left);
            int rightHeight = heightRecursive(root.right);

            return Math.abs(leftHeight - rightHeight) <= 1 && isBalancedRecursive(root.left) && isBalancedRecursive(root.right);
        }

        // 10. Ağaç oluşturma (Tree creation)
        public void createTree(int[] arr) {
            for (int data : arr) {
                insert(data);
            }
        }

        // 11. Ağaç temizleme (Tree clearing)
        public void clearTree() {
            root = null;
        }

        // 12. Ağaç birleştirme (Tree merging)
        public void mergeTrees(BinarySearchTree tree) {
            mergeTreesRecursive(root, tree.root);
        }

        private void mergeTreesRecursive(Node root1, Node root2) {
            if (root2 != null) {
                insert(root2.data);
                mergeTreesRecursive(root1, root2.left);
                mergeTreesRecursive(root1, root2.right);
            }
        }

        // 13. Ağaç kopyalama (Tree copying)
        public BinarySearchTree copyTree() {
            BinarySearchTree newTree = new BinarySearchTree();
            copyTreeRecursive(root, newTree);
            return newTree;
        }

        private void copyTreeRecursive(Node root, BinarySearchTree newTree) {
            if (root != null) {
                newTree.insert(root.data);
                copyTreeRecursive(root.left, newTree);
                copyTreeRecursive(root.right, newTree);
            }
        }

        // 14. Ağaç karşılaştırma (Tree comparison)
        public boolean isEqual(BinarySearchTree tree) {
            return isEqualRecursive(root, tree.root);
        }

        private boolean isEqualRecursive(Node root1, Node root2) {
            if (root1 == null && root2 == null)
                return true;

            if (root1 != null && root2 != null)
                return (root1.data == root2.data) && isEqualRecursive(root1.left, root2.left) && isEqualRecursive(root1.right, root2.right);

            return false;
        }

        // 15. Ağaç dönüşümü (Tree conversion)

        // Bu örnekte farklı bir veri yapısına dönüştürme işlemi yapılmadığı için bu metodu boş bırakıyorum.

        // 16. Ağaç sıralama (Tree sorting)
        public List<Integer> treeSort() {
            List<Integer> sortedList = new ArrayList<>();
            treeSortRecursive(root, sortedList);
            return sortedList;
        }

        private void treeSortRecursive(Node root, List<Integer> sortedList) {
            if (root != null) {
                treeSortRecursive(root.left, sortedList);
                sortedList.add(root.data);
                treeSortRecursive(root.right, sortedList);
            }
        }

        // 17. Derinlik Ölçekli Dolaşma (Depth-First Traversal)
        public void depthFirstTraversal() {
            depthFirstTraversalRecursive(root);
        }

        private void depthFirstTraversalRecursive(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                depthFirstTraversalRecursive(root.left);
                depthFirstTraversalRecursive(root.right);
            }
        }

        // 18. Genişlik Ölçekli Dolaşma (Breadth-First Traversal)
        public void breadthFirstTraversal() {
            if (root == null)
                return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");

                if (tempNode.left != null)
                    queue.add(tempNode.left);

                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }
        }

        // 19. Düzgün Ağaç Oluşturma (Balanced Tree Creation)
        public void createBalancedTree(int[] sortedArray) {
            root = createBalancedTreeRecursive(sortedArray, 0, sortedArray.length - 1);
        }

        private Node createBalancedTreeRecursive(int[] sortedArray, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            Node newNode = new Node(sortedArray[mid]);

            newNode.left = createBalancedTreeRecursive(sortedArray, start, mid - 1);
            newNode.right = createBalancedTreeRecursive(sortedArray, mid + 1, end);

            return newNode;
        }

        // 20. Alt Ağaçları Bulma (Finding Subtrees)
        public List<Node> findSubtrees(int data) {
            List<Node> subtrees = new ArrayList<>();
            findSubtreesRecursive(root, data, subtrees);
            return subtrees;
        }

        private boolean findSubtreesRecursive(Node root, int data, List<Node> subtrees) {
            if (root == null)
                return false;

            if (root.data == data) {
                subtrees.add(root);
                return true;
            }

            boolean foundInLeft = findSubtreesRecursive(root.left, data, subtrees);
            boolean foundInRight = findSubtreesRecursive(root.right, data, subtrees);

            return foundInLeft || foundInRight;
        }

        // 21. Ağaçta Tekrarlanan Elemanları Bulma (Finding Duplicate Elements in a Tree)
        public List<Integer> findDuplicateElements() {
            List<Integer> duplicates = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            findDuplicateElementsRecursive(root, duplicates, set);
            return duplicates;
        }

        private void findDuplicateElementsRecursive(Node root, List<Integer> duplicates, Set<Integer> set) {
            if (root == null)
                return;

            if (!set.add(root.data)) {
                duplicates.add(root.data);
            }

            findDuplicateElementsRecursive(root.left, duplicates, set);
            findDuplicateElementsRecursive(root.right, duplicates, set);
        }

        // 22. Ağacın Yükseklik Dengesini Düzeltme (Balancing) (Balancing the Height of a Tree)
        public void balanceTree() {
            List<Integer> sortedList = treeSort();
            clearTree();
            createBalancedTree(sortedList.stream().mapToInt(i -> i).toArray());
        }

        // 23. Belirli Bir Derinlikteki Düğümleri Listeleme (Listing Nodes at a Specific Depth)
        public List<Integer> listNodesAtDepth(int depth) {
            List<Integer> nodes = new ArrayList<>();
            listNodesAtDepthRecursive(root, depth, nodes, 1);
            return nodes;
        }

        private void listNodesAtDepthRecursive(Node root, int depth, List<Integer> nodes, int currentDepth) {
            if (root == null)
                return;

            if (currentDepth == depth)
                nodes.add(root.data);

            listNodesAtDepthRecursive(root.left, depth, nodes, currentDepth + 1);
            listNodesAtDepthRecursive(root.right, depth, nodes, currentDepth + 1);
        }

        // 24. Derinlik Hesaplama (Depth Calculation)
        public int calculateDepth(int data) {
            return calculateDepthRecursive(root, data, 1);
        }

        private int calculateDepthRecursive(Node root, int data, int currentDepth) {
            if (root == null)
                return -1;

            if (root.data == data)
                return currentDepth;

            int leftDepth = calculateDepthRecursive(root.left, data, currentDepth + 1);
            int rightDepth = calculateDepthRecursive(root.right, data, currentDepth + 1);

            return Math.max(leftDepth, rightDepth);
        }

        // 25. Kardeş Düğümleri Bulma (Finding Sibling Nodes)
        public List<Integer> findSiblingNodes(int data) {
            List<Integer> siblings = new ArrayList<>();
            if (root != null && root.data != data) {
                findSiblingNodesRecursive(root, data, siblings);
            }
            return siblings;
        }

        private void findSiblingNodesRecursive(Node root, int data, List<Integer> siblings) {
            if (root == null)
                return;

            if ((root.left != null && root.left.data == data) || (root.right != null && root.right.data == data)) {
                if (root.left != null)
                    siblings.add(root.right != null ? root.right.data : null);
                else
                    siblings.add(root.left != null ? root.left.data : null);
                return;
            }

            findSiblingNodesRecursive(root.left, data, siblings);
            findSiblingNodesRecursive(root.right, data, siblings);
        }
    }

    public static void main(String[] args) {
        // BinarySearchTree örneği oluşturma
        BinarySearchTree tree = new BinarySearchTree();

        // 1. Ekleme (Insertion)
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // 2. Silme (Deletion)
        tree.delete(20);

        // 3. Arama (Search)
        System.out.println("3. Arama (Search): " + tree.search(30));

        // 4. Dolaşma (Traversal)
        System.out.print("4. Dolaşma (Traversal): ");
        tree.inorderTraversal();
        System.out.println();

        // 5. Düğüm sayısı (Number of nodes)
        System.out.println("5. Düğüm sayısı (Number of nodes): " + tree.numberOfNodes());

        // 6. Yükseklik (Height)
        System.out.println("6. Yükseklik (Height): " + tree.height());

        // 7. Minimum değer (Minimum value)
        System.out.println("7. Minimum değer (Minimum value): " + tree.minValue());

        // 8. Maksimum değer (Maximum value)
        System.out.println("8. Maksimum değer (Maximum value): " + tree.maxValue());

        // 9. Denge (Balance)
        System.out.println("9. Denge (Balance): " + tree.isBalanced());

        // 10. Ağaç oluşturma (Tree creation)
        int[] arr = {10, 5, 15, 3, 7, 12, 18};
        BinarySearchTree newTree = new BinarySearchTree();
        newTree.createTree(arr);

        // 11. Ağaç temizleme (Tree clearing)
        newTree.clearTree();

        // 12. Ağaç birleştirme (Tree merging)
        newTree.mergeTrees(tree);

        // 13. Ağaç kopyalama (Tree copying)
        BinarySearchTree copiedTree = tree.copyTree();

        // 14. Ağaç karşılaştırma (Tree comparison)
        System.out.println("14. Ağaç karşılaştırma (Tree comparison): " + tree.isEqual(copiedTree));

        // 16. Ağaç sıralama (Tree sorting)
        System.out.print("16. Ağaç sıralama (Tree sorting): ");
        List<Integer> sortedList = tree.treeSort();
        System.out.println(sortedList);

        // 17. Derinlik Ölçekli Dolaşma (Depth-First Traversal)
        System.out.print("17. Derinlik Ölçekli Dolaşma (Depth-First Traversal): ");
        tree.depthFirstTraversal();
        System.out.println();

        // 18. Genişlik Ölçekli Dolaşma (Breadth-First Traversal)
        System.out.print("18. Genişlik Ölçekli Dolaşma (Breadth-First Traversal): ");
        tree.breadthFirstTraversal();
        System.out.println();

        // 19. Düzgün Ağaç Oluşturma (Balanced Tree Creation)
        tree.createBalancedTree(sortedList.stream().mapToInt(i -> i).toArray());

        // 20. Alt Ağaçları Bulma (Finding Subtrees)
        List<BinarySearchTree.Node> subtrees = tree.findSubtrees(30);
        System.out.print("20. Alt Ağaçları Bulma (Finding Subtrees): ");
        for (BinarySearchTree.Node subtree : subtrees) {
            System.out.print(subtree.data + " ");
        }
        System.out.println();

        // 21. Ağaçta Tekrarlanan Elemanları Bulma (Finding Duplicate Elements in a Tree)
        System.out.println("21. Ağaçta Tekrarlanan Elemanları Bulma (Finding Duplicate Elements in a Tree): " + tree.findDuplicateElements());

        // 22. Ağacın Yükseklik Dengesini Düzeltme (Balancing) (Balancing the Height of a Tree)
        tree.balanceTree();

        // 23. Belirli Bir Derinlikteki Düğümleri Listeleme (Listing Nodes at a Specific Depth)
        System.out.println("23. Belirli Bir Derinlikteki Düğümleri Listeleme (Listing Nodes at a Specific Depth): " + tree.listNodesAtDepth(3));

        // 24. Derinlik Hesaplama (Depth Calculation)
        System.out.println("24. Derinlik Hesaplama (Depth Calculation): " + tree.calculateDepth(70));

        // 25. Kardeş Düğümleri Bulma (Finding Sibling Nodes)
        System.out.println("25. Kardeş Düğümleri Bulma (Finding Sibling Nodes): " + tree.findSiblingNodes(60));

    }
}
