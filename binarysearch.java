class Solution {
    int binarysearch(int arr[], int n, int k) {
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
                return mid; // Found the element, return its index
            } else if (arr[mid] < k) {
                left = mid + 1; // If k is greater, search the right half
            } else {
                right = mid - 1; // If k is smaller, search the left half
            }
        }
        
        return -1; // If K is not found, return -1
    }
}


