package JDSA_07_Sorting_Algorithms;

public class _04_02_Collisions {
    /*
        * Çakışmalar (Collisions)
        *  Hiç bir doğrama (hashing) foksiyonu mükemmel bir fonksiyon olmayacaktır ve belirli elemanların
        * aynı adrese atanmasıyla bazı çakışmalar doğacaktır. Bu yüzden bu tekniğin gerçekleştiriminde bu çakışma
        * durumları da göz önüne alınmalı ve bir çalışma oluştuğunda yeni yerleştirilen elemanın başka bir pozisyona
        * aktarılması sağlanmalıdır. Bu işlem için de birçok değişik yöntem izlenebilir.
        *
        *   Collisions
        *   No hashing function will be a perfect function and some collisions will occur with certain elements
        * being assigned to the same address. Therefore, in the implementation of this technique, these collision
        * situations should also be taken into account and when a collision occurs, the newly placed element should
        * be transferred to another position. For this process, many different methods can be followed.
        *
        *
        * 1. Ayrı ayrı zincirleme (Seperate Chaining)
        *   Bu yöntemde her bir tablo elemanı bir bağlı liste olarak düşünülür. Eğer bir çakışma olursa, yeni eleman
        * bu bağlı listeye eklenir. Bu yöntemde çakışmaların oluşması durumunda, her bir elemanın bağlı listesine
        * erişim O(1) olacaktır. Fakat bu yöntemde her bir elemanın bağlı listesi için ayrı bir bellek alanı
        * ayrılması gerektiği için, bu yöntemde bellek kullanımı daha fazla olacaktır.
        *
        *   Separate Chaining
        *  In this method, each table element is considered as a linked list. If there is a collision, the new
        * element is added to this linked list. In this method, in case of collisions, access to the linked list of
        * each element will be O(1). However, since a separate memory area is required for the linked list of each
        * element in this method, memory usage will be higher in this method.
        *
        *
        *  Bu yöntem problemi aşmak için en temel yöntemlerden birisidi. Bu yöntemle kayıtlarımızın anahtarlarını
        * yerleştirdiğimiz dizinin her bir elemanı bir bağlantılı liste (linked list) olarak tasarlanmakta ve
        * eğer herhangi bir dizi pozisyonunda bir çakışma olursa burada yer alacak elemanlar bir liste şeklinde
        * aynı pozisyonda tutmaktadır.
        *
        *   This method is one of the most basic methods to overcome the problem. With this method, each element
        * of the array in which we place the keys of our records is designed as a linked list, and if there is a
        * collision at any array position, the elements to be placed here are kept in the same position in the form
        * of a list.
        *
        *
        * Anahtarlar | A | S | E | A | R | C | H | I | N | G | E | X | A | M | P | L | E
        * Pozisyon   | 1 | 8 | 5 | 1 | 7 | 3 | 8 | 9 | 3 | 7 | 5 | 2 | 1 | 2 | 5 | 1 | 5
        *
        *               0   1   2   3   4   5   6   7   8   9   10
        *               *   *   *   *   *   *   *   *   *   *   *
        *               *   L   M   N   *   E   *   G   H   I   *
        *                   A   X   C       P       R   S   *
        *                   A   *   *       E       *   *
        *                   A               E
        *                   *               *
        *
        * 2. Doğrusal Yerleştirme (Linear Probing)
        * Çakışma durumunda kullanılabilecek bir diğer yöntem de doğrusal yerleştirmedir. Bu yöntemle, tablonun herhangi bir
        * pozisyonunda çakışma doğarsa yerleştirilecek yeni eleman tablonun bir sonraki pozisyonuna yerleştirilmektedir.
        * Eğer bu pozisyonda zaten bir eleman varsa boş bir pozisyon bulunana kadar bu işlem devam etmektedir.
        * Bu durumda tabloada bir eleman arama işlemi aşağıdaki gibi devam etmektedir.
        *   1. Doğrama (hashing) fonksiyonu kullanılarak elemanın tabloda yer alması gereken pozisyon bulunur.
        *   2. Eğer eleman bu adreste  yok ise ve bu adrese başka bir eleman daha önceden yerleştirilmiş ise
        * boş bir pozisyona rastlayana veya elemanı bulana kadar sonraki pozisyonları kontrol et.
        *
        *
   */

    public static void main(String[] args) {

        // 1. Ayrı ayrı zincirleme (Seperate Chaining)
        /*
            * Aşağıdaki kod şu işi yapar ve şu şekilde çalışır;
            * Following code does the following and works as follows;
            *
            *  - 11 elemanlı bir dizi oluşturulur. | An array of 11 elements is created.
            * - 12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5 anahtarları oluşturulur. | Keys are created.
            * - Her bir anahtarın mod 11'i alınır ve bu değer dizi içindeki bir pozisyon olarak kullanılır. | Mod 11 of each key is taken and this value is used as a position in the array.
            * - Eğer bu pozisyonda bir eleman yoksa, bu pozisyona anahtar yerleştirilir. | If there is no element at this position, the key is placed at this position.
            * - Eğer bu pozisyonda bir eleman varsa, bu durumda bir çakışma olmuş demektir ve bu durumda | If there is an element at this position, this means that a collision has occurred and in this case
            *  ekrana "Collision: " + anahtar yazdırılır. | "Collision: " + key is printed to the screen.
            * - Son olarak dizi içindeki her bir elemanın pozisyonu ve değeri ekrana yazdırılır. | Finally, the position and value of each element in the array are printed to the screen.
        */
        int[] array = new int[11];
        int[] keys = {12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
        for (int i = 0; i < keys.length; i++) {
            int index = keys[i] % 11;
            if (array[index] == 0) {
                array[index] = keys[i];
            } else {
                System.out.println("Collision: " + keys[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " : " + array[i]);
        }

        // 2. Doğrusal Yerleştirme (Linear Probing)
        /*
            * Aşağıdaki kod şu işi yapar ve şu şekilde çalışır;
            * Following code does the following and works as follows;
            *
            * - 11 elemanlı bir dizi oluşturulur. | An array of 11 elements is created.
            * - 12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5 anahtarları oluşturulur. | Keys are created.
            * - Her bir anahtarın mod 11'i alınır ve bu değer dizi içindeki bir pozisyon olarak kullanılır. | Mod 11 of each key is taken and this value is used as a position in the array.
            * - Eğer bu pozisyonda bir eleman yoksa, bu pozisyona anahtar yerleştirilir. | If there is no element at this position, the key is placed at this position.
            * - Eğer bu pozisyonda bir eleman varsa, bu durumda bir çakışma olmuş demektir ve bu durumda | If there is an element at this position, this means that a collision has occurred and in this case
            * bu durumda bir sonraki pozisyona yerleştirilir. | it is placed in the next position.
            *
         */
        int[] array2 = new int[11];
        int[] keys2 = {12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
        for (int i = 0; i < keys2.length; i++) {
            int index = keys2[i] % 11;
            if (array2[index] == 0) {
                array2[index] = keys2[i];
            } else {
                while (array2[index] != 0) {
                    index = (index + 1) % 11;
                }
                array2[index] = keys2[i];
            }
        }


    }
}
