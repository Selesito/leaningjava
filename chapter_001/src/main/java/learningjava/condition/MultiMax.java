package learningjava.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean resultOne = first > second;
        int result1 = (resultOne ? first : second);
        boolean resultTwo = result1 > third;
        int result2 = (resultTwo ? result1 : third);
        return result2;
    }
}
