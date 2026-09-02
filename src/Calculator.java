public class Calculator {
    public static void main(String[] args) {
        int myInteger = 10;
        double myDouble = 10.1;
        boolean myBoolean = true;
        char myChar = 'A';
        String myString = "Abc";

        System.out.println("Integer: " + myInteger);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Char: " + myChar);
        System.out.println("String: " + myString);

        calculateTotal(50.1, -1);

        // for loop
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        String str = null;
        str.length();
    }
    public static double calculateTotal(double price, int quantity) {
        double totalPrice = price * quantity;

        if (quantity >= 10) {
            totalPrice = totalPrice - totalPrice / 10;
            System.out.println(totalPrice);
        } else if(quantity < 0) {
            System.out.println("Quantity is negative!");
            return -1;
        } else {
            System.out.println(totalPrice);
        }
        return 0;
    }
}
