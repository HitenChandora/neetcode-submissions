class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            encoded_string.append(strs.get(i).length());
            encoded_string.append("#");
            encoded_string.append(strs.get(i));
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char[] c = str.toCharArray();           
        for(int i=0; i<c.length;){
            int j = i;
            while(c[j] != '#'){
                j++;
            }
            int length = Integer.parseInt(new String(c, i, j - i));
            int count  = j + length;
            StringBuilder word = new StringBuilder();
            for(int k=j+1; k<=count; k++){
                word.append(c[k]);  
            }
            i = count + 1;
            result.add(word.toString());
        }
        return result;
    }
}
