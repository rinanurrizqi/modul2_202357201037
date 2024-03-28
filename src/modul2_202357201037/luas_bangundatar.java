/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202357201037;
import javax.swing.JOptionPane;
/**
 *
 * @author UsEr
 */
public class luas_bangundatar {
    
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luasLingkaran(double jarijari) {
        return Math.PI * Math.pow(jarijari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang"));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang : "));
        double luasPersegiPanjang = luasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang : " + luasPersegiPanjang);
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
        double luasSegitiga = luasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "Luas segitiga: " + luasSegitiga);
        System.out.println("Luas segitiga: " + luasSegitiga);
        
        double jarijariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran"));
        double luasLingkaran = luasLingkaran(jarijariLingkaran);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luasLingkaran);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
}


