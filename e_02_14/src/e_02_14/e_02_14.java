/*演習2-14
 * 名前の生と名を個別に読み込み、表示するプログラム。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_14;
import java.util.Scanner;

public class e_02_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//姓の入力を促す。
		System.out.print("姓を入力してください。");
		String firstname = stdIn.next();	//文字列を読みこむ。

		//名の入力を促す。
		System.out.print("名を入力してください。");
		String lastname = stdIn.next();		//文字列を読み込む。

		//読み込んだ文字列を表示する。
		System.out.println("こんにちは" + firstname + lastname + "さん。");
	}

}
