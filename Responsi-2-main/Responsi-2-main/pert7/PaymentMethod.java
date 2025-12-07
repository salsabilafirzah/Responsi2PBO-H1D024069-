public interface PaymentMethod {

    // TODO: Tambahkan method abstract berikut:
    String processPayment(); // memproses pembayaran
    String getPaymentDetails(); // mengembalikan informasi pembayaran
    double getTransactionFee(); // mengembalikan biaya transaksi
    double getBalance(); // mengembalikan saldo
}