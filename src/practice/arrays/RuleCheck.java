package practice.arrays;

import java.util.Arrays;
import java.util.List;

public class RuleCheck {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };

        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(index).equalsIgnoreCase(ruleValue)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}
