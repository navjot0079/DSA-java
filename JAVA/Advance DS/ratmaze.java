public class ratmaze {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        boolean vis[][]=new boolean[m][n];
        solve(0,0,m,n,new StringBuilder());
    }
    public static void solve(int r, int c,int m,int n,StringBuilder path){
        if(r<0 || c<0 || r>=m || c>=n ){
            return ;
        }
        if(r==m-1 && c==n-1){
            System.out.println(path.toString());
        }
        
        path.append('V');
        solve(r+1, c, m,n,path);
        path.deleteCharAt(path.length()-1);

        path.append('H');
        solve(r, c+1, m,n,path);
        path.deleteCharAt(path.length()-1);

        
        
    }
}
