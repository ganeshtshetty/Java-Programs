
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[2][2];
		for(int m=0;m<2;m++)
			for(int n=0;n<2;n++)
			{
				if(m == n) array[m][n] =1;
				else array[m][n]=0;
			}
		for(int m=0;m<2;m++)
			for(int n=0;n<2;n++)
				System.out.println(array[m][n]);
	}

}
