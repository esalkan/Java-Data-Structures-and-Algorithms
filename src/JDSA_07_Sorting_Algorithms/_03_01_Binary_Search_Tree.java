package JDSA_07_Sorting_Algorithms;

public class _03_01_Binary_Search_Tree {
    /*
        * İkili arama ağacı (Binary search tree), her düğümün en fazla iki çocuğa sahip olduğu bir ağaç yapısıdır.
        * Bu ağaç yapısında, her düğümün sol çocuğu kendisinden küçük, sağ çocuğu ise kendisinden büyük olmalıdır.
        *
        * Binary search tree (Binary search tree) is a tree structure in which each node has at most two children.
        * In this tree structure, the left child of each node should be smaller than itself, and the right child should
        * be larger than itself.
        *
        * İkili arama ağacı (Binary search tree) algoritması:
        * 1. Ağaç yapısının kök düğümüne bak.
        * 2. Eğer ağaç yapısı boşsa, yeni düğümü kök düğüm yap.
        * 3. Eğer ağaç yapısı boş değilse, yeni düğümü kök düğümden başlayarak uygun konuma ekle.
        *
        * Binary search tree (Binary search tree) algorithm:
        * 1. Look at the root node of the tree structure.
        * 2. If the tree structure is empty, make the new node the root node.
        * 3. If the tree structure is not empty, add the new node to the appropriate location starting from the root node.
        *
     */

    // Düğüm yapısı | Node structure
    // Node search (int key) fonksiyonu, ağaç yapısında arama işlemi gerçekleştirir
    // | Node search (int key) function performs the search operation in the tree structure
    private static class Node {
        int key;
        Node leftChild;
        Node rightChild;

        Node(int key) {
            this.key = key;
            leftChild = null;
            rightChild = null;
        }
    }

    private Node root; // Kök düğüm | Root node

    // Search function finds the element with the key value and provides access information
    // Search fonksiyonu, key değerine sahip elemanı bulup erişim bilgisini verir
    public Node search(int key) {
        return search(key,root); // Özyinelemeli iç fonksiyonu çağır | Call the recursive inner function
    }

    // Parametrede verilen key değerine sahip elemanı, kökü t olan ağacın veya alt ağacın altında arar
    // Özyinelemeli iç işlev, öz nitelik erişimi olmadığı için "static"
    // Search for the element with the key value given in the parameter under the tree or subtree with the root t
    // Recursive inner function, "static" because it does not have self attribute access
    private static Node search(int key, Node t) {
        if(t==null){ // Kök yoksa bu ağaç boşsa | If there is no root, this tree is empty
            // bulamadık: null döndür | not found: return null
            return null;
        } else if(key<t.key) { // Aranılan değer, kök elemanından küçükse | If the searched value is less than the root element
            return search(key,t.leftChild); // sol alt ağaçta ara | search in the left subtree
        } else if(key>t.key) { // Aranılan değer, kök elemanından büyükse | If the searched value is greater than the root element
            // sağ alt ağaçta ara | search in the right subtree
            return search(key,t.rightChild);
        } else { // Aranılan değer, kök elemanına eşitse | If the searched value is equal to the root element
            return t; // bulduk: elemanın erişim bilgisini döndür | found: return the access information of the element
        }
    }

    public static void main(String[] args) {
        // Test
        // Ağaç yapısını oluştur | Create the tree structure
        _03_01_Binary_Search_Tree bst = new _03_01_Binary_Search_Tree();
        bst.root = new Node(50);
        bst.root.leftChild = new Node(30);
        bst.root.rightChild = new Node(70);
        bst.root.leftChild.leftChild = new Node(20);
        bst.root.leftChild.rightChild = new Node(40);
        bst.root.rightChild.leftChild = new Node(60);
        bst.root.rightChild.rightChild = new Node(80);

        // Arama işlemi | Search operation
        System.out.println(bst.search(40).key);
    }

