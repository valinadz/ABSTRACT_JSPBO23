package Praktikum08.Tugas;

public class Main {
    public static void main(String[] args) {
        Kurakura kura = new Kurakura("Titi", 5, "Sayur", "Kura-kura Aldabra", 15.5);
        Cat kucing = new Cat("Milo", 3, "Daging", "Persia", "Putih");

        kura.makan();
        kura.displayInfo();

        System.out.println();  // Newline for separation

        kucing.makan();
        kucing.displayInfo();
    }
}