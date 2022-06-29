public class AppMain {

    public static void main(String[] args) {
        int favouriteNumber = 7;
        int result = duplicate(favouriteNumber);
        System.out.println(result);
        int otherResult = duplicate(42);
        System.out.println(otherResult);
    }

    public static int duplicate(int value) {
        return value * 2;
    }
}
