package com.sukhovilin.tasks.polindrom;

public class Recurtion {

    public static void main(String[] args) {
        String[] texts = {"Казак",
                "А роза упала на лапу Азора",
                "Do geese see God?",
                "Wrong String",
                "Madam, I'm Adam"
        };
        new Recurtion().go(texts);
    }


    private void go(String[] texts) {
        for (String text : texts) {
            int i = 0;
            boolean result = check(clean(text), i);
            System.out.println((result ? "Y" : "N") + " " + text);
        }
    }

    private String clean(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) sb.append(text.charAt(i));
        }
        return sb.toString().toLowerCase();
    }

    private boolean check(String text, int i) {
        if (i == text.length() / 2) return true;
        if (text.charAt(i) != text.charAt(text.length() - 1 - i)) return false;
        return check(text, ++i);
    }

}
