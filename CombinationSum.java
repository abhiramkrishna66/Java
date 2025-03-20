import java.util.ArrayList;
import java.util.List;
public class CombinationSum{
    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        backtrack(candidates,target,0,res,comb);
        return res;
    }
    private static void backtrack(int[] candidates,int target,int start,List<List<Integer>> res,List<Integer> comb){
      if(target==0){
        res.add(new ArrayList<>(comb));
        return;
      }
      if(target<0){
        return;
      }
      for(int i=start;i<candidates.length;i++){
        comb.add(candidates[i]);
        backtrack(candidates, target-candidates[i], i, res, comb);
        comb.remove(comb.size()-1);
      }
    }
    public static void main(String[] args) {
        int[] candidates={3,4,5,6};
        int target=7;
        System.out.println(combinationSum(candidates, target));
    }
}
