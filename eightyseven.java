//to determine whether given matrix is a sparse matrix
class eightyseven{
    public static void main(String[]args){
        int rows,columns,size,count=0;
        int a[][]={{1,0,0},{0,2,0},{0,0,3}};
        rows=a.length;
        columns=a[0].length;
        size=rows*columns;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
            if(a[i][j]==0)
            count++;
            }}
                if(count>(size/2)){
                    System.out.println("GIVEN MATRIX IS A SPARSE MATRIX");}
                    else{
                    System.out.println("GIVEN MATRIX IS NOT A SPARSE MATRIX");
                }
            }
        }    
        