package easy.AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        int index_A = a.length() - 1;
        int index_B = b.length() - 1;
		StringBuilder sb = new StringBuilder();
        int sum, tmp = 0;
        
        while(index_A >= 0 || index_B >= 0){
            sum = tmp;

            if(index_A >= 0)
                if(a.charAt(index_A--) == '1') sum += 1;
            if(index_B >= 0)
                if(b.charAt(index_B--) == '1') sum += 1;
            
            sb.append(sum % 2);
            tmp = sum / 2;
            
        }
        
        if(tmp == 1) sb.append(1);
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("0", "0"));
        System.out.println(solution.addBinary("10110", "11"));
        System.out.println(solution.addBinary("1010", "1011"));
    }
}