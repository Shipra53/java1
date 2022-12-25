//sum of each row and column of a matrix
class ninetytwo{
   public static void main(String[]args) {
    int row,column,sum_of_row,sum_of_column;
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    row=a.length;
    column=a[0].length;
    for(int i=0;i<row;i++){
      sum_of_row=0;
      for(int j=0;j<column;j++){
         sum_of_row=sum_of_row+a[i][j];
      } 
      System.out.println("SUM OF "+(i+1)+" ROW:"+sum_of_row);
    }
    for(int i=0;i<column;i++){
      sum_of_column=0;
      for(int j=0;j<row;j++){
         sum_of_column=sum_of_column+a[j][i];
      }
      System.out.println("SUM OF "+(i+1)+" COLUMN:"+sum_of_column);
    }}}