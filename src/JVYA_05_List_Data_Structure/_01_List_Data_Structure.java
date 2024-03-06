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

