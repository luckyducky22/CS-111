public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		int rowCount1=0;
		int colCount1=0;
		int rowCount2=0;
		int colCount2=0;

		 for (int i=1;i<=matrix1.length;i++)
		 {
            for (int j=0;j<matrix1[0].length;j++)
            {
				colCount1=colCount1+1;
			}
			rowCount1=rowCount1+1;
		}
		for (int i=1;i<=matrix2.length;i++)
				 {
		            for (int j=0;j<matrix2[0].length;j++)
		            {
						colCount2=colCount2+1;
					}
					rowCount2=rowCount2+1;
		}

		colCount1 = colCount1/rowCount1;
		colCount2= colCount2/rowCount2;

		System.out.println("MATRIX 1: the number of rows it has is: "+rowCount1);
		System.out.println("MATRIX 1: the number of columns it has is: "+(colCount1));


		System.out.println("MATRIX 2: the number of rows it has is: "+rowCount2);
		System.out.println("MATRIX 2: the number of rows it has is: "+(colCount2));

		double [][] newMatrix = new double[rowCount1][colCount2];
		System.out.println("The new matrix should have "+rowCount1+" rows and "+colCount2+" columns.");
		System.out.println();
		/*
		int value1= 0;
		int valeu2=0;
		for (int i=0;i<=newMatrix.length;i++)
		{
			for (int j=0;j<=newMatrix[0].length;j++)
			{
				value1= (matrix1[i][j]*matrix2[i][j]);
				if ((i !=newMatrix.length) && (j !=newMatrix[0].length))
				newMatrix[i][j] = (matrix1[i][j]*matrix2[i][j]) + (matrix1[i+1][j]*matrix2[i][j+1]);


			}

		}
		*/

		/*
		int i= 0;
		int j=0;
		while ((i!= rowCount1) && (j!= colCount2))
		{
			//newMatrix[i][j] = (matrix1[i][j]*matrix2[i][j]) + (matrix1[i][j+1]*matrix2[i+1][j]);


			i++;
			j++;

		}*/

		for(int i = 0; i < rowCount1; i++)
		{
	    	for(int j = 0; j < colCount2; j++)
		    	{
		       		for(int s = 0; s < colCount1; s++)
		            	{
		                	newMatrix[i][j] += matrix1[i][s] * matrix2[s][j];
		                }
		        }
        }




		return newMatrix;
	}
}