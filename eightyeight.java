//to determine whether two matrices are equal 
class eightyeight{
    public static void main(String[]args){
        int row1,row2,column1,column2;
        boolean flag=true;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        row1=a.length;
        column1=a[0].length;
        row2=b.length;
        column2=b[0].length;
        if(row1!=row2||column1!=column2){
            System.out.println("MATRIX ARE NOT EQUAL");
        }
        else{
        for(int i=0;i<row1;i++){
            for(int j=0;j<column2;j++){
            if(a[i][j]!=b[i][j]){
                    flag=false;
                    break;
                }}}
                if(flag)
                    System.out.println("GIVEN MATRIX ARE EQUAL");
                    else
                    System.out.println("GIVEN MATRIX ARE NOT EQUAL");
                }
                 }
                }
        