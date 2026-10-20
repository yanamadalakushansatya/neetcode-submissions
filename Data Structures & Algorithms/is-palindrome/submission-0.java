class Solution {
    public boolean isPalindrome(String s) {                 
       s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       s= s.replaceAll("\\s+","").trim();
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);

    }
}
