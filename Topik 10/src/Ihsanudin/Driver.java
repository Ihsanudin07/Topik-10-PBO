package Ihsanudin;

public class Driver extends Member {

    private final String noplat;
    private final String jenisKendaraan;
    private final String tipeKendaraan;

    Driver(String nik, String nama, String notelepon, double saldo, String noplat, String jenisKendaraan, String tipeKendaraan){
        super(nik, nama, notelepon, saldo);
        this.noplat = noplat;
        this.jenisKendaraan = jenisKendaraan;
        this.tipeKendaraan = tipeKendaraan;
    }

    public void display(){
        System.out.println();
        System.out.println("Data Driver Ojek");
        System.out.println("NIK     : " + nik);
        System.out.println("Nama    : " + nama);
        System.out.println("No Tlpn : " + notelepon);
        System.out.println("Saldo   : " + saldo );
        System.out.println("Jenis   : " + jenisKendaraan);
        System.out.println("Tipe    : " + tipeKendaraan);
        System.out.println("No Plat : " + noplat);
    }
}
