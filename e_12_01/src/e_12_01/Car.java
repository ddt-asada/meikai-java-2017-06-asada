/*演習12-1
 * 自動車クラスを派生させ、フィールドとメソッドを追加した自動車クラスを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */

package e_12_01;

public class Car {
	private String name;		//名前
	private int width;			//幅
	private int height;			//高さ
	private int length;			//長さ
	private double x;			//現在位置X座標
	private double y;			//現在位置Y座標
	private double fuel;		//残り燃料
	private Day purchaseDay;	//購入日

	//コンストラクタ
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name ;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}

	//現在位置X座標のゲッタ
	public double getX() {
		return x;
	}

	//現在位置Y座標のゲッタ
	public double getY() {
		return y;
	}

	//残り燃料のゲッタ
	public double getFuel() {
		return fuel;
	}

	//購入日のゲッタ
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	//残り燃料のセッタ
	public void setFuel(double dist){
		fuel += dist;
	}
	
	//現在位置X座標のセッタ
	public void setX(double dx){
		x += dx;
	}
	
	//現在位置Y座標のセッタ
	public void setY(double dy){
		y += dy;
	}

	//スペックを表示するメソッド
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	//X方向にdx・Y方向にdy移動するメソッド
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);	//移動距離の算出。

		//燃料不足かどうか判定する分岐。
		if(dist > fuel) {
			return false;

		//移動に成功した場合、移動距離、消費燃料を反映する。
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	} 
}
