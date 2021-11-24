package Ihsanudin;

public class Customer extends Member {

    Customer (String nik, String nama, String notelepon, double saldo){
        super(nik, nama, notelepon, saldo);
    }

    public void display(){
        System.out.println();
        System.out.println("Data Customer Ojek ");
        System.out.println("NIK     : " + nik);
        System.out.println("Nama    : " + nama);
        System.out.println("No Tlpn : " + notelepon);
        System.out.println("Saldo   : " + saldo );
    }
}
