class Solution {
    public boolean isAnagram(String s, String t) {
        /* Create an array to count the frequency of each letter in string s
            Subtract the frequency of each letter in the string t 
            from the frequency of the corresponding letter in the string s
         */
         int sLen = s.length();
         int tLen = t.length();
         int[] record = new int[26];
         for(int i = 0; i < sLen; i++){
            // record the frequency of each letter in string s
            record[s.charAt(i)- 'a']++;
         }
         /* for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);    // get the letter
            int index = currentChar - 'a';     // count the index
            record[index] = record[index] + 1; // frequency + 1
            }
          */
          for(int i = 0; i < tLen; i++){
            record[t.charAt(i) - 'a']--;
            // e.g. there are 2 'a' in string t but only 1 in string s
            // the record of 'a' will be -1
          }

          for(int i = 0; i < record.length; i++){
            if(record[i] != 0){
                return false;
            }
          }
          return true;
          //if put "return true" in the else branch, it will return immediately when it finds the first 0
    }
}
