/*演習7-24
 * 配列から任意の要素を削除した配列を返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_24;
import java.util.Scanner;

public class e_07_24 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。
		int del;	//配列から削除したい任意の値。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//削除したいインデックスを入力。
		System.out.print("削除したいインデックス：");
		del = stdIn.nextInt();

		//配列から任意の値を削除した配列を返却するメソッドを呼び出す。
		int[] delarray = arrayRmvOf(array, del);

		//任意の値を削除した後の配列を表示する。
		System.out.println("入力された値を削除した後の配列を表示します。");
		for(int i = 0; i < delarray.length; i++) {
			System.out.println("delarray[" + i + "] = " + delarray[i]);
		}

		stdIn.close();
	}
	
	static int[] arrayRmvOf(int[] array, int del) {
		//削除後の要素を格納する配列を生成。
		int delarray[] = new int [array.length - 1];
		int count = 0;		//配列に格納した数をカウントするための整数。
		
		//値をもとの配列から抜き出していく。
		for(int i = 0; i < array.length; i++) {
			if(i != del) {
				delarray[count++] = array[i];
			}
		}
		
		//削除した配列を返却する。
		return delarray;
	}

}
