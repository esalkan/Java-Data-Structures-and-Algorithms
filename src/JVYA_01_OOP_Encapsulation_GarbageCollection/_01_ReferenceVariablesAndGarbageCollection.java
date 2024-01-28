package JVYA_01_OOP_Encapsulation_GarbageCollection;

import java.awt.*;

public class _01_ReferenceVariablesAndGarbageCollection {
    public static void main(String[] args) {
        /*
            * Java'da oluşturulan bir nesneye, nesnenin erişim bilgisini tutan referans değişkenkleri ile erişilir.
            * Referans değişkenleri, nesnenin bellekteki konumunu tutar.
            * Programın çalışması sırasında, bir nesnenin erişim bilgisini ttan referans değişkeni olmadığında, o nesne artık kullanılmadığı anlamına gelir.
            * Bu nesneler, Garbage Collector tarafından bellekten silinir. Bu işleme Garbage Collection denir.
            * Ancen Garbage Collector'ın çalışması için, programın çalışması sırasında, bir nesnenin erişim bilgisini tutan referans değişkeni olmaması gerekir.
            * System.gc() yöntemi, Garbage Collector'ın çalışmasını sağlar. Ancak, bu yöntem, Garbage Collector'ın çalışmasını sağlamak için bir istektir.
            * Garbage Collector, bu isteği yerine getirmek zorunda değildir.
            * Bu isteği yerine getirmek için, Garbage Collector'ın çalışması için uygun bir zamanı beklemek gerekir.
            * Bu nedenle, System.gc() yöntemi, Garbage Collector'ın çalışmasını sağlamak için kullanılmamalıdır.
            * Bunun yerine programın çalışması sırasında, bir nesnenin erişim bilgisini tutan referans değişkeni olmamasına dikkat edilmelidir.
            *
            * In Java, an object that is created is accessed through reference variables that hold the access information of the object.
            * Reference variables hold the location of the object in memory.
            * When there is no reference variable that holds the access information of an object during the execution of the program, it means that the object is no longer used.
            * These objects are deleted from memory by the Garbage Collector. This process is called Garbage Collection.
            * However, for the Garbage Collector to work, there must be no reference variable that holds the access information of an object during the execution of the program.
            * The System.gc() method allows the Garbage Collector to work. However, this method is a request for the Garbage Collector to work.
            * The Garbage Collector is not obliged to fulfill this request.
            * To fulfill this request, you need to wait for a suitable time for the Garbage Collector to work.
            * Therefore, the System.gc() method should not be used to make the Garbage Collector work.
            * Instead, it should be noted that there is no reference variable that holds the access information of an object during the execution of the program.
            *
        */
        /*
            * The Point class is defined in the java.awt package and is used to represent a location in a two-dimensional (x, y) coordinate space.
            * The Point class has two int fields, x and y, and two methods, move() and getLocation().
            * The move() method changes the location of the point to the new location that is specified by the parameters x and y.
            * The getLocation() method returns the location of the point as a Point object.
            * The Point class is a reference type, so the variables p and q are reference variables.
            *
            * Point sınıfı, iki boyutlu (x, y) koordinat uzayındaki bir konumu temsil etmek için kullanılır ve java.awt paketinde tanımlanmıştır.
            * Point sınıfının iki int alanı, x ve y, ve iki yöntemi, move() ve getLocation() vardır.
            * move() yöntemi, noktanın konumunu x ve y parametreleri tarafından belirtilen yeni konuma değiştirir.
            * getLocation() yöntemi, noktanın konumunu bir Point nesnesi olarak döndürür.
            * Point sınıfı bir referans türü olduğundan, p ve q değişkenleri referans değişkenleridir.
        */

        Point p,q; // p and q are reference variables
        p = new Point(20, 40); // p references a Point object | p, bir Point nesnesine referans verir
        System.out.println(p.toString()); // Output: java.awt.Point[x=20,y=40]

        q = p; // q references the same Point object as p | q, p ile aynı Point nesnesine referans verir
        q.x = 100; // the x field of the Point object referenced by q is changed to 100 | q tarafından referans verilen Point nesnesinin x alanı 100 olarak değiştirilir
        System.out.println(p.toString()); // Output: java.awt.Point[x=100,y=40]

        Point r = new Point(); // r references a Point object | r, bir Point nesnesine referans verir
        System.out.println(r.toString()); // Output: java.awt.Point[x=0,y=0]
        r = q; // r references the same Point object as q | r, q ile aynı Point nesnesine referans verir
        System.out.println(r.toString()); // Output: java.awt.Point[x=100,y=40]

        p = null; // p no longer references a Point object | p artık bir Point nesnesine referans vermiyor
        q = null; // q no longer references a Point object | q artık bir Point nesnesine referans vermiyor
        r = null; // r no longer references a Point object | r artık bir Point nesnesine referans vermiyor


    }
}
