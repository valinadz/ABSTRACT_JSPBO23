package Praktikum08;

public class Kucing extends HewanPeliharaan {
    private String ras;
    private String warnaBulu;

    public Kucing(String nama, int umur, String jenisMakanan, String ras, String warnaBulu) {
        super(nama, umur, jenisMakanan);
        this.ras = ras;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan " + jenisMakanan + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Ras        : " + ras);
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("Makanan    : " + jenisMakanan);
    }
}
