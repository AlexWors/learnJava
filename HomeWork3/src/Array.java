public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int num = 0;
        num = array[0];
        array[0] = array[array.length - 1];
        array[4] = num;

        System.out.println(array[0] + array[array.length - 2]);
    }
}
