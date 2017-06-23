package e_13_02;

public class HorzLine extends AbstLine {
	//水平直線を生成するコンストラクタ
	public HorzLine(int length) {
		super(length);
	}

	//水平直線に関する図形情報を表す文字列を返却する。
	public String toString() {
		return "HorazLine(length：" + getLength() + ")";
	}

	//水平直線を描画するメソッド。
	public void draw() {
		for(int i = 1; i<= getLength(); i++) {
			System.out.print('-');;
		}

		System.out.println();
	}
}
