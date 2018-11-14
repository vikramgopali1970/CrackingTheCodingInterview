package CrackingTheCodingInterview;

public class EditDistanceDP {

    public int recursiveEditDistance(String s1,String s2){
        int m = s1.length();
        int n = s2.length();

        return recursiveEditDistanceHelper(s1,s2,m,n);
    }

    private int min(int a,int b,int c){
        if(a<=b && a<=c)
            return a;
        if(b<=c && b<=a){
            return b;
        }
        return c;
    }

    private int recursiveEditDistanceHelper(String s1,String s2,int m,int n){
        if(m==0){
            return n;
        }

        if (n==0){
            return m;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return this.recursiveEditDistanceHelper(s1,s2,m-1,n-1);
        }

        return 1+ this.min(this.recursiveEditDistanceHelper(s1,s2,m,n-1),this.recursiveEditDistanceHelper(s1,s2,m-1,n),this.recursiveEditDistanceHelper(s1,s2,m-1,n-1));
    }


    public int iterativeEditDistance(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] resultDp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    resultDp[i][j] = j;
                }else if(j==0){
                    resultDp[i][j] = i;
                }else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    resultDp[i][j] = resultDp[i-1][j-1];
                }else{
                    resultDp[i][j] = 1 + this.min(resultDp[i][j-1],resultDp[i-1][j],resultDp[i-1][j-1]);
                }
            }
        }
        return resultDp[m][n];

    }

}
