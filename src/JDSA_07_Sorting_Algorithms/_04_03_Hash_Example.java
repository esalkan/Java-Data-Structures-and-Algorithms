package JDSA_07_Sorting_Algorithms;

public class _04_03_Hash_Example {
    // Doğrama (hashing) yöntemi kullanılarak veri yapısına yerleştirilecek kayıtları tanımlayan sınıf
    // Class defining records to be placed in the data structure using the hashing method
    static class Record {
        int key;               // Kayıt anahtarı (Bu örnekte kimlik no) | Record key (In this example, identity number)
        String info;           // Kayıt bilgisi (Bu örnekte isim) | Record information (In this example, name)

        // Yapıcı metot, verilen parametreleri öz niteliklere atar | Constructor method assigns the given parameters to the intrinsic attributes
        Record ( int key, String info ) {
            this.key = key;     // anahtar değeri | key value
            this.info = info;   // bilgi değeri | information value
        }
    }

    // Doğrama (hashing) sınıfı, çakışma durumunda doğrusal yerleştirme kullanır
    // Hashing class uses linear placement in case of collision
    static class Hash {
        private Record[] table;     // Doğrama (hashing) tablosu | Hashing table array of records
        // Her bir tablo elemanı bir kaydı (Record) tutar | Each table element holds a record (Record)

        // Yapıcı metot, verilen boyutta bir tablo oluşturur | Constructor method creates a table of the given size
        public Hash ( int size ) {
            table = new Record[ size ];     // tablo boyutu | table size (number of elements)
        }


        // hashFunction fonksiyonu, verilen bir tamsayı değerini tablo boyutuna göre bir pozisyona eşler
        // hashFunction function maps a given integer value to a position according to the table size
        private int hashFunction ( int v ) {
            return v % table.length;
        }

        // Insert metodu, verilen kimlik no ve isim bilgisini tabloya ekler
        // Insert method adds the given identity number and name information to the table
        public void insert ( int id, String name ) {
            int x = hashFunction ( id );          // Hash fonksiyonu sonucu x'te | x is the result of the hash function
            while ( table[ x ] != null )          // Tablo'nun x. elemanı boş olana kadar | Until the xth element of the table is empty
                x = ( x + 1 ) % table.length;     // X değerine (dairesel olarak) bir ekle | Add one to X (circularly)
            table[ x ] = new Record ( id, name ); // Bulunan boş pozisyona kimlik no ve isim bilgilerini tutan kaydı yerleştir
            // Place the record that holds the identity number and name information in the found empty position
        }

        // Search metodu, verilen kimlik no anahtar değeriyle tabloya konulmuş olan ismi bulup döndürür
        // Search function finds and returns the name placed in the table with the given identity number key value
        public String search ( int id ) {
            int x = hashFunction ( id );            // hash fonksiyonu sonucu x'te
            // tablo'nun x. elemanı doluyken ve o kaydın anahtar değeri kimlik no'dan farklı iken
            while ( table[ x ] != null && table[ x ].key != id )
                x = ( x + 1 ) % table.length;        //   x değerine (dairesel olarak) bir ekle
            if ( table[ x ] != null )             // döngüden çıktığımızda, tablo'nun x. elemanı boş değilse,
                return table[ x ].info;          //   oradaki kaydın bilgi kısmını döndür
            else                             // ama boş ise,
                return null;                   //   bulamadık demek: null döndür
        }
    }
    public static void main ( String[] args ) {
        String s;
        Hash h = new Hash ( 7 );

        h.insert ( 5,"beş" );
        h.insert ( 20,"yirmi" );
        h.insert ( 6,"altı" );
        h.insert ( 13,"onüç" );
        h.insert ( 32,"otuziki" );
        h.insert ( 13,"yine onüç" );

        s = h.search ( 35 );
        System.out.println ( "Aranan eleman: " + s );
        s = h.search ( 6 );
        System.out.println ( "Aranan eleman: " + s );
        s = h.search ( 13 );
        System.out.println ( "Aranan eleman: " + s );
        s = h.search ( 138 );
        System.out.println ( "Aranan eleman: " + s );
    }
}
