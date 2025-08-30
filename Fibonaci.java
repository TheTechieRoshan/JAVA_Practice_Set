
class Fibonaci
{
    public static void main(String args[])
    {
        int i, a, fact = 1;
        System.out.println("Enter any Number");
        a = 5;
        for(i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}