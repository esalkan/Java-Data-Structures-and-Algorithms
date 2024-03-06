package JDSA_01_OOP_Encapsulation_GarbageCollection.Examples;

/*
    * Kapsülleme ve Çöp toplama Örneği
    * Encapsulation and Garbage Collection Example
*/
public class SquareExample {
    public static void main(String[] args) {
        // Square class'ının nesnesi oluşturuldu - Object of Square class is created
        Square square1 = new Square(5);
        // square1 nesnesinin edge özelliğine erişildi ve değeri ekrana yazdırıldı - edge property of square1 object is accessed and its value is printed to the screen
        System.out.println("square1: " + square1);

        Square square2 = new Square();
        System.out.println("square2: " + square2);

        // square2 nesnesinin edge özelliğine erişildi ve değeri ekrana yazdırıldı - edge property of square2 object is accessed and its value is printed to the screen
        square2.setEdge(10);
        System.out.println("square2: " + square2);

        // square2 nesnesinin edge özelliğine erişildi ve değeri ekrana yazdırıldı - edge property of square2 object is accessed and its value is printed to the screen
        System.out.println("square2.getEdge(): " + square2.getEdge());

        // square3 nesnesi oluşturuldu - Object of square3 class is created
        // Square square3 = new Square(-5);
        // System.out.println("square3: " + square3);

        // ------------------------------------------------------------------------------------------------------------
        // Garbage Collection Example | Çöp Toplama Örneği
        // Usde debug mode to see the garbage collection process | Çöp toplama işlemini görmek için debug modunu kullanın

        square1 = square2;
        System.out.println("square1: " + square1);
        System.out.println("square2: " + square2);

        square1 = null;
        System.out.println("square1: " + square1);

        // ------------------------------------------------------------------------------------------------------------


    }
}
