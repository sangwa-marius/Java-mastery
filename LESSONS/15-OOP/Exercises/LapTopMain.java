public class LapTopMain {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100, 34);
        LapTop lapTop1 = new LapTop("Lenovo", "i7", battery1);
        lapTop1.setBatter(new Battery(44, 33));
        lapTop1.displayLapTopInfo();
    }
}
