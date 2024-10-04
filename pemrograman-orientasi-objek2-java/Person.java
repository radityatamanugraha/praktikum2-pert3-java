public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static void main(String[] args) {
        Person Anton = new Person("Anton", 25);
        Person Riko = new Person("Riko", 30);

        System.out.println("Nama Anton : " + Anton.getNama());
        System.out.println("Umur Anton : " + Anton.getUmur());

        System.out.println("Nama Riko : " + Riko.getNama());
        System.out.println("Umur Riko : " + Riko.getUmur());
    }
}