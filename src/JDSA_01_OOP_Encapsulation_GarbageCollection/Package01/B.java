package JDSA_01_OOP_Encapsulation_GarbageCollection.Package01;

// B Class is in the same package with A Class so it can access to A Class' members (x, y, z)
// B Sınıfı A Sınıfı ile aynı pakette olduğu için A Sınıfının üyelerine (x, y, z) erişebilir
public class B {
    public static void main(String[] args) {
        A a = new A();  // A Class'ından bir nesne oluşturuldu | an object is created from A Class
        a.z = 10;       // a.z aynı paketten erişilebilir | a.z is accessible from the same package
        a.y = 20;       // a.y aynı paketten erişilebilir | a.y is accessible from the same package
        // a.x = 30;    // private members can not be accessed from outside of the class
    }
}
