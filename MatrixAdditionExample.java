public class MatrixAdditionExample{  
public static void main(String args[]){     
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};         
int c[][]=new int[3][3];  
for(int i=0;i<10;i++){    
for(int j=0;j<10;j++){    
c[i][j]=a[i][j]+b[i][j];   
System.out.println(c[i][j]+"");    
}    
System.out.println(); 
}    
}}