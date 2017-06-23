/*演習13-2
 * 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_13_02;

public abstract class Triangle {
	//図形情報文字列を返却する抽象メソッド
	public abstract String toString();

	//図形を描画する抽象メソッド
	public abstract void draw();

	//図形情報の表示と図形の描画を行うメソッド
	public void print() {
		System.out.println(toString());
		draw();
	}
}
