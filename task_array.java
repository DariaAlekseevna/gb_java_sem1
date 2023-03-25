/*
 * Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1] 
 * вывести максимальное количетво подряд идущих едениц
 */

public class task_array {
    
    public static void main(String[] args) {
        
        int[] arr = new int[] {1, 0, 1, 1, 0, 0, 1, 1, 1};
        int k = 0;
        int maxk = 0;
        for (int i : arr) {
            if (i == 1) {
                k++;
                if (k > maxk) {
                    maxk = k;
                }
            } else k = 0;
        }
        System.out.println(maxk);


    }
}
