package JDSA_07_Sorting_Algorithms;

public class _02_Sequential_Search {
    /*
        * Arama yöntemleri içinde en basit yöntem olarak kabul edilen sıralı arama yöntemi (Sequential Search),
        * bir dizi veya linked list içinde yer alan elemanların içinden aranan bir elemanın, sırasıyla baştan
        * sona doğru aranmasıdır. Bu yöntemde, aranan elemanın bulunup bulunmadığı, dizinin başından itibaren
        * sırasıyla kontrol edilir. Eğer aranan eleman bulunursa, arama işlemi sona erer. Eğer aranan eleman
        * bulunamazsa, arama işlemi dizinin sonuna kadar devam eder. Bu veri yapısını kullanmak için veri yapısına
        * eleman ekleme işleminde hiçbir özel yön bulunmamaktadır. Elemanlar dizinin veya linked list'in sonuna
        * sırasıyla eklenir. Herhangi bir arama yapılacağı zaman veri yapısı ilk elemandan başlayarak sırasıyla
        * son elemana kadar taranır. Bu nedenle sıralı arama yöntemi, veri yapısının büyüklüğüne göre arama
        * işleminin süresinin değiştiği bir yöntemdir.
        *
        * In the sequential search method, the element to be searched is searched from the beginning to the end
        * of the array or linked list. In this method, it is checked whether the searched element is found from
        * the beginning of the array. If the searched element is found, the search process ends. If the searched
        * element is not found, the search process continues until the end of the array. There is no special
        * direction in adding elements to the data structure. Elements are added to the end of the array or
        * linked list in order. When any search is made, the data structure is scanned from the first element to
        * the last element. Therefore, the sequential search method is a method in which the time of the search
        * process changes according to the size of the data structure.
        *
        * Sıralı arama yöntemi (Sequential Search) algoritması:
        * Bu algoritma, dizinin başından itibaren sırasıyla elemanları kontrol eder. Eğer aranan eleman bulunursa,
        * arama işlemi sona erer. Eğer aranan eleman bulunamazsa, arama işlemi dizinin sonuna kadar devam eder.
        *
        * Sequential search method (Sequential Search) algorithm:
        * This algorithm checks the elements of the array from the beginning. If the searched element is found,
        * the search process ends. If the searched element is not found, the search process continues until the
        * end of the array.
        *
        * Sıralı arama yöntemi (Sequential Search) algoritması:
        * 1. Dizinin başından itibaren sırasıyla elemanları kontrol et.
        * 2. Eğer aranan eleman bulunursa, arama işlemi sona erer.
        * 3. Eğer aranan eleman bulunamazsa, arama işlemi dizinin sonuna kadar devam eder.
        *
        * Sequential search method (Sequential Search) algorithm:
        * 1. Check the elements of the array from the beginning.
        * 2. If the searched element is found, the search process ends.
        * 3. If the searched element is not found, the search process continues until the end of the array.
        *
        *
        * Sırayla arama işlevinin eğer aranan eleman listede yoksa bütün listeyi baştan başa geçmek zorunda kalacağı
        * için N+1 (N listedeki eleman sayısı) adımda sonlanacaktır. Eleman listede bulunduğu durumda ise metodumuz
        * ortalama N/2 adımda sonlanacaktır. Çünkü rastgele bir dağılımda aranan elemanın listede bulunma olasılığı
        * birbirine eşit olacaktır. Bu durumda ortalama çalışma süresi (1 + 2 + 3 + ... + N) / N = N/2 olacaktır.
     */

    private static  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Dizi tanımlama | Array definition

    public static void main(String[] args) {
        int key = 5; // Aranan eleman | The searched element

        // Sıralı arama yöntemi (Sequential Search) algoritması | Sequential search method (Sequential Search) algorithm
        boolean result = sequentialSearch(array, key);

        // Aranan eleman bulundu mu? | Is the searched element found?
        System.out.println("Aranan eleman bulundu mu? " + result);
    }

    // Sıralı arama yöntemi (Sequential Search) algoritması: | Sequential search method (Sequential Search) algorithm:
    // array: Sıralı arama yapılacak dizi | The array to be searched
    // key: Aranan eleman | The searched element
    // return: Eğer aranan eleman bulunursa, true değeri döner. Eğer aranan eleman bulunamazsa, false değeri döner.
    public static boolean sequentialSearch(int[] array, int key){
        // Dizinin başından itibaren sırasıyla elemanları kontrol et. | Check the elements of the array from the beginning.
        for(int i=0; i<array.length; i++){
            // Eğer aranan eleman bulunursa, arama işlemi sona erer. | If the searched element is found, the search process ends.
            if(array[i] == key){
                return true;
            }
        }
        // Eğer aranan eleman bulunamazsa, arama işlemi dizinin sonuna kadar devam eder.
        // If the searched element is not found, the search process continues until the end of the array.
        return false;
    }
}
