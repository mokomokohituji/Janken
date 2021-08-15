package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Comparison comparisonPlay = new Comparison();
        Comparison comparisonComp = new Comparison();
        //グーは0、チョキは1、パーは2
        System.out.println("グーは0、チョキは1、パーは2で入力してください");

        //ScannerをSystem.inで初期化
        Scanner scan = new Scanner(System.in);

        //コンソールで入力された値をplayで受け取る
        int play = scan.nextInt();

        //ユーザーに入力した手を表示させるためpyへ代入
        //空文字をいれなくとも今回は宣言だけすればいいので省略、cpも同じ変更を行う
        String py = comparisonPlay.playComparison(play);

        System.out.println("あなたの手は" + py + "です");


        //コンピュータの手を決めるためランダム関数を使う
        Random rand = new Random();
        //0から2の範囲まで乱数が代入される
        int comp = rand.nextInt(3);

        //ユーザーにコンピューターの手を表示させるためcpへ代入
        String cp = comparisonComp.playComparison(comp);

        System.out.println("コンピュータの手は" + cp + "です");

        //プレイヤーとコンピュータの手を比較する,メソッド化した
        comparison(play,comp);

        //Scannerは必ず閉じる必要がある。変数.close();変数からcloseメソッドを呼び出し閉じる。
        scan.close();
    }

    public static void comparison(int play,int comp){
        if(play == comp) { //同じ手なら
            System.out.println("あいこです");
        }else if(play == 0 && comp == 2|| play == 1 && comp == 0|| play == 2 && comp == 1) {
            System.out.println("あなたの負けです");
        }else  {
            System.out.println("あなたの勝ちです");
        }
    }
}

