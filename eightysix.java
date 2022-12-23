//to determine whether given matrix is identity matrix
class eightysix{
    public static void main(String[]args){
        int rows,columns;
        boolean flag=true;
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        rows=a.length;
        columns=a[0].length;
        if(rows!=columns){
            System.out.println("MATRIX SHOULD BE SQUARE MATRIX");
        }
        else
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
            if(i==j && a[i][j]!=1){
                flag=false;
                break;
            }
                if(i!=j && a[i][j]!=0){
                    flag=false;
                    break;
                }}}
                if(flag){
                    System.out.println("GIVEN MATRIX IS AN IDENTITY MATRIX");}
                    else{
                    System.out.println("GIVEN MATRIX IS NOT AN IDENTITY MATRIX");
                }
            }
        }    
        