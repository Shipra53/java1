//create an array of five floats and calculate their sum.
public class fiftyfour{
     public static void main(String[] args) {
     float []marks={ 43.5f,56.8f,89.3f};
        float sum=0;
     for(float element:marks){
        sum=sum+element;
     }
     System.out.println("SUM= "+sum);
    }
}