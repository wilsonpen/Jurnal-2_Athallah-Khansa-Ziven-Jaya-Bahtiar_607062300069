public class Bag {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;

    
    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStokBarang() {
        return stokBarang;
    }
    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }
    @Override
    public String toString() {
        return "Bag [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stokBarang=" + stokBarang + "]";
    }

    
}
