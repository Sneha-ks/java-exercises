package exercises;

public class PrintWord {
    public static void main(String[] args){
        String[] words = {"mail","roman","print","care","subside","falls","knight"};
        CountFive(words);

    }
    public static void CountFive(String[] words){
        for(int i=0; i<words.length;i++){
            if(words[i].length() == 5){
                System.out.println(words[i]);
            }
        }
    }
}
