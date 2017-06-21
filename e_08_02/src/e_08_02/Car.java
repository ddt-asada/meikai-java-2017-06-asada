/*演習8-2
 * 自動車クラスにフィールドやメソッドを追加する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_08_02;

public class Car {
	private String name;		//名前
	private int width;			//幅
	private int height;			//高さ
	private int length;			//長さ
	private double x;			//現在位置X座標
	private double y;			//現在位置Y座標
	private double fuel;		//残り燃料
	private double gastank;	//燃料容量
	private double performance;//燃費

	//コンストラクタ
	Car(String name, int width, int height, int length, double fuel, double gastank, double performance) {
		this.name = name ;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.gastank = gastank;
		this.performance = performance;
		x = y = 0.0;
	}

	//現在位置X座標のゲッタ
	double getX() {
		return x;
	}

	//現在位置Y座標のゲッタ
	double getY() {
		return y;
	}

	//残り燃料のゲッタ
	double getFuel() {
		return fuel;
	}

	//燃料容量のゲッタ
	double getGastank() {
		return gastank;
	}

	//スペックを表示するメソッド
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	//給油するメソッド
	boolean fuelCharge(double charge) {
		//補給する燃料が容量を超えていないかを判定する。
		if(charge > gastank) {
			return false;

		//成功した時は燃料を反映する。
		} else {
			fuel += charge;
			System.out.println("燃料の補給が完了しました！");
			return true;
		}
	}

	//X方向にdx・Y方向にdy移動するメソッド
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);	//移動距離の算出。

		//燃料不足かどうか判定する分岐。
		if(dist > fuel) {
			return false;

		//移動に成功した場合、移動距離、消費燃料を反映する。
		} else {
			fuel -= dist / performance;
			x += dx;
			y += dy;
			return true;
		}
	}
}