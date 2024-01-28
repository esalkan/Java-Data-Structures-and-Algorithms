package JVYA_01_OOP_Encapsulation_GarbageCollection.Package02;

import JVYA_01_OOP_Encapsulation_GarbageCollection.Package01.A;

// C Class is in the different package with A and B Classes so it can not access to A and B Classes' members (x, y, z)
// C Sınıfı A ve B Sınıfları ile aynı pakette olmadığı için A ve B Sınıflarının üyelerine (x, y, z) erişemez
public class C {

    void f(){
        System.out.println("Void f() methodu çalıştı.");
        A newAClass = new A();
        newAClass.z = 8;
    }
}
