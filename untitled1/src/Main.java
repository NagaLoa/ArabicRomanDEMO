import java.util.Scanner;

public class Main {
    public static void main(String [] args){


        //Создание конвертера
        Converter converter = new Converter();

        //Выражение полученное пользователем
        Scanner scn = new Scanner(System.in);
        System.out.println("Vvod: ");
        String exp = scn.nextLine();

        //Разделение выражения на 2 числа
        String[] words = exp.split("\\+|-|/|\\*");

        String sym = "+-/*";
        int first = 0;
        int second = 0;

        //Создание булиана, для дальнейшего определения перевода в Римскую или Арабскую систему счисления
        boolean isRoman = false;

        //Создание исключений
        try {

            //Если кол-во чисел в массиве больше 2
            if (words.length > 2){

                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }

            //Если кол-во чисел в массиве меньше 2
            if (words.length < 2){
                throw new Exception("Строка не является математической операцией");
            }

            //Проверка на Римское число
            if (converter.isRoman(words[0]) && converter.isRoman(words[1])) {

                isRoman = true;

                //еревод в Арабскую систему счисления, для подсчета, и присвоение значения для first и second
                first = converter.ToArabic(words[0]);
                second = converter.ToArabic(words[1]);

            //Проверка на разные системы счисления
            } else if (converter.isRoman(words[0]) ^ converter.isRoman(words[1])) {
                throw new Exception("Используются одновременно разные системы счисления");

            } else {

                isRoman = false;

                //Если числа арабские, проверка числа на дробность
                if (isRoman == false){
                    float checkNumber = Float.parseFloat(words[0]);
                    if (checkNumber-(int)checkNumber != 0)
                        throw new Exception("Калькулятор умеет работать только с целыми числами");

                    float checkNumber1 = Float.parseFloat(words[1]);
                    if (checkNumber1-(int)checkNumber1 != 0)
                        throw new Exception("Калькулятор умеет работать только с целыми числами");

                    else {
                        //Присвоение арабских чисел переменным first и second
                        first = Integer.parseInt(words[0]);
                        second = Integer.parseInt(words[1]);
                    }

                }

            }

            int result = 0;

            //Проверка на величину числа для уравнения, не меньше 1 и не больше 10
            if (first > 10 || first < 1 || second > 10 || second < 1) {
                throw new Exception("Используйте символы от 1 до 10 включительно");
            }

            //Калькулятор для вычисления выраженя
            for (int i = 0; i < sym.length(); i++) {
                String c = Character.toString(sym.charAt(i));
                if (exp.contains(c)) {
                    switch (c) {
                        case ("+"):
                            result = first + second;
                            break;
                        case ("-"):
                            result = first - second;
                            break;
                        case ("/"):
                            result = first / second;
                            break;
                        case ("*"):
                            result = first * second;
                            break;
                    }
                    break;

                }

            }

                //Если римские
                if (isRoman) {
                    if (result > 1) {
                        //Вывод результата
                        System.out.println(converter.ToRoman(result));
                    }
                    else {
                        //Если римское число меньше 1
                        throw new Exception("В римской системе нет отрицательных чисел");
                    }

                }
                //Вывод в Арабской системе счисления
                else {
                    System.out.println(result);

                }

        }
        //Вывод нужного исключения(throw new Exception)
        catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
    public static void ArabicToRoman(int number) {

    }
}