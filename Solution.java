class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //solution with memoization
        Map <Integer, Integer> map= new HashMap<>();
        return minCostClimbingStairs(cost,cost.length,map,0);
        
    }
    
    public int minCostClimbingStairs(int[] cost, int stair, Map<Integer,Integer> map, int result){
        if (stair==0|| stair==1){return result;}
        if(map.containsKey(stair)){ return map.get(stair); }
		int result1 = minCostClimbingStairs(cost,stair-1,map, cost[stair-1]);
		int result2 = minCostClimbingStairs(cost,stair-2,map, cost[stair-2]);

		result = result + Math.min( result1, result2 );        
		map.put(stair, result);
		return result;
    }
}
