package e_13_01;

public class VirtLine extends AbstLine {
	//垂直直線を生成するコンストラクタ
	public VirtLine(int length) {
		super(length);
	}

	//垂直直線に関する図形情報を表す文字列を返却する。
	public String toString() {
		return "virtLine(length：" + getLength() + ")";
	}

	//垂直直線を描画する。
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			System.out.println('|');
		}
	}
}
