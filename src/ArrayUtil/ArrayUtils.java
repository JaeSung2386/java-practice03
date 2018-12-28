package ArrayUtil;

public class ArrayUtils {
	// int 배열을 double 배열로 변환
	public static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];
		for(int n = 0; n < source.length; n++) {
			result[n] = (double)source[n];
		}
		return result;
	}
	
	// double 배열을 int 배열로 변환
	public static int[] doubleToInt(double[] source) {
		int[] result = new int[source.length];
		for(int n = 0; n < source.length; n++) {
			result[n] = (int)source[n];
		}
		return result;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int[] concat( int[] s1, int[] s2 ) {
		int[] result = new int[s1.length+s2.length];
		for(int n = 0; n < s1.length; n++)
			result[n] = s1[n];
		for(int n = s2.length; n < s1.length+s2.length; n++)
			result[n] = s2[n-s2.length];
		return result;
	}
}
