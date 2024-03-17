public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        System.out.println(Integer.toString(169, 2));
        System.out.println(bg.solution(169));
    }

    /***
     *
     * @param N
     * @return longest sequence of zeros in binary representation of an integer N.
     */
    public int solution(int N) {
        String binStr = Integer.toString(N, 2);
        int gapCount = 0;
        int maxGapCount = 0;
        for (char c : binStr.toCharArray()) {
            if (c == '1') {
                if (maxGapCount < gapCount) {
                    maxGapCount = gapCount;
                }
                gapCount = 0;
            }
            if (c == '0') {
                gapCount++;
            }
        }
        return maxGapCount;
    }
}
