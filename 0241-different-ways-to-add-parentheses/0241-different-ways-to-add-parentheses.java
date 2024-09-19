class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<expression.length();++i){
            char oper = expression.charAt(i);
            if(oper == '+' || oper == '-' || oper == '*'){
                List<Integer> s1 = diffWaysToCompute(expression.substring(0,i));
                List<Integer> s2 = diffWaysToCompute(expression.substring(i+1));
                for(int a: s1){
                    for(int b: s2){
                        if(oper == '+') list.add(a+b);
                        else if(oper == '-') list.add(a-b);
                        else if(oper == '*') list.add(a*b);
                    }
                }
            }
        }
        if(list.isEmpty()){
            list.add(Integer.parseInt(expression));
        }
        return list;
    }
}