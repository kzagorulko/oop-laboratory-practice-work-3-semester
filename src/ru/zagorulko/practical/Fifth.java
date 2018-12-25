package ru.zagorulko.practical;

public class Fifth {
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

    public void showMultipliers(int n, int k) {
        if (k > n / 2) {
            System.out.println(n + " ");
            return;
        }

        if (n % k == 0) {
            System.out.print(k + " ");
            showMultipliers(n / k, k);
        } else {
            showMultipliers(n, ++k);
        }
    }

    public int showSum(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + showSum(n / 10);
        }
    }

    public static void main(String[] args) {
        Fifth praq = new Fifth();

        System.out.println(praq.isPalindrome("ПОТОП"));
        praq.showMultipliers(12, 2);
        System.out.println("sum: " + praq.showSum(123));
    }
}


