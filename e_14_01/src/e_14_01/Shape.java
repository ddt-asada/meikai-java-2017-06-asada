/*演習14-1
 * 図形クラス群を利用するプログラムを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_01;

public abstract class Shape {
	//図形情報を表す文字列を返却する抽象メソッド
	public abstract String toString();

	//図形を描写するための抽象メソッド
	public abstract void draw();

	//図形情報の表示と図形の描写を行う。
	public void print() {
		System.out.println(toString());
		draw();
	}

}
