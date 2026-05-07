package practice.linearsearch;

public class SearchInString {
    static boolean linearSearch(String str, char target){
//        char[] chars = str.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if(String.valueOf(target).equalsIgnoreCase(String.valueOf(chars[i]))){
//                return true;
//            }
//        }

        for(char c : str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Neha";
        char target = 'e';
        if(linearSearch(str, target)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
