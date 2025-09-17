package backtracking;

public class MaxWordScore {
    public static int solution(String[] words, int[] freq, int [] score, int idx) {

        if(idx==words.length){
            return 0;
        }
        int wordSayNo = 0 + solution(words,freq,score,idx+1);

//        wordSayYes
        int wordScore=0;
        String word=words[idx];
        boolean flag=true;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(freq[ch-'a']==0) flag=false;
            freq[ch-'a']--;
            wordScore+=score[ch-'a'];
        }
        int wordSayYes=0;
        if(flag){ // frequency kam nhi h zero se
            wordSayYes+=wordScore+solution(words,freq,score,idx+1);
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        return Math.max(wordSayYes,wordSayNo);
    }
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dad", "good"};
        String letters[] = {"a","a","c","d","d","d","g","o","o"};
        int []score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        int[] freq = new int[26];

        for (String s : letters) {
            char ch = s.charAt(0);
            freq[ch - 'a']++;
        }
        System.out.println(solution(words,freq,score,0));
    }
}
