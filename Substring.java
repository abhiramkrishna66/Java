public class Substring {
    public static void main(String[] args) {
        int a[] = {1, 1, 0, 1, 1, 0};
        int b[] = {1, 0, 1};
        
        int count = 0;
        int min = Math.min(a.length, b.length);
        int index = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (index < b.length && a[i] == b[index]) {
                count++;
                index++;
            }
        }

       
        if (count == b.length) {
            System.out.println("This is a subsequence of Array A");
        } else {
            System.out.println("Not a subsequence of A");
        }
    }
}
