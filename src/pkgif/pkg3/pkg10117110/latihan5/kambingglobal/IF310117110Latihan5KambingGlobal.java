
package pkgif.pkg3.pkg10117110.latihan5.kambingglobal;

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Jumlah Kambing Setelah di Tambah
 */
public class IF310117110Latihan5KambingGlobal {
    
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method Untuk Menampilkan Jumlah Kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        IF310117110Latihan5KambingGlobal kambingSusu = new IF310117110Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan Jumlah Kambing Yang ada
        kambingSusu.getJumlahKambing();
       
    }
    
}
