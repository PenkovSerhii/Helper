import java.util.Scanner;
import java.io.FileReader;

public class BasicLanguageDesign {
    public static void main(String[] args) throws Exception {
        Hello();
        Underlining();
        VersionJava();
        Underlining();
        ListOfComponents();
        Underlining();
        ChooseSubject();
        Underlining();
    }
    private static void Hello(){
        System.out.println("Привет разработчик!!!");
    }
    private static void VersionJava(){
        System.out.println("Добро пожаловать в Java " + System.getProperty("java.version"));
    }
    private static void ListOfComponents(){
        System.out.println("Список тем :");
        System.out.println("   1. Основные операции с переменными в Java");
        System.out.println("   2. Что такое циклы в Java? И какие есть виды циклов?");
        System.out.println("   3. Работа со сканером в Java (ввод и вывод данных)");
        System.out.println("   4. Типы переменных в Java. Создание переменной");
        System.out.println("   5. Массивы в Java");
    }
    private static void Underlining(){
        for (int i = 0; i < 10; i++)
            System.out.print("=");
        System.out.println();
    }
    private static void ChooseSubject()throws  Exception{
        System.out.print("Выбирите номер перечисленных тем (для выхода введите EXIT) :");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int NumberSubject = scanner.nextInt();
            switch (NumberSubject) {
                case 1:
                    ReadFile(1);
                    OperationsWithVariables();
                    break;
                case 2:
                    ReadFile(2);
                    Cycles();
                    break;
                case 3:
                    ReadFile(3);
                    WorkWithScanner();
                    break;
                case 4:
                    ReadFile(4);
                    TypeVariable();
                    break;
                case 5:
                    ReadFile(5);
                    Arrays();
                    break;
                default:
                    System.out.println("Указанный номер темы отсутствует в списке. Сделайте выбор повторно!");
                    ChooseSubject();
            }
        } else if(scanner.hasNext()){
            String NumberSubject = scanner.next();
            if(NumberSubject.equalsIgnoreCase("EXIT")){
                System.out.println("Выход");
                return;
            } else {
                System.out.println("Вы сделали непправильный выбор. Повторите!");
                ChooseSubject();
                Underlining();
            }
        }
    }
    private static void ReadFile(int number)throws Exception{
        FileReader file = new FileReader( number + ".txt");
        Scanner scan = new Scanner(file);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }
        file.close();
    }
    private static void OperationsWithVariables(){
        System.out.println("Пример 1: Операция сложения");
        System.out.println("Пример 2: Операция определения остатка");
        System.out.println("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int NumberSubject = scanner.nextInt();
            if (NumberSubject == 1){

            }
        } else {
            System.out.println("Вы ввели не число ");
        }
    }
    private static void Cycles(){

    }
    private static void WorkWithScanner(){

    }
    private static void TypeVariable(){

    }
    private static void Arrays(){

    }

}
