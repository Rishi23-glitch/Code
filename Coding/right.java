public class right {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=n;k>=i;k--)
                System.out.print("\t");
            for(int j=0;j<=i;j++)
                System.out.print("*\t");
            System.out.println("\n");
    }
}
}
