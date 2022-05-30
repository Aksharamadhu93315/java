class ComplexNumber
{
int real,image;
public ComplexNumber(int r, int i)
{
this.real=r;
this.image=i;
}
public void showC()
{
System.out.print(this.real + " +i" + this.image);
}
public static ComplexNumber add (ComplexNumber n1, ComplexNumber n2)
{
ComplexNumber res= new ComplexNumber(0,0);
res.image=n1.image + n2.image;
return res;
}
public static void main(String args[])
{
ComplexNumber c1=new ComplexNumber(4,5);
ComplexNumber c2=new ComplexNumber(10,5);
System.out.println("\nfirst complex number: ");
c1.showC();
System.out.println("\nsecond complex number: ");
c2.showC();
ComplexNumber res=add(c1,c2);
System.out.println("\naddition is : ");
res.showC();
}}