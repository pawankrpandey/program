package Hareprograms;

public class Evenoddcount {

	public static void main(SImutiable[] args) {
		// TODO Auto-generated method stub



int num=12345;

int evencount=0;
int oddcount=0;

while(num>0) 
{
int rem=num%10;

if(rem%2==0)
{
evencount++;
}
else
{
oddcount++;
}
num=num/10;
}

System.out.println("number of even count:"+evencount);
System.out.println("number of odd count:"+oddcount);

}

}

	


