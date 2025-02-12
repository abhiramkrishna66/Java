class Prime{
    static boolean CheckPrime(int num){
         int count=0;
         if (num == 0 || num == 1) {
            return false; 
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;  
            }
        }
         if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        for(int j=0;j<=100;j++){
            if(CheckPrime(j))
            {
                System.out.println(j+"");
        }
    }
}}
