public class Reverse_And_Spaces {
    public static void main(String[] args) {
        String input="I love  Java Programming";
        String[] words=input.trim().split("\\s+");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<words.length;i++){
            str.append(words[i]);
            if(i>0){
                str.append(" ");
            }
        }
        System.out.print(str.toString());
    }
}
