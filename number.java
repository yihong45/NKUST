public class number
{
    public static void main(String[] args) {
        int i,j;
        for( i=2;i<=100;i++){
            for( j=2;j<i;j++){
            if(i%j==0)
                break;

            }
            if(j==i)
                System.out.println(i);
        }

    }
}
