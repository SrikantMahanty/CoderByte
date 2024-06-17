package Easy;

public class gcf {
    private static  int gcf(int []arr){

        if (arr[0] == 0 || arr[1] == 0) {
            return arr[0] + arr[1];
        }
        return gcf(new int[]{arr[1], arr[0] % arr[1]});

    }
    public static void main(String[] args) {

            var result1 = gcf(new int[]{64, 128, 256, 512});
            System.out.println(result1);
            var result2 = gcf(new int[]{12, 28});
            System.out.println(result2);
        }
    }

