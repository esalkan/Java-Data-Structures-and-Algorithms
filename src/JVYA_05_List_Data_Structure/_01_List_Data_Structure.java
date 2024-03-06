package JVYA_05_List_Data_Structure;

public class _01_List_Data_Structure {

    /*
        * Liste Veri Yapısı | List Data Structure
        *
        * Liste, tutulan elemanların birbiri ardına konularak saklandığı ve önden arkaya doğru birer birer giderek
        * erişilebildiği veri yapısıdır. Listeler, veri yapıları içerisinde en esnek olanlarından biridir.
            * List, a data structure in which elements are stored in a sequence and can be accessed one by one
            * from front to back. Lists are one of the most flexible data structures.
        *
        * Listeler, genellikle dizilerle karıştırılır. Diziler, sabit boyutlu veri yapılarıdır ve bellekte
        * ardışık olarak saklanırlar. Listeler ise, dinamik boyutlu veri yapılarıdır ve bellekte ardışık olarak
        * saklanmazlar. Listeler, genellikle bağlı liste (linked list) veri yapısı ile gerçekleştirilir.
            * Lists are often confused with arrays. Arrays are fixed-size data structures and are stored
            * consecutively in memory. Lists, on the other hand, are dynamic-size data structures and are not
            * stored consecutively in memory. Lists are usually implemented with the linked list data structure.
            *
        *
    */

    public static void main(String[] args) {
        // Liste oluştur | Create a list
        List list = new List();

        // Liste sınıfı metotları | List class methods
        // List sınıfı, insert, append, remove, length ve display metodlarını içerir.

        // insert metodu, listenin başına yeni bir eleman ekler.
        // append metodu, listenin sonuna yeni bir eleman ekler.
        // remove metodu, listenin başındaki elemanı siler.
        // length metodu, listenin uzunluğunu döndürür.
        // display metodu, listenin içeriğini ekrana yazdırır.

        // Örnekler | Examples
        // Insert metodu | Insert method
        // Listeye eleman ekle | Add items to the list
        list.insert(50);
        list.insert(40);
        list.insert(30);

        // Display metodu | Display method
        // Listeyi ekrana yazdır | Print the list to the screen
        list.display(); // 30 40 50

        // Append metodu | Append method
        // Listenin sonuna eleman ekle | Add an item to the end of the list
        list.append(60);
        list.append(70);

        // Display metodu | Display method
        // Listeyi ekrana yazdır | Print the list to the screen
        list.display(); // 30 40 50 60 70

        // Insert ile listenin başına eleman ekle | Add an item to the beginning of the list with Insert
        list.insert(20);

        // Display metodu | Display method
        // Listeyi ekrana yazdır | Print the list to the screen
        list.display(); // 20 30 40 50 60 70

        // Remove metodu | Remove method
        // Listeden verilen değeri sil | Remove the given value from the list
        list.remove(30);

        // Display metodu | Display method
        // Listeyi ekrana yazdır | Print the list to the screen
        list.display(); // 20 40 50 60 70

        // Length metodu | Length method
        // Listenin uzunluğunu döndür | Return the length of the list
        System.out.println(list.length()); // 5
    }
}

/*
    * Liste Sınıfı | List Class
    * Liste sınıfı, bağlı liste (linked list) veri yapısını kullanarak listeyi gerçekleştirir.
    * List class uses the linked list data structure to implement the list.
    *
    * List sınıfı, Item sınıfı ile birlikte kullanılır. Item sınıfı, listeye eklenecek her bir elemanı tanımlar.
    * The List class is used together with the Item class. The Item class defines each item to be added to the list.
    *
    * List sınıfı, list yapıcı metodu, insert, atEnd, append, remove, length ve display metotlarını içerir.
    * The List class includes the list constructor method, insert, atEnd, append, remove, length, and display methods.
    *
    * List sınıfı, list adında bir öznitelik içerir. Bu öznitelik, listenin başlangıç elemanının erişim bilgisini tutar.
    * The List class includes an attribute named list. This attribute holds the access information of the starting element of the list.
    *
    * List sınıfı, insert metodu ile listenin başına, append metodu ile listenin sonuna, remove metodu ile listenin başındaki elemanı siler.
    * The List class adds to the beginning of the list with the insert method, to the end of the list with the append method, and removes the first item in the list with the remove method.
    *
    * List sınıfı, atEnd metodu ile listenin son elemanını, length metodu ile listenin uzunluğunu, display metodu ile listenin içeriğini ekrana yazdırır.
    * The List class returns the last item in the list with the atEnd method, the length of the list with the length method, and prints the content of the list to the screen with the display method.
    *
    * List sınıfı, Item sınıfı ile birlikte kullanılır. Item sınıfı, listeye eklenecek her bir elemanı tanımlar.
    * The List class is used together with the Item class. The Item class defines each item to be added to the list.
    *
    * Item sınıfı, val ve next adında iki öznitelik içerir. val özniteliği, elemanın değerini tutar. next özniteliği, bir sonraki elemanın referansını tutar.
    * Item class includes two attributes named val and next. The val attribute holds the value of the item. The next attribute holds the reference of the next item.
    *
    * Item sınıfı, yapıcı metot içerir. Yapıcı metot, parametre değerlerini ilgili özniteliklere (val ve next) atar.
    * The Item class includes a constructor method. The constructor method assigns the parameter values to the relevant attributes (val and next).
*/
class List{
    private Item list; // İlk elemanın erişim bilgisini tutar

    // List sınıfının yapıcı metodu | Constructor method of the List class
    // Listenin başlangıç değerini null olarak atar | Assigns the starting value of the list as null
    public List() {
        list = null;
    }

    // Listenin başına yeni bir eleman ekler | adds a new item to the beginning of the list
    public void insert(int val) {
        list = new Item(val, list);
    }

    // Listenin son elemanını döndürür | returns the last item in the list
    public Item atEnd() {
        Item p = list;
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    // Listenin sonuna yeni bir eleman ekler | adds a new item to the end of the list
    public void append(int val) {
        Item p = atEnd();
        p.next = new Item(val, null);
    }

    // Listenin başındaki elemanı siler | removes the first item in the list
    public void remove(int val) {
        if (list == null) {
            return;
        }
        if (list.val == val) {
            list = list.next;
            return;
        }
        Item p = list;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
                return;
            }
            p = p.next;
        }
    }

    // Listenin uzunluğunu döndürür | returns the length of the list
    public int length() {
        int count = 0;
        Item p = list;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    // Listenin içeriğini ekrana yazdırır | prints the content of the list to the screen
    public void display() {
        Item p = list;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}

// Listede saklanacak her bir elemanı tanımlayan sınıf | Class defining each item to be stored in the list
class Item {
    int val;    // Elemanın değeri | Value of the item
    Item next;  // Bir sonraki elemanın referansı | Reference of the next item

    // Yapıcı metot | Constructor method (constructor)
    // Yapıcı metot, parametre değerlerini ilgili özniteliklere (val ve next) atar.
    Item(int val, Item next) { // Yapıcı metot, sınıfın adı ile aynıdır ve geriye bir değer döndürmez.
        this.val = val; // Elemanın değerini ata | Assign the value of the item
        this.next = next; // Bir sonraki elemanın referansını ata | Assign the reference of the next item
    }
}