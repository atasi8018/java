import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        String firststring ="listiorn";
        String secondstring ="silent";
        char[] arr1 = firststring.toCharArray();
        char[] arr2 = secondstring.toCharArray();
        boolean flag = isAnagram(arr1, arr2);
        if(flag==true)
            System.out.println("The string is anagram");
        else System.out.println("The string is not anagram");
    }

    private static boolean isAnagram(char[] arr1, char[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i <arr1.length; i++) {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
