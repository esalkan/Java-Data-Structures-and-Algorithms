package JDSA_04_Queue_Data_Structure;

public class _01_Queue_Data_Structure_Intro {

    /*
     * Kuyruk (Queue) Veri Yapısı - Queue Data Structure
     *
     * Kuyruk ilk giren ilk çıkar (FIFO - First In First Out) mantığına göre çalışan bir veri yapısıdır.
     *   Queue is a data structure that operates on the first-in, first-out (FIFO) logic.
     *
     * Kuyruk, veri yapısı içerisindeki elemanların sırasını koruyan bir veri yapısıdır.
     *   The queue is a data structure that maintains the order of elements within the data structure.
     * Kuyruğun en önünden (front) eleman çıkarılır ve en arkasına (rear) eleman eklenir.
     *   An element is removed from the front of the queue and an element is added to the back of the queue.
     *
     * Kuyruk veri yapısının temel işlemleri şunlardır:
     * 1. enqueue(): Kuyruğun arkasına eleman ekler. - Adds an element to the back of the queue.
     * 2. dequeue(): Kuyruğun önünden eleman çıkarır. - Removes an element from the front of the queue.
     * 3. peek(): Kuyruğun en önündeki elemana erişim sağlar. - Provides access to the front element of the queue.
     * 4. isEmpty(): Kuyruğun boş olup olmadığını kontrol eder. - Checks whether the queue is empty.
     * 5. isFull(): Kuyruğun dolu olup olmadığını kontrol eder. - Checks whether the queue is full.
     * 6. display(): Kuyruğun içeriğini ekrana yazdırır. - Prints the contents of the queue to the screen.
     * 7. size(): Kuyruğun boyutunu döndürür. - Returns the size of the queue.
     * 8. clear(): Kuyruğu temizler. - Clears the queue.
     * 9. contains(): Kuyrukta eleman arar. - Searches for an element in the queue.
     * 10. element(): Kuyruğun en önündeki elemana erişim sağlar. - Provides access to the front element of the queue.
     * 11. offer(): Kuyruğun arkasına eleman ekler. - Adds an element to the back of the queue.
     * 12. poll(): Kuyruğun en önündeki elemanı çıkarır. - Removes an element from the front of the queue.
     * 13. remove(): Kuyruğun en önündeki elemanı çıkarır. - Removes an element from the front of the queue.
     * 14. toArray(): Kuyruğu diziye dönüştürür. - Converts the queue to an array.
     * 15. iterator(): Kuyruğu döngü ile dolaşmayı sağlar. - Allows you to iterate through the queue with a loop.
     *
     * Kuyruk veri yapısının kullanım alanları şunlardır: - The usage areas of the queue data structure are as follows:
     * 1. İşlem sırasında geçici veri depolama. - Temporary data storage during operation.
     * 2. İşlem sırasında veri işleme. - Data processing during operation.
     * 3. İşlem sırasında veri aktarımı. - Data transfer during operation.
     * 4. İşlem sırasında veri sıralama. - Data sorting during operation.
     * 5. İşlem sırasında veri filtreleme. - Data filtering during operation.
     * 6. İşlem sırasında veri dönüşümü. - Data conversion during operation.
     *
     * Kuyruk veri yapısının avantajları şunlardır: - The advantages of the queue data structure are as follows:
     * 1. Kuyruk veri yapısı, veri depolama ve erişim işlemlerini hızlı bir şekilde gerçekleştirir.
     *    1. The queue data structure performs data storage and access operations quickly.
     * 2. Kuyruk veri yapısı, veri depolama ve erişim işlemlerini sabit bir zaman karmaşıklığına sahip olan bir veri yapısıdır.
     *   2. The queue data structure is a data structure with a constant time complexity for data storage and access operations.
     *
     * Kuyruk veri yapısının dezavantajları şunlardır:
     * 1. Kuyruk veri yapısı, sabit bir boyuta sahip olduğu için, kuyruğun boyutu dolduğunda yeni eleman eklenemez.
     *   1. The queue data structure has a constant size, so new elements cannot be added when the size of the queue is full.
     * 2. Kuyruk veri yapısı, veri depolama ve erişim işlemlerini sabit bir zaman karmaşıklığına sahip olan bir veri yapısıdır.
     *   2. The queue data structure is a data structure with a constant time complexity for data storage and access operations.

     */


    public static void main(String[] args) {
        int i;

        Queue q = new Queue(); // kuyruk yarat - create a queue
        q.enqueue(5); // kuyruğun arkasına 5'i ekle - add 5 to the back of the queue
        q.enqueue(4); // kuyruğun arkasına 4'ü ekle - add 4 to the back of the queue
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(34);
        q.enqueue(42);
        System.out.println("Kuyruğun İçeriği :"); // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen
        q.display(); // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen

        System.out.println("Kuyruğun En Önündeki Eleman :" + q.peek()); // kuyruğun en önündeki elemana eriş - access the front element of the queue
        i= q.dequeue(); // kuyruğun önünden eleman çıkar - remove an element from the front of the queue
        System.out.println("Cikan eleman: " + i); // çıkan elemanı ekrana yazdır - print the removed element to the screen
        q.display(); // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen


    }
}


class Queue {
    /* Kuyruğun alabileceği eleman sayısının üst sınırı - Number of elements the queue can take */
    public final int MAX_SIZE = 100;

