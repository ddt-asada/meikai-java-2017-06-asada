/*演習6-15
 * 曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_15;

import java.util.Random;
import java.util.Scanner;

public class e_06_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int day;		//問題を出題する際に乱数により生成した数字を格納する整数。
		int last = -1;	//問題が前回とかぶらないようにするために前回出題した問題を記憶させる整数。
		int retry;		//繰り返しを判定する整数。
		//答えの判定に使用する曜日の英語の文字列表現。
		String[] englishDay = {"Monday",
								"Tuesday",
								"Wednesday",
								"Thursday",
								"Friday",
								"Saturday",
								"Sunday"};
		//問題の出題に使用する曜日の日本語の文字列表現。
		String[] japaneseDay = {"月曜日",
								 "火曜日",
								 "水曜日",
								 "木曜日",
								 "金曜日",
								 "土曜日",
								 "日曜日"};
		String answerDay;	//答えとして入力する文字列。

		//問題のルールーを説明。
		System.out.println("英語の曜日を入力して下さい。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		//終了を選択するまで問題を繰り返す。
		do {
			//まず初めに問題にとなる月を乱数により生成。
			do {
				day = rand.nextInt(12);
			//出題する月が前回と同じとならなようにする。
			} while(day == last);
			last = day;

			//正解するまでループする。
			do {
				//問題を出題する。
				System.out.print(japaneseDay[day] + "の英語は：");
				answerDay = stdIn.next();//答えとなる文字列を読み込む。

				//正解か不正解かを判定する分岐。
				if(answerDay.equals(englishDay[day])) {
					System.out.println("正解です。");

				} else {
					System.out.println("不正解です。");

				}

			} while(answerDay.equals(englishDay[day]) != true);

			//もう一度繰り返すかどうかを選択させる。
			System.out.print("もう一度？はい…1/いいえ…0");
			retry = stdIn.nextInt();

		}while(retry == 1);

		stdIn.close();
	}
}