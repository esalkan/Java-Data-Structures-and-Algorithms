package JDSA_03_Stack_Data_Structure;

public class _01_Stack_Data_Structure_Intro {

    // Yığıt, son giren-ilk çıkar (last-in/first-out) kuralıyla elemanları depolayan bir veri yapısıdır.
    // Yığıt, veri yapısı içerisindeki elemanları sıralı bir şekilde depolayan ve bu elemanlara sadece son elemandan erişim sağlayan bir veri yapısıdır.
    // Yığıt veri yapısında elemanlar, yığıtın en üstüne eklenir ve yığıtın en üstünden çıkarılır.

    // Yığıt veri yapısının temel işlemleri şunlardır:
    // 1. push(): Yığıtın en üstüne eleman ekler.
    // 2. pop(): Yığıtın en üstündeki elemanı çıkarır.
    // 3. peek(): Yığıtın en üstündeki elemana erişim sağlar.
    // 4. isEmpty(): Yığıtın boş olup olmadığını kontrol eder.
    // 5. isFull(): Yığıtın dolu olup olmadığını kontrol eder.

    // Yığıt veri yapısının kullanım alanları şunlardır:
    // 1. İşlem sırasında geçici veri depolama.
    // 2. Geri alma (undo) işlemleri.

    // Yığıt veri yapısının avantajları şunlardır:
    // 1. Yığıt veri yapısı, veri depolama ve erişim işlemlerini hızlı bir şekilde gerçekleştirir.
    // 2. Yığıt veri yapısı, veri depolama ve erişim işlemlerini sabit bir zaman karmaşıklığına sahip olan bir veri yapısıdır.

    // Yığıt veri yapısının dezavantajları şunlardır:
    // 1. Yığıt veri yapısı, sabit bir boyuta sahip olduğu için, yığıtın boyutu dolduğunda yeni eleman eklenemez.
    // 2. Yığıt veri yapısı, veri depolama ve erişim işlemlerini sabit bir zaman karmaşıklığına sahip olan bir veri yapısıdır.

    // Stack, a data structure that stores elements in a last-in/first-out (LIFO) order.
    // Stack is a data structure that stores elements in a sequential manner and provides access to these elements only from the top element.
    // In the stack data structure, elements are added to the top of the stack and removed from the top of the stack.

    // The basic operations of the stack data structure are as follows:
    // 1. push(): Adds an element to the top of the stack.
    // 2. pop(): Removes the top element of the stack.
    // 3. peek(): Provides access to the top element of the stack.
    // 4. isEmpty(): Checks whether the stack is empty.
    // 5. isFull(): Checks whether the stack is full.

    // The usage areas of the stack data structure are as follows:
    // 1. Temporary data storage during operation.
    // 2. Undo operations.

    // The advantages of the stack data structure are as follows:
    // 1. The stack data structure performs data storage and access operations quickly.
    // 2. The stack data structure is a data structure with a constant time complexity for data storage and access operations.

    // The disadvantages of the stack data structure are as follows:
    // 1. The stack data structure has a constant size, so new elements cannot be added when the size of the stack is full.
    // 2. The stack data structure is a data structure with a constant time complexity for data storage and access operations.

        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.display();
            stack.pop();
            stack.display();
            stack.peek();

            System.out.println();

            int i;
            Stack s = new Stack();

            s.push(5);
            s.push(4);
            i = s.pop();
            s.display();
            s.push(7);
            s.push(8);
            s.push(34);
            s.push(42);
            i = s.pop();
            s.display();
            i = s.pop();
            s.display();
            s.push(6);
            s.display();
            i = s.pop();
            s.display();

        }
    }

