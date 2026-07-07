/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java 
 * to edit this template
 */

package Keuangan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class User digunakan untuk menyimpan data user
 * seperti nama, jenis kelamin, email, password, dan id user.
 * 
 * @author ASUS
 */
public class User {

    // Deklarasi variabel / atribut untuk menyimpan data user
    private String NamaUser, JenisKelamin, emailUser, password;
    private int idUser;

    private ArrayList<String> dataNamaUser;
    private ArrayList<String> dataJenisKelamin;
    private ArrayList<String> dataemailUser;
    private ArrayList<String> datapassword;
    private ArrayList<Integer>dataidUser;
    /**
     * Constructor kosong
     * Digunakan ketika object dibuat tanpa isi data awal
     */
    public User (){
    this.dataNamaUser = new ArrayList<>();
    this.dataJenisKelamin  = new ArrayList<>();
    this.dataemailUser = new ArrayList<>();
    this.datapassword = new ArrayList<>();
    this.dataidUser = new ArrayList<>();
    }

    /**
     * Constructor dengan parameter
     * Digunakan untuk mengisi data user saat object dibuat
     */
    public User(String namaUser, String jenisKelamin, String emailUser, String password, int idUser) {
       
        // Mengisi atribut NamaUser dengan parameter namaUser
        this.NamaUser = namaUser;
        
        // Mengisi atribut JenisKelamin dengan parameter jenisKelamin
        this.JenisKelamin = jenisKelamin;
        
        // Mengisi atribut emailUser dengan parameter emailUser
        this.emailUser = emailUser;
        
        // Mengisi atribut password dengan parameter password
        this.password = password;
        
        // Mengisi atribut idUser dengan parameter idUser
        this.idUser = idUser;
        
    this.dataNamaUser = new ArrayList<>();
    this.dataJenisKelamin  = new ArrayList<>();
    this.dataemailUser = new ArrayList<>();
    this.datapassword = new ArrayList<>();
    this.dataidUser = new ArrayList<>();
        
    }

    /**
     * Method tampilUser()
     * Berfungsi untuk menampilkan seluruh data user ke layar
     */
    public void tampilUser() {

        System.out.println("NamaUser: " + NamaUser);
        System.out.println("JenisKelamin: " + JenisKelamin);
        System.out.println("emailUser: " + emailUser);
        System.out.println("password: " + password);
        System.out.println("idUser: " + idUser);
    }

    
     public void inputDataNamaUser(String data) {
        this.dataNamaUser.add(data);
    
    }
    
      public void inputDataJenisKelamin(String data) {
        this.dataJenisKelamin.add(data);
    
    }
    
      public void inputDataemailUser(String data) {
        this.dataemailUser.add(data);
    
    }
    
      public void inputDatapassword(String data) {
        this.datapassword.add(data);
    
    }
    
      public void inputDataidUser(Integer data) {
        this.dataidUser.add(data);
    
    }
      
      
      public ArrayList<String> listDataNamaUser() {
        return this.dataNamaUser;
    
    }
      
    public ArrayList<String> listDataJenisKelamin() {
        return this.dataJenisKelamin;
    
    }
    
    public ArrayList<String> listDataemailUser() {
        return this.dataemailUser;
    
    }
    
    public ArrayList<String> listDatapassword() {
        return this.datapassword;
    
    }
    
    public ArrayList<Integer> listDataidUser() {
        return this.dataidUser;
    
    }
    
      
      
      
    
    // Getter digunakan untuk mengambil data NamaUser
    public String getNamaUser() {
        return this.NamaUser;
    }

    // Getter digunakan untuk mengambil data JenisKelamin
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    // Getter digunakan untuk mengambil data emailUser
    public String getemailUser() {
        return this.emailUser;
    }

    // Getter digunakan untuk mengambil data password
    public String getpassword() {
        return this.password;
    }

    // Getter digunakan untuk mengambil data idUser
    public int getidUser() {
        return this.idUser;
    }
    
    
    // Setter digunakan untuk mengubah atau mengisi NamaUser
    public void setNamaUser(String NamaUser) {
        this.NamaUser = NamaUser;
    }

    // Setter digunakan untuk mengubah atau mengisi JenisKelamin
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    // Setter digunakan untuk mengubah atau mengisi emailUser
    public void setemailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    // Setter digunakan untuk mengubah atau mengisi password
    public void setpassword(String password) {
        this.password = password;
    }

    // Setter digunakan untuk mengubah atau mengisi idUser
    public void setidUser(int idUser) {
        this.idUser = idUser;
    }
    
      
    public int  getIndexData(String nama) {
    int index = this.dataNamaUser.indexOf(nama);
    if (index < 0 ){
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    return index;
    }
    
    public void searchdata(String nama) {
    int i = getIndexData(nama);
    String Jk = this.dataJenisKelamin.get(i);
    String email = this.dataemailUser.get(i);
    int iduser = this.dataidUser.get(i);
    
    String pesan = "Nama User: " + nama + "\njeniskelamin: " + Jk + "\n" + "" + email + "\niduser" + iduser;
    
    JOptionPane.showMessageDialog(null, pesan);
    }
    
     public void ubahDataUser(String NamaUser, String JenisKelamin, String emailUser, int IdUser) {
        int i = getIndexData(NamaUser);
        this.listDataNamaUser().set(i, NamaUser);
        this.listDataJenisKelamin().set(i, JenisKelamin);
        this.listDataemailUser().set(i, emailUser);
        this.listDataidUser().set(i, IdUser);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }
     
     public void hapusDataUser(String NamaUser, String JenisKelamin, String emailUser, int IdUser) {
         int i = getIndexData(NamaUser);
         this.listDataNamaUser().remove(i);
         this.listDataJenisKelamin().remove(i);
         this.listDataemailUser().remove(i);
         this.listDataidUser().remove(i);
         JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
     
     }
}