class Solution {
    public String removeOuterParentheses(String S) {
        
        int i=0, j=0, k=0;;
        String r = "";
        
        while (true) {
            char temp = S.charAt(k);
            if(temp == '(') {
                i++;
            } else j++;
            
            if(i == j) {
                r += S.substring(k-2*j+2, k);
                i = 0; j = 0;
            }
            
            if(k == S.length()-1) {
                break;
            }
            k++;
            
        }
        return r;
        
    }
}
