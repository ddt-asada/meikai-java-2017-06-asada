/*演習15-5
 * 3人でじゃんけんを行うプログラムを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_15_05;
import java.util.Random;
import java.util.Scanner;

public class e_15_05 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		//手を表す文字列の配列を作る。
		String[] hands = {"グー", "チョキ", "パー"};
		int retry;		//繰り返しを判定する整数。
		int comp1;		//コンピュータの手を選択するための乱数を格納する整数。
		int comp2;		//コンピュータの手を選択するための乱数を格納する整数。
		int judge1;		//じゃんけんの結果の判定の一つ目。
		int judge2;		//じゃんけんの結果の判定の二つ目。
		int user;		//プレーヤーの手を決める整数。

		do {
			//コンピュータの手を乱数により決定。
			comp1 = rand.nextInt(3);
			comp2 = rand.nextInt(3);

			do {
				System.out.print("じゃんけんポン");
				//プレイヤーの手を選択する。
				for(int i = 0; i < 3; i++) {
					System.out.printf("(%d)%s ", i, hands[i]);
				}
				System.out.print("：");
				user = stdIn.nextInt();
			} while(user < 0 || user > 2);

			//両者の手を表示
			System.out.println("CPU1は" + hands[comp1] + "で、CPU2は" + hands[comp2] + "で、あなたは" + hands[user] + "です。");

			//判定を行う
			//あいこの場合そのまま引き分けですと表示し、あいこでない場合は誰が勝っているかを判定する。
			judge1 = user + comp1 + comp2;
			judge2 = (user - comp1 + 3) % 3;
			switch(judge1) {
			case 0:
			case 3:
			case 6:	System.out.println("引き分けです。");				break;
			case 2:
			case 5:
				switch(judge2) {
				case 0:	System.out.println("CPU2の一人勝ちです。");		break;
				case 1:	System.out.println("CPU1の一人勝ちです。");		break;
				case 2:	System.out.println("あなたの一人勝ちです。");	break;
				}break;
			case 1:
			case 4:
				switch(judge2) {
				case 0:	System.out.println("あなたとCPU1の勝ちです。");	break;
				case 1:	System.out.println("CPU1とCPU2の勝ちです。");	break;
				case 2:	System.out.println("あなたとCPU2の勝ちです。");	break;
				}break;
			}

			//もう一度行うかどうかを確認。
			do {
				System.out.print("もう一度？(0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);

		stdIn.close();
	}
}
