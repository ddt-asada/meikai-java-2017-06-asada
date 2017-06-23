package e_13_01;

public abstract class AbstLine extends Shape{
	//直線の長さを表すint型のフィールド
	private int length;

	//直線を生成するコンストラクタ
	public AbstLine(int length) {
		setLength(length);
	}

	//直線の長さを取得する。
	public int getLength() {
		return length;
	}

	//直線の長さを設定する。
	public void setLength(int length) {
		this.length = length;
	}

	//直線に関する図形情報を表す文字列を返却する。
	public String tString() {
		return "AbstLine(length：" + length + ")";
	}
}
