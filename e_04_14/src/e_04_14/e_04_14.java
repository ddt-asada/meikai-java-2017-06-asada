/*演習4-14
 * 総和を求めるプログラムに式も表示するように変更する。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_14;
import java.util.Scanner;

public class e_04_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;	//求めたわ和代入する整数。
		int end = 0;	//どもまでの和を求めるかの終点。

		//どこまでの和を求めるかの入力を促す。
		System.out.print("どこまでの和をもとめますか。");
		end = stdIn.nextInt();

		//総和を求める。
		for(int i = 1; i <= end; i++) {

			//式を表示するための分岐。
			if(i == end) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " + ");
			}

			sum += i;
		}

		//求めた総和を表示する。
		System.out.println(sum);

		stdIn.close();
	}

}
