package com.sukhovilin.tasks.polindrom;

/**
 * Yandex, real interview, stage 1. Find the palindrome string.
 */
public class App {
    public static void main(String[] args) {
        String[] texts = {"Казак",
                "А роза упала на лапу Азора",
                "Do geese see God?",
                "Madam, I'm Adam"
        };
        new App().go(texts);
    }

    private void go(String[] texts) {
        for (String text : texts) {
            boolean result = check(text);
            System.out.println((result ? "Y" : "N") + " " + text);
        }
    }

    private boolean check(String str) {
        int f = 0;
        int l = str.length() - 1;

        while (f <= l) {

            char first = str.charAt(f);
            char last = str.charAt(l);

            if (!Character.isLetter(first)) {
                f++;
                continue;
            }

            if (!Character.isLetter(last)) {
                l--;
                continue;
            }

            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                return false;
            }

            f++;
            l--;
        }
        return true;
    }


}
