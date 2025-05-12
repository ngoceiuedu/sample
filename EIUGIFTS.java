import java.util.*;

class EIUGIFTS {
    static Scanner sc = new Scanner(System.in);

    static public void main(String[] args) {
        var N = sc.nextInt();
        var K = sc.nextInt();
        var items = new int[N];

        for (var i = 0; i < N; i++) {
            items[i] = sc.nextInt();
        }

        var max = 0;
        var minDifference = Integer.MAX_VALUE / 2;
        for (var i = 0; i < N; i++) {
            for (var j = i + 1; j < N; j++) {
                if (max < items[i] + items[j] && items[i] + items[j] <= K) {
                    max = items[i] + items[j];
                    minDifference = Math.abs(items[j] - items[i]);
                } else if (max == items[i] + items[j] 
                            && minDifference > Math.abs(items[j] - items[i])) {
                    minDifference = Math.abs(items[j] - items[i]);
                }
            }
        }

        System.out.println(max + " " + minDifference);
    }
}