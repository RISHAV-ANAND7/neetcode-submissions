class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n=s1.length();
        int j=n-1;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
