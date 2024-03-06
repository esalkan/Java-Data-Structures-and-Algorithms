package JDSA_01_OOP_Encapsulation_GarbageCollection.Examples;

public class Square {
    private int edge;  // private: Sadece bu sınıf içerisinden erişilebilir. - Only accessible from this class.

    // Constructor method with parameter | Parametreli kurucu metot:
    public Square (int edge) {
        if (edge < 0) {
            throw new RuntimeException("Edge value cannot be negative!");
        } else {
            this.edge = edge;
        }
    }

    // Constructor method without parameter | Parametresiz kurucu metot:
    public Square(){
        // this.edge = 1;
        this(1);  // this: Bu sınıfın nesnesi - This object of this class
                        // this(1): Bu sınıfın nesnesinin edge özelliğine 1 değerini ata - Assign 1 value to the edge property of this object of this class (this.edge = 1;)
    }

    // Getter method | Get metodu:
    // getEdge() method is used to access the edge property of the Square class and return it.
    // getEdge() metodu, Square sınıfının edge özelliğine erişmek ve onu döndürmek için kullanılır.
    public int getEdge() {
        return edge;
    }

    // Setter method | Set metodu:
    // setEdge() method is used to access the edge property of the Square class and assign it.
    // setEdge() metodu, Square sınıfının edge özelliğine erişmek ve onu atamak için kullanılır.
    public void setEdge(int edge) {
        if (edge < 0) {
            throw new RuntimeException("Edge value cannot be negative!");
        } else {
            this.edge = edge;
        }
    }

    // toString() method is used to access the edge property of the Square class and return it.
    // toString() metodu, Square sınıfının edge özelliğine erişmek ve onu döndürmek için kullanılır.
    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
