/*演習2-9
 * 三角形の底辺と高さを読み込んで面積を表示する。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_09;
import java.util.Scanner;

public class e_02_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//三角形の底辺の入力を促す。
		System.out.println("三角形の面積をもとめます。");

		System.out.print("底辺を入力してください。");
		double len = stdIn.nextDouble();	//実数値を読み込む。

		//高さの入力を促す。
		System.out.print("高さを入力してください。");
		double high = stdIn.nextDouble();	//実数値を読み込む。

		//三角形の面積を求めて表示する。
		System.out.println("三角形の面積は" + (len * high / 2) + "です。");

	}

}
