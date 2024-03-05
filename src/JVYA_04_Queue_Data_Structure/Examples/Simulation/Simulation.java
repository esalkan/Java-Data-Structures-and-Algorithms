package JVYA_04_Queue_Data_Structure.Examples.Simulation;
import JVYA_04_Queue_Data_Structure.Examples.QueueStackExample.IdeaQueue;
import java.util.Random;

public class Simulation {
    public static void main(String args[]) {
        // Random sınıfı nesnesi oluşturuldu (rastgele sayı üretmek için)
        Random rnd = new Random();

        // Kuyruk nesnesi oluşturuldu (müşteri kuyruğu)
        IdeaQueue q = new IdeaQueue();

        // ödeme noktasının kaç dakika süre ile açık kalacağı
        // (örneğin 5 dakika sonra kapanacaksa, 5 dakika boyunca müşteri kabul eder)
        final int KAPANIS=5;

        // Geçen dakika sayısı (simülasyonun başlangıcında 0)
        int dk=0;

        // Servis verilmekte olan müşterinin sıra numarası ve kaç dakikalık daha işlemi kaldığı
        int mno=0, kalan=0;

        // o sırada ödeme noktasına yeni giren müşterinin kaç dakikalık işlemi olduğu
        // (örneğin 1-3 dakika arasında bir işlem süresi olabilir)
        int yeni;

        // Veznenin boş olup olmadığı (başlangıçta boş)
        boolean bos = true;

        System.out.println("Odeme noktasi acildi:");

        while(true) {
            System.out.println(dk+". dk:");

            if(dk<KAPANIS) {             // ödeme noktası açıksa
                yeni=rnd.nextInt(3)+1;     // 1-3 dakikalık işlemi olan yeni müşteri bir geldi
                System.out.println("\tyeni bir musteri kuyruga girdi; "+yeni+" dakikalik islemi var");
                q.insert(yeni);            // kuyruğa girdi
            }

            if(dk==KAPANIS)
                System.out.println("\todeme noktasi kapandi");

            if(!bos) {                   // vezne boş değilse
                kalan--;                   // işlemi yapılan müşterinin kalan işlem süresinden 1 dk daha geçti
                if(kalan==0) {             // işlemi bittiyse
                    System.out.println("\t"+mno+". musteriye verilen hizmet tamamlandi");
                    bos=true;                // vezne artık boş
                }
            }

            // kalan işlem süresi yoksa ve ödeme noktası kapanmışsa ve kuyrukta bekleyen yoksa, çık
            if(kalan==0 && dk>=KAPANIS && q.empty()) break;

            if(bos && !q.empty()) {      // vezne boşa ve kuyrukta bekleyen varsa
                kalan=q.delete();         // öndeki müşteriyi al, işlemini başlat
                mno++;                    // müşteri sıra numarasını ilerlet
                bos=false;                // vezne boş değil
                System.out.println("\t"+mno+". musteriye hizmet verilmeye baslandi");
            }

            dk++;                        // bir dakika daha geçmiş oldu

        } // while
        System.out.println("\tvezne kapandi");
    }
}
