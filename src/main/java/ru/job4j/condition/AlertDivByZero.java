package ru.job4j.condition;

public class AlertDivByZero {

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }

        result = number < 0;
        if (result) {
            System.out.println("This is negative number.");
        }
    }
}
