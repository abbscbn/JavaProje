
import java.util.Scanner;


public class Yolcu implements Kurallar {
    
    private double harc;
    private boolean cikis_yasagi;
    private boolean vize;

    public Yolcu() throws InterruptedException  {
        System.out.println("Harc parasını yatırın (min:100tl)");
        Scanner scanner= new Scanner(System.in);
        double para=scanner.nextDouble();
        scanner.nextLine();
        
        if(para>=100){
            this.harc=para;
        }
        else{
            System.out.println("100 tl nin aşağısında para yatırdınız");
        }
        
        System.out.println("para yatırılıyor....");
        Thread.sleep(2000);
        
        System.out.println("Çıkış yasağınız var mı? (evet/hayır)");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.cikis_yasagi=true;
        }
        else{
            this.cikis_yasagi=false;
        }
        System.out.println("Yasak kontrol edeliyor....");
        Thread.sleep(2000);
        System.out.println("Vizenin bulunuyor mu?");
        cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.vize=true;
        }
        else{
            this.vize=false;
        }
       System.out.println("Vize kontrol ediliyor....");
        Thread.sleep(2000);
        
        
    }

    @Override
    public boolean Cikis_yasagi() {
        if(this.cikis_yasagi){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double harc() {
        return this.harc;
    }

    @Override
    public boolean vize() {
        if(this.vize){
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
