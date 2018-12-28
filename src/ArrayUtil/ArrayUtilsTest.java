package ArrayUtil;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {10, 11, 12, 13};
		double[] d1 = ArrayUtils.intToDouble(a1);
		for(double d : d1) {
			System.out.print(d + " ");
		}
		
		System.out.println("");
		
		
		double[] d2 = {10.1, 11.1, 12.2, 13.2};
		int[] a2 = ArrayUtils.doubleToInt(d2);
		for(int a : a2) {
			System.out.print(a + " ");
		}

		System.out.println("");

		
		int[] a3 = ArrayUtils.concat(a1, a2);
		for(int a : a3) {
			System.out.print(a + " ");
		/* 출력 결과
		10.0 11.0 12.0 13.0 
		10 11 12 13 
		10 11 12 13 10 11 12 13 
		 */
		}
	}
}
