public class Main {

    public static void main(String[] args)
    {
        RJ rj = new RJ();
        int[] numbers = new int[]{3,2,3,7,8};
        System.out.println(rj.SearchArray(numbers, 7, 0,numbers.length, 1));
        System.out.println(rj.SearchArray(numbers, 9, 0,numbers.length, 1));
        int[] numbersSortY = new int[]{2,3,4,6,9,12,17};
        System.out.println(rj.IsSortedAscending(numbersSortY));
        System.out.println(rj.IsSortedDescending(numbersSortY));
        int[] numberSortD = new int[]{9,6,3,1};
        System.out.println(rj.IsSortedDescending(numberSortD));

        int[][] twoDim = new int[][]{{2,3,5},{5,6,4}};
        System.out.println(rj.SearchforIntegerTwoDimensionalArray(twoDim, 6));
        System.out.println(rj.SearchforIntegerTwoDimensionalArray(twoDim, 1));
        rj.PrintTwoDimensionalArray(twoDim);

        int count = 5;
        boolean bl = true;
        rj.SetCount(5);
        rj.IncrementIfTrue(rj.GetCount(), bl, 2);
        System.out.println(rj.GetCount());
        rj.IncrementIfTrue(rj.GetCount(), bl, 2);
        System.out.println(rj.GetCount());
        bl = false;
        rj.IncrementIfTrue(rj.GetCount(), bl, 2);
        System.out.println(rj.GetCount());

        int[] ar = new int[]{4,2,8,7};
        rj.SortArrayAscending(ar);

        rj.PrintArray(ar);
        int[] arTwo = new int[]{5,2,1,3,3,10,2,18,15,12};
        System.out.println();
        rj.SortArrayAscending(arTwo);
        rj.PrintArray(arTwo);
        double[] arThree = new double[]{4.7, 3.28, 5.79,6.12, 4.14};
        rj.SortArrayAscending(arThree);
        System.out.println();
        rj.PrintArray(arThree);
        rj.SortArrayDescending(arTwo);
        rj.SortArrayDescending(arThree);
        System.out.println();
        rj.PrintArray(arTwo);
        System.out.println();
        rj.PrintArray(arThree);

        int[] arrayOne = new int[]{7,4,6,2};
        int[] arrayTwo = new int[]{5,4,6,1};
        System.out.println();
        System.out.println("Matched positions and values: " + rj.CountofMatchValueandPosition(arrayOne, arrayTwo));
        boolean bool = false;
        System.out.println(rj.IncrementIfFalse(2,bool, 2));
        System.out.println(rj.GetCount());
        int abc = 10;
        System.out.println(rj.IncrementIfFalse(abc,bool,5));
        rj.IncrementCountIfFalse(abc,bool);
        System.out.println(rj.GetCount());


        int[] testArray = new int[]{3,7,8,6,6,7};
        rj.PrintArray(testArray);
        System.out.println();
        int[] newTestArray = rj.AddToBeginning(testArray, 5);
        rj.PrintArray(newTestArray);
        System.out.println();
        int[] newNewTestArray = rj.AddToEnd(newTestArray, 10);
        rj.PrintArray(newNewTestArray);
        System.out.println();

        double[] testArrayD = new double[]{3.1,7.7,8.4,6.1,6.7,7.25};
        rj.PrintArray(testArrayD);
        System.out.println();
        double[] newTestArrayD = rj.AddToBeginning(testArrayD, 5.76);
        rj.PrintArray(newTestArrayD);
        System.out.println();
        double[] newNewTestArrayD = rj.AddToEnd(newTestArrayD, 10.98);
        rj.PrintArray(newNewTestArrayD);
        System.out.println();

        rj.PrintArrayAndSum(testArray);
        rj.PrintArrayAndSum(testArrayD);

        //What percentage of the two arrays are the same
        int[] first = new int[]{5,2,5,5,1,7,9,9,9,4,8,8,3,7,8,6};
        int[] second = new int[]{5,2,2,5,1,7,8,9,9,9,4,8,8,3,7,2};
        System.out.println(rj.Comparison(first, second));

        int[] f = new int[]{7,4,4,5};
        int[] fTwo = new int[]{7,4,3,5};
        System.out.println(rj.Comparison(f, fTwo));


        int[] intArray = new int[]{5,8,3,3,4,8,5,6,2};
        rj.PrintArrayAndSum(rj.Insert(intArray,1, 2));
        double[] doubleArray = new double[]{9.5, 6.7, 1.7, 9.4, 3.1};
        rj.PrintArrayAndSum(rj.Insert(doubleArray,5.33, 3));

        String[] names = new String[]{"cat", "dog", "horse", "donkey"};
        rj.PrintArray(names);
        System.out.println();
        System.out.println(rj.SearchArray(names, "donkey", 0, names.length, 1));
        String[] namesNew = rj.Insert(names, "New_Input", 4);
        rj.PrintArray(namesNew);












    }
}
