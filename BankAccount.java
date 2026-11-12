
public class BankAccount {

    // Properti privat
    private int saldo;
    private String namaPemilik;

    // Constructor
    public BankAccount(String namaPemilik, int saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    // Method deposit
    public boolean deposit(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            return true;
        } else {
            return false;
        }
    }

    // Method withdraw
    public boolean withdraw(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    // Method getSaldo
    public int getSaldo() {
        return saldo;
    }

    // Method getNamaPemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }
}
