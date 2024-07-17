package Easy;

public class OtherProd {
    public static String OtherProducts(int[] arr) {
        int []nwlist=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int total=1;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }else{
                    total*=arr[j];
                }
            }
            nwlist[i]=total;
        }
        // Creating a string to generate our required result
        StringBuilder result = new StringBuilder();

        for (int x = 0; x < arr.length; x++) {
            result.append(nwlist[x]);
            if (x != arr.length - 1) {
                result.append('-');
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };

        System.out.println(OtherProducts(A));
    }
}
