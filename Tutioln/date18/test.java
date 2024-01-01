package Tutioln.date18;

public class test {
        public static int getLeastWaterContainer(int[] height) {

//            int maxArea = maxArea(height);
//            System.out.println(maxArea);
            int leastWater = Integer.MAX_VALUE;
            for (int i = 0; i < height.length; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    int currentArea = Math.min(height[i], height[j]) * (j - i);
                    if (currentArea < leastWater) {
                        leastWater = currentArea;
                    }
                }
            }
            return (leastWater);
        }

        public static void main(String[] args) {
            int[] height = {8, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println(getLeastWaterContainer(height));
        }
}
