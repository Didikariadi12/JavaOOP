package BelajarOOP;

public class handphone {
    private String nama;
    private String merek;
    private int ram;
    private int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
       }

    }


class menuhandhone{
    public static void main(String[]args){
        System.out.println("\n\tselamat datang di toko handphone kami\n");

        System.out.println("\t\tMenu 1");
        handphone handphone1=new handphone();
        handphone1.setNama("Samsung Galaxy Note 20 Ultra");
        handphone1.setMerek(" Samsung");
        handphone1.setRam(128);
        handphone1.setHarga(5000000);

        System.out.println("nama handphone :"+handphone1.getNama());
        System.out.println("merek handphone :"+handphone1.getMerek());
        System.out.println("ukuran ram handphone :"+handphone1.getRam());
        System.out.println("total harga handphone :"+handphone1.getHarga());

        System.out.println("\n\t\tMenu 2");
        handphone handphone2=new handphone();
        handphone2.setNama("Oppo Reno 4 Pro");
        handphone2.setMerek(" Oppo");
        handphone2.setRam(64);
        handphone2.setHarga(2000000);

        System.out.println("nama handphone :"+handphone2.getNama());
        System.out.println("merek handphone :"+handphone2.getMerek());
        System.out.println("ukuran ram handphone :"+handphone2.getRam());
        System.out.println("total harga handphone :"+handphone2.getHarga());

        System.out.println("\n\t\tmenu 3");
        handphone handphone3=new handphone();
        handphone3.setNama("Asus Rog Phone 3");
        handphone3.setMerek(" Asus");
        handphone3.setRam(256);
        handphone3.setHarga(10000000);

        System.out.println("Nama handphone :"+handphone3.getNama());
        System.out.println("Merek handphone :"+handphone3.getMerek());
        System.out.println("Ukuran RAM handphone :"+handphone3.getRam());
        System.out.println("Total harga handphone :"+handphone3.getHarga());
        }

}
