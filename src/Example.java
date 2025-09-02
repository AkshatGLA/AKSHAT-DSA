public class Example {
    public static void changePrimitive(int num) {
        num = 100;  // changes only local copy
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 50;
        changePrimitive(num);
        System.out.println(num); // Output: 50
    }
}
