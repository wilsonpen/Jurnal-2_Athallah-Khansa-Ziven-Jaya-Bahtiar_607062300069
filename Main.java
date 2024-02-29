public class Main {

    public static void main(String[] args) {
        Generic<ATK> daftarAtk = new Generic<>(5);
        Generic<Bag> daftarBag = new Generic<>(5);

        daftarAtk.addData(new ATK("A0001", "pensil", "Joyko 2B", 25));
        daftarAtk.addData(new ATK("A0002", "pensil", "Faber Castle", 30));
        daftarAtk.addData(new ATK("A0003", "Pulpen", "Kenko", 22));
        daftarAtk.addData(new ATK("B0001", "Kertas", "Karton", 25));
        daftarAtk.addData(new ATK("B0002", "Buku", "SIDU", 105));

        daftarBag.addData(new Bag("C0001", "Kaos Kaki", "Kaos Kaki Putih SD", 50));
        daftarBag.addData(new Bag("C0002", "Kaos Kaki", "Kaos Kaki Hitam SD", 50));
        daftarBag.addData(new Bag("C0003", "Dasi", "Dasi Merah SD", 50));
        daftarBag.addData(new Bag("C0004", "Topi", "Topi SD", 50));
        daftarBag.addData(new Bag("C0005", "Sabuk", "Sabuk SD", 50));

        daftarAtk.display();

    }
}