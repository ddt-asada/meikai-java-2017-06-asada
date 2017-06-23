/*演習14-3
 * DVDPlayerクラスを利用するプログラム例を作成する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_03;

public class DVDPlayer implements ExPlayer{

	//DVD再生開始宣言。
	public void play() {
		System.out.println("DVD再生開始！");
	}

	//DVDの再生を終了。
	public void stop() {
		System.out.println("DVD再生終了！");
	}

	//DVDスロー再生を開始。
	public void slow() {
		System.out.println("DVDスロー再生開始！");
	}
}
