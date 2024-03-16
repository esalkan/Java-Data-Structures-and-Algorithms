package JDSA_07_Sorting_Algorithms;

public class _04_01_Hash_Functions {
    /*
        * Doğrama fonksiyonlarını belirlemek için çok çeşitli yöntemler kullanmak mümkündür. Bu yöntemleri incelerken
        * anahtar değerlerinin tamsayı olduğunu kabul edeceğiz (Tabi String, ya da başka türdeki verilerde oldukça
        * kolay bir şekilde tam sayıya çevrilebilir.) Bu yöntemlerden hemen hemen en çok kullanılanı bölme (division)
        * yöntemidir. Bölme yöntemi, anahtar değerlerinin tablo boyutuna göre modunu alarak bir tablo adresi elde etme
        * işlemidir. Bu işlemi gerçekleştiren fonksiyon aşağıdaki gibi tanımlanabilir:
        *
        * H(key) = key mod m
        * H : Anahtar değerini tablo adresine eşleyen fonksiyon
        * H(key) : Bu fonksiyonun key anahtar değeri için döndürdüğü tablo adresi (dizi indeksi)
        * key : Anahtar değeri
        * mod : Mod (modulus) işlemi
        * m : Tablo boyutu (elemanların yerleştirileceği dizinin büyüklüğünü göstermektedir.)
        *
        * Aslında bu fonksiyonun tanımlanmasında karşımıza bellek ve hız ikilemi çıkmaktadır.
        * Eğer sınırsız belleğe sahip olsak hiç mod işlemini kullanmadan direkt anahtar değerini bellek adresi olarak kullanır
        * ve hiç çakışma olmayacağı için her elemana tek bir adımda erişimi garantilemiş olurduk.
        * Ancak bellek sınırı bizi kullandığımız alanı daraltmaya itmektedir.
        * Eğer kullandığımız toplam alan tam elemanların sığacağı kadar büyüklükte
        * (eleman sayısına eşit uzunlukta tablo) olursa bu durumda yer olarak en verimli duruma ulaşmış oluruz.
        * Ancak bu durumda da çakışma sayısı artacağı için hızdan bir kayıp söz konusu olacaktır.
        * Bu yüzden kullanılan alan ve fonksiyon problemin önemine ve var olan kaynaklara bağlı olarak çok çeşitli şekillerde tanımlanabilir.
        *
        * Örneğin elimizde 1 ile 400 aralığında değişen değerlerle anahtarlanmış yüz adet kayıt olduğunu düşünelim.
        * Bu kayıtları bir tabloya yerleştirmek için
        *
        * H(key) key mod 101
        *
        * fonksiyonunu kullanabiliriz. Bu fonksiyon bize yer açısından oldukça verimli bir durum sağlayacaktır.
        * Ancak bu fonksiyonla 101, 202, 303, 404 gibi birçok anahtar değeri aynı tablo adresine yerleşecektir.
        * Bu çakışma sayısını azaltmak için yukarıda anlatıldığu gibi kullanılan dizinin boyutunu arttırabiliriz.
        * Örneğin dizinin boyutunu iki katına çıkardığımızda çakışma sayısı yarıya düşecektir ama yine bu bize
        * kullanılan bellek açısından bir verim düşüşü yaratacaktır.
        *
        * Kullanılan doğrama fonksiyonunun (hash function) belirlenmesi aslında çok çeşitli yöntemlerle gerçekleştirilebilir.
        * Yukarıda anlatılan bölme metodu en çok kullanılan yöntemdir. Ancak uygulamanın özelliklerine göre bazen anahtar
        * değerinin belirli rakamlarının belirleyici olması durumunda bu rakamların seçilmesi,
        * anahtar değerinin ikili gösteriminin kullanılması gibi birçok yöntem bu işlemde kullanılabilir.
        *
        * --------------------------------------------------------------------------------------------------------------
        *
        * It is possible to use a variety of methods to determine the hashing functions. When examining these methods,
        * we will assume that the key values are integers (Of course, it is quite easy to convert the data to an integer
        * in the case of String, or other types of data.) The division method is almost the most commonly used method.
        * The division method is the process of obtaining a table address by taking the mod of the key values according
        * to the table size. The function that performs this operation can be defined as follows:
        *
        * H(key) = key mod m
        * H : Function that maps the key value to the table address
        * H(key) : The table address (array index) returned by this function for the key key value
        * key : Key value
        * mod : Mod (modulus) operation
        * m : Table size (indicates the size of the array where the elements will be placed.)
        *
        * In fact, the memory and speed dilemma confronts us in defining this function.
        * If we had unlimited memory, we would use the key value directly as a memory address without using the mod operation
        * and we would guarantee access to each element in a single step without any collisions. However, the memory limit
        * forces us to narrow the area we use. If the total area we use is as large as the size of the elements
        * (table of the same length as the number of elements), we will have reached the most efficient situation in terms of space.
        * However, in this case, the number of collisions will increase, so there will be a loss of speed. Therefore, the area
        * used and the function can be defined in a variety of ways depending on the importance of the problem and the existing resources.
        *
        * For example, let's assume that we have a hundred records keyed with values ranging from 1 to 400.
        * We can use the function
        *
        * H(key) key
        * mod 101
        *
        * to place these records in a table. This function will provide us with a very efficient situation in terms of space.
        * However, with this function, many key values such as 101, 202, 303, 404 will be placed in the same table address.
        * To reduce this number of collisions, we can increase the size of the array used, as described above.
        * For example, when we double the size of the array, the number of collisions will be halved, but this will create
        * a decrease in efficiency in terms of memory used.
        *
        * The determination of the hashing function used can actually be realized with a variety of methods.
        * The division method described above is the most commonly used method. However, depending on the characteristics
        * of the application, sometimes the selection of certain digits of the key value, the use of the binary representation
        * of the key value, and many other methods can be used in this process.
        *
    */

