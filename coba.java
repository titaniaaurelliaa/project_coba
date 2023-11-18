import java.util.Arrays;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        /// scanner level dan login ///
        Scanner pilLevel = new Scanner(System.in);
        Scanner login = new Scanner(System.in);
        String levelPengguna, username, password;

        /// scanner konfirmasi ///
        Scanner konfirmasiAngka = new Scanner(System.in);

        /// tambah transaksi ///
        String nama, next, tanggal;
        int a, pilihan, jumlah, jml = 0, jamkeberangkatan; 

         //login
        do {
            System.out.println("|===========================================|");
            System.out.println("|           Pilih level pengguna            |");
            System.out.println("|===========================================|");
            System.out.println("| 1. Admin                                  |");
            System.out.println("| 2. Pengguna                               |");
            System.out.println("|===========================================|");
            System.out.print("   Pilihan anda: ");
            levelPengguna = pilLevel.nextLine();

            if (levelPengguna.equalsIgnoreCase("admin")) {}
                System.out.println("|===========================================|");
                System.out.println("|      Silahkan login terlebih dahulu       |");
                System.out.println("|===========================================|");
                System.out.print("  Username: ");
                username = login.nextLine();
                System.out.print("  Password: ");
                password = login.nextLine();
                if (levelPengguna.equalsIgnoreCase("admin")) {}
                System.out.println("|===========================================|");
                System.out.println("|      Silahkan login terlebih dahulu       |");
                System.out.println("|===========================================|");
                System.out.print("  Username: ");
                username = login.nextLine();
                System.out.print("  Password: ");
                password = login.nextLine();
                if (username.equals("admin") && password.equals("admin123")) {}
                    do {
                        System.out.println("|===========================================|");
                        System.out.println("|        Berhasil masuk sebagai admin       |");
                        System.out.println("|===========================================|");
                        System.out.println("|      Silahkan pilih menu (1/2/3/4/5)      |");
                        System.out.println("|===========================================|");
                        System.out.println("| 1. Tambah Transaksi                       |");
                        System.out.println("| 2. Cek Ketersediaan Kursi                 |");
                        System.out.println("| 3. Menampilkan Struk                      |");
                        System.out.println("| 4. Laporan Harian                         |");
                        System.out.println("| 5. Laporan Bulanan                        |");
                        System.out.println("| 6. Kembali                                |");
                        System.out.println("|===========================================|");
                        System.out.print(" Pilihan anda: ");
                        int menu = konfirmasiAngka.nextInt();

                        if (menu == 1) {
                            do {
                                //memilih tujuan
                                System.out.println("\n ==========================================");
                                System.out.println("| --- Selamat Datang di Stasiun Malang --- |");
                                System.out.println(" ==========================================");

                                System.out.println("\n ==========================================");
                                System.out.println("|      Silahkan Memilih Tujuan Anda        |");
                                System.out.println("|                  ---                     |");
                                System.out.println("|         1. Surabaya, KA Jayabaya         |");
                                System.out.println("|         2. Jakarta, KA Brawijaya         |");
                                System.out.println(" ==========================================");
                                System.out.print("Pilihan anda: ");
                                pilihan = input.nextInt();
                                int kotaTujuan = pilihan - 1;

                                //memilih gerbong
                                System.out.println(" \n==========================================");
                                System.out.println("|     Silahkan memilih gerbong kereta      |");
                                System.out.println("|                   ---                    |");
                                System.out.println("|           1. Gerbong Ekonomi             |");
                                System.out.println("|          2. Gerbong Eksekutif            |");
                                System.out.println(" ==========================================");
                                System.out.print("Pilihan anda: ");
                                int gerbongKereta = input.nextInt();

                                //memilih tanggal dan jam keberangkatan
                                System.out.println("\n==========================================");
                                System.out.println("|         --- Data Pengguna ---           |");
                                System.out.println("==========================================");

                                System.out.print("Masukkan tanggal keberangkatan: ");
                                tanggal = input.next(); 
                                System.out.println(" \n==========================================");
                                System.out.println("| Silahkan memilih jam keberangkatan kereta|");
                                System.out.println("|                   ---                    |");
                                System.out.println("|              1. 11.00 WIB                |");
                                System.out.println("|              2. 14.00 WIB                |");
                                System.out.println(" ===========================================");
                                System.out.print("Pilihan anda: ");
                                jamkeberangkatan = input.nextInt();

                                //perulangan dan input kursi
                                do {
                                    System.out.print("\nMasukkan nama       : ");
                                    nama = input.next();
                                    System.out.print("Masukkan baris kursi: ");
                                    baris = input.nextInt();
                                    System.out.print("Masukkan kolom kursi: ");
                                    kolom = input.nextInt();
                        
                                    // Cek apakah kursi sudah terisi
                                    if (penumpang[baris - 1][kolom - 1] == null) {
                                        penumpang[baris - 1][kolom - 1] = nama;
                                        jml++;
                                        System.out.println("Data penumpang berhasil di input");
                                    } else {
                                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                                    }
                        
                                    System.out.print("Apakah anda ingin menambah pelanggan lain (Y/T)? ");
                                    jawab = input.next().charAt(0);
                                } while (jawab == 'y' || jawab == 'Y');
                                

    }
}
                      