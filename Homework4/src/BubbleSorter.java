import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class BubbleSorter {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
for(int j=0; j<a-1;a--) {
    for (int i = 0; i < a - 1; i++) {
        if (parseInt(args[i]) > parseInt(args[i + 1])) {
            String b = args[i];
            args[i] = args[i + 1];
            args[i + 1] = b;
        }
    }
}
            System.out.println(Arrays.toString(args));

    }
}