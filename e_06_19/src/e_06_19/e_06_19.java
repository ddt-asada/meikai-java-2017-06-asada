/*演習6-19
 * クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_19;
import java.util.Scanner;

public class e_06_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int clas = 0;		//行列の行の部分当たるクラス数。
		int person = 0;		//行列の列の部分に当たるクラスの人数。

		//クラス数の入力。
		System.out.print("学年のクラス数：");
		clas = stdIn.nextInt();

		//クラス数を行とした行列を生成する。
		int[][] score = new int[clas][];

		//クラス毎の合計点を求めるための配列を生成する。
		int[] sumScore = new int[clas];

		//1クラス当たりの人数の入力を行い、それに対応した行列を生成する。
		for(int i = 0; i < clas; i++) {
			//1クラス当たりの人数の入力。
			System.out.print((i + 1) + "組の人数：");
			person = stdIn.nextInt();

			//1クラス当たりの人数を列とした配列を作成。
			score[i] = new int[person];

			//一人ずつの点数を入力していく。
			for(int j = 0; j < person; j++) {
				System.out.print((i + 1) + "組の" + (j + 1) + "番の点数：");
				sumScore[i] += stdIn.nextInt();

			}
		}

		//求めた合計点よりクラスごとの平均点を求めて表示する。
		System.out.println("組    合計  平均");
		for(int i = 0; i < clas; i++) {
			System.out.printf("%d組%6d%6.1f\n", (i + 1), sumScore[i], ((double)sumScore[i] / person));
		}

		//全体の合計点と平均点を求める。
		System.out.printf("計%7d%6.1f", (sumScore[0] + sumScore[1]), ((double)(sumScore[0] + sumScore[1]) / 5));

		stdIn.close();
	}
}
