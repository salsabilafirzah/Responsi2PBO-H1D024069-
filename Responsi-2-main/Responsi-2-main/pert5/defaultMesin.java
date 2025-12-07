class defaultMesin {
    protected String namaMesin;
    protected int tenagaHP;

    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    void tampilInfo() {
        System.out.println("Mesin " + this.namaMesin + " | Tenaga: " + this.tenagaHP + " HP");
    }

    double nilaiPerforma() {
        return this.tenagaHP * 1.0;
    }

    String kategoriMesin() {
        return "Mesin Umum";
    }

    // Getter tambahan untuk keperluan analisis
    public String getNamaMesin() { return namaMesin; }
}