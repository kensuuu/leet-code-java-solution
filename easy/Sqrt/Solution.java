package easy.Sqrt;

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        
        return binarySearch(1, x, x);
    }

    public int binarySearch(int left, int right, int key) {
        if (left <= right) {
            int mid = (right + left) / 2;
            if (mid > key / mid) { // f(mid) = mid^2 - key > 0
                return binarySearch(left, mid - 1, key);
            }
            if(key / (mid + 1) < (mid + 1)) { // f(mid + 1) = (mid + 1)^2 - key < 0
                return mid;
            }
            return binarySearch(mid + 1, right, key);
        }
        return key;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(0));
        System.out.println(solution.mySqrt(5));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(412849));
    }
}