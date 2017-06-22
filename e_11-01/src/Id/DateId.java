/*演習11-1
 * パッケージの所属場所を変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package Id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId{
	private static int counter;	//何番までの識別番号を与えたか。

	private int id;			//識別番号。

	//静的初期化子
	static{
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);		//現在年
		int m = today.get(MONTH);		//現在月
		int d = today.get(DATE);		//現在日

		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	//コンストラクタ
	public DateId() {
		id = ++counter;		//識別番号
	}

	//識別番号のゲッタ
	public int getId() {
		return id;
	}
}