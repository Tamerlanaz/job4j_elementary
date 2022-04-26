package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int l = word.length;
        if (word.length > pref.length) {
            l = pref.length;
        }
        for (int index = 0; index < l; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
