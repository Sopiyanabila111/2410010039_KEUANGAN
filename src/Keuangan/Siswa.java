/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 * to edit this template
 */
package Keuangan;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Siswa {

    // Variabel / atribut untuk menyimpan data siswa
    private int id_siswa, id_kelas, id_angkatan;
    private String nis, nama_siswa, alamat_siswa;
    private ArrayList<Integer> dataId_siswa;
    private ArrayList<Integer> dataId_kelas;
    private ArrayList<Integer> dataId_angkatan;
    private ArrayList<String> datanis;
    private ArrayList<String> datanama_siswa;
    private ArrayList<String> dataalamat_siswa;
      

    /**
     * Constructor parameter
     * Digunakan untuk mengisi data siswa
     * saat object dibuat
     */
    public Siswa() {
    this.dataId_siswa = new ArrayList<>();
    this.dataId_kelas = new ArrayList<>();
    this.dataId_angkatan = new ArrayList<>();
    this.datanis = new ArrayList<>();
    this.datanama_siswa = new ArrayList<>();
    this.dataalamat_siswa = new ArrayList<>();
        
    }
    
    public Siswa(String nis, String nama_siswa, String alamat_siswa, int id_siswa, int id_kelas, int id_angkatan) {
    this.nis = nis;
    this.nama_siswa = nama_siswa;
    this.alamat_siswa = alamat_siswa;
    this.id_siswa = id_siswa;
    this.id_kelas = id_kelas;
    this.id_angkatan = id_angkatan;
    
    this.datanis = new ArrayList<>();
    this.datanama_siswa = new ArrayList<>();
    this.dataalamat_siswa = new ArrayList<>();
    this.dataId_siswa = new ArrayList<>();
    this.dataId_kelas = new ArrayList<>();
    this.dataId_angkatan = new ArrayList<>();
    }
    /**
     * Method tampilSiswa()
     * Berfungsi untuk menampilkan seluruh data siswa
     */
    public void tampilSiswa() {

        System.out.println("ID Siswa : " + id_siswa);
        System.out.println("ID Kelas : " + id_kelas);
        System.out.println("ID Angkatan : " + id_angkatan);
        System.out.println("NIS : " + nis);
        System.out.println("Nama Siswa : " + nama_siswa);
        System.out.println("Alamat : " + alamat_siswa);
    }

    
     public void inputDataId_siswa(Integer data) {
        this.dataId_siswa.add(data);
    
    }
    
    public void inputDataId_kelas(Integer data) {
        this.dataId_kelas.add(data);
    
    }
    
    public void inputDataId_angkatan(Integer data) {
        this.dataId_angkatan.add(data);
    
    }
    
    public void inputDatanis(String data) {
        this.datanis.add(data);
    
    }
    
     public void inputDatanama_siswa(String data) {
        this.datanama_siswa.add(data);
    
    }
     
    public void inputDataalamat_siswa(String data) {
        this.dataalamat_siswa.add(data);
    
    }
    
    
    public ArrayList<Integer> listDataId_siswa() {
        return this.dataId_siswa;
    
    }
    
    public ArrayList<Integer> listDataId_kelas() {
        return this.dataId_kelas;
    
    }
    
    public ArrayList<Integer> listDataid_angkatan() {
        return this.dataId_angkatan;
    
    }
    
    public ArrayList<String> listDatanis() {
        return this.datanis;
    
    }
    
    public ArrayList<String> listDatanama_siswa() {
        return this.datanama_siswa;
    
    }
    public ArrayList<String> listDataalamat_siswa() {
        return this.dataalamat_siswa;
    
    }
    
    
    
    
    
    // Getter digunakan untuk mengambil data id_siswa
    public int getIdSiswa() {
        return id_siswa;
    }

    // Setter digunakan untuk mengubah atau mengisi data id_siswa
    public void setIdSiswa(int id_siswa) {
        this.id_siswa = id_siswa;
    }

    // Getter digunakan untuk mengambil data id_kelas
    public int getIdKelas() {
        return id_kelas;
    }

    // Setter digunakan untuk mengubah atau mengisi data id_kelas
    public void setIdKelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    // Getter digunakan untuk mengambil data id_angkatan
    public int getIdAngkatan() {
        return id_angkatan;
    }

    // Setter digunakan untuk mengubah atau mengisi data id_angkatan
    public void setIdAngkatan(int id_angkatan) {
        this.id_angkatan = id_angkatan;
    }

    // Getter digunakan untuk mengambil data NIS
    public String getNis() {
        return nis;
    }

    // Setter digunakan untuk mengubah atau mengisi data NIS
    public void setNis(String nis) {
        this.nis = nis;
    }

    // Getter digunakan untuk mengambil data nama siswa
    public String getNamaSiswa() {
        return nama_siswa;
    }

    // Setter digunakan untuk mengubah atau mengisi data nama siswa
    public void setNamaSiswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    // Getter digunakan untuk mengambil data alamat siswa
    public String getAlamatSiswa() {
        return alamat_siswa;
    }

    // Setter digunakan untuk mengubah atau mengisi data alamat siswa
    public void setAlamatSiswa(String alamat_siswa) {
        this.alamat_siswa = alamat_siswa;
    }
    
    public int  getIndexData(String nama) {
    int index = this.datanama_siswa.indexOf(nama);
    if (index < 0 ){
        
        }
    return index;
    }
    
    public void searchdata(String nama) {
    int i = getIndexData(nama);
    String nis = this.datanis.get(i);
    int Kelas = this.dataId_kelas.get(i);
    String alamat = this.dataalamat_siswa.get(i);
    
    String pesan = "Nama Siswa: " + nama + "\nnis: " + nis + "\n" + "kelas" + Kelas + "\nalamat" + alamat;
    
    JOptionPane.showMessageDialog(null, pesan);
    }
    
    public void ubahDataSiswa(String nama, String nis, String alamat, int Kelas) {
        int i = getIndexData(nama);
        this.listDatanama_siswa().set(i, nama);
        this.listDatanis().set(i, nis);
        this.listDataalamat_siswa().set(i, alamat);
        this.listDataId_kelas().set(i, Kelas);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }
    
    public void hapusDataSiswa(String nama, String nis, String alamat, int Kelas) {
        int i = getIndexData(nama);
        this.listDatanama_siswa().remove(i);
        this.listDatanis().remove(i);
        this.listDataalamat_siswa().remove(i);
        this.listDataId_kelas().remove(i);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
    }
}

