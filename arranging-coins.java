class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        int flag = n;
        for(int i=1;i<=n;i++){
            if(flag>=i){
                row = row+1;
                flag=flag-i;
            }else{
                break;
            }
        }
        return row;
    }
}