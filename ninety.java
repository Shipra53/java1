//to display upper traingular matrix
class ninety{
    public static void main(String[]args){
        int a[][]={{1,2,3},{1,2,0},{1,2,3}};
        int rows=a.length;
        int columns=a[0].length;
        if(rows!=columns){
            System.out.println("Matrix should be a square matrix");
        }else{
            System.out.println("Upper triangular matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
            if(j<i)
            System.out.print("0 ");
            else
            System.out.print(a[i][j]+" ");
            }
                    System.out.println();
                }
            }
        }}   
        