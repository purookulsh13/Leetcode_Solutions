public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> li = new ArrayList<List<Integer>>();
    LinkedList<Integer> comb = new LinkedList<Integer>();
    backtrace(target,comb,0,candidates,li);
    return li;
}

public void backtrace(int target,LinkedList<Integer> comb,int start,int[] candidates,List<List<Integer>> li){
    if(target==0){
        li.add(new ArrayList<Integer>(comb));
        return;
    }
    else if(target<0){
        return;
    }
    for(int i=start;i<candidates.length;++i){
        comb.add(candidates[i]);
        backtrace(target-candidates[i],comb,i,candidates,li);
        comb.removeLast();
    }
}