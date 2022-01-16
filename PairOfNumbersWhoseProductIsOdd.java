public class PairOfNumbersWhoseProductIsOdd
{

    int arr2[] = {1,7,4,4,8};
    public void PairOfNumbersOfOddProduct(int arr2[])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 1; j < 5; j++)
            {
                if((arr2[i]*arr2[j])%2==0)
                {
                    System.out.println("False");
                }
                else
                    System.out.println("True");
            break;
            }
        break;
        }

    }
}
class Test3
{
    public static void main(String[] args)
    {
        PairOfNumbersWhoseProductIsOdd obj = new PairOfNumbersWhoseProductIsOdd();
        obj.PairOfNumbersOfOddProduct(obj.arr2);

    }
}