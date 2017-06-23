/*演習15-1
 * 文字列を読み込んで、その文字列を逆順に表示するプログラム。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */

package e_15_01;
import java.util.Scanner;

public class e_15_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//文字列をキーボードから読み込む。
		System.out.print("文字列s：");
		String s = stdIn.next();

		//文字列を逆順に表示。
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		stdIn.close();
	}
}
