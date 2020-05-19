import java.util.Scanner;
import java.io.FileReader;

public class BasicLanguageDesign {
    public static void main(String[] args) throws Exception {
        BasicLanguageDesign basicLanguageDesign = new BasicLanguageDesign();
        basicLanguageDesign.Hello();
        basicLanguageDesign.VersionJava();
        basicLanguageDesign.ListOfComponents();
        basicLanguageDesign.ChooseSubject();
    }
    private void Hello(){
        System.out.println("Привет разработчик!!!");
        Underlining();
    }
    private void VersionJava(){
        System.out.println("Добро пожаловать в Java " + System.getProperty("java.version"));
        Underlining();
    }
    private void ListOfComponents(){
        System.out.println("Список тем :");
        System.out.println("   1. Основные операции с переменными в Java");
        System.out.println("   2. Что такое циклы в Java? И какие есть виды циклов?");
        System.out.println("   3. Работа со String в Java");
        System.out.println("   4. Типы переменных в Java");
        System.out.println("   5. Массивы в Java");
        Underlining();
    }
    private void ChooseSubject()throws  Exception{
        System.out.print("Выбирите номер перечисленных тем (для выхода введите EXIT) : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        Underlining();
            switch (string.toUpperCase()) {
                case "1":
                    ReadFile("OperationsWithVariables");
                    OperationsWithVariables();
                    break;
                case "2":
                    ReadFile("Cycles");
                    Cycles();
                    break;
                case "3":
                    ReadFile("WorkWithString");
                    WorkWithString();
                    break;
                case "4":
                    ReadFile("TypesVariables");
                    TypeVariable();
                    break;
                case "5":
                    ReadFile("Arrays");
                    Arrays();
                    break;
                case "EXIT": Exit(); break;
                default:
                    System.out.println("Указанный номер темы отсутствует в списке. Сделайте выбор повторно!");
                    Underlining();
                    ChooseSubject();
            }
    }
    private void ReadFile(String string)throws Exception{
        FileReader file = new FileReader( string + ".txt");
        Scanner scan = new Scanner(file);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }
        file.close();
    }
    private void OperationsWithVariables() throws Exception{
        Underlining();
        System.out.println("  1    - Пример операция сложения");
        System.out.println("  2    - Пример операция определения остатка от деления");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toUpperCase()) {
            case "1": OperationsWithVariablesExampleAdd(); break;
            case "2": OperationsWithVariablesExampleModule(); break;
            case "EXIT": Exit(); break;
            default:
                System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                Underlining();
                OperationsWithVariables();
        }
    }
    private void OperationsWithVariablesExampleAdd() throws Exception {
        Underlining();
        System.out.println("Пример операция сложения");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        double num1 = EnterNumber("Введите первое число  : ");
        double num2 = EnterNumber("Введите второе число  : ");
        double sum = num1 + num2;
        System.out.println("Сумма :" + num1 + " + " + num2 + " = " + sum);
        Underlining();
        ExitBlock("OperationsWithVariables", "OperationsWithVariablesExampleAdd");
    }
    private void OperationsWithVariablesExampleModule() throws Exception{
        Underlining();
        System.out.println("Пример операция определения остатка от деления");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        double num1 = EnterNumber("Введите первое число  : ");
        double num2 = EnterNumber("Введите второе число  : ");
        double mod = num1%num2;
        System.out.println("Остаток :" + num1 + " % " + num2 + " = " + mod);
        Underlining();
        ExitBlock("OperationsWithVariables", "OperationsWithVariablesExampleModule");
    }
    private void Cycles()throws Exception{
        Underlining();
        System.out.println("  1    - Пример цикла for");
        System.out.println("  2    - Пример цикла do while");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toUpperCase()) {
            case "1": CyclesExampleFor(); break;
            case "2": CyclesExampleDoWhile(); break;
            case "EXIT": Exit(); break;
            default:
                System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                Underlining();
                Cycles();
        }
    }
    private void CyclesExampleFor()throws Exception{
        Underlining();
        System.out.println("Пример цикла for");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        int num1 = (int)EnterNumber("Введите количество элементов : ");
        for (int i=1; i <= num1; i++) {
            System.out.print (i + ", ");
        }
        System.out.println();
        Underlining();
        ExitBlock("Cycles", "CyclesExampleFor");
    }
    private void CyclesExampleDoWhile()throws Exception{
        Underlining();
        System.out.println("Пример цикла do while");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        int number = (int)EnterNumber("Введите количество элементов : ");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i < number);
        System.out.println();
        Underlining();
        ExitBlock("Cycles", "CyclesExampleDoWhile");
    }
    private void WorkWithString() throws Exception{
        Underlining();
        System.out.println("  1    - Пример возвращает длину строки Метод length ()");
        System.out.println("  2    - Пример добавляет одну строку в конец к другой строке метод concat()");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toUpperCase()) {
            case "1": WorkWithStringExampleLength(); break;
            case "2": WorkWithStringExampleConcat(); break;
            case "EXIT": Exit(); break;
            default:
                System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                Underlining();
                WorkWithString();
        }
    }
    private void WorkWithStringExampleLength() throws Exception{
        Underlining();
        System.out.println("Пример возвращает длину строки Метод length ()");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.length());
        Underlining();
        ExitBlock("WorkWithString", "WorkWithStringExampleLength");
    }
    private void WorkWithStringExampleConcat() throws Exception{
        Underlining();
        System.out.println("Пример добавляет одну строку в конец к другой строке метод concat()");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое предложение : ");
        String sentence_1 = scanner.nextLine();
        System.out.println("Введите второе предложение : ");
        String sentence_2 = scanner.nextLine();
        Underlining();
        System.out.println(sentence_1.concat(sentence_2));
        Underlining();
        ExitBlock("WorkWithString", "WorkWithStringExampleConcat");
    }
    private void TypeVariable() throws Exception{
        Underlining();
        System.out.println("  1    - Пример определяем тип переменной целого числа");
        System.out.println("  2    - Пример выводит параметри переменной по запросу из перечня");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toUpperCase()) {
            case "1":
                TypeVariableExample_1();
                break;
            case "2":
                TypeVariableExample_2();
                break;
            case "EXIT":
                Exit();
                break;
            default:
                System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                Underlining();
                TypeVariable();
        }
    }
    private void TypeVariableExample_1() throws Exception{
        Underlining();
        System.out.println("Пример определяем тип переменной целого числа");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        if (scanner.hasNextByte()){
            System.out.println("Целое число - типа byte");
        } else  if (scanner.hasNextShort()){
            System.out.println("Целое число - типа short");
        }else  if (scanner.hasNextInt()){
            System.out.println("Целое число - типа int");
        }else  if (scanner.hasNextLong()){
            System.out.println("Целое число - типа long");
        }else  if (scanner.hasNextBigInteger()){
            System.out.println("Целое число - выходит за граници типа long");
        }
        else {
            System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
            TypeVariableExample_1();
        }
        System.out.println();
        Underlining();
        ExitBlock("TypeVariable", "TypeVariableExample_1");
    }
    private void TypeVariableExample_2() throws Exception{
        Underlining();
        System.out.println("Пример выводит параметри переменной по запросу из перечня");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список типов приметивных переменных :");
        System.out.println("1 - byte");
        System.out.println("2 - short");
        System.out.println("3 - int");
        System.out.println("4 - long");
        System.out.println("5 - char");
        System.out.println("6 - float");
        System.out.println("7 - double");
        System.out.println("8 - boolean");
        System.out.print("Выбирите тип переменной (для выхода введите EXIT): ");
        switch (scanner.next().toUpperCase()){
            case "1":
                System.out.println("Размер: 8 бит   Диапазон: от -128 до 127"); break;
            case "2":
                System.out.println("Размер: 16 бит   Диапазон: от -32768 до 32767"); break;
            case "3":
                System.out.println("Размер: 32 бит  Диапазон: от -2147483648 до 2147483647"); break;
            case "4":
                System.out.println("Размер: 8 бит   Диапазон: от -9223372036854775808L до 9223372036854775807L"); break;
            case "5":
                System.out.println("Размер: 16 бит   Беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)"); break;
            case "6":
                System.out.println("Размер: 32 бит   Диапазон: от 1.4e-45f до 3.4e+38f"); break;
            case "7":
                System.out.println("Размер: 64 бит   Диапазон: от 4.9e-324 до 1.7e+308"); break;
            case "8":
                System.out.println("Размер: 8 бит (в массивах), 32 бит (не в массивах используется int)   Диапазон: true (истина) или false (ложь)"); break;
            case "EXIT": Exit(); break;
            default:
                System.out.println("Указанный номер темы отсутствует в списке. Сделайте выбор повторно!");
                Underlining();
                TypeVariableExample_2();
        }
    }
    private void Arrays()throws Exception{
        Underlining();
        System.out.println("  1    - Пример заполнения массива случайними числами от 1 до 10");
        System.out.println("  2    - Пример прямоугольник двухмерний массив");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toUpperCase()) {
            case "1":
                ArraysExample_1();
                break;
            case "2":
                ArraysExample_2();
                break;
            case "EXIT":
                Exit();
                break;
            default:
                System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                Underlining();
                Arrays();
        }
    }
    private void ArraysExample_1()throws Exception{
        Underlining();
        System.out.println("Пример заполнения массива случайними числами от 1 до 10");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        int num1 = (int)EnterNumber("Введите количество элементов массива: ");
        int[] array = new int[Math.abs(num1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10)+1;
        }
        for (int i:array) {
            System.out.print(i+", ");
        }
        System.out.println();
        Underlining();
        ExitBlock("Arrays", "ArraysExample_1");
    }
    private void ArraysExample_2()throws Exception{
        Underlining();
        System.out.println("Пример прямоугольник двухмерний массив");
        Underlining();
        Scanner scanner = new Scanner(System.in);
        int num1 = (int)EnterNumber("Введите количество строк массива: ");
        int num2 = (int)EnterNumber("Введите количество столбцов массива: ");
        int[][] array = new int[Math.abs(num1)][Math.abs(num2)];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Underlining();
        ExitBlock("Arrays", "ArraysExample_2");
    }
    private void Exit(){
         Underlining();
         System.out.println("Выход из программы");
         return;
     }
    private void ExitBlock(String components, String operation) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("  1    - Хотите вернуться к списку тем ?");
        System.out.println("  2    - Хотите вернуться в предидущее меню ?");
        System.out.println("  3    - Хотите повторить пример ?");
        System.out.println("  EXIT - Выход из программы");
        Underlining();
        System.out.print("Сделайте выбор : ");
         switch (scanner.next().toUpperCase()) {
             case "1":
                 ListOfComponents();
                 ChooseSubject();
                 break;
             case "2":
                 switch (components){
                     case "OperationsWithVariables" : OperationsWithVariables();break;
                     case "Cycles" : Cycles();break;
                     case "WorkWithString" : WorkWithString();break;
                     case "TypeVariable" : TypeVariable();break;
                     case "Arrays" : Arrays();break;
                 }
             break;
             case "3":
                 switch (operation){
                     case "OperationsWithVariablesExampleAdd" : OperationsWithVariablesExampleAdd();break;
                     case "OperationsWithVariablesExampleModule" : OperationsWithVariablesExampleModule();break;
                     case "CyclesExampleFor" : CyclesExampleFor();break;
                     case "CyclesExampleDoWhile" : CyclesExampleDoWhile();break;
                     case "WorkWithStringExampleLength" : WorkWithStringExampleLength();break;
                     case "WorkWithStringExampleConcat" : WorkWithStringExampleConcat();break;
                     case "TypeVariableExample_1" : TypeVariableExample_1();break;
                     case "TypeVariableExample_2" : TypeVariableExample_2();break;
                     case "ArraysExample_1" : ArraysExample_1();break;
                     case "ArraysExample_2" : ArraysExample_2();break;
                 }
             case "EXIT":
                 Underlining();
                 System.out.println("Выход из программы");
                 return;
             default:
                 System.out.println("Ваш вибор не сответствует условиям. Сделайте выбор повторно!");
                 Underlining();
                 ExitBlock(components,operation);
         }
    }
    private double EnterNumber(String string){
        double num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(string);
        if (scanner.hasNextDouble()){
            num = scanner.nextDouble();
        }else {
            System.out.println("Вы ввели не число. Повторите ввод !");
            EnterNumber(string);
        }
        return num;
    }
    private void Underlining(){
        for (int i = 0; i < 10; i++)
            System.out.print("=");
        System.out.println();
    }
}
