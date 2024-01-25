class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length + 1]; // Increased the size by 1
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            result[i + 1] = sum; // Store cumulative sum in the next index
        }

        int maxAltitude = 0;
        for (int i = 0;i<result.length;i++) {
            maxAltitude = Math.max(maxAltitude, result[i]);
        }

        return maxAltitude;
    }
}
