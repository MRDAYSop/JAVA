class Game
{
    void main(int n)
    {
        int y=(int)Math.round(Math.random()*10);
        System.out.println(y);
        if(n==y)
        {
            System.out.println("\n you win the game");
        }
        else
        {
            System.out.println("\n You lose the game");
        }
    }
}