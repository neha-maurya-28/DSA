package practice.arrays;

public class Panogram {
    public static boolean checkPanogram(String sentence){
        boolean result = false;
        if(sentence.length()<26){
            return false;
        }
        for(char i = 'a'; i <= 'z'; i++){
            if(sentence.contains(String.valueOf(i))){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjhelazydog";
        System.out.println(checkPanogram(sentence));
    }
}
