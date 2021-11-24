package Ihsanudin;

public abstract class Member {
    protected final String nik;
    protected final String nama;
    protected final String notelepon;
    protected double saldo;

    Member(String nik, String nama, String notelepon, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.notelepon = notelepon;
        this.saldo = saldo;
    }

    public String getNik(){
        return nik;
    }

    void transaksi(Member x, double biaya){
        x.saldo -= biaya;
        this.saldo += biaya;
    }

    public abstract void display();
}
