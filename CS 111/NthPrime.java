
public class NthPrime{

	public static void main(String []args){


		int nth=0;
		do
		{
		System.out.println("Enter in the nth prime number you want ");
		 nth = IO.readInt();
		 if (nth<=0)
		 System.out.println("N cannot be this number. enter again ");


		}
		while (nth<=0);


		int pace=0;
		int answer = 0;

		for(int x=2;x<=nth*10;x++){

			for(int y=2;y<=x;y++){
				if(x==y){
					pace++;
					answer = x;
				}
				if(x%y==0){
					break;
				}
			}
			if(pace==nth){
				break;
			}
		}

		System.out.println(answer);


	}

}