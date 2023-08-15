package problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    public static void main(String args[]){
        String[] nums = { "abc","yyy","def","csv" };

        System.out.println("The smallest missing positive number from the array is "
                + solution(2," "));
    }

    public static  int solution(int N, String S) {

        int [][]seat = new int[N+1][10];
        int num = 0;
        char[] s = S.toCharArray();

        for(int i=0;i<S.length();i++){
            if(s[i]==' ')continue;
            else if(s[i]>='0'&&s[i]<='9')
                num = num*10+s[i]-'0';
            else{
                seat[num][s[i]-'A'] = 1;
                num = 0;
            }
        }
        int ret = 0;
        for(int i=1;i<=N;i++){
            if(seat[i][1]+seat[i][2]+seat[i][3]+seat[i][4]==0){
                seat[i][1] = seat[i][2] = seat[i][3] = seat[i][4] = 1;
                ret++;
            }
            if(seat[i][3]+seat[i][4]+seat[i][5]+seat[i][6]==0){
                seat[i][3] = seat[i][4] = seat[i][5] = seat[i][6] = 1;
                ret++;
            }
            if(seat[i][5]+seat[i][6]+seat[i][7]+seat[i][8]==0){
                seat[i][5] = seat[i][6] = seat[i][7] = seat[i][8] = 1;
                ret++;
            }
        }
        return ret;
    }



        public static int maxLength(String[] A) {
            List<Integer> wordList = new ArrayList<>();
            wordList.add(0);
            
            int result = 0;

            for (String word : A) {
                int a = 0;
                int duplicate = 0;

                for (char c : word.toCharArray()) {
                    duplicate |= a & (1 << (c - 'a'));
                    a |= 1 << (c - 'a');
                }
                if (duplicate > 0)
                    continue;
                for (int i = wordList.size() - 1; i >= 0; i--) {
                    if ((wordList.get(i) & a) > 0) 
                        continue;
                    wordList.add(wordList.get(i) | a);
                    result = Math.max(result, Integer.bitCount(wordList.get(i) | a));
                }
            }
            return result;
        }


    public static int solution(int[] A) {
        Set<Integer> distinct = Arrays.stream(A).boxed().collect(Collectors.toSet());

        int idx = 1;
        while (true)
        {
            if (!distinct.contains(idx)) {
                return idx;
            }
            idx++;
        }
    }
}
