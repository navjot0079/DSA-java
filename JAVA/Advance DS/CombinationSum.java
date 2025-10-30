import java.util.ArrayList;
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        combinationSum(candidates, target,0, new ArrayList<>(), result);
        System.out.println(result);
    }
    
    private static void combinationSum(int[] candidates, int target, int start, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            combinationSum(candidates, target, start, current, result);
            current.remove(current.size() - 1);
        }
    }
}
