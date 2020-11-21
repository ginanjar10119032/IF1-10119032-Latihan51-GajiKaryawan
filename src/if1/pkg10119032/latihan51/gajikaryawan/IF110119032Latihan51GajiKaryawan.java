package if1.pkg10119032.latihan51.gajikaryawan;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program gaji karyawan
 * menggunakan konsep objek dan inheritance
 */
public class IF110119032Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Manager manager1 = new Manager();
        
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        manager1.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");
        manager1.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3): ");
        manager1.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        manager1.setJabatan(input.next());
        System.out.print("Masukkan Kehadiran : ");
        manager1.setKehadiran(input.nextInt());
        
        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("NIK\t: ".concat(manager1.getNik()));
        System.out.println("NAMA\t: ".concat(manager1.getNama()));
        System.out.println("GOLONGAN: " + manager1.getGolongan());
        System.out.println("JABATAN : ".concat(manager1.getJabatan()));
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + manager1.tunjanganGolongan(manager1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + manager1.tunjanganJabatan(manager1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager1.tunjanganKehadiran(manager1.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager1.gajiTotal());
    }
    
}