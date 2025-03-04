public class Reverse_And_Spaces{
    public static void main(String[] args) {
        String str=" I LOVE  JAVA    PROGRAMMING   ";
        String[] words=str.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
