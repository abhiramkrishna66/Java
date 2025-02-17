public class NamePattern {
    public static void main(String[] args) {
        String name = "ABHIRAM";
        for (char c : name.toCharArray()) {
            printPattern(c);
            System.out.println();
        }
    }
    
    public static void printPattern(char c) {
        int size = 7; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isPartOfPattern(c, i, j, size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static boolean isPartOfPattern(char c, int i, int j, int size) {
        if (c == 'A') return i == 0 || j == 0 || j == size - 1 || i == size / 2;
        if (c == 'B') return j == 0 || (j == size - 1 && i != 0 && i != size - 1 && i != size / 2) || i == 0 || i == size / 2 || i == size - 1;
        if (c == 'H') return j == 0 || j == size - 1 || i == size / 2;
        if (c == 'I') return i == 0 || i == size - 1 || j == size / 2;
        if (c == 'R') return j == 0 || (i == 0 && j != size - 1) || (i == size / 2 && j != size - 1) || (j == size - 1 && i < size / 2) || (i > size / 2 && i - j == size / 2 - 1);
        if (c == 'M') return j == 0 || j == size - 1 || (i == j && i <= size / 2) || (i + j == size - 1 && i <= size / 2);
        return false;
    }
}
