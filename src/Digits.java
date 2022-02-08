import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num == 0)
        {
            digitList.add(0);
        }
        while (num > 0)
        {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    public boolean isStrictlyIncreasing()
    {
        int first = digitList.get(0);
        for (int i = 1; i < digitList.size(); i++)
        {
            if (digitList.get(i) > first)
            {
                first = digitList.get(i);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
