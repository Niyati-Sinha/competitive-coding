//Time Complexity = O(m+n)
//Space Complexity (Best Case) = Theeta(m+n)+O(1)+O(1)

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    
         int arr[]= new int[nums1.length];

         for(int i=0;i<arr.length;i++)
            arr[i] = 0;

         int index1=0;
         int index2=0;

         for(int i=0; i<(m+n); i++){

             if(index1<m && index2<n){

                 if(nums1[index1]<=nums2[index2]){
                     arr[i]=nums1[index1++];
                     //System.out.println("nums1<nums2 "+arr[i]);
                 }
                 else if(nums2[index2]<nums1[index1]){
                     arr[i]=nums2[index2++];
                     //System.out.println("nums1>nums2 "+arr[i]);
                 }
             }
             else if(index1<m)
                 arr[i]=nums1[index1++];
             else if(index2<n)
                 arr[i]=nums2[index2++];
        }

         for(int i=0; i<arr.length; i++)
             nums1[i]=arr[i];

    }
}
