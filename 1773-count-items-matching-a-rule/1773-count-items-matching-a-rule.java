class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);

            if ((ruleKey.equals("type") && ruleValue.equals(type)) ||
                (ruleKey.equals("color") && ruleValue.equals(color)) ||
                (ruleKey.equals("name") && ruleValue.equals(name))) {
                count++;
            }
        }

        return count;
    }
}
