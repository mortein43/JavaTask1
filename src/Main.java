import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;

public class Main {

    public static void delay () {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void screenArrayList (String text, ArrayList<Integer> arrayList) {
        out.println("Наш массив " + text + " чисел:");
        for (int i = 0; i<arrayList.size(); i++) out.print(arrayList.get(i) + " ");
        out.println("");
    }

    private static void printLine(int length, int direction, char symbol) {
        switch (direction) {
            case 1:
                for (int i = 0; i < length; i++) out.print(symbol);
                break;
            case 2:
                for (int i = 0; i < length; i++) out.println(symbol);
                break;
            default:
                out.println("Ви зробили не корректний вибір, коли вибирали напрямок.");
                break;
        }
        out.println("");
    }

    private static void sortArrayList(ArrayList<Integer> arrayList12, int choise12) {
        switch (choise12) {
            case 1:
                for (int i = 0; i<arrayList12.size()-1; i++) {
                    for (int j = i+1; j<arrayList12.size(); j++) {
                        if (arrayList12.get(i)>arrayList12.get(j)) {
                            int a = arrayList12.get(i);
                            int b = arrayList12.get(j);
                            arrayList12.set(i, b);
                            arrayList12.set(j, a);
                        }
                    }
                }
                out.println("Наш відсортований масив по зростанню:");
                for (int num : arrayList12) out.print(num + " ");
                out.println("");
                break;
            case 2:
                for (int i = 0; i<arrayList12.size()-1; i++) {
                    for (int j = i+1; j<arrayList12.size(); j++) {
                        if (arrayList12.get(i)<arrayList12.get(j)) {
                            int a = arrayList12.get(i);
                            int b = arrayList12.get(j);
                            arrayList12.set(i, b);
                            arrayList12.set(j, a);
                        }
                    }
                }
                out.println("Наш відсортований масив по спаданню:");
                for (int num : arrayList12) out.print(num + " ");
                out.println("");
                break;
            default:
                out.println("При виборі методу сортування ви допустили помилку.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("\nЗавдання 1:");

        String text = "\"Your time is limited, so don’t waste it living someone else’s life\" Steve Jobs";
        int key = 0;
        int lastIndex = 0;
        int countTab = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                key++;
            }
            if (key != 0 && key % 4 == 0) {
                String tabs = "\t".repeat(countTab);
                out.println(tabs + text.substring(lastIndex, i).trim());
                lastIndex = i + 1;
                key = 0;
                countTab+=2;
            }
        }

        if (lastIndex < text.length()) {
            String tabs = "\t".repeat(countTab);
            out.println(tabs + text.substring(lastIndex).trim());
        }


        delay();
        out.println("\nЗавдання 2:");


        out.println("Введіть число:");
        double firstNumber = scanner.nextDouble();
        out.println("Введіть число, це буде відсоток:");
        double secondNumber = scanner.nextDouble();
        double res = firstNumber/100*secondNumber;
        out.println(String.format( "%.0f відсотків від числа %.0f дорівнює %.2f",secondNumber, firstNumber, res));


        delay();
        out.println("\nЗавдання 3:");
        out.println("Введіть першу цифру:");
        double fNumber3 = scanner.nextDouble();
        out.println("Введіть другу цифру:");
        double sNumber3 = scanner.nextDouble();
        out.println("Введіть третю цифру:");
        double tNumber3 = scanner.nextDouble();
        double res3 = fNumber3*100+sNumber3*10+tNumber3;
        out.println(String.format("Сформоване число: %.0f", res3));

        delay();
        out.println("\nЗавдання 4:");
        out.println("Введіть шестизначне число:");
        int number4 = scanner.nextInt();
        if (number4>999999 || number4<100000) {
            out.println("Помилка ви ввели не шестизначне число.");
        }
        else {
            int num1 = number4/100000;
            int num2 = ((number4/10000)%10)*10;
            int num34 = ((number4%10000)/100)*100;
            int num5 = ((number4%100)/10)*10000;
            int num6 = (number4%10)*100000;
            int res4 = num6+num5+num34+num2+num1;
            out.println(res4);
        }

        delay();
        out.println("\nЗавдання 5:");
        String[] monthsForSeason = {
                "Winter",
                "Winter",
                "Spring",
                "Spring",
                "Spring",
                "Summer",
                "Summer",
                "Summer",
                "Autumn",
                "Autumn",
                "Autumn",
                "Winter",
        };
        out.println("Введіть номер місяця від 1 до 12:");
        int numMonths = scanner.nextInt()-1;
        if (numMonths>=0 && numMonths<=11) {
            out.println(monthsForSeason[numMonths]);
        } else {
            out.println("Помилка. Міяця з таким номер не існує.");
        }

        delay();
        out.println("\nЗавдання 6:");
        out.println("Введіть кількість метрів:");
        double metr = scanner.nextDouble();
        out.println("Виберіть у що потрібно перевести: \n 1. милі \n 2. дюйми \n 3. ярди");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                double res1 = metr * 0.00062137;
                out.println(String.format("%.2f метрів дорівнює %.2f милям", metr, res1));
                break;
            case 2:
                double res2 = metr * 39.370;
                out.println(String.format("%.2f метрів дорівнює %.2f дюймам", metr, res2));
                break;
            case 3:
                double res3T6 = metr * 1.0936;
                out.println(String.format("%.2f метрів дорівнює %.2f ярдам", metr, res3T6));
                break;
            default:
                out.println("Ви зробили не корректний вибір.");
                break;
        }

        delay();
        out.println("\nЗавдання 7:");
        out.println("Введіть перше число(початок діапазону):");
        int fNumber7 = scanner.nextInt();
        out.println("Введіть друге число(кінець діапазону):");
        int sNumber7 = scanner.nextInt();

        if (fNumber7<sNumber7 && fNumber7!=sNumber7) {
            out.println("Непарні числа вказано діапазону:");
            for (int i = fNumber7; i<=sNumber7; i++) if (i%2==1) out.print(i + " ");
        } else if (fNumber7>sNumber7 && fNumber7!=sNumber7) {
            out.println("Непарні числа вказано діапазону:");
            for (int i = sNumber7; i<=fNumber7; i++) if (i%2==1) out.print(i + " ");
        } else out.println("Із вказаними числами діапазону цілих чисел не існує.");
        out.println("");

        delay();
        out.println("\nЗавдання 8:");

        out.println("Введіть перше число діапазону:");
        int fNumber8 = scanner.nextInt();
        out.println("Введіть друге число діапазону:");
        int sNumber8 = scanner.nextInt();

        if (fNumber8<sNumber8 && fNumber8!=sNumber8) {
            out.println("Таблиці множення у вказаному діапазоні:");
            while (fNumber8<=sNumber8) {
                for (int i=1; i<=10; i++) out.println(fNumber8 + " * " + i + " = " + fNumber8*i);
                out.println("");
                fNumber8++;
            }
        } else if (fNumber8>sNumber8 && fNumber8!=sNumber8) {
            out.println("Таблиці множення у вказаному діапазоні:");
            while (sNumber8<=fNumber8) {
                for (int i=1; i<=10; i++) out.println(sNumber8 + " * " + i + " = " + sNumber8*i);
                out.println("");
                sNumber8++;
            }
        } else {
            out.println("Таблиці множення у вказаному діапазоні, нажаль вона лише одна :(");
            do { //special for @arakviel
                for (int i=1; i<=10; i++) out.println(fNumber8 + " * " + i + " = " + fNumber8*i);
            } while (fNumber8!=sNumber8);
        }

        delay();
        out.println("\nЗавдання 9:");
        out.println("Наш масив із рандомними числами:");
        Random random = new Random();
        ArrayList<Integer> arrayInt = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            arrayInt.add(random.nextInt(-100, 100));
            out.print(arrayInt.get(i) + " ");
        }
        out.println("");
        int max = arrayInt.get(0);
        int min = arrayInt.get(0);
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 0; i<arrayInt.size(); i++) {
            if (arrayInt.get(i)>max) max = arrayInt.get(i);
            if (arrayInt.get(i)<min) min = arrayInt.get(i);
            if (arrayInt.get(i)>0) countPositive++;
            if (arrayInt.get(i)<0) countNegative++;
            if (arrayInt.get(i)==0) countZero++;
        }
        out.println("Максимальне значення у масиві: " + max);
        out.println("Мінімальне значення у масиві: " + min);
        out.println("Кількість додатніх значень у масиві: " + countPositive);
        out.println("Кількість від’ємних значень у масиві: " + countNegative);
        out.println("Кількість нулів у масиві: " + countZero);

        delay();
        out.println("\nЗавдання 10:");
        out.println("Наш одномірний массив:");
        ArrayList<Integer> array10 = new ArrayList<Integer>();
        Random random10 = new Random();
        for (int i = 0; i<10; i++) {
            array10.add(random10.nextInt(-100, 100));
            out.print(array10.get(i) + " ");
        }
        ArrayList<Integer> array10Even = new ArrayList<Integer>();
        ArrayList<Integer> array10Odd = new ArrayList<Integer>();
        ArrayList<Integer> array10Positive = new ArrayList<Integer>();
        ArrayList<Integer> array10Negative = new ArrayList<Integer>();

        for (int i = 0; i<array10.size(); i++) {
            if (array10.get(i)%2==0) array10Even.add(array10.get(i));
            if (array10.get(i)%2==1) array10Odd.add(array10.get(i));
            if (array10.get(i)<0) array10Negative.add(array10.get(i));
            if (array10.get(i)>0) array10Positive.add(array10.get(i));
        }
        out.println("");

        screenArrayList("парних", array10Even);
        screenArrayList("не парних", array10Odd);
        screenArrayList("від’ємних", array10Negative);
        screenArrayList("додатніх", array10Positive);


        delay();
        out.println("\nЗавдання 11:");

        out.println("Введіть довжину лінії: ");
        int length = scanner.nextInt();
        out.println("Виберіть напрям лінії: ");
        out.println("1. Горизонталь\n2. Вертикаль");
        int direction = scanner.nextInt();
        out.println("Введіть символ з якого будуватиметься лінія: ");
        scanner.nextLine();
        String input = scanner.nextLine();
        char symbol = input.charAt(0);
        printLine(length, direction, symbol);

        delay();
        out.println("\nЗавдання 12:");
        Random random12 = new Random();
        ArrayList<Integer> arrayList12 = new ArrayList<Integer>();
        out.println("Наш масив:");
        for (int i = 0; i<10; i++) {
            arrayList12.add(random.nextInt(-100, 100));
            out.print(arrayList12.get(i) + " ");
        }
        out.println("\nВедіть як ви хочете його відсортувати: \n1. По зростанню.\n2. По спаданню.");
        int choise12 = scanner.nextInt();
        sortArrayList(arrayList12, choise12);
        scanner.close();
    }
}