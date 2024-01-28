package JVYA_01_OOP_Encapsulation_GarbageCollection;

/*
    * Kapsülleme, saklama, giydirme, gizleme olarak bilinen bu kavram, bir nesnenin değişkenlerini ve fonksiyonlarını bir arada tutarak,
    * dışarıdan erişime kapalı tutmaktır. Bu sayede nesnenin değişkenlerine ve fonksiyonlarına sadece nesnenin kendisi erişebilir.
    * Nesneye özel özellikler gizlenerek, yanlızca izin verilen işlevler (fonksiyonlar) ile ve kontrollü olarak erişilmesi sağlanır.
    * Kapsülleme uygulandığında,
    *   - Nesnenin değişkenleri private olarak tanımlanır.
    *   - Nesnenin fonksiyonları public olarak tanımlanır.
    *   - Nesnenin değişkenlerine erişmek için get ve set fonksiyonları kullanılır.
    *   - Nesnenin fonksiyonları, nesnenin değişkenlerine erişir.
    *   - Nesnenin fonksiyonları, nesnenin değişkenlerini değiştirir.
    *   - Nesnenin fonksiyonları, nesnenin değişkenlerini kontrol eder.
    *   - ...
    *
    * Encapsulation, hiding, dressing, hiding, known as this concept, a variable of an object and functions together,
    * It is to keep closed to access from the outside by keeping it closed. In this way, only the object itself can access the variables and functions of the object.
    * Special properties of the object are hidden, and access is allowed only with authorized functions (functions) and controlled.
    * When encapsulation is applied,
    * - The variables of the object are defined as private.
    * - The functions of the object are defined as public.
    * - Get and set functions are used to access the variables of the object.
    * - The functions of the object access the variables of the object.
    * - The functions of the object change the variables of the object.
    * - The functions of the object control the variables of the object.
    * - ...
    *
*/
public class _03_Encapsulation {
    public static void main(String[] args) {

        // Person sınıfından bir nesne oluşturuluyor. | An object is created from the Person class.
        // Ve verileri ile birlikte Person sınıfının constructor metodu çalıştırılıyor. | And the constructor method of the Person class is run with its data.
        // Person sınıfının constructor metodu çalıştırıldığında, Person sınıfının nesnesi oluşturuluyor. | When the constructor method of the Person class is run, the object of the Person class is created.
        // Person sınıfının nesnesi oluşturulduğunda, Person sınıfının değişkenleri oluşturuluyor. | When the object of the Person class is created, the variables of the Person class are created.
        // Person sınıfının değişkenleri oluşturulduğunda, Person sınıfının değişkenlerine değer atanıyor. | When the variables of the Person class are created, the variables of the Person class are assigned values.
        // Person sınıfının değişkenlerine değer atandığında, Person sınıfının nesnesi oluşturuluyor. | When the variables of the Person class are assigned values, the object of the Person class is created.
        _03_PersonClass person = new _03_PersonClass(12345678910L, "John", "Doe", 30);

        System.out.println("\nPerson Object Created via Constructor Method | Constructor Metodu ile Person Nesnesi Oluşturuldu");
        // Kimlik bilgisini ekrana yazdır. | Print the identity information to the screen.
        System.out.println("ID: " + person.getId());

        // İsim bilgisini ekrana yazdır. | Print the name information to the screen.
        System.out.println("Name: " + person.getName());

        // Soyisim bilgisini ekrana yazdır. | Print the surname information to the screen.
        System.out.println("Surname: " + person.getSurname());

        // Tam isim bilgisini ekrana yazdır. | Print the full name information to the screen.
        System.out.println("Full Name: " + person.getFullName());

        // Yaş bilgisini ekrana yazdır. | Print the age information to the screen.
        System.out.println("Age: " + person.getAge());

        System.out.println("\nAfter Changes The person object details | Değişikliklerden Sonra person Nesnesinin Detayları");
        // Person sınıfının nesnesinde değişiklik yap. | Make changes to the object of the Person class.
        person.setName("Jane");
        person.setSurname("Doe");
        person.setAge(25);

        // Kimlik bilgisini yeniden ekrana yazdır. | Print the identity information again to the screen.
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());

        // ------------------------------------------------------------------------------------------------------------

        _03_PersonClass a = new _03_PersonClass(1234543L, "Ali", "Güneş", 23);
        _03_PersonClass b = new _03_PersonClass(8797796L, "Veli","Ay", 58);

        System.out.println("Example Started...");

        System.out.println("a ------> [" + a.getFullName() + "]");
        System.out.println("a ------> [" + b.getFullName() + "]");

        a = b; // Referansları switch ediyoruz.
        b = a;

        System.out.println("a ------> [" + a.getFullName() + "]");
        System.out.println("a ------> [" + b.getFullName() + "]");
    }
}
