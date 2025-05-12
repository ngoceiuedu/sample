import java.util.*;

public class Sample1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var n = sc.nextInt();
        for (var i = 0; i < n; i++) {
            var num = sc.nextInt();
            if (num < 10) {
                System.out.println(num);
            } else {
                System.out.println(num - 10);
            }
        }
    }
}