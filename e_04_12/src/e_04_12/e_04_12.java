/*演習4-12
 * 0から読み込んだ整数値までカウントアップするプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_12;
import java.util.Scanner;

public class e_04_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int max;	//カウントアップの終点となる整数値。

		//カウントアップの終点の入力を促す。
		System.out.print("カウントアップの終点を入力してください。");
		max = stdIn.nextInt();

		//入力された値から0までカウントアップする。
		for(int i = 0; i <= max; i++) {
			System.out.println(i);
		}
		stdIn.close();
	}

}
