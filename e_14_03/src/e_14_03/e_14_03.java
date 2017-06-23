/*演習14-3
 * DVDPlayerクラスを利用するプログラム例を作成する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_03;

public class e_14_03 {

	public static void main(String[] args) {
		//インスタンスの生成。
		DVDPlayer DVD = new DVDPlayer();

		//再生開始。
		DVD.play();

		//スロー再生
		DVD.slow();

		//再生終了
		DVD.stop();
	}
}
