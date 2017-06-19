/*演習2-15
 * 住所を読み込んで、その住所を反復表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */

package e_02_15;
import java.util.Scanner;

public class e_02_15 {

	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);

		//住所の入力を促す。
		System.out.print("住所を入力してください。");
		String addres = StdIn.nextLine();	//キーボードから文字列を読み込む。

		//入力された文字列を表示。
		System.out.println("入力された住所は" + addres + "です。");

		StdIn.close();
	}

}