    // Doğrama yönteminde tutulacak kayıtları tanımlayan sınıf
    // Class defining records to be kept in the hashing method
    public static class Record {
        int key;               // Kaytın anahtar değeri | Key value of the record
        String info;           // Kaydın bilgi kısmı (Kayıtta tutulacak bilgi) | Information part of the record (Information to be kept in the record)

        // Constructor function, assigns the given parameters to the specific attributes
        // Yapıcı metot, verilen parametreleri belirli niteliklere atar
        Record ( int key, String info ) {
            this.key = key;
            this.info = info;
        }
    }

    // Doğrama sınıfı, çakışma durumunda doğrusal yerleştirme kullanır
    // Hash class uses linear placement in case of collision
    public static class Hash {
        private Record[] table;     // Doğrama tablosu, her bir elemanında anahtar ve bilgi tutulur
                                    // Hash table, key and information are kept in each element

        // Yapıcı metod, size boyutunda doğrama tablosu oluşturur
        // Constructor method, creates a hash table of size size
        public Hash ( int size ) {
            table = new Record[ size ];
        }

        // Doğrama fonksiyonu, verilen anahtar değerine göre tablo boyutuna göre modunu alarak bir tablo adresi elde eder
        // Hash function, takes the mod of the table size according to the given key value and obtains a table address
        private int hashFunction ( int v ) {
            return v % table.length;
        }

        // Insert metodu, kimlik no değerine göre, kimlik no ile birlikte isim bilgisini tabloya ekler
        // Insert function, adds the name information to the table with the identity number value
        public void insert ( int id, String name ) {
            int x = hashFunction ( id );          // hash fonksiyonu sonucu x'te | x in the result of the hash function
            while ( table[ x ] != null )          // tablo'nun x. elemanı dolu olduğu sürece | as long as the xth element of the table is full
                x = ( x + 1 ) % table.length;      //   x değerine (dairesel olarak) bir ekle | add one to x (circularly)
            table[ x ] = new Record ( id, name );  // bu boş yere, kimlik no ve isim bilgilerini tutan kaydı yerleştir | place the record that holds the identity number and name information in this empty place
        }

        // Search metodu, verilen kimlik no anahtar değeriyle tabloya konulmuş olan ismi bulup döndürür
        // Search method, finds and returns the name placed in the table with the given identity number key value
        public String search ( int id ) {
            int x = hashFunction ( id );          // hash fonksiyonu sonucu x'te | x in the result of the hash function
            // tablo'nun x. elemanı doluyken ve o kaydın anahtar değeri kimlik no'dan farklı iken | while the xth element of the table is full and the key value of that record is different from the identity number
            while ( table[ x ] != null && table[ x ].key != id )
                x = ( x + 1 ) % table.length;        //   x değerine (dairesel olarak) bir ekle | add one to x (circularly)
            if ( table[ x ] != null )             // döngüden çıktığımızda, tablo'nun x. elemanı boş değilse, | when we exit the loop, if the xth element of the table is not empty
                return table[ x ].info;          //   oradaki kaydın bilgi kısmını döndür | return the information part of the record there
            else                             // ama boş ise, |  but if it's empty
                return null;                   //   bulamadık demek: null döndür |  means we couldn't find it: return null
        }
    }

    public static void main(String[] args) {
        String s;
        Hash h = new Hash ( 7 );

        h.insert ( 5, "beş" );
        h.insert ( 20, "yirmi" );
        h.insert ( 6, "altı" );
        h.insert ( 13, "onüç" );
        h.insert ( 32, "otuziki" );
        h.insert ( 13, "yine onüç" );

        s = h.search ( 35 );
        s = h.search ( 6 );
        s = h.search ( 13 );
        s = h.search ( 138 );




//        int key = 123;
//        int m = 101;
//        int a = 3;
//        int b = 5;
//        int p = 100;
//        int q = 97;
//
//        System.out.println("H(key) = " + hashFunction(key, m));
//        System.out.println("H(key) = " + hashFunction(key, m, a, b));
//        System.out.println("H(key) = " + hashFunction(key, m, a, b, p));
//        System.out.println("H(key) = " + hashFunction(key, m, a, b, p, q));

    }

    public static int hashFunction(int key, int m)
    {
        return key % m;
    }

    public static int hashFunction(int key, int m, int a, int b)
    {
        return ((a * key + b) % 100) % m;
    }

    public static int hashFunction(int key, int m, int a, int b, int p)
    {
        return ((a * key + b) % p) % m;
    }

    public static int hashFunction(int key, int m, int a, int b, int p, int q)
    {
        return ((a * key + b) % p) % q % m;
    }
}
