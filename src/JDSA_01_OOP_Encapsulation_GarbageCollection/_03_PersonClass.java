package JDSA_01_OOP_Encapsulation_GarbageCollection;

public class _03_PersonClass {
    // Person sınıfı, bir kişinin bilgilerini tutmak için oluşturulmuştur.
    // The Person class is created to hold a person's information.

    // The Person class properties and functions | Person sınıfının özellikleri ve fonksiyonları:
    private long id;               // TCKN (TC Kimlik Numarası) - Turkish Republic Identity Number
    // private: Sadece bu sınıf içerisinden erişilebilir. - Only accessible from this class.

    private String name, surname;  // İsim ve soyisim - Name and surname
    // private: Sadece bu sınıf içerisinden erişilebilir. - Only accessible from this class.

    private int age;               // Yaş - Age
    // private: Sadece bu sınıf içerisinden erişilebilir. - Only accessible from this class.

    // Constructor method | Kurucu metot:
    public _03_PersonClass(long id, String name, String surname, int age) {
        this.id = id;           // this: Bu sınıfın nesnesi - This object of this class
        // this.id: Bu sınıfın nesnesinin id özelliği - The id property of this object of this class
        // = id: Bu sınıfın nesnesinin id özelliğine parametre olarak gelen id değerini ata - Assign the id value coming as a parameter to the id property of this object of this class

        this.name = name;       // this: Bu sınıfın nesnesi - This object of this class
        // this.name: Bu sınıfın nesnesinin name özelliği - The name property of this object of this class
        // = name: Bu sınıfın nesnesinin name özelliğine parametre olarak gelen name değerini ata - Assign the name value coming as a parameter to the name property of this object of this class

        this.surname = surname; // this: Bu sınıfın nesnesi - This object of this class
        // this.surname: Bu sınıfın nesnesinin surname özelliği - The surname property of this object of this class
        // = surname: Bu sınıfın nesnesinin surname özelliğine parametre olarak gelen surname değerini ata - Assign the surname value coming as a parameter to the surname property of this object of this class

        this.age = age;         // this: Bu sınıfın nesnesi - This object of this class
        // this.age: Bu sınıfın nesnesinin age özelliği - The age property of this object of this class
        // = age: Bu sınıfın nesnesinin age özelliğine parametre olarak gelen age değerini ata - Assign the age value coming as a parameter to the age property of this object of this class

        System.out.println("Person constructor method is working...");
    }

    // Getter methods | Get metotları:
    // Get metodları, sınıfın private olarak tanımlanmış özelliklerine erişmek için kullanılır.
    // Get methods are used to access the properties of the class defined as private.

    // getId() method is used to access the id property of the Person class and return it.
    // getId() metodu, Person sınıfının id özelliğine erişmek ve onu döndürmek için kullanılır.
    public long getId() {
        return id;
    }

    // getName() method is used to access the name property of the Person class and return it.
    // getName() metodu, Person sınıfının name özelliğine erişmek ve onu döndürmek için kullanılır.
    public String getName() {
        return name;
    }

    // getSurname() method is used to access the surname property of the Person class and return it.
    // getSurname() metodu, Person sınıfının surname özelliğine erişmek ve onu döndürmek için kullanılır.
    public String getSurname() {
        return surname;
    }

    // getFullName() method is used to access the name and surname properties of the Person class and return them.
    // getFullName() metodu, Person sınıfının name ve surname özelliklerine erişmek ve onları döndürmek için kullanılır.
    public String getFullName(){
        return name + " " + surname;
    }

    // getAge() method is used to access the age property of the Person class and return it.
    // getAge() metodu, Person sınıfının age özelliğine erişmek ve onu döndürmek için kullanılır.
    public int getAge() {
        return age;
    }

    // Setters methods | Set metotları:
    // Set metodları, sınıfın private olarak tanımlanmış özelliklerini değiştirmek için kullanılır.
    // Set methods are used to change the properties of the class defined as private.
    public void setName(String s){
        if (s.length() > 0) {
            name = s;
        } else {
            throw new RuntimeException("Name cannot be empty!");
        }
    }

    public void setSurname(String s){
        if (s.length() > 0) {
            surname = s;
        } else {
            throw new RuntimeException("Surname cannot be empty!");
        }
    }

    public void setFullName(String s, String ss){
        if (s.length() > 0 && ss.length() > 0) {
            name = s;
            surname = ss;
        } else {
            throw new RuntimeException("Name and surname cannot be empty!");
        }
    }

    public void setAge(int y){
        if (y > 0) {
            age = y;
        } else {
            throw new RuntimeException("Age cannot be less than 1!");
        }
    }

    // toString() method | toString() metodu:
    // toString() metodu, sınıfın özelliklerini yazdırmak için kullanılır.
    // The toString() method is used to print the properties of the class.
    /*
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age + " years old" +
                '}';
    }
    */
}
