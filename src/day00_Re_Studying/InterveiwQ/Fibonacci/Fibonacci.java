package day00_Re_Studying.InterveiwQ.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 15, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
