import javax.crypto.spec.PSource;
import java.util.Scanner;

public class daireproje {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secim;
        System.out.println(" lütfen yapmak istediğiniz işlemi giriniz:");
        System.out.println(" MENU \n1-Daire\n2-Üçgen\n3-Doğru\n4-çıkış");
        System.out.println("seçiminiz: ");
        secim = input.nextInt();
        if(secim==1) {
            System.out.println(" 3 noktanın koordinatlarını giriniz:");
            System.out.println("1.koordinat noktası:(x1,y1)");
            System.out.println("x1 noktasını giriniz:");
            double x1 = input.nextDouble();
            System.out.println("y1 noktasını giriniz: ");
            double y1 = input.nextDouble();
            System.out.println("2.koordinat noktası:(x2,y2)");
            System.out.println("x2 noktasını giriniz:");
            double x2 = input.nextDouble();
            System.out.println("y2 noktasını giriniz: ");
            double y2 = input.nextDouble();
            System.out.println("3.koordinat noktası:(x3,y3)");
            System.out.println("x3 noktasını giriniz:");
            double x3 = input.nextDouble();
            System.out.println("y3 noktasını giriniz: ");
            double y3 = input.nextDouble();
            double a=x1+x2+x3/3;
            double b=y1+y2+y3/3;
            double r1= Math.sqrt(Math.pow(x1 - a, 2) + Math.pow(y1 - b, 2));
            double r2= Math.sqrt(Math.pow(x2 - a, 2) + Math.pow(y2 - b, 2));
            double r3= Math.sqrt(Math.pow(x3 - a, 2) + Math.pow(y3 - b, 2));
            if(r1==r2 && r2==r3){
                double alan = Math.PI *( Math.pow(r1, 2));
                System.out.println("noktalar daire oluşturur");
                System.out.println("Dairenin alanı: " + alan);}
            else {
                System.out.println("Noktalar daire oluşturmuyor");
            }
        }
        if(secim==2) {
            System.out.println(" 3 noktanın koordinatlarını giriniz:");
            System.out.println("1.koordinat noktası:(x1,y1)");
            System.out.println("x1 noktasını giriniz:");
            double x1 = input.nextDouble();
            System.out.println("y1 noktasını giriniz: ");
            double y1 = input.nextDouble();
            System.out.println("2.koordinat noktası:(x2,y2)");
            System.out.println("x2 noktasını giriniz:");
            double x2 = input.nextDouble();
            System.out.println("y2 noktasını giriniz: ");
            double y2 = input.nextDouble();
            System.out.println("3.koordinat noktası:(x2,y2)");
            System.out.println("x3 noktasını giriniz:");
            double x3 = input.nextDouble();
            System.out.println("y3 noktasını giriniz: ");
            double y3 = input.nextDouble();
            double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
                double s = (s1 + s2 + s3) / 2;
                double alan = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

                System.out.println("Noktalar ücgen olusturur.");
                System.out.println("ücgenin alanı: " +alan);
            }
            else {
                System.out.println("Noktalar ücgen olusmuyor.");
            }
        }
        if(secim==3) {

            System.out.println(" 3 noktanın koordinatlarını giriniz:");
            System.out.println("1.koordinat noktası:(x1,y1)");
            System.out.println("x1 noktasını giriniz:");
            double x1 = input.nextDouble();
            System.out.println("y1 noktasını giriniz: ");
            double y1 = input.nextDouble();
            System.out.println("2.koordinat noktası:(x2,y2)");
            System.out.println("x2 noktasını giriniz:");
            double x2 = input.nextDouble();
            System.out.println("y2 noktasını giriniz: ");
            double y2 = input.nextDouble();
            System.out.println("3.koordinat noktası:(x2,y2)");
            System.out.println("x3 noktasını giriniz:");
            double x3 = input.nextDouble();
            System.out.println("y3 noktasını giriniz: ");
            double y3 = input.nextDouble();
            if ((y3 - y1) / (x3 - x1) == (y2 - y1) / (x2 - x1)) {
                System.out.println("noktalar dogru üzerindedir.");
            } else {
                System.out.println("noktalar aynı doğru üzerinde degildir");

            }
        }
        if(secim==4)
        {
            System.out.println("cıkıs");
        }


    }
}
