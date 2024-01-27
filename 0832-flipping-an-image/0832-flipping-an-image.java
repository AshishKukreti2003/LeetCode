class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        // Step 1: Flip the image horizontally
        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1;
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }

        // Step 2: Invert the image
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }

        return image;
    }
}
