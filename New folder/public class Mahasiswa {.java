public class Mahasiswa {
    String Nama;
    int NIM;
    void setData(String Value1, int Value2) {
        Nama=Value1;
        NIM=Value2;
    }
    void printDatas() {
        System.out.println( “ I am a student with= “ +NIM+ “ , and named ” + Nama);
    }
}