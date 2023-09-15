import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите математическое выражение:");
        String operation = console.nextLine();
        System.out.println(calc(operation));
    }

    public static String calc(String operation) throws Exception {

        String[] numbers = new String[2];
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int result = 0;
        int a = 0;
        int b = 0;
        numbers = operation.split("[ ,.!№;%:?()@#$^]");
        if (numbers.length < 3) {
            throw new Exception("Не является математическим выражением");
        }
        if (numbers.length > 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда должны быть целыми числами и один оператор + - * /");
        }
        try {
            if (Integer.valueOf(numbers[0]) < 0 || Integer.valueOf(numbers[0]) > 10 || Integer.valueOf(numbers[2]) < 0 || Integer.valueOf(numbers[2]) > 10) {
                throw new Exception("Число должно быть от 1 до 10");
            }
        } catch (NumberFormatException e) {
        }
        if (numbers[1].equals("+")) {

            for (int i = 0; i < arab.length - 1; i++) {
                if (numbers[0].equals(String.valueOf(i))) {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[2]);
                    result = a + b;
                    return String.valueOf(result);
                }
            }
            for (int i = 0; i < 10; i++) {
                if (numbers[0].equals(roman[i])) {
                    if (numbers[0].equals("I")) {
                        a = 1;
                    } else if (numbers[0].equals("II")) {
                        a = 2;
                    } else if (numbers[0].equals("III")) {
                        a = 3;
                    } else if (numbers[0].equals("IV")) {
                        a = 4;
                    } else if (numbers[0].equals("V")) {
                        a = 5;
                    } else if (numbers[0].equals("VI")) {
                        a = 6;
                    } else if (numbers[0].equals("VII")) {
                        a = 7;
                    } else if (numbers[0].equals("VIII")) {
                        a = 8;
                    } else if (numbers[0].equals("IX")) {
                        a = 9;
                    } else if (numbers[0].equals("X")) {
                        a = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    if (numbers[2].equals("I")) {
                        b = 1;
                    } else if (numbers[2].equals("II")) {
                        b = 2;
                    } else if (numbers[2].equals("III")) {
                        b = 3;
                    } else if (numbers[2].equals("IV")) {
                        b = 4;
                    } else if (numbers[2].equals("V")) {
                        b = 5;
                    } else if (numbers[2].equals("VI")) {
                        b = 6;
                    } else if (numbers[2].equals("VII")) {
                        b = 7;
                    } else if (numbers[2].equals("VIII")) {
                        b = 8;
                    } else if (numbers[2].equals("IX")) {
                        b = 9;
                    } else if (numbers[2].equals("X")) {
                        b = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    result = a + b;
                    return roman[result - 1];
                }
            }
        }


        if (numbers[1].equals("-")) {

            for (int i = 0; i < arab.length - 1; i++) {
                if (numbers[0].equals(String.valueOf(i))) {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[2]);
                    result = a - b;
                    return String.valueOf(result);
                }

            }
            for (int i = 0; i < 10; i++) {
                if (numbers[0].equals(roman[i])) {
                    if (numbers[0].equals("I")) {
                        a = 1;
                    } else if (numbers[0].equals("II")) {
                        a = 2;
                    } else if (numbers[0].equals("III")) {
                        a = 3;
                    } else if (numbers[0].equals("IV")) {
                        a = 4;
                    } else if (numbers[0].equals("V")) {
                        a = 5;
                    } else if (numbers[0].equals("VI")) {
                        a = 6;
                    } else if (numbers[0].equals("VII")) {
                        a = 7;
                    } else if (numbers[0].equals("VIII")) {
                        a = 8;
                    } else if (numbers[0].equals("IX")) {
                        a = 9;
                    } else if (numbers[0].equals("X")) {
                        a = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    if (numbers[2].equals("I")) {
                        b = 1;
                    } else if (numbers[2].equals("II")) {
                        b = 2;
                    } else if (numbers[2].equals("III")) {
                        b = 3;
                    } else if (numbers[2].equals("IV")) {
                        b = 4;
                    } else if (numbers[2].equals("V")) {
                        b = 5;
                    } else if (numbers[2].equals("VI")) {
                        b = 6;
                    } else if (numbers[2].equals("VII")) {
                        b = 7;
                    } else if (numbers[2].equals("VIII")) {
                        b = 8;
                    } else if (numbers[2].equals("IX")) {
                        b = 9;
                    } else if (numbers[2].equals("X")) {
                        b = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    result = a - b;
                    return roman[result - 1];
                }
            }
        }


        if (numbers[1].equals("*")) {

            for (int i = 0; i < arab.length - 1; i++) {
                if (numbers[0].equals(String.valueOf(i))) {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[2]);
                    result = a * b;
                    return String.valueOf(result);
                }

            }
            for (int i = 0; i < 10; i++) {
                if (numbers[0].equals(roman[i])) {
                    if (numbers[0].equals("I")) {
                        a = 1;
                    } else if (numbers[0].equals("II")) {
                        a = 2;
                    } else if (numbers[0].equals("III")) {
                        a = 3;
                    } else if (numbers[0].equals("IV")) {
                        a = 4;
                    } else if (numbers[0].equals("V")) {
                        a = 5;
                    } else if (numbers[0].equals("VI")) {
                        a = 6;
                    } else if (numbers[0].equals("VII")) {
                        a = 7;
                    } else if (numbers[0].equals("VIII")) {
                        a = 8;
                    } else if (numbers[0].equals("IX")) {
                        a = 9;
                    } else if (numbers[0].equals("X")) {
                        a = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    if (numbers[2].equals("I")) {
                        b = 1;
                    } else if (numbers[2].equals("II")) {
                        b = 2;
                    } else if (numbers[2].equals("III")) {
                        b = 3;
                    } else if (numbers[2].equals("IV")) {
                        b = 4;
                    } else if (numbers[2].equals("V")) {
                        b = 5;
                    } else if (numbers[2].equals("VI")) {
                        b = 6;
                    } else if (numbers[2].equals("VII")) {
                        b = 7;
                    } else if (numbers[2].equals("VIII")) {
                        b = 8;
                    } else if (numbers[2].equals("IX")) {
                        b = 9;
                    } else if (numbers[2].equals("X")) {
                        b = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    result = a * b;
                    return roman[result - 1];
                }
            }
        }


        if (numbers[1].equals("/")) {

            for (int i = 0; i < arab.length - 1; i++) {
                if (numbers[0].equals(String.valueOf(i))) {
                    a = Integer.parseInt(numbers[0]);
                    b = Integer.parseInt(numbers[2]);
                    result = a / b;
                    return String.valueOf(result);
                }

            }
            for (int i = 0; i < 10; i++) {
                if (numbers[0].equals(roman[i])) {
                    if (numbers[0].equals("I")) {
                        a = 1;
                    } else if (numbers[0].equals("II")) {
                        a = 2;
                    } else if (numbers[0].equals("III")) {
                        a = 3;
                    } else if (numbers[0].equals("IV")) {
                        a = 4;
                    } else if (numbers[0].equals("V")) {
                        a = 5;
                    } else if (numbers[0].equals("VI")) {
                        a = 6;
                    } else if (numbers[0].equals("VII")) {
                        a = 7;
                    } else if (numbers[0].equals("VIII")) {
                        a = 8;
                    } else if (numbers[0].equals("IX")) {
                        a = 9;
                    } else if (numbers[0].equals("X")) {
                        a = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    if (numbers[2].equals("I")) {
                        b = 1;
                    } else if (numbers[2].equals("II")) {
                        b = 2;
                    } else if (numbers[2].equals("III")) {
                        b = 3;
                    } else if (numbers[2].equals("IV")) {
                        b = 4;
                    } else if (numbers[2].equals("V")) {
                        b = 5;
                    } else if (numbers[2].equals("VI")) {
                        b = 6;
                    } else if (numbers[2].equals("VII")) {
                        b = 7;
                    } else if (numbers[2].equals("VIII")) {
                        b = 8;
                    } else if (numbers[2].equals("IX")) {
                        b = 9;
                    } else if (numbers[2].equals("X")) {
                        b = 10;
                    } else {
                        throw new Exception("Число должно быть от I до X");
                    }
                    result = a / b;
                    return roman[result - 1];
                }
            }
        }
        return operation;
    }

}