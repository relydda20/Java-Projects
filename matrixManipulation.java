public class matrixManipulation{
    public static void main(String[] args){
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        
        matrixMulti(a, b);
        dotProduct(a, b);
    }
    
    public static void matrixMulti(int [][]a, int [][] b){  
          
    int c[][]=new int[3][3]; 
        
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
            c[i][j]=0;      
            for(int k=0;k<3;k++) {      
                c[i][j]+=a[i][k]*b[k][j];      
            }
        System.out.print(c[i][j]+" ");  
            }  
        System.out.println();    
        }    
    }
    
    public static void dotProduct(int [][]a, int [][]b){
        int c[][] = new int [3][3];
        for (int i = 0; i<c.length;i++){
            for (int j = 0; j<c[i].length;j++){
                int num = 0;
                for (int k = 0; k<c[i].length; k++){
                    num += a[i][k] * b[k][j];
                }
                    System.out.print(num + " ");
                }
                    System.out.println(" ");
        }
    }
}
