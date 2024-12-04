package Praktikum08;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Kurakura
        Kurakura kuraKura = new Kurakura("Si Lambat", 5, "Sayuran", "Kura-Kura Sulcata", 3.5);
        kuraKura.displayInfo();
        kuraKura.makan();

        System.out.println();

        // Instansiasi objek Kucing
        Kucing kucing = new Kucing("Milo", 2, null, null, null);
        kucing.displayInfo();
        kucing.makan();
    }
}
