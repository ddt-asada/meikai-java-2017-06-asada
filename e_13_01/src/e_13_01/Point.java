package e_13_01;

public class Point extends Shape{

	//点を生成するコンストラクタ
	public Point() {
	}

	//点に関する図形情報を表す文字列を返却するメソッド
	public String toString() {
		return "Point";
	}

	//点を描画するメソッド
	public void draw() {
		System.out.println('+');
	}

}
