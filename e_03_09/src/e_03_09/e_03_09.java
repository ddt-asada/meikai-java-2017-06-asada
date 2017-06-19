/*演習3-9
 * 二つの実数値を読みこんで、大きい方を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_09;
import java.util.Scanner;

public class e_03_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		double max;		//求めた最大値を格納する整数値。
		
		//大小を判定したい二つの実数値を入力することを促す。
		System.out.print("大小を判定したい実数値を入力してください。");
		double com1 = stdIn.nextDouble();
		
		//大小を判定したい二つの実数値を入力することを促す。
		System.out.print("大小を判定したい実数値を入力してください。");
		double com2 = stdIn.nextDouble();
		
		//大小を判定するための分岐。
		if(com1 > com2) {
			max = com1;		//最大値を取得。
			
		} else {
			max = com2;		//最大値を取得。
			
		}
		
		//求めた最大値を表示。
		System.out.println("大きい方の値は" + max + "です。");
		
		stdIn.close();;

	}

}
