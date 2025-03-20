import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CombinationSum2{
    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        Arrays.sort(candidates);
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
        if(i>start && candidates[i]==candidates[i-1]){
            continue;
        }
        comb.add(candidates[i]);
        backtrack(candidates, target-candidates[i], i+1, res, comb);
        comb.remove(comb.size()-1);
      }
    }
    public static void main(String[] args) {
            int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum(candidates, target));
    }
} 
    
