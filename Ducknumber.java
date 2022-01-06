class Ducknumber
{
    void main(int b,int e)
    {
        int dig=0,sum=0,ab=0,ae=0;
        ab=(b<e)?b:e;
        ae=(b<e)?e:b;
        while(ab<ae)
        {
            int s=ab;
            while(s>0)
            {
                dig=s%10;
                if(dig==0)
                {
                    System.out.println(ab+"it is a duck number");
                    sum=sum+ab;
                }
                s=s/10;
            }
            ab++;
        }
        System.out.println("\n Sum of the numbers="+sum);
    }
}