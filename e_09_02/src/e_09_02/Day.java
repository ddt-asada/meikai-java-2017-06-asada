/*演習9-2
 * 日付クラスを作成し、全コンストラクタの動きが確認できるプログラムを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_09_02;

public class Day {
	private int year = 1;		//年を1で初期化。
	private int month = 1;		//月を1で初期化。
	private int date = 1;		//日を1で初期化。

	//コンストラクタの定義。

	//デフォルトコンストラクタ
	public Day() {};

	//年のみを読みこみほかは初期状態のままとするコンストラクタ。
	public Day(int year) {
		this.year = year;
	}

	//年と月を読み込みほかは初期状態のままとするコンストラクタ。
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	//コンストラクタ
	public Day(int year, int month, int date) {
		this(year,month);
		this.date = date;
	}

	//コピーコンストラクタ
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	//年を取得するゲッタ
	public int getYear() {
		return this.year;
	}

	//月を取得するゲッタ
	public int getMonth() {
		return this.month;
	}

	//日を取得するゲッタ
	public int getDate() {
		return this.date;
	}

	//年を変更するセッタ。
	public void setYear(int year) {
		this.year = year;
	}

	//月を変更するセッタ
	public void setMonth(int month) {
		this.month = month;
	}

	//日を設定するセッタ
	public void setDate(int date) {
		this.date = date;
	}

	//年・月・日を一度に設定するセッタ。
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}


	//曜日を求めるメソッド
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}

		return  (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//日付ｄと等しいか判定するメソッド
	public boolean equalTo(Day d) {
		return year == d.year && month ==d.month && date == d.date;
	}

	//文字列表現を返却する。
	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金","土"};
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

}