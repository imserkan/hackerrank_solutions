package sislamoglu.in.count_triplets;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(Solution.countTriplets(new ArrayList<>(Arrays.asList(1L, 2L, 2L, 4L)), 2) == 2L);
//        System.out.println(Solution.countTriplets(new ArrayList<>(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L)), 3) == 6L);
//        System.out.println(Solution.countTriplets(new ArrayList<>(Arrays.asList(1L, 5L, 5L, 25L, 125L)), 5) == 4L);
        Solution.countTriplets(new ArrayList<>(Arrays.asList(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L)), 1);
    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Integer> arrayMap = new HashMap<>();
        for (Long val: arr){
            Integer count = arrayMap.getOrDefault(val, 0);
            arrayMap.put(val, ++count);
        }
        Set<Long> indices = new HashSet<>();
        arr.stream().forEach(val -> {
            indices.add(val);
        });
        arr = new ArrayList<>(indices);
        Collections.sort(arr);

        long result = 0;
        for (int i = 0; i <= arr.size()-3; i++){
            result += arrayMap.get(arr.get(i)) * arrayMap.get(arr.get(i+1)) * arrayMap.get(arr.get(i+2));
        }
        return result;
    }

}
