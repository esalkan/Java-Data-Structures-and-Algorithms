package JVYA_03_Stack_Data_Structure;

public class Stack {
    /* Yığıtın alabileceği eleman sayısının üst sınırı */
    /* The upper limit of the number of elements the stack can take */
    public final int MAX_SIZE = 1000;

    /* Üst elemanın indeksini tutan değişken */
    /* Variable holding the index of the top element */
    public int top;

    /* Yığıtın elemanlarını tutan dizi */
    /* Array holding the elements of the stack */
    public int[] stackArray;

    /* Yığıtın yapıcı metodu */
    /* Constructor method of the stack */
    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    /* full() metodu, yığıtın dolu olup olmadığını kontrol eder */
    /* The full() method checks whether the stack is full */
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    /* empty() metodu, yığıtın boş olup olmadığını kontrol eder */
    /* The empty() method checks whether the stack is empty */
    public boolean isEmpty() {
        return top == -1;
    }

    /* push() metodu, yığıtın en üstüne eleman ekler */
    /* The push() method adds an element to the top of the stack */
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            stackArray[++top] = data;
            System.out.println(data + " pushed to stack");
        }
    }

    /* pop() metodu, yığıtın en üstündeki elemanı çıkarır */
    /* The pop() method removes the top element of the stack */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int data = stackArray[top--];
            System.out.println(data + " popped from stack");
            return data;
        }
    }

    /* peek() metodu, yığıtın en üstündeki elemana erişim sağlar */
    /* The peek() method provides access to the top element of the stack */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    /* display() metodu, yığıtın elemanlarını ekrana yazdırır */
    /* The display() method prints the elements of the stack to the screen */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
