public class smallest_lett {
    public static void main(String args[]) {
        char arr[] = {'c', 'e', 'f', 'j', 'l'};
        char target = 'a';
        char ans = small_character(arr, target);
        System.out.println(ans);
    }

    static char small_character(char ar[], char tar) {
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar < ar[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }

        return ar[start%ar.length];
    }
}

