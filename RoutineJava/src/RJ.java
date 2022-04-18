public class RJ {

    private int count;
    private int[] intArray;
    private double[] doubleArray;
    private int[][] twoDimArray;
    private double[][] twoDimArrayDoub;
    public RJ()
    {

    }

    public RJ(int c)
    {
        count = c;
    }

    public RJ(int c, int[] iA)
    {
        count = c;
        intArray = iA;
    }
    public RJ(int c, double[] dA)
    {
        count = c;
        doubleArray = dA;
    }
    public RJ(int[] iA, double[] dA)
    {
        intArray = iA;
        doubleArray = dA;
    }
    public RJ(int[] iA)
    {
        intArray = iA;
    }
    public RJ(double[] dA)
    {
        doubleArray = dA;
    }
    public RJ(int c, int[] iA, double[] dA)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
    }
    public RJ(double[][] twoDimAD)
    {
        twoDimArrayDoub = twoDimAD;
    }
    public RJ(int[][] twoDimAD)
    {
        twoDimAD = twoDimAD;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
    }

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;

    }

    public boolean SearchArray(int[] arr,int number, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i] == number)
            {
                isFound = true;
            }
        }
        return isFound;
    }

    public boolean SearchArray(double[] arr,double number, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i] == number)
            {
                isFound = true;
            }
        }
        return isFound;
    }

    public boolean IsSortedAscending(int[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] < arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedAscending(double[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] < arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedDescending(int[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] > arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedDescending(double[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] > arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, int number)
    {
        boolean numberFound = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (number == arr[i][j])
                {
                    numberFound = true;
                }
            }
        }
        return numberFound;
    }

    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, double number)
    {
        boolean numberFound = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (number == arr[i][j])
                {
                    numberFound = true;
                }
            }
        }
        return numberFound;
    }

    public void PrintTwoDimensionalArray(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void PrintArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public void SortArrayAscending(int[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public void SortArrayAscending(double[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public void SortArrayDescending(int[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public void SortArrayDescending(double[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public int CountofMatchValueandPosition(int[] arrOne, int[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        return count;

    }
    //A match in arrTwo is counted once
    public int CountofMatchValue(int[] arrOne, int[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            for (int j = 0; j < arrTwo.length; j++)
            {
                if (arrOne[i] == arrTwo[j])
                {
                    count = count + 1;
                    break;
                }
            }

        }
        return count;

    }
    public double CountofMatchValueandPosition(double[] arrOne, double[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        return count;

    }
    //A match in arrTwo is counted once
    public int CountofMatchValue(double[] arrOne, double[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            for (int j = 0; j < arrTwo.length; j++)
            {
                if (arrOne[i] == arrTwo[j])
                {
                    count = count + 1;
                    break;
                }
            }

        }
        return count;

    }

    public int IncrementIfTrue(int num, boolean b, int inc)
    {
        if (b == true)
        {
            num = num + inc;
        }
        return num;
    }

    public int IncrementIfFalse(int num, boolean b, int inc)
    {
        if (b == false)
        {
            num = num + inc;
        }
        return num;
    }
    public void IncrementCount(int amount)
    {
        count = count + amount;
    }

    public void IncrementCountIfFalse(int amount, boolean b)
    {
        if (b == false)
        {
            count = count + amount;
        }
    }

    public void IncrementCountIfTrue(int amount, boolean b)
    {
        if (b == true)
        {
            count = count + amount;
        }
    }

    public void SetCount(int c)
    {
        count = c;
    }
    public int GetCount()
    {
        return count;
    }

    public int[] GetIntArray()
    {
        return intArray;
    }

    public double[] GetDouble()
    {
        return doubleArray;
    }

    public double[][] GetTwoDimArr()
    {
        return twoDimArrayDoub;
    }
    public int[][] GetTwoDimArrInt()
    {
        return twoDimArray;
    }

    public int[] AddToEnd(int[] arr, int n)
    {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }

    public int[] AddToBeginning(int[] arr, int n)
    {
        int[] newArray = new int[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = n;

        return newArray;

    }
    /*

    public int[] Insert(int[] arr, int n, int loc)
    {

    }
    */


    public double[] AddToEnd(double[] arr, double n)
    {
        double[] newArray = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }

    public double[] AddToBeginning(double[] arr, double n)
    {
        double[] newArray = new double[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = n;

        return newArray;

    }

    public int GetSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public double GetSum(double[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }


    public void PrintArrayAndSum(int[] arr)
    {
        PrintArray(arr);
        System.out.println();
        System.out.println("Sum " + GetSum(arr));
    }

    public void PrintArrayAndSum(double[] arr)
    {
        PrintArray(arr);
        System.out.println();
        System.out.println("Sum: " + GetSum(arr));
    }


    public String Comparison(int[] arr, int[] arrTwo)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == arrTwo.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == arrTwo[i])
                {
                    count = count + 1;
                }
            }
        }
        else
        {
            System.out.println("Must have same array length.");
        }
        double percentage = ((double)count/(double)length) * 100;
        return percentage + "%";
    }





    public int[] Insert(int[] arr, int n, int loc)
    {
        int[] arrTwo = new int[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc - 1] = n;
        return arrTwo;
    }

    public double[] Insert(double[] arr, double n, int loc)
    {
        double[] arrTwo = new double[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc - 1] = n;
        return arrTwo;
    }




}
