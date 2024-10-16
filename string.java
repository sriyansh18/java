public class string {
    // public static int compare(String s1,String s2){
    //     if(s1.equals(s2)){
    //         return 0;
    //     }
    //     else if (s1.length()<s2.length()) {
    //         return -1;
    //     }
    //     else {
    //         return 1;
    //     }
    // }
    // public static boolean ifpal(String s1){
    //     String temp="";
    //     for(int i=s1.length()-1;i>=0;i--){
    //         temp+=s1.charAt(i);
    //     }
    //     if(temp.equals(s1)){
    //         return true;
    //     }
    //     else return false;
    // }
    // public static boolean ifpalpointer(String s1) {
    //     int left = 0;
    //     int right = s1.length() - 1;

    //     while (left < right) {
    //         if (s1.charAt(left) != s1.charAt(right)) {
    //             return false; // Characters don't match
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true; // All characters matched
    // }

    //Finding good string using ASCII values
    
    // public static int goodstr(String s1){
    //     int asciiValue=0;
    //     int current =0;
    //     int count=0;
    // char[] vowels={'A','a','E','e','I','i','O','o','U','u'};
    //     System.out.println("Vowel ASCII Values:");
    //     for (char vowel : vowels) {
    //         asciiValue= (int) vowel;
    //         for(int i=0;i<=s1.length()-1;i++){
    //             int a=s1.charAt(i);
    //             if( a==asciiValue){
    //                 current++;
    //             }
    //             if(count <current ){
    //                 count++;
    //             }
    //     }
    //     }
    //     return count;
    // }
    // public static String reverse(String s1){
    //     char[] charArray = s1.toCharArray();
    //     int left=0;
    //     int right=s1.length()-1;
    //     while(left<right){
    //         char temp= charArray[left];
    //         charArray[left]=charArray[right];
    //         charArray[right]=temp;
    //         left++;
    //         right--;
    //     }
    //     return new String(charArray);
    // }

    // check if palindrome

    // public static boolean checkifpalind(String s2){
    //     char[] charArray = {};
    //     int left=0;
    //     int right=s2.length()-1;
    //     while(left<right){
    //         if(s2.charAt(left)!=s2.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;  
    //     }
    //     return true;  
    // }
    
    //chaeck the most ocurring element in a sorted string

    // public static char mostoccurinsorted(String s3){
    //     char maxchar=s3.charAt(0);
    //     int count=1;
    //     int maxcount=1;
    //     for(int i=1;i<s3.length()-1;i++){
    //         if(s3.charAt(i)==s3.charAt(i-1)){
    //             count++;
    //         }
    //         else {
    //             if(count>maxcount){
    //                 maxcount=count;
    //                 maxchar=s3.charAt(i-1);
    //             }
    //             count=1;
    //         }
    //     }    
    //     if (count>maxcount){
    //         maxchar=s3.charAt(s3.length()-1);
    //     }
    //     return maxchar;
    // }

    //reverse the sentence

    public static String reversesentence(String s4){
        char[] charArray = s4.toCharArray();
        int left=0;
        int right=s4.length()-1;
        while(left<right){
            if (s4.charAt(right)!=' ') {
                char temp= charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
            }
            left++;
            right--;
        }
        return new String(charArray);
    }


    


    public static void main(String[] args){
        String s1="AaiouE";
        String s2="mom";
        String s3="bscsbcansdaa";
        String s4="Hello there how you doing";
        String result=reversesentence(s4);
        System.out.println(result);
        // char result= mostoccurinsorted(s3);
        // System.out.println(result);
        // boolean result = checkifpalind(s2);
        // System.out.println(result);
        // String result= reverse(s1);
        // System.out.println(result);
        // int result=goodstr(s1);
        // System.out.println(result);
        // boolean result=ifpal(s1);
        // System.out.println(result);
        // boolean resul=ifpalpointer(s1);
        // System.out.println(resul);
        // int result=(compare(s1, s2));
        // System.out.println(result);
    }
}
