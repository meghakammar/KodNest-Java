import java.util.Scanner;
public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][][] = new int[3][3][5];
        System.out.println("Enter Array Elements:");
        for(int i=0; i<=a.length-1; i++)
        {
            for(int j=0; j<=a.length-1; j++)
            {
                for(int k=0; k<=a.length-1; k++)
                {
                    a[i][j][k]= scan nextInt();
                    System.out.printLN("Array Elements are :");
                    for(int i=0; i<=a.length-1; i++)
                    {
                        for(int j=0; j<=a[i][j].length-1; j++)
                        {
                            for(int k=0; k<=a.lenght-1; k++)
                            {
                                System.out.print(a[i][j][k]+ " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }