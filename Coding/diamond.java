public class diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print("\t");
            for(int k=0;k<i;k++)
                System.out.print("*\t");
            for(int p=1;p<i;p++)
                System.out.print("*\t");
            System.out.println("\n");
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print("\t");
            for(int k=0;k<i;k++)
                System.out.print("*\t");
            for(int p=1;p<i;p++)
                System.out.print("*\t");
            System.out.println("\n");
        }
    }
}
