/*演習13-3
 * じゃんけんのプレーヤを表すクラス群を作成する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_13_03;

public class Player extends Hand{
	private int chand;		//どの手を出したかを判定する整数。

	//コンストラクタ
	public Player (int hand) {
		chand = hand;
	}

	public int whand()
	{
		//出した手の判定を行う。
		switch(chand) {
		case 0:	System.out.println("あなたが出した手はグーです。");		break;
		case 1:	System.out.println("あなたが出した手はチョキです。");		break;
		case 2:	System.out.println("あなたが出した手はパーです。");		break;
		}

		//出した手を返す。
		return chand;
	}
}
