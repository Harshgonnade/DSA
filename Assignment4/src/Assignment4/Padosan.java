package Assignment4;
import java.util.Scanner;
public class Padosan 
{
	
int x1,y1,x2,y2,x3,y3,x4,y4;
	
	public Padosan(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		this.x4=x4;
		this.y4=y4;
		
	}
	
	public boolean isAdjacent(Padosan s)
	{
		return(this.x1==s.x1 && this.x2==s.x2 && Math.abs(this.y1-s.y1)==1)||(this.y1==s.y1 && this.y2==s.y2 && Math.abs(this.x1-s.x1)==1);
	}
}

 class Square
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		Padosan[]Padosan=new Padosan[N];
		
		for(int i=0;i<N;i++)
		{
			Padosan[i] = new Padosan(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					}
					
					for (int i = 0; i < N; i++) 
					{
						int count = 0;
						for (int j = 0; j < N; j++) {
						// Check if the squares are different and adjacent
						if (i != j && Padosan[i].isAdjacent(Padosan[j])) {
						count++;
						}
						}
						// Print the square number and the number of adjacent squares
						System.out.println((i + 1) + " " + count);
						}
						sc.close();
	}
}
