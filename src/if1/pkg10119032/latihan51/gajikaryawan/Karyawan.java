package if1.pkg10119032.latihan51.gajikaryawan;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi superclass Karyawan
 */
public class Karyawan {
    protected String nik, nama, jabatan;
    protected int golongan;
    
    public String getNik() {
        return nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }    
    
    public int getGolongan() {
        return golongan;
    }
    
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }    
    
}