/*演習15-2
 * 文字列を読み込んでその全文字の文字コードを表示するプログラム。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_15_02;
import java.util.Scanner;

public class e_15_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//文字列を読み込む。
		System.out.print("文字列s：");
		String s = stdIn.next();

		//文字コードを表示する。
		for(int i = 0; i < s.length(); i++) {
			System.out.println("s[" + i + "] = " + s.codePointAt(i));

		}
		stdIn.close();
	}

}
