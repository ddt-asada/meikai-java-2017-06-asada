/*演習7-25
 * 配列から指定した要素を先頭とする後方nこの要素を削除した配列を返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_25;
import java.util.Scanner;

public class e_07_25 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。
		int del;	//配列から削除したい任意のインデックスの先頭。
		int delnum;	//後方何個を削除するか。
		
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
		System.out.print("削除したいインデックスの先頭：");
		del = stdIn.nextInt();
		
		//後方何個を削除するかを入力。
		System.out.print("後方何個を削除しますか：");
		delnum = stdIn.nextInt();

		//配列から任意の値を削除した配列を返却するメソッドを呼び出す。
		int[] delarray = arrayRmvOfN(array, del, delnum);

		//任意の値を削除した後の配列を表示する。
		System.out.println("入力された値を削除した後の配列を表示します。");
		for(int i = 0; i < delarray.length; i++) {
			System.out.println("delarray[" + i + "] = " + delarray[i]);
		}

		stdIn.close();
	}
	
	static int[] arrayRmvOfN(int[] array, int del, int delnum) {
		//削除したい範囲が配列の範囲を超えていないかを比較し、超えている場合は配列の長さまでを範囲として新たに採用する。
		delnum = array.length < (delnum + del) ? (array.length - del) : delnum;
		
		//削除した後の値を格納するための配列を生成する。
		int delarray[] = new int[array.length - delnum];
		int count = 0;	//いくつ削除したかをカウントする整数。
		
		//削除の前半部分を格納。
		for(int i = 0; i < del; i++) {
			delarray[count++] = array[i];
		}
		
		//後半部分を格納
		for(int i = (del + delnum); i < array.length; i++) {
			delarray[count++] = array[i];
		}
		
		//生成した配列を返却。
		return delarray;
	}

}
