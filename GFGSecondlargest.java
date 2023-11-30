/*Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.*/
class Solution {
    int print2largest(int arr[], int n) {
        int largest=arr[0];
        int slargest=-1;//As non negative numbers only inn the array
        for(int i=1;i<n;i++){//As we have arr[0] already starting from 1
            if(arr[i]>largest){
                slargest=largest;//largest is small so we have to store it in second
                largest=arr[i];//Storing the larger one in largest
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];//some cases like 12 35 10 34
                //There 12 will be slargest with only if 
                //but it is less than 34 so it have to be verified
            }
        }
        return slargest;
    }
}
