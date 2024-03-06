package JVYA_05_List_Data_Structure.Examples;

public class StudentList {
    public static void main(String[] args) {
        StudentInformation.search(124);
    }
}

class StudentInformation {
    // Öğrencinin numarasını tutar | holds the student's number
    int studentNo;

    // Öğrencinin adını tutar | holds the student's name
    String studentName;

    // Öğrencinin soyadını tutar | holds the student's surname
    String studentSurname;

    // Öğrencinin adresini tutar | holds the student's address
    String studentAddress;

    // öğrencinin sınıfını tutar | holds the student's class
    int studentClassYear;

    // next, bir sonraki öğrencinin bilgilerini tutar | next holds the information of the next student
    StudentInformation next;


    // Arama işlemini gerçekleştirir | performs the search operation
    // key, aranacak öğrenci numarasıdır | key is the student number to be searched
    public static void search(int key) {
        StudentInformation liste = new StudentInformation();
        liste.studentNo = 123;
        liste.studentName = "Ali";
        liste.studentSurname = "Yılmaz";
        liste.studentAddress = "Ankara";
        liste.studentClassYear = 3;
        liste.next = null;

        StudentInformation liste1 = new StudentInformation();
        liste1.studentNo = 124;
        liste1.studentName = "Ayşe";
        liste1.studentSurname = "Demir";
        liste1.studentAddress = "İstanbul";
        liste1.studentClassYear = 2;
        liste1.next = liste;
        liste = liste1;

        StudentInformation liste2 = new StudentInformation();
        liste2.studentNo = 125;
        liste2.studentName = "Mehmet";
        liste2.studentSurname = "Kara";
        liste2.studentAddress = "İzmir";
        liste2.studentClassYear = 1;
        liste2.next = liste;
        liste = liste2;

        // Arama işlemi | Search operation
        // pt, liste üzerinde dolaşan bir işaretçidir | pt is a pointer that traverses the list
        StudentInformation pointer = liste;

        // While döngüsü, pointer null olmadığı sürece ve aranan öğrenci numarası bulunana kadar döner
        // While loop continues until the pointer is not null and the student number is found
        while (pointer != null && pointer.studentNo != key){
            pointer = pointer.next;  // pointer'ı bir sonraki öğrenciye taşı | move the pointer to the next student
        }

        // Pointer null ise, döngüden çıkarız bu arama sonucunda öğrenci bulunamadığı anlamına gelir
        // If the pointer is null, we exit the loop, which means that the student was not found in this search
        if(pointer==null){
            System.out.println(key+": bu numaraya sahip ogrenci yok"); /* yok demektir */
        } else {
            System.out.println("Student No: " + pointer.studentNo);
            System.out.println("Student Name: " + pointer.studentName);
            System.out.println("Student Surname: " + pointer.studentSurname);
            System.out.println("Student Adress: " + pointer.studentAddress);
            System.out.println("Student Class: " + pointer.studentClassYear);
        }
    }
}
