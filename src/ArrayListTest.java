import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        for (String str : names)
        {
            System.out.println(str);
        }

        int i = 0;
        while (i < names.size())
        {
            System.out.println(names.get(i));
            i++;
        }

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        for (int i = 0; i < catList.size(); i++)
        {
            System.out.println(catList.get(i).getName());
        }

        for (Cat cat : catList)
        {
            System.out.println(cat.getName());
        }
        */

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        for (int i = 1; i < numList.size() - 1; i++)
        {
            int cur = numList.get(i);
            int next = numList.get(i + 1);
            numList.set(i - 1, cur + next);
        }
        System.out.println(numList);

    }
}
