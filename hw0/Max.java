public class Max {
	/** Returns the maximum value from m. */
	public static int max(int[] m){
		int max = 0;
		int i = 0; //initialization
		if(m.length == 0) {
			return 0;
		}
		while (i < m.length) {
			if (m[i] > max) {
				max = m[i];
			}
			i++;
		}
		return max;
	}

    public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      int result = max(numbers);
    }

}