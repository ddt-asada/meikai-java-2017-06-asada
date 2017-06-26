/*演習15-8
 * コマンドライン引数から与えられた月のカレンダーを表示するプログラムを作成する。
 * 作成日：2017年6月26日
 * 作成者：浅田　知嗣
 */
package e_15_08;
import static java.util.Calendar.*;

import java .util.GregorianCalendar;

public class e_15_08 {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		
		//カレンダーを作成するために使用する月ごととの日付を格納した配列、わかりやすくするために0に当たる部分には0月を入れて読み飛ばす。
		int monthday[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int month;		//どの月のカレンダーを生成するかを格納する整数。
		int monthend;	//どの月までを描写するかを設定する。
		
		//コマンドライン引数より年と月が入力されたかを判定する。
		//受け取った引数の第一が年、第二が月として考える。
		if(args.length == 2) {
			//生成したい範囲を一つの月のみに絞ることにより、その月のみのカレンダーを表示。
			month = monthend = Integer.parseInt(args[1]);
		
		//年のみが入力された場合はその年の1月～12月までをすべて表示。
		} else if(args.length == 1) {
			//生成するカレンダーの範囲を1月～12月までに決定。
			month = 1;
			monthend = 12;
		
		//上記以外、つまり何もコマンドライン引数より受け取らなかった場合は現在月を取得。
		} else {
			month = monthend = today.get(MONTH) + 1;	//現在月を取得。
		}

		//カレンダーの描写の繰り返し。
		for(int i = month; i <= monthend; i++) {
			//カレンダーらしく見せるために枠を表示する。
			System.out.printf("          %2d月\n", i);
			System.out.println("----------------------");

			//月ごとの日付を表示。
			for(int j = 1; j <= monthday[i]; j++){
				//日付を表示。
				System.out.printf("%3d", j);

				//7日ごとに改行。
				if(j % 7 == 0) {
				System.out.println();
				}
			}

			//次の月の表示に移るときに改行。
			System.out.println();
		}
	}
}
