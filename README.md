# RoutineJava

Commonly used functions in Java.

An RJ object can operate on its own data or other data.
## RJ Class constructors and methods

    public RJ()
   


    public RJ(int c)
  

    public RJ(int c, int[] iA)
   
    public RJ(int c, double[] dA)
    
    public RJ(int[] iA, double[] dA)
    
    public RJ(int[] iA)
   
    public RJ(double[] dA)
   
    public RJ(int c, int[] iA, double[] dA)
    
    public RJ(double[][] twoDimAD)
    
    public RJ(int[][] twoDimAD)
   
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA)
  

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD)
   
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD)
   

    public RJ(String[] arrS)
    

    public RJ(int c, String[] arrS)
   

    public RJ(int c, int[] iA, String[] arrS)
    
    public RJ(int c, double[] dA, String[] arrS)
    
    public RJ(int[] iA, double[] dA, String[] arrS)
    
    public RJ(int[] iA, String[] arrS)
    
    public RJ(double[] dA, String[] arrS)
    
    public RJ(int c, int[] iA, double[] dA, String[] arrS)
   
    public RJ(double[][] twoDimAD, String[] arrS)
  
    public RJ(int[][] twoDimAD, String[] arrS)
    
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS)
   

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS)

    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS)
 
    public RJ(boolean isTree, RJ pRJ, RJ nRJ)
   

    public RJ(RJ pRJ, RJ nRJ, int c)
    

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA)
   
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA)
    
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA)
    
    public RJ(RJ pRJ, RJ nRJ, int[] iA)
    
    public RJ(RJ pRJ, RJ nRJ, double[] dA)
    
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA)
   
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD)
    
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD)
    
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA)
   

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD)
 
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD)
    

    public RJ(RJ pRJ, RJ nRJ, String[] arrS)
  

    public RJ(RJ pRJ, RJ nRJ, int c, String[] arrS)
   

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String[] arrS)
   
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String[] arrS)
    
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String[] arrS)
  
    public RJ(RJ pRJ, RJ nRJ,int[] iA, String[] arrS)
    
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String[] arrS)
 
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String[] arrS)
   
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String[] arrS)
   
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String[] arrS)
  
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS)
   

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS)
   
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS)
    

    public RJ(String nam)
  

    public RJ(int c, String nam)
   

    public RJ(int c, int[] iA, String nam)
    
    public RJ(int c, double[] dA, String nam)
  
    public RJ(int[] iA, double[] dA, String nam)
   
    public RJ(int[] iA, String nam)
    
    public RJ(double[] dA, String nam)
    
    public RJ(int c, int[] iA, double[] dA, String nam)
    
    public RJ(double[][] twoDimAD, String nam)
   
    public RJ(int[][] twoDimAD, String nam)
   
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String nam)
   

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String nam)
   
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String nam)
   

    public RJ(String[] arrS, String nam)

    public RJ(int c, String[] arrS, String nam)
   

    public RJ(int c, int[] iA, String[] arrS, String nam)
    
    public RJ(int c, double[] dA, String[] arrS, String nam)
    
    public RJ(int[] iA, double[] dA, String[] arrS, String nam)
    
    public RJ(int[] iA, String[] arrS, String nam)
    
    public RJ(double[] dA, String[] arrS, String nam)
    
    public RJ(int c, int[] iA, double[] dA, String[] arrS, String nam)
   
    public RJ(double[][] twoDimAD, String[] arrS, String nam)
    
    public RJ(int[][] twoDimAD, String[] arrS, String nam)
   
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS, String nam)
  
    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS, String nam)
 
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS, String nam)
 
    public RJ(RJ pRJ, RJ nRJ, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int c, String nam)
    

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int[] iA, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String nam)
  
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String nam)
   

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String nam)
  

    public RJ(RJ pRJ, RJ nRJ, String[] arrS, String nam)
    

    public RJ(RJ pRJ, RJ nRJ, int c, String[] arrS, String nam)
   

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String[] arrS, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String[] arrS, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String[] arrS, String nam)
   
    public RJ(RJ pRJ, RJ nRJ,int[] iA, String[] arrS, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String[] arrS, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String[] arrS, String nam)
    
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String[] arrS, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String[] arrS, String nam)
  
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS, String nam)


    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS, String nam)
   
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS, String nam)
  


    public void SetNames(String n, String iaN, String dAN, String tdaN, String tdaDN, String saN)
   

    
    public String GetNameOfIntArray()
   
    public String GetNameOfDoubleArray()
   

    public String GetNameOfTDIntArray()
    

    public String GetNameofTDDoubleArray()
    
    public String GetNameOfStringArray()
   

    public void SetIndependentAndDependent(int i, int d)
    
    public void SetIndependent(int i)
    
    public void SetDependent(int d)
    

    public void AddPrevRJ(RJ rj)
    
    public void AddNextRJ(RJ rj)
    

    public RJ GetPrevRJ()
    
    public RJ GetNextRJ()
   
    public RJ GetLeftRJ()
    
    public RJ GetRightRJ()
   

    public int PeekFirst(int[] arr)
    

    public int PeekLast(int[] arr)
    

    public double PeekFirst(double[] arr)
   

    public double PeekLast(double[] arr)
   

    public int PeekFirst()
   

    public int PeekLast()
   

    public double PeekFirstDouble()
   

    public double PeekLastDouble()
   

    public boolean SearchArray(int[] arr,int number, int min, int max, int increment)
 


    public boolean SearchArray(String[] arr,String str, int min, int max, int increment)

    public boolean SearchArray(double[] arr,double number, int min, int max, int increment)
  

    public boolean IsSortedAscending(int[] arr)
   

    public boolean IsSortedAscending(double[] arr)
   

    public boolean IsSortedDescending(int[] arr)
   
    public boolean IsSortedDescending(double[] arr)
  

    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, int number)
   
    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, double number)
    

    public void PrintTwoDimensionalArrayInt()
    
    public void PrintTwoDimensionalArrayDoub()
   


    public void PrintTwoDimensionalArray(int[][] arr)
   

    public void PrintTwoDimensionalArray(double[][] arr)
   

    public void PrintTwoDimensionalArray(boolean[][] arr)
    

    public void PrintArray(int[] arr)
  

    public void PrintArrayInt()
    
    public void PrintArray(String[] arr)
  

    public void PrintArrayStr()
   

    public void PrintArray(double[] arr)
  

    public void PrintArrayDoub()
   

    public void PrintArray(boolean[] arr)
   

    public void SortArrayAscending(int[] array)
    
    
    public void mergeSort(int[] array, int n) 

    public void merge(int[] array, int[] l, int[] r, int left, int right)

    public void mergeSort() 


    public void PrintReversedArrayInt(int[] arrInt)
   
    public void PrintReversedArrayInt()
    

    public void PrintReversedArrayDoub(double[] arrDoub)
    

    public void PrintReversedArrayDoub()
    


    public int[] ReverseArrayInt(int[] arrInt)
 

    public int[] ReverseArrayInt()
 

    public double[] ReverseArrayDoub(double[] arrDoub)
   

    public double[] ReverseArrDoub()

    public int[][] SortTDArrayAscending(int[] array)
  



    public boolean IsSortedAscending(int[][] arr)
   

    public void SortArrayAscending(double[] array)

    public void SortArrayDescending(int[] array)
    
    public void SortArrayDescending(double[] array)
  
    public int[] SortArrayAscendingRet(int[] array)
   
    public double[] SortArrayAscendingRet(double[] array)
    
    public int[] SortArrayDescendingRet(int[] array)
  
    public double[] SortArrayDescendingRet(double[] array)
   




    public int CountofMatchValueandPosition(int[] arrOne, int[] arrTwo)
    
    public int CountofMatchValue(int[] arrOne, int[] arrTwo)
    
    public double CountofMatchValueandPosition(double[] arrOne, double[] arrTwo)
    
   
    public int CountofMatchValue(double[] arrOne, double[] arrTwo)
    

    public int IncrementIfTrue(int num, boolean b, int inc)
   

    public int IncrementIfFalse(int num, boolean b, int inc)
   
    public void IncrementCount(int amount)
   

    public void IncrementCountIfFalse(int amount, boolean b)
   

    public void IncrementCountIfTrue(int amount, boolean b)
  
    public void SetCount(int c)
    

    public void SetIntArray(int[] arr)
 
    public void SetDoubleArray(double[] arr)
   

    public void SetStringArray(String[] arr)
    

    public void SetIntTwo(int[][] arr)
    

    public void SetDoubleTwo(double[][] arr)
    

    public int GetCount()
   

    public int[] GetIntArray()
    

    public double[] GetDoubleArray()
    

    public String[] GetStringArray()
   

    public double[][] GetTwoDimArr()
   
    public int[][] GetTwoDimArrInt()
  

    public int[] AddToEnd(int[] arr, int n)
   

    public int[] AddToBeginning(int[] arr, int n)


    public String[] AddToEnd(String[] arr, String s)
  
    public String[] AddToBeginning(String[] arr, String s)
    


    public double[] AddToEnd(double[] arr, double n)
    

    public double[] AddToBeginning(double[] arr, double n)
    

    public int GetSum(int[] arr)
   
    public double GetSum(double[] arr)
   


    public void PrintArrayAndSum(int[] arr)
    

    public void PrintArrayAndSum(double[] arr)
    
    public String Comparison(int[] arr)
   

    public String Comparison(double[] arr)


    public String Comparison(int[] arr, int[] arrTwo)
   

    public String Comparison(String[] arr)
 




    public int[] Insert(int[] arr, int n, int loc)
   

    public String[] Insert(String[] arr, String s, int loc)
   

    public double[] Insert(double[] arr, double n, int loc)
 

    public int CountOccurrences(int[] arr, int n)
   

    public int CountOccurrences(double[] arr, double n)
    
    public int CountOccurrences(String[] arr, String s)
   

    public int CountOccurrences(int n)
   

    public int CountOccurrences(double n)
   


   

    public int CountOccurrencesRangeInclusive(int low, int high)
   

    public int CountOccurrencesRangeInclusive(double[] arr, double low, double high)
   

    public int CountOccurrencesRangeInclusive(int[] arr, int low, int high)
  

    public int CountOccurrencesRangeInclusive(double low, double high)
 

    public int[] ReplaceAll(int[] arr, int n, int newN)
    

    public double[] ReplaceAll(double[] arr, double n, double newN)
  
    public String[] ReplaceAll(String[] arr, String s, String newS)
  

    public void ReplaceAll(int n, int newN)
  

    public void ReplaceAll(double n, double newN)
    
    public void ReplaceAll(String s, String newS)
   
    public void ReplaceSpecific(int[] intArr, int val, int loc)
   

    public void ReplaceSpecific(int val, int loc)
    

    public void ReplaceSpecificTD(int val , int locOne, int locTwo)
    

    public void ReplaceSpecificTD(double val , int locOne, int locTwo)
    

    public void ReplaceSpecificTD(String val, int locOne, int locTwo)
    

    public void ReplaceSpecific(double val, int loc)
   

    public void ReplaceSpecific(double[] doubArr, double val, int loc)
   

    public void ReplaceSpecific(String val, int loc)
   

    public void ReplaceSpecific(String[] stringArr, String val, int loc)
    


    public void SwapIntArray(RJ rj)
    

    public void SwapDoubleArray(RJ rj)
  
    public void SwapStringArray(RJ rj)
 

    public int[] ReturnRandomInt(int size)

    public double[] ReturnRandomDouble(int size)
   

    public boolean[] ReturnRandomBool(int size)
   


    public int[][] ReturnRandomTwoDimInt(int size, int sizeTwo)
   
    public double[][] ReturnRandomTwoDimDouble(int size, int sizeTwo)
    

    public boolean[][] ReturnRandomTwoDimBool(int size, int sizeTwo)
 
    public int CountUnique(int[] arr)
   


    public int CountUnique(double[] arr)
   

    public int[][] CountedArray(int size)
  



    public int[] GetByFrequency(int[] arr)
    


    public double ChangeFromRate(double changeDependent, double changeIndependent, double actualChangeIndependent)
   
    public double DifferenceFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
 
    public double RatioFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
    


    public double SigmoidFunction(double x)
    

    public double ReLU(double x)
 

    public double PercOutput(double W, double bias, double doub)
    

    public int[] KeepLargestInt(int[] integerArr, int[] integerArrTwo)
    
    public int[] KeepSmallestInt(int[] integerArr, int[] integerArrTwo)
    
    public double[] KeepLargestDouble(double[] doubleArr, double[] doubleArrTwo)
   
    public double[] KeepSmallestDouble(double[] doubleArr, double[] doubleArrTwo)
   

    public void AddIntArrayToIntArray(int[] addInt)
    

    public void AddDoubToDoubArray(double[] addDoub)
    
    public int[] MultiplyByScalarInteger(int[] arr, int s)
    

    public double[] MultiplyByScalarDouble(double[] arr, int s)
   

    public String GetSwitch(int numb, int[] results, String[] messages)

