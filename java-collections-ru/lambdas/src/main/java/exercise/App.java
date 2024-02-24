package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        String[][] doubledImage = new String[2 * rows][2 * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                doubledImage[2*i][2*j] = image[i][j];
                doubledImage[2*i][2*j+1] = image[i][j];
                doubledImage[2*i+1][2*j] = image[i][j];
                doubledImage[2*i+1][2*j+1] = image[i][j];
            }
        }

        return doubledImage;
    }
}
// END
