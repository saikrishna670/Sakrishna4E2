public class selection_sorting{
	public static void main(String[] args) {
	    int []nums={19,21,3,8,9,10,12};
		for(int i=0;i<nums.length;i++){
		    int minIndex=i;
		    for(int j=i+1;i<nums.length;j++){
		        if(nums[minIndex]>nums[i]){
		            minIndex=j;
		        }
		    }
		    int temp=nums[i];
		    nums[i]=nums[minIndex];
		    nums[minIndex]=temp;
		}
	}
}
	