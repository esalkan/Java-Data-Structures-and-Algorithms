package JDSA_07_Sorting_Algorithms;

public class _04_00_Hashing_Method {

    /*
        * Arama yöntemleri içinde doğrama (bölme/hashing) yöntemi kullanıldığı farklı yaklaşımla ve performans açısından
        * gösterdiği önemli başarıyla ön plana çıkmaktadır. Doğrama yöntemi, elemanların veri yapısına nasıl
        * yerleştirieceği özel bir yöntemle belirlenerek, bu yöntem sayesinde bir elemanın o veri yapısında bulunup
        * bulunmadığının tek bir adımda bulunabilmesi amaçlanmıştır. Böyle bir yöntemin kullanılabileceği uygun bir örnek
        * 1'den N'e kadar tamsayılarla anahtarlanmış kayıtların N büyüklüğünde bir diziye yerleştirilmesi durumudur.
        * Burada her anahtarın dizide kendi değerine eşit indekse sahip pozisyona yerleştirilmesiyle istenen özellik sağlanabilir.
        * Böylelikle örneğin K anatar değerine sahip bir kayda sadece dizinin k'ıncı pozisyonunda bulunan anahtarın gösterdiği
        * elemana bakarak tek bir adımda ulaşmak mümkün olacaktır. Bu yapıyla aranan elemanın dizinin neresinde olduğu
        * belirlemeye çalışma yükü tek adıma indirilmiş olacaktır. Yani aradığımız elemanları veri yapımıza ekleme
        * ve veri yapımızdan çıkarma sadece birer adımda gerçekleştirilebilecektir.
        *
        * Ancak birçok uygulamada kayıtlarımızın anahtarları tamsayı olmayacaktır veya tamsayı oldugu durumda ise
        * sayıların aralığı (range) dizimizin veya elemanlarımızı saklayacağımız tablonun indeks aralığı ile aynı olmayabilir.
        * Yani anahtar olarak kullandığımız tamsayılar ard arda ve sıfırdan başlayıp dizi boyuna kadar düzenli bir şekilde artan
        * sayılar olmak zorunda değildir. Doğrama tekniği genel olarak bütün bu durumlarda bir fonksiyon aracılığı ile
        * anahtar değerlerini belirli bir tablo adresine (dizi indeksine) eşleyen ve kayıtların yukarıda anlatıldığı gibi
        * tek adımla tabloya yerleştirilmesini ve alınmasını sağlayan yöntem olarak tanımlanabilir.
        *
        * Mükemmel durumda kullanılan doğrama fonksiyonunun (hash function) her eleman için başka elemanlarınkinden
        * farklı bir adres ataması gerekmektedir. Ancak birçok uygulamada böyle mükemmel bir fonksiyon bulabilmek imkansızdır.
        * O yüzden doğrama tekniği kullanıldığında bazı elemanların aynı pozisyonlara atanması ve çakışmaların (collision)
        * oluşması oldukça sık görülen bir durumdur. Böyle durumlarda ise çeşitli teknikler kullanarak bu çakışma
        * durumlarında veri kaybının önlenmesi ve verimliliğin korunması sağlanmaya çalışılmaktadır.
        * Yani doğrama yönteminde iki önemli işlev yerine getirilmelidir. Verilen anahtarların özelliklerine uygun,
        * çakışma sayısını en azda tutabilecek bir fonksiyonun belirlenmesi ve çakışma olduğu durumda yapılacak işlemler.
        *
    */
}
