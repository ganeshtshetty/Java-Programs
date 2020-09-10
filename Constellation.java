import java.util.*;
public class Constellation
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,m,i,j,p,q;
        n=s.nextInt();
        char mat[][]=new char[3][n+1];
        char ch[]=new char[10];
        for(i=0;i<3;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=s.next().charAt(0);
            }
        }
    for(i=0;i<n;i++)
    {
        if(mat[0][i]=='#' && mat[1][i]=='#' && mat[2][i]=='#')
            System.out.print("#");
        else if(mat[0][i]=='.' && mat[1][i]=='.' && mat[2][i]=='.')
            continue;
        else
        {
            p=i;
            ch[0]=mat[0][p];
            ch[1]=mat[0][p+1];
            ch[2]=mat[0][p+2];
            ch[3]=mat[1][p];
            ch[4]=mat[1][p+1];
            ch[5]=mat[1][p+2];
            ch[6]=mat[2][p];
            ch[7]=mat[2][p+1];
            ch[8]=mat[2][p+2];
            ch[9]='\0';
            if(ch[0]=='.' && ch[1]=='*' && ch[2]=='.' && ch[3]=='*' && ch[4]=='*' && ch[5]=='*' && ch[6]=='*' && ch[7]=='.' && ch[8]=='*')
            {
                 System.out.print("A");
                i+=2;
            }
            if(ch[0]=='*' && ch[1]=='*' && ch[2]=='*' && ch[3]=='*' && ch[4]=='*' && ch[5]=='*' && ch[6]=='*' && ch[7]=='*' && ch[8]=='*')
            {
              System.out.print("E");
                i+=2;
            }
            if(ch[0]=='*' && ch[1]=='*' && ch[2]=='*' && ch[3]=='.' && ch[4]=='*' && ch[5]=='.' && ch[6]=='*' && ch[7]=='*' && ch[8]=='*')
            {
                System.out.print("I");
                i+=2;
            }
            if(ch[0]=='*' && ch[1]=='*' && ch[2]=='*' && ch[3]=='*' && ch[4]=='.' && ch[5]=='*' && ch[6]=='*' && ch[7]=='*' && ch[8]=='*')
            {
                System.out.print("O");
                i+=2;
            }
            if(ch[0]=='*' && ch[1]=='.' && ch[2]=='*' && ch[3]=='*' && ch[4]=='.' && ch[5]=='*' && ch[6]=='*' && ch[7]=='*' && ch[8]=='*')
            {
                System.out.print("U");
                i+=2;
            }
        }
  }
}
}

