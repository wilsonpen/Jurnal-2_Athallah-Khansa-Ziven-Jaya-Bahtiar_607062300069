public class ATK {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getKodeBarang(){
        return this.kodeBarang;
    }

    public String getJenisBarang(){
        return this.jenisBarang;
    }

    public String getNamaBarang(){
        return this.namaBarang;
    }

    public int getStokBarang(){
        return this.stokBarang;

    }

    @Override
    public String toString() {
        return "ATK [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stokBarang=" + stokBarang + "]";
    }

}