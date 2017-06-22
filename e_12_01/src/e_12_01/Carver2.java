/*演習12-1
 * 自動車クラスを派生させ、フィールドとメソッドを追加した自動車クラスを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_12_01;

public class Carver2 extends Car {
	private double travelDistance;		//総移動距離

	//コンストラクタ
	public Carver2(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width,height, length, fuel, purchaseDay);	//スーパークラスのコンストラクタの呼び出し。
		travelDistance = 0.0;		//移動距離
	}

	//総移動距離のゲッタ
	public double getTravelDistance() {
		return travelDistance;
	}

	//X方向にdx・Y方向にdy移動するメソッドをオーバーライド
	public boolean totalmove(double dx, double dy) {
		super.move(dx, dy);
		double dist = Math.sqrt(dx * dx + dy * dy);	//移動距離の算出。

		//燃料不足かどうか判定する分岐。
		if(dist > getFuel()) {
			return false;

		//移動に成功した場合、移動距離、消費燃料を反映する。
		} else {
			travelDistance += dist;
			setFuel(-dist);
			setX(dx);
			setY(dy);
			return true;
		}
	}
}
