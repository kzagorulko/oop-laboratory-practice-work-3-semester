package ru.zagorulko;

public class PraqFive {
    public String isPalindrome(String word) {
        if (word.length() == 1) {
            return "YES";
        }
        if (word.charAt(word.length()-1) == word.charAt(0)) {
            if(word.length() == 2) {
                return "YES";
            }
            if("YES".equals(isPalindrome(word.substring(1,word.length()-1)))) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        PraqFive praq = new PraqFive();

        System.out.println(praq.isPalindrome("KEKEKEKEK"));
    }
}


