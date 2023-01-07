public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> li = new ArrayList<List<Integer>>();
    LinkedList<Integer> comb = new LinkedList<Integer>();
    backtrace(k,n,comb,0,li);
    return li;
}

public void backtrace(int k,int n,LinkedList<Integer> comb,int start,List<List<Integer>> li){
    if(n==0 && comb.size()==k){
        li.add(new ArrayList<Integer>(comb));
        return;
    }
    else if(n<0 || comb.size()==k){
        return;
    }
    for(int i=start;i<9;++i){
        comb.add(i+1);
        backtrace(k,n-i-1,comb,i+1,li);
        comb.removeLast();
    }
}