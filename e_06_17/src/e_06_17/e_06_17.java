/*演習6-17
 * 6人の2科目の点数を読み込んで、科目ごとの平均点、学生後tの平均点を求めるプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_17;
import java.util.Scanner;

public class e_06_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int person = 6;							//配列の要素数。
		int[][] score = new int[person][2];	//学生ごと、科目別の点数を格納する配列。
		int[] sumStudent = new int[person];	//学生ごとの合計点を格納する配列。
		int[] sumSubject = new int[2];			//科目ごとの合計点を格納する配列。

		//点数の入力を促す。
		System.out.println(person + "人の国語・数学の点数を入力せよ。");

		//学生ごと、科目ごとの点数の入力。
		for(int i = 0; i < person; i++) {
			//国語の点数の入力。
			System.out.print((i + 1) + "人目…国語：");
			score[i][0] = stdIn.nextInt();

			//数学の点数の入力。
			System.out.print("       数学：");
			score[i][1] = stdIn.nextInt();

			//学生ごとの合計点を求める。
			sumStudent[i] += score[i][0];
			sumStudent[i] += score[i][1];

			//科目ごとの合計点を求める。
			sumSubject[0] += score[i][0];
			sumSubject[1] += score[i][1];
		}

		//見やすくするために表題を付ける。
		System.out.println("NO.  国語  数学  平均");

		//合計点より平均点を求めて表示する。
		for(int i = 0; i < person; i++) {
			System.out.printf("%2d%6d%6d%6.1f \n",(i + 1), score[i][0], score[i][1], ((double)sumStudent[i] / 2));
		}

		//科目ごとの平均点を表示。
		System.out.printf("平均%6.1f%6.1f", ((double)sumSubject[0] / person), ((double)sumSubject[1] / person));
	}
}
