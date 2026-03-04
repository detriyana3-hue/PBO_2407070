package latihan_pbo.latihan3;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Segitiga ppp = new Segitiga();
        Lingkaran pppp = new Lingkaran();

        p.setSisi(5);
        pp.setPanjang(7);
        pp.setLebar(6);
        ppp.setAlas(3);
        ppp.setTinggi(8);
        pppp.setJari(10);
        System.out.println("LuasPersegi=" + p.LuasPersegi());
        System.out.println("LuasPersegiPanjang=" + pp.LuasPersegiPanjang());
        System.out.println("LuasSegitiga=" + ppp.LuasSegitiga());
        System.out.println("LuasLingkaran=" + pppp.LuasLingkaran());

    }
}
