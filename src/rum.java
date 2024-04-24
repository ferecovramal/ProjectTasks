import java.util.Scanner;

public class rum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayiyi girin: ");
        String rom1 = scanner.nextLine();
        int num1 = romanToInteger(rom1);

        System.out.print("İkinci sayiyi girin: ");
        String rom2 = scanner.nextLine();
        int num2 = romanToInteger(rom2);

        int sum = num1 + num2;

        String result = integerToRoman(sum);

        System.out.println("Toplam: " + result);
    }

    public static String integerToRoman(int num) {

        StringBuilder roman = new StringBuilder();

        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }

        return roman.toString();
    }

    public static int romanToInteger(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInteger(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && romanToInteger(roman.charAt(i)) > romanToInteger(roman.charAt(i - 1))) {
                result += romanToInteger(roman.charAt(i)) - 2 * romanToInteger(roman.charAt(i - 1));
            } else {
                result += romanToInteger(roman.charAt(i));
            }
        }
        return result;
    }
}
