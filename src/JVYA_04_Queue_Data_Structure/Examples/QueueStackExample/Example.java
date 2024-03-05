package JVYA_04_Queue_Data_Structure.Examples.QueueStackExample;

public class Example
{

    public static void TersCevir(IdeaQueue q)
    {
        // Geçici yığıt oluşturuyoruz ve kuyruğun elemanlarını geçici yığıta itere ederek ters çeviriyoruz
        IdeaStack ideaStack = new IdeaStack();

        // While döngüsü ile kuyruğun elemanlarını geçici yığıta itere ederek ters çeviriyoruz
        while (!q.empty()) {
            int eleman = q.delete();
            ideaStack.push(eleman);
        }

        // Geçici yığıtın elemanlarını tekrar kuyruğa geri ekliyoruz
        while (!ideaStack.empty()) {
            int eleman = ideaStack.pop();
            q.insert(eleman);
        }
    }


    public static int KuyrukSonEleman(IdeaQueue q)
    {
        // Kuyruk boş ise -1 döndürüyoruz (hata durumu)
        if (q.empty()) {
            return -1;
        }

        // Geçici yığıt oluşturuyoruz
        IdeaStack ideaStack = new IdeaStack();

        // Kuyruğun elemanlarını geçici yığıta iterleyerek son elemanı bul
        while (!q.empty()) {
            int eleman = q.delete();
            ideaStack.push(eleman);
        }

        // Geçici yığıtın en üstündeki elemanı alıyoruz (en son elemanı)
        int enSonEleman = ideaStack.pop();

        // Geçici yığıtta saklanan diğer elemanları tekrar kuyruğa geri ekliyoruz
        while (!ideaStack.empty()) {
            int eleman = ideaStack.pop();
            q.insert(eleman);
        }

        return enSonEleman;
    }


    public static int YigitElemanToplam(IdeaStack s)
    {
        // Geçici yığıt oluşturuyoruz
        IdeaStack tempStack = new IdeaStack();

        // Yığıtın eleman sayısını ve ortanca ile son elemanları saklamak için değişkenler oluşturuyoruz
        int elemanSayisi = 0;
        int ortancaEleman = -1;
        int sonEleman = -1;

        // Yığıttaki eleman sayısını buluyoruz ve geçici yığıta iterleyerek saklıyoruz bu arada ortanca ve son elemanları buluyoruz
        while (!s.empty()) {
            int eleman = s.pop();
            tempStack.push(eleman);
            elemanSayisi++;
        }

        // Yığıtın eleman sayısına göre ortanca elemanı buluyoruz ve geçici yığıta geri ekliyoruz
        int ortancaIndis = elemanSayisi / 2;
        for (int i = 0; i < elemanSayisi; i++) {
            int eleman = tempStack.pop();
            if (i == ortancaIndis) {
                ortancaEleman = eleman;
            }
            if (i == elemanSayisi - 1) {
                sonEleman = eleman;
            }
            s.push(eleman);
        }

        // Ortanca ve son elemanın toplamını döndürüyoruz
        return ortancaEleman + sonEleman;
    }

    public static void YigitAyikla(IdeaStack s, int x)
    {
        IdeaStack tempStack = new IdeaStack(); // Geçici yığıt oluşturuyoruz

        // Yığıt boş olana kadar elemanları kontrol ettiriyoruz
        while (!s.empty()) {
            int eleman = s.pop();
            if (eleman < x) {
                tempStack.push(eleman);
            }
        }

        // Saklanan elemanları tekrar asıl yığıta geri ekliyoruz
        while (!tempStack.empty()) {
            int eleman = tempStack.pop();
            s.push(eleman);
        }

    }


    public static void main(String[] args)
    {
        // Yeni bir yığıtlar ve kuyruklar oluşturuyoruz ve içlerini dolduruyoruz
        IdeaStack s1 = new IdeaStack();
        IdeaStack s2 = new IdeaStack();
        IdeaQueue q1 = new IdeaQueue();
        IdeaQueue q2 = new IdeaQueue();

        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s2.push(15);
        s2.push(16);
        s2.push(17);
        s2.push(18);
        s2.push(19);

        q1.insert(-5);
        q1.insert(-4);
        q1.insert(-3);
        q1.insert(-2);
        q2.insert(-11);
        q2.insert(-10);
        q2.insert(-9);
        q2.insert(-8);
        q2.insert(-7);

        // Tersçevir fonksiyonunu çağırarak kuyruğu ters çeviriyoruz
        TersCevir(q1);

        // showContent fonksiyonu ile kuyruğun içeriğini ekrana yazdırıyoruz
        q1.showContent();

        // KuyrukSonEleman fonksiyonunu çağırarak kuyruğun son elemanını buluyoruz ve ekrana yazdırıyoruz
        System.out.println(KuyrukSonEleman(q1));

        // showContent fonksiyonu ile kuyruğun içeriğini ekrana yazdırıyoruz
        q1.showContent();

        // KuyrukSonEleman fonksiyonunu çağırarak kuyruğun son elemanını buluyoruz ve ekrana yazdırıyoruz
        System.out.println(KuyrukSonEleman(q2));

        // showContent fonksiyonu ile kuyruğun içeriğini ekrana yazdırıyoruz
        q2.showContent();

        // YigitElemanToplam fonksiyonunu çağırarak yığının ortanca ve son elemanlarının toplamını buluyoruz ve ekrana yazdırıyoruz
        System.out.println(YigitElemanToplam(s1));

        // showContent fonksiyonu ile yığının içeriğini ekrana yazdırıyoruz
        s1.showContent();

        // YigitElemanToplam fonksiyonunu çağırarak yığının ortanca ve son elemanlarının toplamını buluyoruz ve ekrana yazdırıyoruz
        System.out.println("Yığıt Eleman Topla : "+ YigitElemanToplam(s2));

        // showContent fonksiyonu ile yığının içeriğini ekrana yazdırıyoruz
        s2.showContent();

        // YigitAyikla fonksiyonunu çağırarak yığıttaki elemanlardan 56'dan küçük olanları siliyoruz
        YigitAyikla(s2, 17);

        // showContent fonksiyonu ile yığının içeriğini ekrana yazdırıyoruz
        s2.showContent();
    }



}
