import java.util.*;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;



public class Converter {
    //Создаем новую map
    TreeMap<String, Integer> romanKeyMap = new TreeMap<>();

    //Получаем ключ по значению, for example V -> 5
    public int ToArabic(String number){
        return romanKeyMap.get(number);

    }
    //Получае значение по ключу, 5 -> V
    public String ToRoman(int number) {
        Object objectNumber = (Integer)number;
        return romanKeyMap.entrySet().stream().filter(entry -> objectNumber.equals(entry.getValue())).map(Map.Entry::getKey).findFirst().get();

    }
    //Привязываем значение к ключу
    public Converter() {
        romanKeyMap.put("I", 1);
        romanKeyMap.put("II", 2);
        romanKeyMap.put("III", 3);
        romanKeyMap.put("IV", 4);
        romanKeyMap.put("V", 5);
        romanKeyMap.put("VI", 6);
        romanKeyMap.put("VII", 7);
        romanKeyMap.put("VIII", 8);
        romanKeyMap.put("IX", 9);
        romanKeyMap.put("X", 10);
        romanKeyMap.put("XI", 11);
        romanKeyMap.put("XII", 12);
        romanKeyMap.put("XIII", 13);
        romanKeyMap.put("XIV", 14);
        romanKeyMap.put("XV", 15);
        romanKeyMap.put("XVI", 16);
        romanKeyMap.put("XVII", 17);
        romanKeyMap.put("XVIII", 18);
        romanKeyMap.put("XIX", 19);
        romanKeyMap.put("XX", 20);
        romanKeyMap.put("XXI", 21);
        romanKeyMap.put("XXII", 22);
        romanKeyMap.put("XXIII", 23);
        romanKeyMap.put("XXIV", 24);
        romanKeyMap.put("XXV", 25);
        romanKeyMap.put("XXVI", 26);
        romanKeyMap.put("XXVII", 27);
        romanKeyMap.put("XXVIII", 28);
        romanKeyMap.put("XXIX", 29);
        romanKeyMap.put("XXX", 30);
        romanKeyMap.put("XXXI", 31);
        romanKeyMap.put("XXXII", 32);
        romanKeyMap.put("XXXIII", 33);
        romanKeyMap.put("XXXIV", 34);
        romanKeyMap.put("XXXV", 35);
        romanKeyMap.put("XXXVI", 36);
        romanKeyMap.put("XXXVII", 37);
        romanKeyMap.put("XXXVIII", 38);
        romanKeyMap.put("XXXIX", 39);
        romanKeyMap.put("XL", 40);
        romanKeyMap.put("XLI", 41);
        romanKeyMap.put("XLII", 42);
        romanKeyMap.put("XLIII", 43);
        romanKeyMap.put("XLIV", 44);
        romanKeyMap.put("XLV", 45);
        romanKeyMap.put("XLVI", 46);
        romanKeyMap.put("XLVII", 47);
        romanKeyMap.put("XLVIII", 48);
        romanKeyMap.put("XLIX", 49);
        romanKeyMap.put("L", 50);
        romanKeyMap.put("LI", 51);
        romanKeyMap.put("LII", 52);
        romanKeyMap.put("LIII", 53);
        romanKeyMap.put("LIV", 54);
        romanKeyMap.put("LV", 55);
        romanKeyMap.put("LVI", 56);
        romanKeyMap.put("LVII", 57);
        romanKeyMap.put("LVIII", 58);
        romanKeyMap.put("LIX", 59);
        romanKeyMap.put("LX", 60);
        romanKeyMap.put("LXI", 61);
        romanKeyMap.put("LXII", 62);
        romanKeyMap.put("LXIII", 63);
        romanKeyMap.put("LXIV", 64);
        romanKeyMap.put("LXV", 65);
        romanKeyMap.put("LXVI", 66);
        romanKeyMap.put("LXVII", 67);
        romanKeyMap.put("LXVIII", 68);
        romanKeyMap.put("LXIX", 69);
        romanKeyMap.put("LXX", 70);
        romanKeyMap.put("LXXI", 71);
        romanKeyMap.put("LXXII", 72);
        romanKeyMap.put("LXXIII", 73);
        romanKeyMap.put("LXXIV", 74);
        romanKeyMap.put("LXXV", 75);
        romanKeyMap.put("LXXVI", 76);
        romanKeyMap.put("LXXVII", 77);
        romanKeyMap.put("LXXVIII", 78);
        romanKeyMap.put("LXXIX", 79);
        romanKeyMap.put("LXXX", 80);
        romanKeyMap.put("LXXXI", 81);
        romanKeyMap.put("LXXXII", 82);
        romanKeyMap.put("LXXXIII", 83);
        romanKeyMap.put("LXXXIV", 84);
        romanKeyMap.put("LXXXV", 85);
        romanKeyMap.put("LXXXVI", 86);
        romanKeyMap.put("LXXXVII", 87);
        romanKeyMap.put("LXXXVIII", 88);
        romanKeyMap.put("LXXXIX", 89);
        romanKeyMap.put("XC", 90);
        romanKeyMap.put("XCI", 91);
        romanKeyMap.put("XCII", 92);
        romanKeyMap.put("XCIII", 93);
        romanKeyMap.put("XCIV", 94);
        romanKeyMap.put("XCV", 95);
        romanKeyMap.put("XCVI", 96);
        romanKeyMap.put("XCVII", 97);
        romanKeyMap.put("XCVIII", 98);
        romanKeyMap.put("XCIX", 99);
        romanKeyMap.put("C", 100);

    }
    public boolean isRoman(String number){

        return romanKeyMap.containsKey(number);
    }
}
