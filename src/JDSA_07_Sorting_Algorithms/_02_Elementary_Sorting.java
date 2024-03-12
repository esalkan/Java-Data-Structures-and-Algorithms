package JDSA_07_Sorting_Algorithms;


import java.util.Arrays;

public class _02_Elementary_Sorting {

    /*
     * Basit sıralama (Elementary Sorting) algoritmaları:
     *   Bilgisayar dünyasında yapılan işlemlerin önemli bir kısmı kullanıcıya verilerin belirli bir ölçüte
     * göre sıralanarak sunulmasına ayrılmaktatır. Uygulamalarda sık sık isimlerin alfabetik sıralamaya göre,
     * sayısal verilerin ise matematiksel büyüklüklerine göre sıralanması gerekmektedir. Verileri belirli bir ölçüte
     * göre sıralamak için çeşitli algoritmalar kullanılmaktadır. Bu algoritmaları belirli bir veri dizisini
     * sıralamak için ne kadar işleme gerensinim duyduklarına göre sınıflamak mümkündür.
     *
     * Bu yaklaşımı kullanarak sıralama algoritmalarını "Basit Sıralama Algoritmaları (Elementary Sorting Algorithms)"
     * ve "ileri sıralama algoritmaları (Advanced Sorting Algorithms)" olmak üzere iki gruba ayırabiliriz.
     *
     * Biz burada "Seçerek sıralama (Selection sort)", Yerleştirerek sıralama (Insertion sort)" ve "Kabarcık sıralama (Bubble sort)"
     * olarak adlandırılan üç değişik basit sıralama algoritmasını inceleyeceğiz. Basit sıralama algoritmaları sıralama problemine
     * anlaşılır ve basit bir giriş olanağı sağladığı gibi, veri miktarının çok büyük olmadığı birçok uygulamada, ileri
     * sıralama algoritmalarına göre daha kolay bir biçimde gerçekleştirilebildikleri için tercih edilirler.
     */

    // Sıralama algoritmalarının gerçekleştirilmesi;
    private static int[] array={7,2,9,6,8,3,1,5};
    // 1. Seçerek sıralama (Selection sort) algoritması:
    /* seçerek sıralama */
    public static void selectionSort() {
        int i,j,min;
        for(i = 0; i < array.length-1; i++) { /* i: 0 -> length-2 */
            min = i;
            for(j = i + 1; j <= array.length-1; j++) /* i+1. ile length-1. arasındaki elemanların en küçüğünü bul */
                if(array[j] < array[min])
                    min = j;
            swap(min,i); /* bu en küçük ile i. elemanı değiştir */
        }
    }

    // 2. Yerleştirerek sıralama (Insertion sort) algoritması:
    public static void insertionSort() {
        int i,j,v;
        for(i=1; i<=array.length-1; i++) { /* i: 1 -> length */
            v=array[i]; /* yerleştirilecek eleman */
            j=i;
            while(j>0 && array[j-1]>v) { /* 0. ile i-1 elemanlar arasında gerekenleri ileriye kaydırıp */
                array[j] = array[j-1]; /* yerleştirilecek elemana yer aç */
                j--;
            }
            array[j]=v; /* elemanı olması gereken yere koy */
        }
    }

    // 3. Kabarcık sıralama (Bubble sort) algoritması:
    public static void bubbleSort() {
        int i,j;
        for(i=array.length-1; i>=1; i--) /* i: length-1 -> 1 */
            for(j=1; j<=i; j++)
                if(array[j-1] > array[j]) /* 0. ile i. elemanlar arasında önceki büyük olan çift varsa */
                    swap(j-1,j); /* yerlerini değiştir */
    }

    // Dizinin i ve j indislerindeki elemanlarının yerini değiştiren metod:
    private static void swap(int i, int j) {
        int tmp;
        tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }
}
