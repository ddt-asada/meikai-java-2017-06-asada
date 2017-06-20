/*演習7-4
 * 1からnまでの全整数の総和を返却するメソッド。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_04;
import java.util.Scanner;

public class e_07_04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int end;		//1からnまでの総和を求める際のnに当たる部分。

		//求めたい総和の終点を入力を促す。
		System.out.print("総和の終点：");
		end = stdIn.nextInt();

		//総和を求めるメソッドを呼び出し、返却された値を表示する。
		System.out.println("1から" + end + "までの総和は" + sumUp(end) + "です。");

		stdIn.close();
	}

	//1からnまでの総和を求めるメソッド。
	static int sumUp(int end) {
		int sum = 0;	//求めた総和を格納する整数。

		//総和を求めるくりかえし。
		for(int i = 1; i <= end; i++) {
			sum += i;
		}

		//求めた総和を返却する。
		return sum;
	}

}
