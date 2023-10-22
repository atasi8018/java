public class First {
    public static void main(String[] args) {
        String str="Tree is important for environment";
        String[] words = str.split(" ");
        String revword="";
        for (String word: words) {
            for (int i=word.length()-1;i>=0;i--){
                revword +=word.charAt(i);
            }
            revword +=" ";
        }
        System.out.println(revword);
    }
}
