import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args){
        // TODO: Read N
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        // TODO: Read N strings into an array
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLine();
        }
        // TODO: Find the longest common prefix
        // Hint: Start with the first string as the 'prefix'. 
        // Iterate through the rest, shortening the 'prefix' until it matches the start of the current string.
        String prefix = arr[0];
        for(int i=1;i<N;i++){
            while(!arr[i].startsWith(prefix)){ prefix=prefix.substring(0, prefix.length()-1);
            if(prefix.isEmpty()) {System.out.print("-1"); return;}
            }
        }
        if(prefix.isEmpty()) {System.out.print("-1"); return;}
        System.out.print(prefix);
        // TODO: If prefix is empty, print "-1", otherwise print the prefix.
    }
}
