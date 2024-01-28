package JVYA_01_OOP_Encapsulation_GarbageCollection;

import JVYA_01_OOP_Encapsulation_GarbageCollection.Package01.A;

public class _02_Accessibility_Identifiers {

    /*
        * Java'da erişim belirleyicileri, nesnelerin ve yöntemlerin erişimini kontrol etmek için kullanılır.
        * Erişim belirleyicileri, nesnelerin ve yöntemlerin erişimini sınırlar.
        * Erişim belirleyiciler şunlardır:
        *   - public        (her yerden erişilebilir)
        *   - protected     (aynı paket veya alt sınıflardan erişilebilir)
        *   - private       (sadece aynı sınıftan erişilebilir)
        *   - default       (aynı paketten erişilebilir)
        *
        *
        * In Java, access modifiers are used to control the access of objects and methods.
        * Access modifiers limit the access of objects and methods.
        * Access modifiers are:
        * - public        (accessible from everywhere)
        * - protected     (accessible from the same package or subclasses)
        * - private       (accessible from the same class only)
        * - default       (accessible from the same package)
     */

    /*
        * Paketlerin erişim belirleyicisi yoktur.
        * Paketler, sınıfların ve arayüzlerin erişimini kontrol etmek için kullanılır.
        *
        * There is no access modifier for packages.
        * Packages are used to control the access of classes and interfaces.
        *
        * Örnekler için Paket01, Paket02 ve Paket03 paketlerine bakınız.
        * İçlerindeki sınıfların erişim belirleyicilerini değiştirerek, erişim belirleyicilerinin nasıl çalıştığını görebilirsiniz.
        *
        * See the Paket01, Paket02 and Paket03 packages for examples.
        * You can see how access modifiers work by changing the access modifiers of the classes in them.
     */

    public static void main(String[] args) {
        A a = new A();  // A Class'ından bir nesne oluşturuldu | an object is created from A Class
        a.z = 10;       // a.z aynı paketten erişilebilir | a.z is accessible from the same package

        // a.y = 20;    // a.y aynı paketten erişilebilir | a.y is accessible from the same package
                        // y elemanı default erişim belirleyicisine sahip olduğu için aynı paketten erişilebilir | y element is accessible from the same package because it has default access modifier

        // a.x = 30;    // private members can not be accessed from outside of the class
    }                   // private üyelere sınıfın dışından erişilemez
}
