public class AddBinary {
    public static void main(String[] args) {
        String s1="11";
        String s2="1";
        char[] s1array=s1.toCharArray();
        char[] s2array=s2.toCharArray();
        int i=s1array.length-1,j=s2array.length-1;
        int carry=0;
        int num1=0,num2=0,sum=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            num1 = (i >= 0) ? s1array[i] - '0' : 0;
            num2 = (j >= 0) ? s2array[j] - '0' : 0;
        
                sum=num1+num2+carry;
                int digit=sum%2;
                carry=sum/2;
                i--;
                j--;

    
    
    sb.append((char)(digit+ '0'));
}
System.out.print(sb.reverse().toString());
}
}
