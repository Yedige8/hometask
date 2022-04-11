import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        String firstString = "спел ППРРР";
        String firstString = "спел выам ППРРР";
        distanceBetweenSubString(firstString, "спел"," ППРРР" );
    }

    //Четные и нечетные символы разделить по разным строкам
    public static void methodBackCounAndUncoutString(String a) {
        String firstString = a;
        String unCountable = "";
        String countable = "";
        for (int i = 0; i < firstString.length(); i++) {
            if ((i % 2) == 0) {
                unCountable = unCountable + firstString.charAt(i);
            } else {
                countable += firstString.charAt(i);
            }
        }
        System.out.println("UnCountable " + unCountable + "; countable " + countable);
    }

    //Четные и нечетные символы разделить по разным строкам
    public static void countOnlyNumbers(String a) {
        String firstString = a;
        int count = 0;

        for (int i = 0; i < firstString.length(); i++) {
            if (Character.isDigit(firstString.charAt(i))) {
                count++;
            }
        }
        System.out.println("Количество цифр в строке " + count);
    }

    //Вводится строка из букв и цифр, построить новую только из цифр
    public static void buildNewStringOnlyNumbers(String a) {
        String firstString = a;
        String newString = "";
        for (int i = 0; i < firstString.length(); i++) {
            if (Character.isDigit(firstString.charAt(i))) {
                newString += firstString.charAt(i);
            }
        }
        System.out.println("Новая строка только из цифр " + newString);
    }

    //Удаление одинаковых символов
    public static void deleteEqualCharacter(String a) {
        String firstString = a;
        StringBuilder newString = new StringBuilder();
        newString.append(firstString.charAt(0));
        int coun = 0;
        for (int i = 1; i < firstString.length(); i++) {
            for (int q = 0; q < newString.length(); q++) {
                if ((firstString.charAt(i)) == newString.charAt(q)) {
                    coun++;
                }
            }
            if (coun == 0) {
                newString.append(firstString.charAt(i));
            }
            coun = 0;
        }
        System.out.println("Удаление одинаковых символов " + newString);
    }

    //Частота встречаемости символа в строке
    public static void frequencyOfCharacter(String a) {
        String firstString = a;
        HashMap<Character, Integer> characterAndCount = new HashMap<Character, Integer>();

        for (int i = 1; i < firstString.length(); i++) {
            if (characterAndCount.containsKey(firstString.charAt(i))) {
                characterAndCount.put(firstString.charAt(i), characterAndCount.get(firstString.charAt(i)) + 1);
            } else {
                characterAndCount.put(firstString.charAt(i), 1);
            }
        }
        System.out.println("Частота встречаемости символа в строке " + characterAndCount);
    }

    //Переворот строки
    public static void lineFeed(String a) {
        String firstString = a;
        StringBuffer secondString = new StringBuffer();
        for (int i = firstString.length() - 1; i >= 0; i--) {
            secondString.append(firstString.charAt(i));
        }
        System.out.println("Переворот строки  " + secondString);
    }

    //Количество вхождений подстроки в строку
    public static void lineFeed(String string, String substring) {
        int count = 0;
        Pattern p = Pattern.compile(substring);
        Matcher m = p.matcher(string);
        while (m.find()) {
            count++;
        }
        System.out.println("Количество вхождений подстроки в строку " + substring + ":" + count);
    }

    //Вывести слова строки в обратном порядке
    public static void wordReversInString(String string) {
        StringBuffer secondString = new StringBuffer();
        String[] words = string.split(" ");

        for (String str : words) {
            StringBuffer wordRevers = new StringBuffer();
            for (int i = str.length() - 1; i >= 0; i--) {

                wordRevers.append(str.charAt(i));
            }

            secondString.append(wordRevers).append(" ");
        }
        System.out.println("Вывести слова строки в обратном порядке  " + secondString);
    }

    //Сортировка массива строк по алфавиту
    public static void sortArray(String string) {
        String[] words = string.split(" ");
        Arrays.sort(words);
        System.out.print("Сортировка массива строк по алфавиту: ");
        for (String s : words) {
            System.out.print(s + "; ");
        }
    }

    //Определить длину самого короткого слова в строке
    public static void minLengthWord(String string) {
        String secondString = "";
        String[] words = string.split(" ");
        int minLengthWord = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (minLengthWord > words[i].length()) {
                minLengthWord = words[i].length();
                secondString = words[i];
            } else if (minLengthWord == words[i].length()){
                secondString = words[i];
            }
            if (secondString.equals("")){
                secondString = words[0];
            }
        }
        System.out.println("Определить длину самого короткого слова в строке. Длина: "+ minLengthWord + " Слово: "+ secondString);
    }

    //Подсчет количества слов в строке
    public static void wordCount(String string) {
        String[] words = string.split(" ");
        System.out.println("Подсчет количества слов в строке: " + words.length);
    }
    //Добавление пробелов в строку
    public static void addSpaceInString(String string) {
        StringBuffer secondString = new StringBuffer();
        secondString.append(string).append(" ");
        System.out.println("Добавление пробелов в строку: " + secondString);
    }

    //Является ли строка палиндром?
    public static void isItPalindrome(String string) {
        String firstString = string;
        StringBuffer secondString = new StringBuffer();
        for (int i = firstString.length() - 1; i >= 0; i--) {
            secondString.append(firstString.charAt(i));
        }
        boolean isItPalindrome = true;
        System.out.println("firstString " + firstString);
        System.out.println("secondString " + secondString);
        if(!firstString.contentEquals(secondString)){
            System.out.println("!firstString.equals(secondString) " + !firstString.equals(secondString));
            isItPalindrome = false;
        }
        System.out.println("Является ли строка палиндром? " + isItPalindrome);
    }

    //Замена подстроки в строке
    public static void changeSubString(String string, String oldSubString, String newSubString) {
        String firstString = string;
        String oSubString = oldSubString;
        String nSubString = newSubString;
        System.out.println("Замена подстроки в строке " + firstString.replace(oldSubString, newSubString));
    }
    //Расстояние между подстроками
    public static void distanceBetweenSubString(String string, String firstSubString, String secondSubString) {
        String firstString = string;
        int stringLength = string.length();
        int firstSubStringLength = firstSubString.length();
        int secondSubStringLength  = secondSubString.length();

        int firstSubStringIn = firstString.indexOf(firstSubString);
        System.out.println("firstSubStringIn " + firstSubStringIn);
        int secondSubStringIn = firstString.lastIndexOf(secondSubString);
        System.out.println("secondSubString " + secondSubString);
        System.out.println("secondSubString " + secondSubStringIn);

        int firstSubStringOut = firstSubStringIn + firstSubStringLength;
        int distanceBetween = secondSubStringIn - firstSubStringOut;

        System.out.println("Расстояние между подстроками " + distanceBetween);
    }

}
