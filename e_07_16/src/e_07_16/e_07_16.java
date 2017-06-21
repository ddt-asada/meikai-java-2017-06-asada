/*演習7-16
 * 配列の要素の最小値を求めるメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_16;
import java.util.Scanner;

public class e_07_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		n =stdIn.nextInt();

		//身長を格納する配列を生成。
		int[] height = new int[n];

		//体重を格納する配列の生成。
		int[] weight = new int[n];

		//配列の全要素に値を入れる。
		for(int i = 0; i < n; i++) {
			System.out.print("height[" + i + "] = ");
			height[i] = stdIn.nextInt();

			System.out.print("weight[" + i + "] = ");
			weight[i] = stdIn.nextInt();
		}

		//配列の最小値を表示。
		System.out.println("height[]の全要素の最小値は" + minOf(height) + "です。");
		System.out.println("weight[]の全要素の最小値は" + minOf(weight) + "です。");

		stdIn.close();
	}
	
	static int minOf(int[] array) {
		int min = array[0];		//最小値を求めるのに使う整数。
		
		//最小値を求める。
		for(int i = 1; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
			}
		}
		
		//求めた最小値を返す。
		return min;
	}
}
