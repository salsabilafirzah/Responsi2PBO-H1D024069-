public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // Contoh: OVO, Saldo 150000, Nominal 50000
        EWalletPayment ovoPayment = new EWalletPayment("OVO", 150000.0, 50000.0);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ==="); //

        // 1. Menampilkan data sebelum transaksi
        System.out.println("Saldo awal: " + ovoPayment.getBalance()); //

        // 2. Memproses pembayaran
        ovoPayment.processPayment();

        // 3. Menampilkan data setelah transaksi
        System.out.println("Sisa saldo: " + ovoPayment.getBalance()); //
        System.out.println(ovoPayment.getPaymentDetails()); //
    }
}