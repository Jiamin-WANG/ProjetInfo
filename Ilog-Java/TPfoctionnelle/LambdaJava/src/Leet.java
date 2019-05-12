import java.util.List;
import java.util.LinkedList;

public class Leet {
    public static List<List<Integer>> output = new LinkedList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        solution(candidates,target,new LinkedList<Integer>(),0);
        return output;
    }
    
    public static void solution(int[] candidates, int target,List<Integer> res,int index){
        if(target == 0){
            List<Integer> tmpList = new LinkedList<>();
            for(int n: res){
                tmpList.add(n);
            }
            output.add(tmpList);
            return;
        }else if(target <=0)
            return;
        else{
            for(int i:candidates){
                int tmp = target - i;
                res.set(index, i);
                solution(candidates, tmp, res,index++);
            }
        }
    }
    
    public static void main(String[]args) {
    	int[] arr = {2,2,3,4};
    	combinationSum(arr,8);
    }
}
