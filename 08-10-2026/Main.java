public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        String txt = args[0];
        // System.out.println(txt);
        System.out.println("Reversed String : " + obj.reverseString_and_isPalindrome(txt));
    }
    public boolean isVowel(char x){
        return x=='a'|| x=='e'||x=='i'||x=='o'||x=='u';
    }
    public String reverseString_and_isPalindrome(String txt) {
        char[] strArr = txt.toCharArray();
        boolean flag = true;
        int vowelCount = 0;

        for (int i = 0; i < strArr.length / 2; i++) {

            int j = strArr.length - i - 1;

            if (strArr[i] != strArr[j]) {
                flag = false;
            }

            if (isVowel(strArr[i])) {
                vowelCount++;
            }

            if (isVowel(strArr[j])) {
                vowelCount++;
            }

            char temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
        }

        // Handle middle character for odd length
        if (strArr.length % 2 != 0 && 
            isVowel(strArr[strArr.length / 2])) {
            vowelCount++;
        }

        System.out.println("Palindrome: " + flag);
        System.out.println("Number of Vowels: " + vowelCount);

        return String.valueOf(strArr);
    }
    // public String reverseString_and_isPalindrome(String txt) {
    //     char[] strArr = txt.toCharArray();
    //     boolean flag = true;
    //     int vowelCount = 0;

    //     for (int i = 0; i <= strArr.length / 2; i++) {

    //         if (strArr[i]!=strArr[strArr.length-i-1]){
    //             flag = false;
    //         }
    //         if (isVowel(strArr[i])) {
    //             vowelCount++;
    //         }

    //         // Vowel check - right
    //         if (strArr[strArr.length - i - 1] != strArr[i] && isVowel(strArr[strArr.length - i - 1])) {
    //             vowelCount++;
    //         }

    //         char temp = strArr[i];

    //         strArr[i] = strArr[strArr.length - i - 1];

    //         strArr[strArr.length - i - 1] = temp;
    //     }
    //     if (strArr.length % 2 != 0 && isVowel(strArr[strArr.length / 2])) {
    //         vowelCount++;
    //     }
    //     System.out.println("Palindrome: " + flag);
    //     System.out.println("Number of Vowels : "+ vowelCount);

    //     return String.valueOf(strArr);
    // }

    
}