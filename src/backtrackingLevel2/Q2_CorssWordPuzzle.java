package backtrackingLevel2;

public class Q2_CorssWordPuzzle {
    static boolean solved = false;

    public static void solve(char arr[][], String[] words, int idx){
        if(solved) return;
        if(idx==words.length){
//            display(arr);
//            System.out.println("--------------------");
            solved=true;
            return;
        }
        String word=words[idx];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='-' || arr[i][j]==word.charAt(0)){
                    if(canPlaceWordHorizontally(arr, word, i, j)){
                        boolean placedWord[]= placedWordHorizontally(arr, word, i, j);
                        solve(arr, words, idx+1);
                        if(!solved){
                            unplaceWordHorizontally(arr, placedWord, i, j);
                        }
                    }
                    if(canPlaceWordVertically(arr, word, i, j)){
                        boolean placedWord[]= placedWordVertically(arr, word, i, j);
                        solve(arr, words, idx+1);
                        if(!solved){
                            unplaceWordVertically(arr, placedWord, i, j);
                        }
                    }
                }
            }
        }
    }

    public static boolean canPlaceWordVertically(char arr[][], String word, int i, int j){
        if(i-1>=0 && arr[i-1][j]=='+') return false;
        else if(i + word.length() < arr.length && arr[i + word.length()][j]!='+') return false;

        for(int space=0;space<word.length();space++){
            if(i + space >= arr.length) return false;
            if(arr[i + space][j] !='-' && arr[i + space][j]!=word.charAt(space)) return false;
        }
        return true;
    }

    public static boolean[] placedWordVertically(char arr[][], String word, int i, int j){
        boolean placedWord[]=new boolean[word.length()];
        for(int space=0;space<word.length();space++){
            if(arr[i + space][j]=='-'){
                arr[i + space][j]=word.charAt(space);
                placedWord[space]=true;
            }
        }
        return placedWord;
    }

    public static void unplaceWordVertically(char [][] arr, boolean placedWord[], int i, int j){
        for(int place=0;place<placedWord.length;place++){
            if(placedWord[place]==true){
                arr[i + place][j]='-';
            }
        }
    }

    public static boolean canPlaceWordHorizontally(char arr[][], String word, int i, int j){
        if(j-1>=0 && arr[i][j-1]=='+') return false;
        else if(j + word.length() < arr[0].length && arr[i][j+word.length()]!='+') return false;

        for(int space=0;space<word.length();space++){
            if(j + space >= arr[0].length) return false;
            if(arr[i][j + space] !='-' && arr[i][j + space]!=word.charAt(space)) return false;
        }
        return true;
    }

    public static boolean[] placedWordHorizontally(char arr[][], String word, int i, int j){
        boolean placedWord[]=new boolean[word.length()];
        for(int space=0;space<word.length();space++){
            if(arr[i][space + j]=='-'){
                arr[i][space + j]=word.charAt(space);
                placedWord[space]=true;
            }
        }
        return placedWord;
    }

    public static void unplaceWordHorizontally(char [][] arr, boolean placedWord[], int i, int j){
        for(int place=0;place<placedWord.length;place++){
            if(placedWord[place]==true){
                arr[i][place + j]='-';
            }
        }
    }

    public static void display(char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board1 = {
                {'+', '-', '+', '-', '-', '-', '+', '+', '+', '+'},
                {'+', '-', '+', '-', '+', '-', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '+', '-', '-', '-', '+', '+'},
                {'+', '-', '+', '-', '+', '+', '+', '-', '+', '+'},
                {'+', '-', '+', '-', '-', '-', '+', '-', '-', '+'},
                {'+', '-', '+', '-', '+', '-', '+', '+', '-', '+'},
                {'+', '-', '+', '-', '+', '-', '-', '-', '-', '+'},
                {'+', '-', '-', '-', '+', '+', '+', '-', '+', '+'},
                {'+', '-', '+', '-', '-', '-', '-', '-', '+', '+'},
                {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'}
        };

        String[] words1 = {"CAT", "DOG", "RAT"};


        solve(board1, words1, 0);
        display(board1);
    }

}
