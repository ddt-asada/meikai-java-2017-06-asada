package e_13_02;

public class Rectangle extends Shape {
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

}