    /*
        * İkili arama işlemini gerçekleştiren yukarıdaki işlev ikili arama ağacının özelliğini kullanarak her defasında
        * aranan anahtar değerinin o anki elemandan büyük veya küçük olmasına göre ağacın sol tarafına veya sağ tarafına
        * doğru arama işlevini sürdürmektedir. Bu arama işlevinin kaç adımda sonlanacağının üzerinde işlem yapılan ikili
        * arama ağacının yapısına bağlı olduğuna dikkat ediniz. Eğer var olan ağacın dengeli bir yapısı varsa dizi üzerinde
        * gerçekleştirilen ikili aramada olduğu gibi yine aynı nedenlerden dolayı arama işlevi başarılı veya başarısız
        * durumda da
        * log2(N+1)
        * adımda sonuca ulaşacaktır. Ağacın dengeli bir yapıya sahip olması, kök elemanının
        * sağında ve solunda yer alan alt ağaçların yüksekliklerinin birbirlerine yakın olması anlamına gelmektedir.
        * Dengeli ikili ağaç veri yapısı çok sık kullanılan bir veri yapısıdır. Dengeli ağaç yapısını oluşturmak için
        * "ekleme" ve "çıkarma" işlemleri sırasında çeşitli işlemlerle ağacın dengesinin bozulmamasını sağlayan
        * algoritmalar geliştirilmiştir. Ancak bu algoritmaların verimsiz
        * (log2N'den kötü)
        * olması dengeli ağaç
        * avantajını yok edecektir. Bu avantajı da koruyabilmek için yapılan işlemler ise bu konudaki algoritmaları
        * oldukça karmaşıklaştırmıştır. Sıradan bir ikili ağaçta ise bu denge ise ağaca yerleştirilen elemanların
        * özelliğine göre değişecektir. Örneğin elemanlar büyüklük sırasına göre yerleştirilirse oluşan ağaç sırasal
        * bir yapıya sahip olacaktır. Aşağıdaki şekilde bu durum gösterilmiştir. Bu durumun oluşabilmesi için 1,2,3,4
        * elemanlarının sırayla ağaca yerleştirilmesi gerekmektedir. Bu durumun oluşmasını daha detaylı incelemek için
        * ikili ağaca yerleştirme (insert) işlevini inceleyebilirsiniz.
        * Verilerin zaten sıralı olduğu durumda aşağıda da olduğu gibi yerleştirilen eleman daha önceki elemanların
        * tümünden büyük olacağı için daima ağacın en sağ tarafına yerleştirilecektir.
        * Bu durum ikili arama ağacı için en kötü durum olarak karşımıza çıkmaktadır.
        * Bu yapıya sahip bir ağaçta ise arama işlemi sırayla arama (sequential search) yöntemiyle aynı performansa
        * sahip olacaktır.
        *
        * The above function that performs binary search uses the property of the binary search tree to continue the search
        * function to the left or right side of the tree according to whether the searched key value is greater or less than
        * the current element. Note that the number of steps that this search function will end depends on the structure of
        * the binary search tree being processed. If the existing tree has a balanced structure, the search function will
        * reach the result in
        * log2(N+1)
        * steps, as in the binary search performed on the array, for the same reasons, whether the search function is
        * successful or unsuccessful. Having a balanced structure of the tree means that the heights of the subtrees on the
        * right and left of the root element are close to each other. The balanced binary tree data structure is a widely
        * used data structure. Algorithms have been developed to ensure that the balance of the tree is not disturbed
        * during the "insertion" and "removal" operations by various operations. However, the inefficiency of these
        * algorithms
        * (worse than log2N)
        * will destroy the advantage of the balanced tree. The operations to maintain this advantage have made the
        * algorithms on this subject quite complicated. In an ordinary binary tree, this balance will change according to
        * the property of the elements placed in the tree. For example, if the elements are placed in order of magnitude,
        * the resulting tree will have a sequential structure. This situation is shown in the figure below. For this
        * situation to occur, the elements 1,2,3,4 must be placed in the tree in order. To examine this situation in more
        * detail, you can examine the binary tree insertion (insert) function. When the data is already sorted, the
        * element placed as below will always be placed on the far right of the tree because it will be greater than all
        * previous elements. This situation is the worst case for the binary search tree. In a tree with this structure,
        * the search operation will have the same performance as the sequential search method.
        *
        */
}
