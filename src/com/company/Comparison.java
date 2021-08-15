package com.company;

public class Comparison {
    public static String playComparison(int play){
        String py;
        switch (play) {
            case 0:
                py = "グー";
                break;
            case 1:
                py = "チョキ";
                break;
            default:
                py = "パー";
                break;
        }
        return py;
    }

    public static String compComparison(int comp){
        String cp;
        switch (comp) {
            case 0:
                cp = "グー";
                break;
            case 1:
                cp = "チョキ";
                break;

            default:
                cp = "パー";
                break;
        }
        return cp;
    }
}
