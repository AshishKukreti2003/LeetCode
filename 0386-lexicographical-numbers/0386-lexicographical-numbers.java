class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        Collections.sort(list, (a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        return list; 
    }
}