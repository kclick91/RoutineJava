import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        /*System.out.println("Simple Examples.");
        System.out.println("1. Instantiate an RJ object.");
        RJ simple = new RJ();
        System.out.println("2. Instantiate an RJ object with parameters.");
        RJ simpleParam = new RJ(3, new int[]{5,5,2,2,3}, new double[]{7.7, 7.5, 1.1, 1.2}, new int[][]{{9,9,7,8,8,1}, {1,1,1,6,8,2}}, new double[][]{{7.7,4.4,4.3}, {3.1, 4.4, 4.8}}, new String[]{"Many", "strings", "are", "great"});
        System.out.println("3. Print the object's array of integers.");
        simpleParam.PrintArrayInt();
        System.out.println("4. Print the object's array of doubles.");
        simpleParam.PrintArrayDoub();
        System.out.println("5. Print the object's array strings");
        simpleParam.PrintArrayStr();
        System.out.println("6. Print the object's two dimensional array of integers.");
        simpleParam.PrintTwoDimensionalArrayInt();
        System.out.println("7. Print the object's two dimensional array of doubles.");
        simpleParam.PrintTwoDimensionalArrayDoub();
        System.out.println("8. Print any integer array.");
        simple.PrintArray(new int[]{4,4,6,6,4,4,2,2});
        System.out.println("9. Print any double array.");
        simple.PrintArray(new double[]{3.9, 9.3, 9.8, 7.9});
        System.out.println("10. Print any string array");
        simple.PrintArray(new String[]{"New", "array", "will", "be", "printed"});



        System.out.println("End of simple examples.\n");




        *//*RJ rj = new RJ();
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


        //Merge Sort
        System.out.println("MERGE SORT!!!");
        int[] newArr = new int[]{2,6,7,9,4};
        rj.mergeSort(newArr, newArr.length);
        rj.PrintArray(newArr);
        int[] newArrTwo = new int[]{8,4,6,3,2,7,8,1,15,24,21,5};
        rj.mergeSort(newArrTwo, newArrTwo.length);
        rj.PrintArray(newArrTwo);
        rj.ReverseArrayInt(newArr);
        rj.PrintArray(newArr);

        rj.SetIntArray(new int[]{7,8,6,4,6,1,1,2});
        rj.mergeSort();
        rj.PrintArrayInt();
        rj.ReverseArrayInt();

        rj.SetDoubleArray(new double[]{4.6, 7.6, 5.5, 1.2, 1.1});
        rj.PrintArrayDoub();
        rj.mergeSort();
        //rj.PrintReversedArrayDoub();
        rj.PrintReversedArrayDoub();


        //End of Merge Sort

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

        //Compare using two different objects
        RJ routineOne = new RJ(new int[]{3,6,7}, new double[]{1.5, 5.6});
        RJ routineTwo = new RJ(new int[]{3,6,7}, new double[]{1.5,7.8});
        System.out.println();
        System.out.println(routineOne.Comparison(routineTwo.GetIntArray()));
        System.out.println(routineOne.Comparison(routineTwo.GetDoubleArray()));

        System.out.println(routineOne.PeekFirst());
        System.out.println(routineOne.PeekFirstDouble());
        System.out.println(routineOne.PeekLast());
        System.out.println(routineOne.PeekLastDouble());

        System.out.println(routineTwo.PeekFirst());
        System.out.println(routineTwo.PeekFirstDouble());
        System.out.println(routineTwo.PeekLast());
        System.out.println(routineTwo.PeekLastDouble());

        int[] peekTestArray = new int[]{6,9,9,10,11,2};
        double[] peekTestArrayDouble = new double[]{5.5,4.1,5.3,5.4,8.4,9.9,10.9,2.9,1.3,4.3};

        RJ rjTest = new RJ();
        System.out.println(rjTest.PeekFirst(peekTestArray));
        System.out.println(rjTest.PeekLast(peekTestArray));
        System.out.println(rjTest.PeekFirst(peekTestArrayDouble));
        System.out.println(rjTest.PeekLast(peekTestArrayDouble));


        //Next/Prev RJ
        RJ rjZero = new RJ();
        rjZero.SetIntArray(new int[]{2,1,8,5,5});
        RJ rjOne = new RJ(new int[]{3,1,2,4,2});
        RJ rjTwo = new RJ(new int[]{7,7,7,5,5});


        rjOne.AddPrevRJ(rjZero);
        rjOne.AddNextRJ(rjTwo);

        rjOne.PrintArray(rjOne.GetPrevRJ().GetIntArray());
        System.out.println();
        rjOne.PrintArrayInt();
        System.out.println();
        rjOne.PrintArray(rjOne.GetNextRJ().GetIntArray());


        String[] arrayForCountingString = new String[]{"one", "two", "three", "one"};
        int[] arrayForCountingInt = new int[]{3,8,8,7,2,3,3,3,7,8,5,5};
        double[] arrayForCountingDouble = new double[]{6.4,3.5,6.0,6.0,2.3,1.25, 6.0};
        System.out.println();
        RJ rjQWERTY = new RJ();
        System.out.println("Occurs: " + rjQWERTY.CountOccurrences(arrayForCountingString, "one"));
        System.out.println("Occurs: " + rjQWERTY.CountOccurrences(arrayForCountingInt, 5));
        System.out.println("Occurs: " + rjQWERTY.CountOccurrences(arrayForCountingDouble, 6.0));
        System.out.println("Occurs: " + rjQWERTY.CountOccurrencesRangeInclusive(arrayForCountingDouble,3.0, 6.0));

        ProductSale ps = new ProductSale(new int[]{2,4,3,3,7,7,7,2,3}, new double[]{8.50,8.99,6.25,8.90,3.00,7.13, 4.99, 4.99, 2.99});
        ps.PrintProductsAndPrices();

        RJ rjrj = new RJ();
        int[] newInt = rjrj.ReplaceAll(new int[]{5,5,3,5,8,8,7,1,2,1,3}, 5, 6);
        rjrj.PrintArray(newInt);
        double[] newDouble = rjrj.ReplaceAll(new double[]{5.2,5.4,3.1,5.7,8.1,8.2,7.9,1.3,2.8,1.1,3.7}, 5, 6);
        rjrj.PrintArray(newDouble);
        String[] newStringArray = rjrj.ReplaceAll(new String[]{"Front", "Next", "Next", "Next", "Last"}, "Next", "Medium");
        rjrj.PrintArray(newStringArray);


        //Compare int arrays in linked RJ objects
        rjrj.SetIntArray(new int[]{4,5,5,4,2,2,3,9,9});
        rjrj.AddNextRJ(new RJ(new int[]{3,5,5,4,2,2,3,7,9}));
        System.out.println(rjrj.Comparison(rjrj.GetNextRJ().GetIntArray()));

        RJ rjSO = new RJ(new int[]{8,5,6,6});
        RJ rjSOTwo = new RJ(new int[]{4,4,4,4});
        System.out.println();
        rjSO.PrintArrayInt();
        rjSOTwo.PrintArrayInt();
        System.out.println();
        rjSO.SwapIntArray(rjSOTwo);
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  v");
        rjSO.PrintArrayInt();
        rjSOTwo.PrintArrayInt();


        System.out.println();
        //Find the largest numbers in an array
        RJ testRJ = new RJ();
        int[] arr = new int[]{6,4,7,8,3,6,9};
        testRJ.SortArrayDescending(arr);
        System.out.println("Max: " + testRJ.PeekFirst(arr));

        int[] countNumberofUnique = new int[]{6,1,1,3,2,2,5,8,8,9};
        RJ counter = new RJ();
        System.out.println(counter.CountUnique(countNumberofUnique));

        //Currently prints out counts in ascending order
        counter.PrintArray(counter.GetByFrequency(countNumberofUnique));

        RJ indANDDep = new RJ();

        System.out.println(rj.ChangeFromRate(1, 2, 10));
        System.out.println(rj.ChangeFromRate(2.4, 1.3, 3.9));

        double[] p = new double[]{3.4, 4.5};
        double[] ptwo = new double[]{3.1, 8.7};

        System.out.println("Ratio: " + indANDDep.RatioFromActualChange(0,0,p, ptwo, 3));
        System.out.println("Difference: " + indANDDep.DifferenceFromActualChange(0,2, p, ptwo, 10.7));


        RJ rjTesttest = new RJ();
        rjTesttest.PrintArray(rjTesttest.ReturnRandomBool(5));
        rjTesttest.PrintTwoDimensionalArray(rjTesttest.ReturnRandomTwoDimInt(3,4));
        rjTesttest.PrintTwoDimensionalArray(rjTesttest.ReturnRandomTwoDimDouble(7,4));
        rjTesttest.PrintTwoDimensionalArray(rjTesttest.ReturnRandomTwoDimBool(2,2));

        //A Game//

        RJ tictactoe = new RJ();
        System.out.println("Tic-tac-toe");
        System.out.println("------------");

        //Check if positions are taken or not
        //

        tictactoe.SetIntTwo(new int[][]{{0,0,0},{0,0,0},{0,0,0}});
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(1, 1, 1);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(2, 0,1);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(1, 2, 0);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(2, 0, 2);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(1, 1, 2);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");
        tictactoe.ReplaceSpecificTD(2, 0, 0);
        tictactoe.PrintTwoDimensionalArray(tictactoe.GetTwoDimArrInt());
        System.out.println("--------------------");


        //End Game//

        RJ testEul = new RJ();
        System.out.println(testEul.SigmoidFunction(.78));
        System.out.println(testEul.SigmoidFunction(2));
        System.out.println(testEul.ReLU(-.35));
        System.out.println(testEul.ReLU(.98));

        RJ rjThree = new RJ();
        System.out.println(rjThree.PercOutput(5.0, 2.0, 4));


        //Playing Testing
        System.out.println("PLAYING/TESTING");
        rj.PrintArrayAndSum(new int[]{5,3,4,4});
        RJ rjPT = new RJ(new int[]{6,5,3,4,4,5,9,9,7,3});
        rjPT.ReplaceSpecific(5, 3);
        rjPT.PrintArrayAndSum(rjPT.GetIntArray());

        System.out.println("------");
        int[] testIntArray = new int[]{4,4,3,7,19,34,23,5,8};
        double[] testDoubArray = new double[]{4.7, 1.2, 8.8, 7,5, 1.1};
        RJ routineJava = new RJ(testIntArray, testDoubArray);

        //Merge sort double array!!!!
        routineJava.mergeSort();
        routineJava.PrintArrayInt();


        routineJava.SetNames("Name", "Integer Array", "Double Array", "Two Dim Integer Array Name", "Two Dim Double Array Name", "String array name");
        System.out.println();
        System.out.println(routineJava.GetNameOfIntArray() + ", " + routineJava.GetNameOfDoubleArray() + ", " +  routineJava.GetNameOfTDIntArray() + ", " + routineJava.GetNameofTDDoubleArray() + ", " + routineJava.GetNameOfStringArray());



        System.out.println("1. Replace Specific 2. Sort");

        routineJava.SetDoubleArray(new double[]{6.7,5.9,2.1,4.4, 6.9});
        routineJava.PrintArrayDoub();
        routineJava.ReplaceSpecific(3.2, 3);
        routineJava.PrintArrayDoub();
        routineJava.SortArrayAscending(routineJava.GetDoubleArray());
        routineJava.PrintArrayDoub();

        RJ linkOne = new RJ();
        RJ linkTwo = new RJ();
        RJ top = new RJ(true, linkOne, linkTwo);
        linkOne.SetDoubleArray(new double[]{6.3,4.1,5.6,1.1,1.2,9.8});
        linkTwo.SetDoubleArray(new double[]{3.3,1.1,1.9,1.2,5.2,5.6});
        top.GetLeftRJ().PrintArrayDoub();
        top.GetRightRJ().PrintArrayDoub();


        RJ routJava = new RJ(new int[]{5,8,9,4,5,5,2,7,2});
        routJava.PrintArrayInt();
        routJava.SetDoubleArray(routJava.KeepLargestDouble(linkOne.GetDoubleArray(), linkTwo.GetDoubleArray()));

        routJava.PrintArrayDoub();
        System.out.println("==========");
        RJ jr = new RJ(new int[]{9,4,4,9,7});
        jr.PrintArrayInt();
        jr.AddIntArrayToIntArray(new int[]{6,7,7,6,5});
        jr.PrintArrayInt();*//*

        RJ sameObject = new RJ(new int[]{8,7,9,9,1,2,9,4,3}, new double[]{7.7, 9.9, 9.5, 7.6, 1.6});

        sameObject.PrintArrayInt();
        //sameObject.PrintArrayDoub();
        sameObject.AddIntArrayToIntArray(new int[]{7,5,5,2,2,3,3,1,8});
        //sameObject.AddDoubToDoubArray(new double[]{4.4, 5.8, 6.6, 3.3, 2.1});
        sameObject.PrintArrayInt();
        //sameObject.PrintArrayDoub();
        sameObject.MergeSort();
        sameObject.PrintArrayInt();
        sameObject.ReplaceSpecific(sameObject.GetIntArray(), 16, 5);
        sameObject.PrintArrayInt();
        sameObject.MergeSort();
        sameObject.PrintArrayInt();
        int[] arrOne = sameObject.MultiplyByScalarInteger(new int[]{7,4,9}, 3);
        double[] arrTwo = sameObject.MultiplyByScalarDouble(new double[]{4.78, 6.41, 9.99}, 7);
        sameObject.PrintArray(arrOne);
        sameObject.PrintArray(arrTwo);
        int[] integerArray = new int[]{5,6,1};
        String[] array = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        System.out.println(sameObject.GetSwitch(1,integerArray, array));
        System.out.println(sameObject.GetSwitch(5, integerArray, array));


        System.out.println("Multiply 2D Arrays");

        //sameObject.PrintTwoDimensionalArray(sameObject.Multiply(new int[][]{{2,2},{2,2}}, new int[][]{{2,2}, {2,2}}));


        //int[][] one = new int[][]{{2,3,3}, {4,1,1}};
        //int[][] two = new int[][]{{2,3,3}, {4,1,1}, {3,7,7}};
        //sameObject.Multiply(one, two);


        sameObject.PrintTwoDimensionalArray(sameObject.Multiply(new int[][]{{1,5},{3,4}},new int[][]{{3,2}, {4,1}}));

        sameObject.PrintTwoDimensionalArray(sameObject.Multiply(new int[][]{{1,5,4},{3,4,0}},new int[][]{{3,2}, {4,1}, {1,1}}));

        sameObject.PrintTwoDimensionalArray(sameObject.Multiply(new int[][]{{6,5},{8,4}},new int[][]{{3,2}, {4,1}}));

        sameObject.PrintTwoDimensionalArray(sameObject.AddTwoDimensionalArr(new int[][]{{9,8},{3,3}}, new int[][]{{9,7}, {2,1}}));

        //3 x 2
        //2 x anything

        sameObject.SetDoubleTwo(new double[][]{{3,4},{4,1},{5,1}});

        sameObject.PrintTwoDimensionalArray(sameObject.MultiplyTwoDoub(new double[][]{{7,7,2}, {6,2,2}}));

        sameObject.PrintTwoDimensionalArray(sameObject.MultiplyDoub(new double[][]{{7,7,2}, {6,2,2}}));

        sameObject.SetIntTwo((new int[][]{{3,4},{4,1},{5,1}}));

        sameObject.PrintTwoDimensionalArray(sameObject.MultiplyTwoInt(new int[][]{{7,7,2}, {6,2,2}}));

        sameObject.PrintTwoDimensionalArray(sameObject.MultiplyInt(new int[][]{{7,7,2}, {6,2,2}}));

        sameObject.PrintTwoDimensionalArray(sameObject.Multiply(new int[][]{{4,4,4,9},{3,3,1,7},{6,7,2,9}}, new int[][]{{1,1,1},{7,7,2},{4,4,1},{9,9,7}}));

        sameObject.PrintTwoDimensionalArray(sameObject.GetTwoDimArrInt());

        sameObject.PrintTwoDimensionalArray(sameObject.MultiplyByScalarInteger(sameObject.GetTwoDimArrInt(), 4));

        RJ rjTester = new RJ(new int[][]{{4,3}, {7,3}});

        int[] arrayIntegers = rjTester.StretchTwoDim(rjTester.GetTwoDimArrInt());
        rjTester.PrintArray(arrayIntegers);

        RJ rjNew = new RJ();
        int[][] positions = new int[][]{{1,2,3}, {4,5,6}};
        String[][] occupants = {{"A", "B", "C"},{"D", "E", "F"}};
        System.out.println(rjNew.GetSwitch(3, positions, occupants));
        System.out.println(rjNew.GetSwitch(5, positions,occupants));

        //rjNew.PrintArray(rjNew.GetByFrequency(new int[]{8,5,5}));

        //System.out.println(rjNew.PeekFirst(new double[]{3.9, 2.3, 4.4, 6.7}));


        //Initialize a graph
        //int, double, and String
        List<List<Integer>> lli = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(4);
        li.add(7);
        lli.add(li);
        List<Integer> liTwo = new ArrayList<>();
        liTwo.add(7);
        liTwo.add(4);
        lli.add(liTwo);
        RJ graph = new RJ();
        graph.PrintGraphInteger(lli);


        System.out.println("Brian can send a message to Thomas.\nThomas can send a message to Brian or Fred.\nFred can send a message to Thomas.");
        List<List<String>> lls = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        ls.add("Brian");
        ls.add("Thomas");
        List<String> lsTwo = new ArrayList<>();
        lsTwo.add("Thomas");
        lsTwo.add("Brian");
        lsTwo.add("Fred");
        List<String> lsThree = new ArrayList<>();
        lsThree.add("Fred");
        lsThree.add("Thomas");
        lls.add(ls);
        lls.add(lsTwo);
        lls.add(lsThree);
        RJ graphForStrings = new RJ();
        graphForStrings.PrintGraphString(lls);

        RJ test = new RJ();
        System.out.println(test.GetSwitch(3, new int[]{1,2,3,4,5}, new String[]{"Hello", "this", "is","a", "sentence"}));
        System.out.println(test.GetSwitch(3, new int[]{3,2,1,4,5}, new String[]{"Hello", "this", "is","a", "sentence"}));

        test.PrintArray(test.GetByFrequency(new int[]{1,1,1,2,2,2,3,3,2,2,1}));
        test.PrintArray(test.GetByFrequency(new int[]{4,4,2,2,2,6,7,7,7}));


        //Example Exercises
        int[] values = new int[]{5,4,4,7,8,2};
        RJ exerciseOne = new RJ();
        System.out.println("Exercise 1");
        System.out.print("Find the largest of ");
        exerciseOne.PrintArray(values);
        System.out.println(exerciseOne.PeekFirst(exerciseOne.SortArrayDescendingRet(values)));

        RJ exerciseTwo = new RJ();
        System.out.println("Exercise 2");
        System.out.println("Is this string a palindrome: racecar");
        System.out.println(exerciseTwo.DoesItMatchValueandPosition(exerciseTwo.ReverseArrayChar("racecar".toCharArray()), "racecar".toCharArray()));
        System.out.println(exerciseTwo.DoesItMatchValueandPosition(exerciseTwo.ReverseArrayChar("build".toCharArray()), "build".toCharArray()));

        RJ exerciseThree = new RJ();
        System.out.println("Exercise 3");
        System.out.print("Print out running total of ");
        exerciseThree.SetIntArray(new int[]{34, 12, 15, 21});
        exerciseThree.PrintArray(exerciseThree.GetIntArray());



        exerciseThree.StartWatch();

        for (int i = 0; i < exerciseThree.GetIntArray().length; i++)
        {
            exerciseThree.PrintArrayAndSum(exerciseThree.PartOfArrayInt(exerciseThree.GetIntArray(), i));
        }

        System.out.println(exerciseThree.StopWatch());

        RJ exerciseFour = new RJ();
        int[] shortestStreak = exerciseFour.StoreInt(new int[]{5,5,6,5,5,5,7,7}, "smaller");
        exerciseFour.PrintArray(shortestStreak);
        int[] longestStreak = exerciseFour.StoreInt(new int[]{5,5,2,2,2,2,4,4,4,4,8,8,8,8,8,8,8,2}, "larger");
        exerciseFour.PrintArray(longestStreak);
        int[] shortestStreakTwo = exerciseFour.StoreInt(new int[]{9,9,9,9,3,3,3,7,7,7,7,8,8,8,8,8,8,8}, "smaller");
        exerciseFour.PrintArray(shortestStreakTwo);
        int[] longestStreakTwo = exerciseFour.StoreInt(new int[]{5,5,2,2,2,2,4,4,4,4,4,4,4,8,8,8,8,2}, "larger");
        exerciseFour.PrintArray(longestStreakTwo);


        //RJ object's values and history
        RJ rjrj = new RJ();
        rjrj.ShowValues();


        RJ rjRJ = new RJ();
        List<List<RJ>> rjList = new ArrayList<List<RJ>>();
        RJ rjOne = new RJ(new double[]{0.4, 6.8, 5.9, 7.3});
        RJ rjTwo = new RJ(new double[]{7.7, 2.7, 2.2, 5.4, 8.1, 3.1});
        RJ rjThree = new RJ(new double[]{2.1, 4.1, 3.1, 8.8});

        List<RJ> firstList = new ArrayList<RJ>();
        firstList.add(rjOne);
        firstList.add(rjThree);
        rjList.add(firstList);
        List<RJ> secondList = new ArrayList<RJ>();
        secondList.add(rjTwo);
        rjList.add(secondList);
        List<RJ> thirdList = new ArrayList<RJ>();
        thirdList.add(rjThree);
        thirdList.add(rjOne);
        rjList.add(thirdList);

        rjRJ.PrintGraphRJ(rjList);
        */


        /*RJ usingRJClass = new RJ(0, 0.0, 0.0f, "", true, new int[]{56,89,32,34,55},new double[]{3.1, 3.2, 3.6,1.1}, new int[][]{{0,0},{0,0}}, new double[][]{{0.0,0.0},{0.0,0.0}}, new String[]{"Working memory and the mind seem to have spatial dimensions.", "Imagining a line of 9 small solid circles is harder than imagining 3 rows of 3 small solid circles.", "This is " +
            "as if there is limited space in each direction in the mind."},
            new String[][]{{"", ""},{"", ""}}, 0L, new float[]{0.0f, 0.0f},new long[]{0L, 0L}, new float[][]{{0.0f, 0.0f},{0.0f, 0.0f}},new long[][]{{0L, 0L},{0L, 0L}});*/


        /*System.out.println("Trees/Chains");

        RJ parent = new RJ(new int[]{1,2,3});
        RJ childOne = new RJ(new int[]{5,2,2});
        RJ childTwo = new RJ(new int[]{1,1,1});

        parent.AddLeftRJ(childOne);
        parent.AddRightRJ(childTwo);

        parent.PrintArrayInt();
        parent.GetLeftRJ().PrintArrayInt();
        parent.GetRightRJ().PrintArrayInt();


        RJ first = new RJ(new int[]{4,4,3});
        RJ second = new RJ(new int[]{9,0,9});
        RJ third = new RJ(new int[]{3,5,3});

        first.AddNextRJ(second);
        second.AddPrevRJ(first);
        second.AddNextRJ(third);
        third.AddPrevRJ(second);;

        first.PrintArrayInt();
        first.GetNextRJ().PrintArrayInt();
        second.GetNextRJ().PrintArrayInt();
        third.GetPrevRJ().PrintArrayInt();
        second.GetPrevRJ().PrintArrayInt();
        first.PrintArrayInt();*/

        //BEG
        /*
        int intSelected = 0;
        while(intSelected != 4) {

            System.out.println("Select\n" + "1.View " + usingRJClass.GetNameOfIntArray() + "\n" + "2.View " +  usingRJClass.GetNameOfDoubleArray() + "\n" + "3.View " + usingRJClass.GetNameOfStringArray() + "\n");

            System.out.println("4.Exit\n");
            Scanner scan = new Scanner(System.in);
            intSelected = scan.nextInt();
            System.out.println(usingRJClass.GetSwitch(intSelected, new int[]{1, 2, 3, 4}, new String[]{usingRJClass.ReturnArrayInt().toString(), usingRJClass.ReturnArrayDoub().toString(), usingRJClass.ReturnArrayString().toString(), "Ok. Exited."}));
        }

        //System.out.println("Final Values");
        //System.out.println("============");
        usingRJClass.ShowValues();

        usingRJClass.WritetoFile("Written to values.txt\n", "values.txt");
        usingRJClass.ReadfromFile("values.txt");
        usingRJClass.WritetoFile("", "values.txt");

        System.out.println("Arrays to be written to file:");
        usingRJClass.PrintArrayInt();
        usingRJClass.SetDoubleTwo(new double[][]{{4.5, 4.1, 8.5},{1.9, 1.8, 1.7}});
        usingRJClass.PrintTwoDimensionalArrayDoub();
        usingRJClass.WritetoFile(usingRJClass.IntArrToString() + "\n", "values.txt");
        usingRJClass.WritetoFile(usingRJClass.TDDouArrToString(), "values.txt");
        System.out.println("Everything read from File:\n");
        usingRJClass.ReadfromFile("values.txt");
        */

        RJ rj = new RJ();
        rj.StartWatch();
        for (int i = 0; i < 1000000; i++)
        {
            System.out.println(i);
        }
        long first = rj.StopWatch();
        int i = 0;
        rj.StartWatch();
        while(i < 1000000)
        {
            i++;
            System.out.println(i);
        }
        long second = rj.StopWatch();

        System.out.println(first);
        System.out.println(second);
        RJ rjFile = new RJ();
        rjFile.WritetoFile(first + " milliseconds\n", "Time.txt");
        rjFile.WritetoFile(second + " milliseconds\n", "Time.txt");



        //FILL

        //Show Values
        rjFile.ShowValues();
        rjFile.Record("RecordFile.txt");

        RJ usingRJClass = new RJ(0, 0.0, 0.0f, "", true, new int[]{56,89,32,34,55},new double[]{3.1, 3.2, 3.6,1.1}, new int[][]{{0,0},{0,0}}, new double[][]{{0.0,0.0},{0.0,0.0}}, new String[]{"Working memory and the mind seem to have spatial dimensions.", "Imagining a line of 9 small solid circles is harder than imagining 3 rows of 3 small solid circles.", "This is " +
                "as if there is limited space in each direction in the mind."},
                new String[][]{{"", ""},{"", ""}}, 0L, new float[]{0.0f, 0.0f},new long[]{0L, 0L}, new float[][]{{0.0f, 0.0f},{0.0f, 0.0f}},new long[][]{{0L, 0L},{0L, 0L}});
        usingRJClass.Record("Data_from_using_RJClassObject.txt");









    }
}
