public class LeetCode14 {
    public static String checkStringPrefix(String[] myString){
        if(myString == null || myString.length == 0){
            return "";
        }

        String strPrefix = myString[0];
        for(int i=0; i<myString.length; i++){
            while(myString[i].indexOf(strPrefix) != 0){
                strPrefix = strPrefix.substring(0, strPrefix.length() - 1);
                if(strPrefix.isEmpty()) return "";
            }
        }
        return strPrefix;
    }

    public static void main(String[] args) {
        String[] myArray = {"flower", "flow", "fly"};
        System.out.println(checkStringPrefix(myArray));
    }
}
