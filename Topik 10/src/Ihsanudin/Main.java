package Ihsanudin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final ArrayList <Member> memberOjek = new ArrayList<>();
    private Scanner masukan = new Scanner(System.in);

    private void main(){
        int no;
        do {
            System.out.println("");
            System.out.println("Daftar Menu Ojek Online");
            System.out.println("1. Input Data Driver");
            System.out.println("2. Input Data Customer");
            System.out.println("3. Tampilkan Data ");
            System.out.println("4. Top-up saldo");
            System.out.println("5. Antar Penumpang");
            System.out.println("6. Selesai");

            System.out.println("input no : ");
            no = masukan.nextInt();

            switch (no){
                case 1 :
                    inputDataDriver();
                    break;
                case 2 :
                    inputDataCustomer();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    transaksi(1);
                    break;
                case 5:
                    transaksi(2);
                    break;
                case 6:
                    System.out.println("Aplikasi Selesai");
                    break;
            }
        }while (no != 6);
    }

    private void inputDataDriver(){
        System.out.println();
        System.out.println("Masukkan Data Driver");
        System.out.print("NIK : ");
        String nik = masukan.next();
        System.out.print("Nama : ");
        String nama = masukan.next();
        System.out.print("No Telepon : ");
        String notelepon = masukan.next();
        System.out.print("Jenis Kendaraan : ");
        String jenisKendaraan = masukan.next();
        System.out.print("Tipe Kendaraan : ");
        String tipeKendaraan = masukan.next();
        System.out.print("No Plat : ");
        String noplat = masukan.next();
        System.out.print("Saldo : ");
        double saldo = masukan.nextDouble();

        Driver driver = new Driver(nik,nama,notelepon,saldo, noplat, jenisKendaraan, tipeKendaraan);
        memberOjek.add(driver);
    }

    private void inputDataCustomer() {
        System.out.println();
        System.out.println("Masukkan Data Customer");
        System.out.print("NIK : ");
        String nik = masukan.next();
        System.out.print("Nama : ");
        String nama = masukan.next();
        System.out.print("No Telepon : ");
        String notelepon = masukan.next();
        System.out.print("Saldo : ");
        double saldo = masukan.nextDouble();

        Customer customer = new Customer(nik, nama, notelepon, saldo);
        memberOjek.add(customer);
    }

    private void tampilkanData(){
        for (Member member : memberOjek){
            member.display();
        }
    }

    private void transaksi(int tipeTransaksi){
        System.out.println();
        System.out.println("Tambah Transaksi");
        System.out.print("NIK Driver : ");
        String nikDriver = masukan.next();
        System.out.print("NIK Customer : ");
        String nikCustomer = masukan.next();

        Member driver = cariNik(nikDriver);
        Member customer = cariNik(nikCustomer);

        if (driver != null && customer != null && (driver instanceof  Driver) && (customer instanceof  Customer)){
            if (tipeTransaksi == 1){
                System.out.print("Top up : ");
                double topup = masukan.nextDouble();
                customer.transaksi(driver, topup);
            }else {
                System.out.print("Biaya : ");
                double biaya = masukan.nextDouble();
                driver.transaksi(customer, biaya);
            }
        }else {
            System.out.println("Data yang dimasukkan salah!");
        }
    }

    private Member cariNik(String nik ){
        Member member = null;
        for (Member x : memberOjek){
            if (x.getNik().equals(nik)){
                member = x;
                break;
            }
        }
        return member;
    }

    public static void main(String [] args){
        new Main().main();
    }
}
