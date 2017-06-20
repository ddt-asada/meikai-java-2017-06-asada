/*演習6-14
 * 月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_14;
import java.util.Random;
import java.util.Scanner;

public class e_06_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int month;		//問題を出題する際に乱数により生成した数字を格納する整数。
		int last = -1;		//問題が前回とかぶらないようにするために前回出題した問題を記憶させる整数。
		int retry;		//繰り返しを判定する整数。
		//問題の番号に対応した月の文字列表現。
		String[] smonth = { "January",
							"Febrary",
							"March",
							"April",
							"May",
							"June",
							"July",
							"August",
							"September",
							"October",
							"November",
							"December" };
		String amonth;	//答えとして入力する文字列。

		//問題のルールーを説明。
		System.out.println("英語の月名を入力して下さい。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		//終了を選択するまで問題を繰り返す。
		do {
			//まず初めに問題にとなる月を乱数により生成。
			do {
				month = rand.nextInt(12);
			//出題する月が前回と同じとならなようにする。
			} while(month == last);
			last = month;

			//正解するまでループする。
			do {
				//問題を出題する。
				System.out.print((month + 1) + "月の英語は：");
				amonth = stdIn.next();//答えとなる文字列を読み込む。

				//正解か不正解かを判定する分岐。
				if(amonth.equals(smonth[month])) {
					System.out.println("正解です。");

				} else {
					System.out.println("不正解です。");

				}

			} while(amonth.equals(smonth[month]) != true);

			//もう一度繰り返すかどうかを選択させる。
			System.out.print("もう一度？はい…1/いいえ…0");
			retry = stdIn.nextInt();

		}while(retry == 1);

		stdIn.close();
	}
}
