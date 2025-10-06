package notePad_JAVA;



class CorssWord {
    public static void solve(char[][] arr, String [] words, int idx){
        if(idx==words.length){
            display(arr);
            return;
        }
        String word=words[idx];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='-' || arr[i][j]==word.charAt(0)){
                    if(canPlaceWordHorizontally(arr, word, i, j)) {
                        boolean wePlaced[]=placeWordHorinotally(arr, word, i, j);
                        solve(arr, words, idx + 1);
                        unplaceWordHorizontally(arr,wePlaced , i, j);
                    }
                    if(canPlaceWordVertically(arr, word, i, j)) {
                        boolean wePlaced[]=placeWordVertically(arr, word, i, j);
                        solve(arr, words, idx + 1);
                        unplaceWordVertically(arr, wePlaced, i, j);
                    }
                }
            }
        }
    }
    public static boolean[] placeWordHorinotally(char[][] arr, String word, int i, int j){
        boolean[] wePlaced=new boolean[word.length()];
        for(int jj = 0; jj <word.length(); jj++){
            if(arr[i][j + jj]=='-'){
                arr[i][j + jj]=word.charAt(jj);
                wePlaced[jj]=true;
            }
        }
        return wePlaced;
    }
    public static void unplaceWordHorizontally(char[][] arr, boolean wePlaces[], int i, int j){
        for(int jj=0;jj<wePlaces.length;jj++){
            if(wePlaces[jj]){
                arr[i][j+jj]='-';
            }
        }
    }
    public static boolean[] placeWordVertically(char[][] arr, String word, int i, int j){
        boolean[] wePlaced=new boolean[word.length()];
        for(int ii=0;ii<word.length();ii++){
            if(arr[i+ii][j]=='-'){
                arr[i+ii][j]=word.charAt(ii);
                wePlaced[ii]=true;
            }
        }
        return wePlaced;
    }

    public static void unplaceWordVertically(char[][] arr, boolean wePlaces[], int i, int j){
        for(int ii=0;ii<wePlaces.length;ii++){
            if(wePlaces[ii]){
                arr[i+ii][j]='-';
            }
        }
    }

    public static boolean canPlaceWordVertically(char[][] arr, String word, int i, int j){
        if(i-1>=0 && arr[i-1][j]!='+'){
            return false;
        }else if(i + word.length() < arr.length && arr[i + word.length()][j]!='+'){
            return false;
        }

        for(int ii = 0; ii <word.length(); ii++){
            if(i + ii >= arr.length ){
                return false;
            }
            if(arr[i + ii][j]=='-' || arr[i + ii][j]==word.charAt(ii)){
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public static boolean canPlaceWordHorizontally(char[][] arr, String word, int i, int j){
        if(j-1>=0 && arr[i][j-1]!='+'){
            return false;
        }else if(j + word.length() < arr[0].length && arr[i][j + word.length()]!='+'){
            return false;
        }

        for(int jj = 0; jj <word.length(); jj++){
            if(j + jj >= arr[0].length ){
                return false;
            }
            if(arr[i][j+jj]=='-' || arr[i][j+jj]==word.charAt(jj)){
                continue;
            }else {
                return false;
            }
        }

        return true;
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
        char[][] board2 = {
                {'+', '-', '+', '+', '+'},
                {'+', '-', '-', '-', '+'},
                {'+', '+', '+', '-', '+'},
                {'+', '-', '-', '-', '+'},
                {'+', '+', '+', '-', '+'}
        };
        String[] words2 = {"TREE", "ROCK", "MOON", "STAR"};

        solve(board2, words2, 0);
        display(board2);
    }
}
