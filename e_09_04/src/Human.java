/*演習8-1人間クラスを作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */



public class Human {
	private String name;		//名前
	private int height;			//身長
	private double weight;		//体重
	private int year;			//誕生年
	private int month;			//誕生月
	private int day;			//誕生日

	//コンストラクタ
	Human(String n, int h, double w, int y, int m, int d) {
		name = n;		//名前
		height = h;		//身長
		weight = w;		//体重
		year = y;		//誕生年
		month = m;		//誕生月
		day = d;		//誕生日
	}

	//名前のゲッタ
	String getName() {
		return name;
	}

	//身長のゲッタ
	int getHeight() {
		return height;
	}

	//体重のゲッタ
	double getWeight() {
		return weight;
	}

	//誕生年のゲッタ
	int getYear() {
		return year;
	}

	//誕生月のゲッタ
	int getMonth() {
		return month;
	}

	//誕生日のゲッタ
	int getDay() {
		return day;
	}


	//BMIを求め、それの平均に対する過不足を表示するメソッド。
	void bmi()
	{
		double bmi = 0;		//BMIを求めて代入する型。

		bmi = weight / ((height / 100) * (height / 100));		//BMIを求め、代入。

		//BMIを表示。
		System.out.println("あなたのBMIは" + bmi + "です。");

		//BMIが18.5以下の時。
		if(bmi <= 18.5) {
			//痩せすぎと表示。
			System.out.println("これは痩せすぎです。");

		//18.5～25.0の時。
		} else if (bmi > 18.5 && bmi < 25) {
			//健康的です。と表示。
			System.out.println("健康的です。");

		//これら以外の時。
		} else {
			//太りすぎです。と表示。
			System.out.println("太りすぎです。");
		}
	}

	//理想の身長までの差を表示する。
	void theight()
	{
		//理想の身長との差を表示適当に180cmぐらい。
		System.out.println("理想の身長との差は" + (180 - height) + "cmです。");
	}

	//誕生日の文字列表現を返却するメソッド
	public String toString() {
		return String.format("%04d年%02d月%02d日", year, month, day);
	}
}
