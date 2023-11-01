package Phase1Module3;

public class RightRotateArray {

	public static void main(String[] args) {
		  //Initialize array     
        int [] a = new int [] {1, 2, 3, 4, 5};     
        //n determine the number of times an array should be rotated.    
        int n = 2;    
           
        //Displays original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");     
        }      
            
        //Rotate the given array by n times toward right    
        for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = a[a.length-1];    
            
            for(j = a.length-1; j > 0; j--){    
                //Shift element of array by one    
                a[j] = a[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            a[0] = last;    
        }    
        
        System.out.println();    
            
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }  

	}

}
