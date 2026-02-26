public class PalindromeCheckerApp {
    public static void main(String[] args){
        String phrase = "madam";
        int i,n,flag=0;
        n = phrase.length();
        for(i=0;i<n;i++)
        {
            if(phrase.charAt(i)!=phrase.charAt(n-i-1))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("pallindrom :true");
        }
        else{
            System.out.println("pallindrom :false");
        }
    }
}