package tugas_pbo.tugas3_2407070;

public class BangunDatar {
    private int panjang;
    private int lebar;

    
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }


    public int hitungLuas() {
        return panjang * lebar;
    }
}

