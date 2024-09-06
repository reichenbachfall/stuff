
public class Insertion{

    public static void main(String[]args){

        int[] A = {69,420, 1, 13};

        insertion(A);

        for (int i=0; i<A.length; i++){
        System.out.print(A[i] + " ");
        }
    }

    public static int[] insertion(int[] A){

        for (int j=1; j < A.length; j ++){
            int key = A[j];
            int i = j-1;

            while (i>=0 && A[i] > key) {
                A[i+1] = A[i];
                i --;
            }
            A[i+1] = key;
        }

        return A;
    }

}
