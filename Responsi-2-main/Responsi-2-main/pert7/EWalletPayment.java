public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan
    private String namaLayanan;
    private double saldoPengguna;
    private double nominalPembayaran;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double saldoPengguna, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldoPengguna = saldoPengguna;
        this.nominalPembayaran = nominalPembayaran;
    }

    // Implementasi method interface

    @Override
    public double getTransactionFee() {
        return 2000.0; // Biaya transaksi Rp 2.000
    }

    @Override
    public double getBalance() {
        return this.saldoPengguna;
    }

    @Override
    public String processPayment() {
        double totalBiaya = this.nominalPembayaran + getTransactionFee();

        // Cek kecukupan saldo
        if (this.saldoPengguna >= totalBiaya) {
            this.saldoPengguna -= totalBiaya;
            System.out.println("Memproses pembayaran sebesar " + this.nominalPembayaran + "..."); //
            System.out.println("Pembayaran berhasil!"); //
            return "BERHASIL";
        }
        // Jika saldo tidak cukup, tampilkan pesan gagal
        else {
            System.out.println("Memproses pembayaran sebesar " + this.nominalPembayaran + "...");
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
            return "GAGAL";
        }
    }

    @Override
    public String getPaymentDetails() {
        // Mengembalikan informasi pembayaran
        return "Detail Transaksi: Pembayaran dilakukan melalui " + this.namaLayanan;
    }

}