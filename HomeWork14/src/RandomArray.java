public class RandomArray {
    public static void main(String[] args) {
        int minNum = 20;
        int maxNum = -20;
        int[] array = new int[15];
        int maxNumMod;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 42 - 21);
            if (minNum > array[i]) minNum = array[i];
            if (maxNum < array[i]) maxNum = array[i];
        }

        System.out.printf("max: %d\nmin: %d\n", maxNum, minNum);

        if (minNum < 0) {
            if (minNum * (-1) > maxNum) {
                maxNumMod = minNum;
            } else maxNumMod = maxNum;
        }
        else if (minNum > maxNum) {
            maxNumMod = minNum;
        } else maxNumMod = maxNum;
        System.out.printf("Большее по модулю: %d", maxNumMod);
    }
}

