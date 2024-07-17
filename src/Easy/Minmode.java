package Easy;

import java.util.HashMap;
import java.util.Map;

public class Minmode {
    public static int meanMode(int[] arr) {
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int avg=sum/arr.length;

        Map<Integer,Integer>map=new HashMap<>();
        int modecnt=0;
        int mode=0;
        for(int num:arr){
                map.put(num,map.getOrDefault(num,0)+1);
                if(map.get(num)>modecnt){
                    modecnt=map.get(num);
                    mode=num;
                }
    }
        return (mode==avg)?1:0;
}


        public static void main(String[] args) {
            int[] A = {1, 2, 3}; // 0
            int[] B = {4, 4, 4, 6, 2}; // 1
            int[] C = {5, 3, 3, 3, 1}; // 1

            System.out.println(meanMode(A));
            System.out.println(meanMode(B));
            System.out.println(meanMode(C));
        }
    }
