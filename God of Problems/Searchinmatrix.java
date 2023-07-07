class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int arr1[] = new int[n*m];
        int tmp = 0;
        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                arr1[tmp] = matrix[i][j];
                tmp++;
            }
        }
        for(int i= 0 ; i<n*m ;i++){
            if(arr1[i]==x)return true;
        }
        return false;
	} 
} 
