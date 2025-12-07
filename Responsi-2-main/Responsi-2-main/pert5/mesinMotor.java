class mesinMotor extends defaultMesin {
    private String tipeMotor; //

    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.println("Mesin Motor " + this.namaMesin + " | Tipe: " + this.tipeMotor + " | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = tenagaHP x 1,2
        return this.tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println("Brummm! Mesin motor menyala!");
    }
}