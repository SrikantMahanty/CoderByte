package Medium;

import java.util.HashMap;
import java.util.Map;

public class Simplemode {

    public static  int simpleMode(int[] arr){
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int mode=-1;
        int Frequencycnt=-1;
        for(int num:arr){
            if(map.get(num)>Frequencycnt){
                Frequencycnt=map.get(num);
                mode=num;
            }
        }
        if(Frequencycnt==0){
            return -1;
        }
        return mode;

    }

    public static void main(String[] args) {
        int[] arr1 = {10, 4, 5, 2, 4};
        int[] arr2 = {5, 10, 10, 6, 5};

        System.out.println(simpleMode(arr1)); // Output: 4
        System.out.println(simpleMode(arr2)); // Output: 5
    }
}
