package LeetCode;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/8/27 21:49
 * @×¢ÊÍ
 */

public class T_605 {

    public static void main(String[] args) {

        canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 1) {
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        if (n > 0) {
            return false;
        }
        return true;
    }
}
