package JDSA_07_Sorting_Algorithms;

public class _03_Binary_Search {
    /*
        * İkili arama yöntemi (Binary Search), sıralı bir dizide aranan bir elemanın bulunması için kullanılan bir
        * arama algoritmasıdır.
        *
        * Aramada kullanılan kayıt sayısının çok fazla olduğu durumlarda elemanları tek tek taramak işlem yükünü oldukça
        * fazlalaştıracaktır. Bu durumda ikili arama işlem yükünü azaltan bir yöntem olarak karşımıza çıkmaktadır.
        * İkili aramanın gerçekleştirilebilmesi için veri yapımızda yer alan elemanların daha önceden sıralanmış olması
        * gerekmektedir. Bu da ikili arama yönteminin getirdiği ek işlem yükünü oluşturmaktadır. Elemanlar sıralı
        * olduğu durumda ikili arama metodu önce aranan elemanın anahtarını veri yapısının tam ortasında yer alan
        * elemanla karşılaştırmakta ve bu elemandan büyük veya küçük olma durumuna göre arama aynı yöntemle
        * veri yapısının alt veya üst bölümünde devam etmektedir. Bu yöntemle her bir adımla aramanın gerçekleştirildiği
        * veri kumesinin büyüklüğü yarıya düşürüldüğünde dikkat edilmesi gerekir. Bu durumda ikili arama yöntemi
        * veri yapısının büyüklüğüne göre logaritmik bir zaman karmaşıklığına sahiptir.
        * Bu da arama işlevinin hızlandıran bir etken olmaktadır.
        *
        * Binary search is a method used to find a searched element in an ordered array is the search algorithm.
        *
        * When the number of records used in the search is very high, scanning the elements one by one will greatly
        * increase the processing load. In this case, it appears as a method that reduces the processing load of the
        * binary search. In order for binary search to be performed, the elements in our data structure must have been
        * previously sorted. This creates the additional processing load brought by the binary search method. When the
        * elements are sorted, the binary search method first compares the key of the searched element with the element
        * located in the exact middle of the data structure, and the search continues in the same way in the lower or
        * upper part of the data structure depending on whether the element is larger or smaller. It should be noted
        * that when the size of the data set in which each step of the search is performed is halved, the binary search
        * method has a logarithmic time complexity according to the size of the data structure. This is an accelerating
        * factor for the search function.
        *
        * İkili arama yöntemi başarılı veya başarısız olsun hiçbir zaman log2(N+1) adımdan fazla adım atmaz. Bu özellik
        * her adımda arama yapılan veri büyüklüğünün yarıya düşürülmesinden kaynaklanmaktadır.
        *
        * C n = C n/2 + 1 ifadesi, ikili arama işlevinin gereksinim duyacağı işlem sayısını gösterir.
        * Burada C N/2 dizi ikiye bölündükten sonra gereksinim duyulacak işlem adedini gösterirken 1 ise diziyi
        * ikiye bölmek için gereken karşılaştırma işlemine denk gelmektedir. Bu ilişkinin çözümüyle ise log2(N+1)
        * değeri elde edilir.
    */


    public static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Dizi tanımlama | Array definition

    public static void main(String[] args) {
        int key = 7; // Aranan eleman | The searched element
        int key2 = 22; // Aranan eleman | The searched element

        // İkili arama yöntemi (Binary Search) algoritması | Binary search method (Binary Search) algorithm
        boolean result = binarySearch(array, key);
        boolean result2 = binarySearch(array, key2);

        // Aranan eleman bulundu mu? | Is the searched element found?
        System.out.println("Aranan eleman bulundu mu? " + result);
        System.out.println("Aranan eleman bulundu mu? " + result2);
    }

    // İkili arama yöntemi (Binary Search) algoritması | Binary search method (Binary Search) algorithm
    public static boolean binarySearch(int[] array,int key) {
        // low, dizinin ilk indisidir | low is the first index of the array
        int low = 0;
        // high, dizinin son indisidir | high is the last index of the array
        int high = array.length - 1;

        // low, high'den küçük veya eşit olduğu sürece döngü devam eder
        // The loop continues as long as low is less than or equal to high
        while (low <= high) {
            // mid, dizinin orta indisidir
            // | mid is the middle index of the array
            int mid = (low + high) / 2;

            // Eğer aranan eleman bulunursa, true değeri döner
            if (key == array[mid])
                return true;
            // Eğer aranan eleman, dizinin orta elemanından küçükse, arama işlemi dizinin sol tarafında devam eder
            else if (key < array[mid])
                high = mid - 1;
            // Eğer aranan eleman, dizinin orta elemanından büyükse, arama işlemi dizinin sağ tarafında devam eder
            else
                low = mid + 1;
        }
        // Eğer aranan eleman bulunamazsa, false değeri döner
        return false;
    }
}
