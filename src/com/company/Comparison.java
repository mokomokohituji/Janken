package com.company;

class Comparison {
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
}
