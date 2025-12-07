import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] mesinArray = new defaultMesin[5];

        // Isi array dengan objek mesin
        mesinArray[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesinArray[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesinArray[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        mesinArray[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesinArray[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin mesin : mesinArray) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma() + "\n");
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : mesinArray) {
            // Pengecekan downcasting menggunakan instanceof
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin mesinTertinggi = mesinArray[0];
        for (int i = 1; i < mesinArray.length; i++) {
            if (mesinArray[i].nilaiPerforma() > mesinTertinggi.nilaiPerforma()) {
                mesinTertinggi = mesinArray[i];
            }
        }
        System.out.println(mesinTertinggi.getNamaMesin() + " → " + mesinTertinggi.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi (Descending)
        // Menggunakan Arrays.sort dengan Comparator
        Arrays.sort(mesinArray, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                // Urutan Descending
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma());
            }
        });

        // Tampilkan 3 terbaik
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesinArray[i].getNamaMesin() + " → " + mesinArray[i].nilaiPerforma());
        }
    }
}