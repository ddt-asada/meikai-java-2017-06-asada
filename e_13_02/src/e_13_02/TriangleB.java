/*演習13-2
 * 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_13_02;

public class TriangleB extends Triangle {
	private int length;		//左上直角三角形の底辺を表す。
	private int height;		//左上直角三角形の高さを表す。

	//左上直角三角形を生成するコンストラクタ
	public TriangleB(int length) {
		this.length = length;
		this.height = length;
	}

	//二等辺三角形の文字列表現を返却する
	public String toString() {
		return "TriangleB(length：" + length + ", height：" + height + ")";
	}

	//左上直角三角形
	public void draw() {
		for(int i = 1; i <= length; i++) {
			for(int j = i; j <= length; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}