/*演習4-15
 * 身長と標準体重の対応表を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_15;
import java.util.Scanner;

public class e_04_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min;	//表の身長の下限値を入力する。
		int max;	//身長の上限値。
		int space;	//求める間隔。

		//身長の下限値の入力を促す。
		System.out.print("何cmから");
		min = stdIn.nextInt();

		//身長の上限値の入力を促す。
		System.out.print("何cmまで");
		max = stdIn.nextInt();

		//求める間隔の入力を促す。
		System.out.print("何cmごとに");
		space = stdIn.nextInt();

		//表に見えるように線を引く。
		System.out.println("---------------");
		System.out.println("身長  標準体重");

		//標準体重を求める。
		for(int i = min; i <= max; i += space) {
			System.out.println(i + "   " + ((i - 100) * 0.9));
		}
	stdIn.close();
	}

}
