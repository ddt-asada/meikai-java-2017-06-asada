/*演習4-13
 * 1～nまでの和を求めるプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_13;
import java.util.Scanner;

public class e_04_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int sum = 0;	//求めたわ和代入する整数。
		int end = 0;	//どもまでの和を求めるかの終点。
		
		//どこまでの和を求めるかの入力を促す。
		System.out.print("どこまでの和をもとめますか。");
		end = stdIn.nextInt();
		
		//総和を求める。
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		//求めた総和を表示する。
		System.out.println("1～" + end + "までの総和は" + sum + "です。");
		
		stdIn.close();
	}

}
