class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik; //

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        // Override info mesin traktor
        System.out.println("Mesin Traktor " + this.namaMesin + " | Tarik: " + this.kapasitasTarik + " ton | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = (tenagaHP x 0.9) + (kapasitasTarik x 10)
        return (this.tenagaHP * 0.9) + (this.kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}