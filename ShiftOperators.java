public class ShiftOperators {
    public static void main(String[] args) {
        // Left Shift Operator (<<)
        int num1 = 10;
        int result1 = num1 << 2;
        System.out.println("Left Shift: " + num1 + " << 2 = " + result1);

        // Right Shift Operator (>>)
        int num2 = 20;
        int result2 = num2 >> 2;
        System.out.println("Right Shift: " + num2 + " >> 2 = " + result2);

        // Left Shift Operator with Negative Number
        int num3 = -10;
        int result3 = num3 << 2;
        System.out.println("Left Shift with Negative Number: " + num3 + " << 2 = " + result3);

        // Right Shift Operator with Negative Number
        int num4 = -20;
        int result4 = num4 >> 2;
        System.out.println("Right Shift with Negative Number: " + num4 + " >> 2 = " + result4);
    }
} 
