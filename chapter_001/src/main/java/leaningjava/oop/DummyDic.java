package leaningjava.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String voice = peppy.engToRus("nuf-nuf");
        System.out.println(voice);
    }
}
