public class Task1 {

    1. Hello World
    public class HelloWorld {

        public static void main(String[] args) {

            System.out.println("Hello World! JDK setup successful.");

        }
    }
2. Variables and Operators — Temperature Converter
    public class TemperatureConverter {

        public static void main(String[] args) {

            double fahrenheit = 98.6;

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);

        }
    }
3. Conditional Statements — Even/Odd
    public class EvenOddChecker {

        public static void main(String[] args) {

            int number = 27;

            System.out.println(number % 2 == 0 ? "Even" : "Odd");

        }
    }
4. For Loop — Multiplication Table
    public class MultiplicationTable {

        public static void main(String[] args) {

            int num = 5;

            for (int i = 1; i <= 10; i++) {

                System.out.printf("%d x %d = %d%n", num, i, num * i);

            }
        }
    }
5. While Loop — Count Digits
    public class DigitCounter {

        public static void main(String[] args) {

            int number = 12345, count = 0;

            while (number != 0) {

                number /= 10;
                count++;

            }

            System.out.println("Total digits: " + count);
        }
    }
}
