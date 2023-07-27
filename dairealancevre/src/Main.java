import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double yaricap;
     double pi= 3.14;
     double alfaacisi;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        yaricap = input.nextDouble();

        System.out.println("Merkez açısını derece cinsinden giriniz");
        alfaacisi=input.nextDouble();
        double dilimalan = (pi * (yaricap * yaricap) * alfaacisi) / 360;
        double tamalan=(pi*yaricap*yaricap);
        double cevre=(2*pi*yaricap);
        double yayuzunluk=(cevre*alfaacisi/360);
        System.out.println("girdiğiniz verilere göre dairenin çevresi" +cevre);
        System.out.println(" girdiğiniz verilere göre merkez diliminin alanı " +dilimalan);
        System.out.println("girdiğiniz verilere göre dairenin alanı " +tamalan);
        System.out.println("girdiğiniz verilere göre açıyı gören yayın uzunluğu" +yayuzunluk);

    }
}
//Dairenin Alanını ve Çevresini Hesaplayan Program
//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//Alan Formülü : π * r * r;
//
//Çevre Formülü : 2 * π * r;
//
//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360