    /* Ön ce arka eleman gösterrgeleri ile eleman sayısı - Number of elements with front and rear element pointers */
    private int front, rear, size;

    /* Kuyruğun elemanlarını tutan dizi - Array holding the elements of the queue */
    private int[] elements;

    /* Kuyruk yaratıcı işlev. - Queue constructor function. */
    public Queue() {
        front = 0;
        rear = MAX_SIZE - 1;
        size = 0;
        elements = new int[MAX_SIZE]; // diziyi yarat - create the array
    }

    /* full() işlevi, kuyruk dolu ise true, değilse false döner. - full() method, if the queue is full, it returns true, otherwise it returns false. */
    public boolean full() {
        return (size == MAX_SIZE); // kuyruk doluysa true, değilse false döner - returns true if the queue is full, otherwise returns false
    }

    /* empty() işlevi, kuyruk boş ise true, değilse false döner. - empty() method, if the queue is empty, it returns true, otherwise it returns false. */
    public boolean empty() {
        return (size == 0); // kuyruk boşsa true, değilse false döner - returns true if the queue is empty, otherwise returns false
    }

    /* enqueue(x) işlevi, kuyruk dolu ise hata verir, değilse verilen x değerini kuyruğun arkasına ekler. - enqueue(x) method, if the queue is full, it gives an error, otherwise it adds the given x value to the back of the queue. */
    public void enqueue(int x) {
        if (full())
            throw new RuntimeException("Hata: Kuyruk dolu"); // kuyruk doluysa hata ver - give an error if the queue is full
        rear = (rear + 1) % MAX_SIZE; // kuyruğun arkasına eleman ekle - add an element to the back of the queue
        elements[rear] = x; // kuyruğun arkasına x'i ekle - add x to the back of the queue
        size++; // eleman sayısını artır - increase the number of elements
    }

    /* dequeue() işlevi, kuyruk boş ise hata verir, değilse kuyruğun önünden eleman çıkarır. - dequeue() method, if the queue is empty, it gives an error, otherwise it removes an element from the front of the queue. */
    public int dequeue() {
        if (empty())
            throw new RuntimeException("Hata: Kuyruk bos"); // kuyruk boşsa hata ver - give an error if the queue is empty
        int temp = elements[front]; // kuyruğun önündeki elemanı al - take the element at the front of the queue
        front = (front + 1) % MAX_SIZE; // kuyruğun önünden eleman çıkar - remove an element from the front of the queue
        size--; // eleman sayısını azalt - decrease the number of elements
        return temp; // daha önce önünde olan elemanı döndür - return the element that was previously at the front
    }

    /* peek() işlevi, kuyruğun en önündeki elemana erişim sağlar. - peek() method, provides access to the front element of the queue. */
    public int peek() {
        if (empty())
            throw new RuntimeException("Hata: Kuyruk bos"); // kuyruk boşsa hata ver - give an error if the queue is empty
        return elements[front]; // kuyruğun en önündeki elemanı döndür - return the front element of the queue
    }

    /* display() işlevi, kuyruğun içeriğini ekrana yazdırır. - display() method, prints the contents of the queue to the screen. */
    public void display() {
        if (empty())
            throw new RuntimeException("Hata: Kuyruk bos"); // kuyruk boşsa hata ver - give an error if the queue is empty
        int i = front;
        while (i != rear) {
            System.out.print(elements[i] + " "); // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen
            i = (i + 1) % MAX_SIZE; // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen
        }
        System.out.println(elements[rear]); // kuyruğun içeriğini ekrana yazdır - print the contents of the queue to the screen
    }

    /* delete() işlevi, kuyruğu temizler. - delete() method, clears the queue. */
    public void clear() {
        front = 0;
        rear = MAX_SIZE - 1;
        size = 0;
    }
}

/*
 * Kuyruk veri yapısında erişilecek veya bu veri yapısından çıkarılacak eleman, var olan elemanların içinde
 * veri yapısına ilk koyulan eleman olarak belirlenmiştir. Yan, bu veri yapısında elemanlar veriyi yapısına giriş sırasına göre
 * dizilirler ve bu sıra kullanılarak veri yapısından alınabilirler.
 *
 *   The element to be accessed or removed from the queue data structure is determined as the first element placed in the data structure.
 *   Then, the elements in this data structure are arranged according to the order of entry into the data structure,
 *   and they can be taken from the data structure using this order.
 *
 * Bu veri yapısı üzerinde tanımlanan insert (yerleştirme) ve delete (çıkarma) işlemleri, bu veri yapısına
 * eleman ekleme ve çıkarma işlemleri gerçekleştirilmektedir. Yine bu işlemleri gerçekleştirmek için
 * yukarıda tanımlanan enqueue ve dequeue işlemleri kullanılmaktadır.
 *
 *   The insert and delete operations defined on this data structure are used to add and remove elements to and from this data structure.
 *   Again, the enqueue and dequeue operations defined above are used to perform these operations.
 *
 * Ayrıca kuyruk veri yapısının manipülasyonu için gereksinim duyulan front, rear ve size adını verdiğimiz ve
 * sırasıyla kuyruğun başını, sonunu ve eleman sayısını belirten öz nitelikler de yukarıdaki tanımda yer almaktadır.
 *
 *   In addition, the requirements for manipulating the queue data structure, which we call front, rear, and size,
 *   which respectively indicate the beginning, end, and number of elements of the queue, are also included in the above definition.
 *
 */
