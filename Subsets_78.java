public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> li = new ArrayList<>();
    backtrack(nums,0,new ArrayList<Integer>(),li); 
    return li;
 }

 public void backtrack(int[] nums,int start,List<Integer> track,List<List<Integer>> li){
     li.add(new ArrayList<>(track));
     for(int i=start;i<nums.length;i++){
         track.add(nums[i]);
         backtrack(nums,i+1,track,li);
         track.remove(track.size()-1);
     }
 }