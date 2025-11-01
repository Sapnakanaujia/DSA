class Solution {
    public int minJumps(int[] arr) {
        int n= arr.length;
        if(n==1) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
        map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);

        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited=new boolean[n];
        queue.offer(0);
        visited[0]= true;

        int steps=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int curr=queue.poll();
                if(curr==n-1) return steps;
                int left=curr-1;
                int right=curr+1;

                if(curr==n-1)
                    return steps;
                
                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    queue.offer(curr - 1);
                }
                if (curr + 1 < n && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    queue.offer(curr + 1);
                }
                if (map.containsKey(arr[curr])) {
                    for (int idx : map.get(arr[curr])) {
                        if (!visited[idx]) {
                            visited[idx] = true;
                            queue.offer(idx);
                        }
                    }
                    map.remove(arr[curr]);
                }
            }
            steps++;
        }
        return -1;
    }
}