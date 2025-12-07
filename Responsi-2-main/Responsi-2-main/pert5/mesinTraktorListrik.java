class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai; //

    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        System.out.println("Mesin Traktor Listrik " + this.namaMesin +
                " | Tarik: " + this.kapasitasTarik + " ton" +
                " | Baterai: " + this.kapasitasBaterai + " kWh" +
                " | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = (tenagaHP x 1.1) + (kapasitasBaterai x 5)
        return (this.tenagaHP * 1.1) + (this.kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}