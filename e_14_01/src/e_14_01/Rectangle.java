/*演習14-1
 * 図形クラス群を利用するプログラムを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_01;

public class Rectangle extends Shape implements Plane2D {
	//長方形の幅を表すフィールド
	private int width;

	//長方形の高さを表すフィールド
	private int height;

	//長方形を生成するコンストラクタ
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//長方形に関する図形情報を表す文字列を返却するメソッド
	public String toString() {
		return "Rectangle(width：" + width + ", height：" + height + ")";
	}

	//長方形を描画する。
	public void draw() {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print('*');

			}
			System.out.println();

		}
	}

	//面積を求める。
	public int getArea() {
		return width * height;
	}

}
