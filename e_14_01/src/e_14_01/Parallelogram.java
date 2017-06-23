/*演習14-1
 * 図形クラス群を利用するプログラムを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_01;

public class Parallelogram extends Shape implements Plane2D {
	private int width;		//底辺の幅
	private int height;		//高さ

	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//文字列表現
	public String toString() {
		return "Parallelogram(width：" + width + ",height：" + height + ")";
	}

	//図形を描写
	public void draw() {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height - i; j++) {
				System.out.print(' ');
			}

			for(int j = 1; j <= width; j++) {
				System.out.print('#');
			}

			System.out.println();
		}
	}

	//面積を求める。
	public int getArea() {
		return width * height;
	}

}
