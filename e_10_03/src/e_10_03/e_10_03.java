/*演習10-3
 * 最小値及び最大値を求めるメソッドを集めたユーティリティクラスを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_03;

public class e_10_03 {

	//二値の最小値を求めて返すメソッド。
	public static int min(int min1, int min2) {
		int tmp = min1;		//最小値を求める際の一時的な置き場。

		//最小値を判定するための分岐。
		if(tmp > min2) {
			tmp = min2;
		}

		//求めた最小値を返す。
		return min2;
	}

	//三値の最小値を求めて返すメソッド。
	public static int min(int min1, int min2,int min3) {
		int tmp = min1;		//最小値を求める際の一時的な置き場。

		//最小値を判定するための分岐。
		if(tmp > min2) {
			tmp = min2;
		}

		if(tmp > min3){
			tmp = min3;
		}

		//求めた最小値を返す。
		return tmp;
	}

	//配列の最小値を求めて返すメソッド。
	public static int min(int[] min) {
		int tmp = min[0];		//最小値を求める際の一時的な置き場。

		//最小値を判定するための分岐。
		for(int i = 1; i < min.length; i++) {
			if(tmp > min[i]) {
				tmp = min[i];
			}
		}

		//求めた最小値を返す。
		return tmp;
	}

	//二値の最大値を求めて返すメソッド。
	public static int max(int max1, int max2) {
		int tmp = max1;		//最大値を求める際の一時的な置き場。

		//最大値を判定するための分岐。
		if(tmp < max2) {
			tmp = max2;
		}

		//求めた最大値を返す。
		return max2;
	}

	//三値の最大値を求めて返すメソッド。
	public static int max(int max1, int max2,int max3) {
		int tmp = max1;		//最大値を求める際の一時的な置き場。

		//最大値を判定するための分岐。
		if(tmp < max2) {
			tmp = max2;
		}

		if(tmp < max3){
			tmp = max3;
		}

		//求めた最大値を返す。
		return tmp;
	}

	//配列の最大値を求めて返すメソッド。
	public static int max(int[] max) {
		int tmp = max[0];		//最大値を求める際の一時的な置き場。

		//最大値を判定するための分岐。
		for(int i = 1; i < max.length; i++) {
			if(tmp < max[i]) {
				tmp = max[i];
			}
		}

		//求めた最大値を返す。
		return tmp;
	}
}
