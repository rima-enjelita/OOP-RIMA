
import java.text.NumberFormat;
import java.util.Locale;

public class MainBank {

    public static void main(String[] args) {

        NumberFormat rupiah = NumberFormat.getInstance(
            new Locale("id", "ID")
        );

        // Membuat objek rekening
        BankAccount rekening = new BankAccount(
            "Rima enjelita", 1000000
        );

        // Menampilkan nama pemilik
        System.out.println("Nama Pemilik: "
            + rekening.getNamaPemilik());

        // Menampilkan saldo awal
        System.out.println("Saldo Awal: Rp"
            + rupiah.format(rekening.getSaldo()));

        // Deposit
        int jumlahDeposit = 500000;

        if (rekening.deposit(jumlahDeposit)) {
            System.out.println("Deposit berhasil: Rp"
                + rupiah.format(jumlahDeposit));
        }

        // Penarikan
        int jumlahPenarikan = 200000;

        if (rekening.withdraw(jumlahPenarikan)) {
            System.out.println("Penarikan berhasil: Rp"
                + rupiah.format(jumlahPenarikan));
        }

        // Menampilkan saldo akhir
        System.out.println("Saldo Akhir: Rp"
            + rupiah.format(rekening.getSaldo()));
    }
}
