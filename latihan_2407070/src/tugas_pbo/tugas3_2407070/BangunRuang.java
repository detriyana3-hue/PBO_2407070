package tugas_pbo.tugas3_2407070;

public class BangunRuang extends BangunDatar {
    private int tinggi;


    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }


    public int hitungVolume() {
        return hitungLuas() * tinggi; 
    }
}
