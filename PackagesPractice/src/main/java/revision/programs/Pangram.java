package revision.programs;

public class Pangram {

    public boolean isPangram(String str){
        boolean [] flag = new boolean[26];
        int index = 0;
        for(int i = 0; i<str.length(); i++){
            if(('A' <= str.charAt(i)) && ('Z' >= str.charAt(i)))
                index = str.charAt(i) - 'A';
            else if(('a' <= str.charAt(i)) && ('z' >= str.charAt(i)))
                index = str.charAt(i) - 'a';
            else
                continue;
            flag[index] = true;
        }

        for(boolean f : flag){
            if(!f)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Pangram pangram = new Pangram();
        System.out.println(pangram.isPangram("The quick brown fox jumps over the lazy dog"));
    }

}
