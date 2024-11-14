
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("---Yolcu programına hoş geldiniz----");
        int sartlar=0;
        
        Yolcu yolcu= new Yolcu();
        
        if(yolcu.Cikis_yasagi()==true){
            System.out.println("Çıkış yasağınız bulunuyor********");
            
        }
        else{
            
            sartlar++;
        }
        
        if(yolcu.vize()){
            
            sartlar++;
        }
        else{
            System.out.println("Vizenin bulunmamaktadır");
        }
        if(yolcu.harc()>=100){
            System.out.println("Harç parası tamamdır");
            sartlar++;
        }
        else{
            System.out.println("harç parası tamam değildir");
        }
        
        if(sartlar==3){
            System.out.println("BÜTÜN İŞLEMLER TAMAMLANDI HAYIRLI YOLCULUKLAR");
        }
        else{
            System.out.println("İŞLEMLERİNİZİ KONTROL EDİNİZ");
        }
        
      
        
    }
}
