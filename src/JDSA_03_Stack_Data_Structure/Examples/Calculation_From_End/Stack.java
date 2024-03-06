package JDSA_03_Stack_Data_Structure.Examples.Calculation_From_End;

public class Stack {
    /* Yığıtın alabileceği eleman sayısının üst sınırı. */
    // The upper limit of the number of elements the stack can take.
	public final int MAX_SIZE = 100;
	private int top; // Üst elemanın indeksini tutan değişken - Variable holding the index of the top element
	private int[] elements; // Yığıtın elemanlarını tutan dizi - Array holding the elements of the stack

    // Yığıt yaratıcı işlev. - Stack constructor function.
    public Stack() {
        top = -1;
        elements = new int[MAX_SIZE]; // diziyi yarat - create the array
    }

    /* full() işlevi, yığıt dolu ise true, değilse false döner. */
    /* full() method, if the stack is full, it returns true, otherwise it returns false. */
    public boolean full() {
        return (top == MAX_SIZE-1); // yığıt doluysa true, değilse false döner - returns true if the stack is full, otherwise returns false
    }

    /* empty() işlevi, yığıt boş ise true, değilse false döner. */
    /* empty() method, if the stack is empty, it returns true, otherwise it returns false. */
    public boolean empty() {
        return (top == -1); // yığıt boşsa true, değilse false döner - returns true if the stack is empty, otherwise returns false
    }

    /* push(x) işlevi, yığıt dolu ise hata verir, değilse verilen x değerini yığıta ekler. */
    /* push(x) method, if the stack is full, it gives an error, otherwise it adds the given x value to the stack. */
    public void push(int x) {
        if (full()) throw new RuntimeException("Hata: Yigit dolu"); // yığıt doluysa hata ver   - give an error if the stack is full
       	++top; // eleman sayısını artır - increase the number of elements
       	elements[top] = x; // yığıtın üzerine x'i ekle - add x to the stack
    }

    /* pop() işlevi, yığıt boş ise hata verir, değilse yığıtın en üst elemanını alıp döndürür. */
    /* pop() method, if the stack is empty, it gives an error, otherwise it takes the top element of the stack and returns it. */
    public int pop() {
        if (empty()) throw new RuntimeException("Hata: Yigit bos"); // yığıt boşsa hata ver - give an error if the stack is empty
        int temp = elements[top]; // üstteki elemanı al - take the element on top
        elements[top]=0;
        top--; // eleman sayısını azalt - decrease the number of elements
       return temp; // daha önce üstte olan elemanı döndür  - return the element that was previously on top
    }
}