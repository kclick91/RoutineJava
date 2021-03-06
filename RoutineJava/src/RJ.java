import java.util.Random;

public class RJ {

    protected int count;
    protected int[] intArray;
    protected double[] doubleArray;
    protected int[][] twoDimArray;
    protected double[][] twoDimArrayDoub;
    protected String[] stringArray;
    private String name = "";
    private String intarrayName = "";
    private String doubleArrayName = "";
    private String twodimarrayName = "";
    private String twodimarrayDoubName = "";
    private String stringarrayName = "";

    protected RJ nextRJ;
    protected RJ prevRJ;
    protected RJ leftRJ;
    protected RJ rightRJ;

    protected double independent;
    protected double dependent;

    protected final double  CONSTANTEULERS = 2.7182818284590452353602874713;
    protected final double CONSTANTPI = 3.1415926535897932384626433832;

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
        twoDimArray = twoDimAD;
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

    public RJ(String[] arrS)
    {
        stringArray = arrS;
    }

    public RJ(int c, String[] arrS)
    {
        count = c;
        stringArray = arrS;
    }

    public RJ(int c, int[] iA, String[] arrS)
    {
        count = c;
        intArray = iA;
        stringArray = arrS;
    }
    public RJ(int c, double[] dA, String[] arrS)
    {
        count = c;
        doubleArray = dA;
        stringArray = arrS;
    }
    public RJ(int[] iA, double[] dA, String[] arrS)
    {
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
    }
    public RJ(int[] iA, String[] arrS)
    {
        intArray = iA;
        stringArray = arrS;
    }
    public RJ(double[] dA, String[] arrS)
    {
        doubleArray = dA;
        stringArray = arrS;
    }
    public RJ(int c, int[] iA, double[] dA, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
    }
    public RJ(double[][] twoDimAD, String[] arrS)
    {
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
    }
    public RJ(int[][] twoDimAD, String[] arrS)
    {
        twoDimAD = twoDimAD;
        stringArray = arrS;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        stringArray = arrS;
    }

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;

    }

    public RJ(boolean isTree, RJ pRJ, RJ nRJ)
    {
        //previous/next
        if (isTree == false)
        {
            prevRJ = pRJ;
            nextRJ = nRJ;
        }
        //left/right
        else if (isTree == true)
        {
            leftRJ = pRJ;
            rightRJ = nRJ;
        }
    }

    public RJ(RJ pRJ, RJ nRJ, int c)
    {
        count = c;
        prevRJ = pRJ;
        nextRJ = nextRJ;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA)
    {
        count = c;
        intArray = iA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA)
    {
        count = c;
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA)
    {
        intArray = iA;
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA)
    {
        intArray = iA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, double[] dA)
    {
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD)
    {
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD)
    {
        twoDimAD = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;

    }

    public RJ(RJ pRJ, RJ nRJ, String[] arrS)
    {
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, String[] arrS)
    {
        count = c;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String[] arrS)
    {
        count = c;
        intArray = iA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String[] arrS)
    {
        count = c;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String[] arrS)
    {
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ,int[] iA, String[] arrS)
    {
        intArray = iA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String[] arrS)
    {
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String[] arrS)
    {
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String[] arrS)
    {
        twoDimAD = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;

    }

    //Name

    public RJ(String nam)
    {
        name = nam;
    }


    public RJ(int c, String nam)
    {
        count = c;
        name = nam;
    }

    public RJ(int c, int[] iA, String nam)
    {
        count = c;
        intArray = iA;
        name = nam;
    }
    public RJ(int c, double[] dA, String nam)
    {
        count = c;
        doubleArray = dA;
        name = nam;
    }
    public RJ(int[] iA, double[] dA, String nam)
    {
        intArray = iA;
        doubleArray = dA;
        name = nam;

    }
    public RJ(int[] iA, String nam)
    {
        intArray = iA;
        name = nam;
    }
    public RJ(double[] dA, String nam)
    {
        doubleArray = dA;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        name = nam;
    }
    public RJ(double[][] twoDimAD, String nam)
    {
        twoDimArrayDoub = twoDimAD;
        name = nam;
    }
    public RJ(int[][] twoDimAD, String nam)
    {
        twoDimAD = twoDimAD;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        name = nam;
    }

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        name = nam;
    }

    public RJ(String[] arrS, String nam)
    {
        stringArray = arrS;
        name = nam;
    }

    public RJ(int c, String[] arrS, String nam)
    {
        count = c;
        stringArray = arrS;
        name = nam;
    }

    public RJ(int c, int[] iA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int c, double[] dA, String[] arrS, String nam)
    {
        count = c;
        doubleArray = dA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int[] iA, double[] dA, String[] arrS, String nam)
    {
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int[] iA, String[] arrS, String nam)
    {
        intArray = iA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(double[] dA, String[] arrS, String nam)
    {
        doubleArray = dA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        name = nam;
    }
    public RJ(double[][] twoDimAD, String[] arrS, String nam)
    {
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int[][] twoDimAD, String[] arrS, String nam)
    {
        twoDimAD = twoDimAD;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        stringArray = arrS;
        name = nam;
    }

    public RJ(int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        name = nam;
    }
    public RJ(int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        name = nam;

    }

    public RJ(RJ pRJ, RJ nRJ, String nam)
    {
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, String nam)
    {
        count = c;
        prevRJ = pRJ;
        nextRJ = nextRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String nam)
    {
        count = c;
        intArray = iA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String nam)
    {
        count = c;
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String nam)
    {
        intArray = iA;
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA, String nam)
    {
        intArray = iA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String nam)
    {
        doubleArray = dA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String nam)
    {
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String nam)
    {
        twoDimAD = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;

    }

    public RJ(RJ pRJ, RJ nRJ, String[] arrS, String nam)
    {
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, String[] arrS, String nam)
    {
        count = c;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, double[] dA, String[] arrS, String nam)
    {
        count = c;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int[] iA, double[] dA, String[] arrS, String nam)
    {
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ,int[] iA, String[] arrS, String nam)
    {
        intArray = iA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, double[] dA, String[] arrS, String nam)
    {
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, double[][] twoDimAD, String[] arrS, String nam)
    {
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int[][] twoDimAD, String[] arrS, String nam)
    {
        twoDimAD = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }

    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, double[][] twoDimAD, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;
    }
    public RJ(RJ pRJ, RJ nRJ, int c, int[] iA, double[] dA, int[][] twoDimA, double[][] twoDimAD, String[] arrS, String nam)
    {
        count = c;
        intArray = iA;
        doubleArray = dA;
        twoDimArray = twoDimA;
        twoDimArrayDoub = twoDimAD;
        stringArray = arrS;
        prevRJ = pRJ;
        nextRJ = nRJ;
        name = nam;

    }

    /*
    private String name = "";
    private String intarrayName = "";
    private String doubleArrayName = "";
    private String twodimarrayName = "";
    private String twodimarrayDoubName = "";
    private String stringarrayName = "";
    */
    public void SetNames(String n, String iaN, String dAN, String tdaN, String tdaDN, String saN)
    {
        name = n;
        intarrayName = iaN;
        doubleArrayName = dAN;
        twodimarrayName = tdaN;
        twodimarrayDoubName = tdaDN;
        stringarrayName = saN;

    }

    //Access arrays by name

    
    public String GetNameOfIntArray()
    {
        return intarrayName;
    }
    public String GetNameOfDoubleArray()
    {
        return doubleArrayName;
    }

    public String GetNameOfTDIntArray()
    {
        return twodimarrayName;
    }

    public String GetNameofTDDoubleArray()
    {
        return twodimarrayDoubName;
    }
    public String GetNameOfStringArray()
    {
        return stringarrayName;
    }

    public void SetIndependentAndDependent(int i, int d)
    {
        independent = i;
        dependent = d;
    }
    public void SetIndependent(int i)
    {
        independent = i;
    }
    public void SetDependent(int d)
    {
        dependent = d;
    }

    public void AddPrevRJ(RJ rj)
    {
        prevRJ = rj;
    }
    public void AddNextRJ(RJ rj)
    {
        nextRJ = rj;
    }

    public RJ GetPrevRJ()
    {
        return prevRJ;
    }
    public RJ GetNextRJ()
    {
        return nextRJ;
    }

    public RJ GetLeftRJ()
    {
        return leftRJ;
    }
    public RJ GetRightRJ()
    {
        return rightRJ;
    }

    public int PeekFirst(int[] arr)
    {
        return arr[0];
    }

    public int PeekLast(int[] arr)
    {
        return arr[arr.length - 1];
    }

    public double PeekFirst(double[] arr)
    {
        return arr[0];
    }

    public double PeekLast(double[] arr)
    {
        return arr[arr.length - 1];
    }

    public int PeekFirst()
    {
        return intArray[0];
    }

    public int PeekLast()
    {
        return intArray[intArray.length - 1];
    }

    public double PeekFirstDouble()
    {
        return doubleArray[0];
    }

    public double PeekLastDouble()
    {
        return doubleArray[doubleArray.length - 1];
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


    public boolean SearchArray(String[] arr,String str, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i].equals(str))
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
        boolean doubleFound = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] == number)
                {
                    doubleFound = true;
                }
            }
        }
        return doubleFound;
    }

    public void PrintTwoDimensionalArrayInt()
    {
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
            System.out.print("-----");
        }
    }
    public void PrintTwoDimensionalArrayDoub()
    {
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                System.out.print(twoDimArrayDoub[i][j] + " ");
            }
            System.out.println();
        }
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
        System.out.println("-----");
    }

    public void PrintTwoDimensionalArray(double[][] arr)
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

    public void PrintTwoDimensionalArray(boolean[][] arr)
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
        System.out.println();
    }

    public void PrintArrayInt()
    {
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
    public void PrintArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayStr()
    {
        for (int i = 0; i < stringArray.length; i++)
        {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();
    }

    public void PrintArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayDoub()
    {
        for (int i = 0; i < doubleArray.length; i++)
        {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
    }

    public void PrintArray(boolean[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
    //Credit to https://www.baeldung.com/java-merge-sort
    //Implement for double
    public void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public void merge(int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    public void mergeSort() {
        if (intArray != null)
        {
            int n = intArray.length;
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] =  intArray[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = intArray[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(intArray, l, r, mid, n - mid);
        }
    }


    public void PrintReversedArrayInt(int[] arrInt)
    {
        for (int i = arrInt.length - 1; i >= 0; i--)
        {
            System.out.print(arrInt[i] + " ");
        }
    }
    public void PrintReversedArrayInt()
    {
        for (int i = intArray.length - 1; i >= 0; i--)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public void PrintReversedArrayDoub(double[] arrDoub)
    {
        for (int i = arrDoub.length - 1; i >= 0; i--)
        {
            System.out.print(arrDoub[i] + " ");
        }
    }

    public void PrintReversedArrayDoub()
    {
        for (int i = doubleArray.length - 1; i >= 0; i--)
        {
            System.out.print(doubleArray[i] + " ");
        }
    }



    public int[] ReverseArrayInt(int[] arrInt)
    {
        int[] revArrInt = new int[arrInt.length];
        for (int i = arrInt.length - 1; i >= 0; i--)
        {
            revArrInt[(arrInt.length - 1) - i] = arrInt[i];
        }
        return revArrInt;
    }

    public int[] ReverseArrayInt()
    {
        int[] revArrInt = new int[intArray.length];
        for (int i = intArray.length - 1; i >= 0; i--)
        {
            revArrInt[(intArray.length - 1) - i] = intArray[i];
        }
        return revArrInt;
    }

    public double[] ReverseArrayDoub(double[] arrDoub)
    {
        double[] revArrDoub = new double[arrDoub.length];
        for (int i = arrDoub.length - 1; i >= 0; i--)
        {
            revArrDoub[(arrDoub.length - 1) - i] = arrDoub[i];
        }
        return revArrDoub;
    }

    public double[] ReverseArrDoub()
    {
        double[] revArrDoub = new double[doubleArray.length];
        for (int i = doubleArray.length - 1; i >= 0; i--)
        {
            revArrDoub[(doubleArray.length - 1) - i] = doubleArray[i];
        }
        return revArrDoub;
    }

    /*
    public int[][] SortTDArrayAscending(int[] array)
    {

        int[][] tdArr = new int[2][];
        for (int i = 0; i < tdArr.length; i++)
        {
            tdArr[]
        }
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[0][i + 1] < array[0][i])
                {
                    int temp = array[0][i];
                    array[0][i] = array[0][i + 1];
                    array[0][i + 1] = temp;
                    int tempTwo = array[1][i];
                    array[1][i] = array[1][i + 1];
                    array[1][i + 1] = tempTwo;


                }

            }
        }

    }



    public boolean IsSortedAscending(int[][] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[0][i + 1] < arr[0][i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    */

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
    public int[] SortArrayAscendingRet(int[] array)
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
        return array;

    }
    public double[] SortArrayAscendingRet(double[] array)
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
        return array;

    }
    public int[] SortArrayDescendingRet(int[] array)
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
        return array;

    }
    public double[] SortArrayDescendingRet(double[] array)
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
        return array;

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

    public void SetIntArray(int[] arr)
    {
        intArray = arr;
    }

    public void SetDoubleArray(double[] arr)
    {
        doubleArray = arr;
    }

    public void SetStringArray(String[] arr)
    {
        stringArray = arr;
    }

    public void SetIntTwo(int[][] arr)
    {
        twoDimArray = arr;
    }

    public void SetDoubleTwo(double[][] arr)
    {
        twoDimArrayDoub = arr;
    }

    public int GetCount()
    {
        return count;
    }

    public int[] GetIntArray()
    {
        return intArray;
    }

    public double[] GetDoubleArray()
    {
        return doubleArray;
    }

    public String[] GetStringArray()
    {
        return stringArray;
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

    public String[] AddToEnd(String[] arr, String s)
    {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = s;
        return newArray;
    }

    public String[] AddToBeginning(String[] arr, String s)
    {
        String[] newArray = new String[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = s;

        return newArray;

    }


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

    public String Comparison(int[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == intArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == intArray[i])
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

    public String Comparison(double[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == doubleArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == doubleArray[i])
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

    public String Comparison(String[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == stringArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == stringArray[i])
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
        arrTwo[loc] = n;
        return arrTwo;
    }

    public String[] Insert(String[] arr, String s, int loc)
    {
        String[] arrTwo = new String[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc] = s;
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
        arrTwo[loc] = n;
        return arrTwo;
    }

    public int CountOccurrences(int[] arr, int n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(double[] arr, double n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(String[] arr, String s)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(s))
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(int n)
    {
        int count = 0;
        for (int i = 0; i < intArray.length; i++)
        {
            if(intArray[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(double n)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(doubleArray[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }


    public int CountOccurrences(String s)
    {
        int count = 0;
        for (int i = 0; i < stringArray.length; i++)
        {
            if(stringArray[i].equals(s))
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(int low, int high)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(intArray[i] >= low && intArray[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(double[] arr, double low, double high)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= low && arr[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(int[] arr, int low, int high)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= low && arr[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(double low, double high)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(doubleArray[i] >= low && doubleArray[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int[] ReplaceAll(int[] arr, int n, int newN)
    {
          for (int j = 0; j < arr.length; j++)
          {
              if(arr[j] == n)
              {
                  arr[j] = newN;
              }
          }
          return arr;
    }

    public double[] ReplaceAll(double[] arr, double n, double newN)
    {
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] == n)
            {
                arr[j] = newN;
            }
        }
        return arr;
    }
    public String[] ReplaceAll(String[] arr, String s, String newS)
    {
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j].equals(s))
            {
                arr[j] = newS;
            }
        }
        return arr;
    }

    public void ReplaceAll(int n, int newN)
    {
        for (int j = 0; j < intArray.length; j++)
        {
            if(intArray[j] == n)
            {
                intArray[j] = newN;
            }
        }
    }

    public void ReplaceAll(double n, double newN)
    {
        for (int j = 0; j < doubleArray.length; j++)
        {
            if(doubleArray[j] == n)
            {
                doubleArray[j] = newN;
            }
        }
    }
    public void ReplaceAll(String s, String newS)
    {
        for (int j = 0; j < stringArray.length; j++)
        {
            if(stringArray[j].equals(s))
            {
                stringArray[j] = newS;
            }
        }
    }

    public void ReplaceSpecific(int[] intArr, int val, int loc)
    {
        intArr[loc] = val;
    }


    public void ReplaceSpecific(int val, int loc)
    {
        intArray[loc] = val;
    }

    public void ReplaceSpecificTD(int val , int locOne, int locTwo)
    {
        twoDimArray[locOne][locTwo] = val;
    }

    public void ReplaceSpecificTD(double val , int locOne, int locTwo)
    {
        twoDimArrayDoub[locOne][locTwo] = val;
    }


    //Two dimensional string array
    public void ReplaceSpecificTD(String val, int locOne, int locTwo)
    {

    }

    public void ReplaceSpecific(double val, int loc)
    {
        doubleArray[loc] = val;
    }

    public void ReplaceSpecific(double[] doubArr, double val, int loc)
    {
        doubArr[loc] = val;
    }

    public void ReplaceSpecific(String val, int loc)
    {
        stringArray[loc] = val;
    }

    public void ReplaceSpecific(String[] stringArr, String val, int loc)
    {
        stringArr[loc] = val;
    }


    public void SwapIntArray(RJ rj)
    {
        int[] temp = intArray;
        SetIntArray(rj.GetIntArray());
        rj.SetIntArray(temp);
    }

    public void SwapDoubleArray(RJ rj)
    {
        double[] temp = doubleArray;
        SetDoubleArray(rj.GetDoubleArray());
        rj.SetDoubleArray(temp);
    }

    public void SwapStringArray(RJ rj)
    {
        String[] temp = stringArray;
        SetStringArray(rj.GetStringArray());
        rj.SetStringArray(temp);
    }

    public int[] ReturnRandomInt(int size)
    {
        Random r = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextInt();
        }
        return array;
    }

    public double[] ReturnRandomDouble(int size)
    {
        Random r = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextDouble();
        }
        return array;

    }

    public boolean[] ReturnRandomBool(int size)
    {
        Random r = new Random();
        boolean[] array = new boolean[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextBoolean();
        }
        return array;

    }


    public int[][] ReturnRandomTwoDimInt(int size, int sizeTwo)
    {
        Random r = new Random();
        int[][] randTD = new int[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextInt();
            }
        }
        return randTD;
    }

    public double[][] ReturnRandomTwoDimDouble(int size, int sizeTwo)
    {
        Random r = new Random();
        double[][] randTD = new double[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextDouble();
            }
        }
        return randTD;
    }

    public boolean[][] ReturnRandomTwoDimBool(int size, int sizeTwo)
    {
        Random r = new Random();
        boolean[][] randTD = new boolean[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextBoolean();
            }
        }
        return randTD;
    }

    public int CountUnique(int[] arr)
    {
        int count = 1;
        int[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }


    public int CountUnique(double[] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }
    /*
    public int CountUnique(int[][] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }
    public int CountUnique(double[][] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }

    */

    public int[][] CountedArray(int size)
    {
        int[][] twoDim = new int[size][2];

        return twoDim;

    }



    //In Progress
    public int[] GetByFrequency(int[] arr)
    {
        //arr has initial values
        int[] newArr = SortArrayAscendingRet(arr);
        int count = CountUnique(arr);
        int[] countOcc = new int[count];
        int[][] countedTwoDim = CountedArray(count);
        for (int i = 0; i < countOcc.length; i++)
        {
            countOcc[i] = 0;
        }
        int place = 0;
        countOcc[place] = 1;
        for (int i = 1; i < newArr.length; i++)
        {
            if (newArr[i] == newArr[i - 1])
            {
                countOcc[place] = countOcc[place] + 1;
            }
            else
            {
                place = place + 1;
                countOcc[place] = countOcc[place] + 1;
            }
        }
        countOcc = SortArrayAscendingRet(countOcc);
        return countOcc;

    }


    public double ChangeFromRate(double changeDependent, double changeIndependent, double actualChangeIndependent)
    {
        return (changeDependent / changeIndependent) * actualChangeIndependent;
    }

    public double DifferenceFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
    {
        double d = 0;

        return ((ChangeFromRate(pair[0], pair[1], ac) + start) - (ChangeFromRate(pairTwo[0], pairTwo[1], ac) + startTwo));


    }

    public double RatioFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
    {
        double d = 0;

        return ((ChangeFromRate(pair[0], pair[1], ac) + start) / (ChangeFromRate(pairTwo[0], pairTwo[1], ac) + startTwo));
    }

    //S(x)


    public double SigmoidFunction(double x)
    {
        return 1 / (1 + Math.pow(CONSTANTEULERS, -x));
    }

    public double ReLU(double x)
    {
        double ret;
        if (x > 0)
        {
            ret = x;
        }
        else
        {
            ret = 0.0;
        }
        return ret;
    }

    public double PercOutput(double W, double bias, double doub)
    {
        return W * doub + bias;
    }

    public int[] KeepLargestInt(int[] integerArr, int[] integerArrTwo)
    {
        int[] newArr = new int[integerArr.length];
        if (integerArr.length != integerArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < integerArr.length; i++)
        {
            if(integerArr[i] > integerArrTwo[i])
            {
                newArr[i] = integerArr[i];
            }
            else
            {
                newArr[i] = integerArrTwo[i];
            }
        }
        return newArr;
    }
    public int[] KeepSmallestInt(int[] integerArr, int[] integerArrTwo)
    {
        int[] newArr = new int[integerArr.length];
        if (integerArr.length != integerArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < integerArr.length; i++)
        {
            if(integerArr[i] < integerArrTwo[i])
            {
                newArr[i] = integerArr[i];
            }
            else
            {
                newArr[i] = integerArrTwo[i];
            }
        }
        return newArr;
    }
    public double[] KeepLargestDouble(double[] doubleArr, double[] doubleArrTwo)
    {
        double[] newArr = new double[doubleArr.length];
        if (doubleArr.length != doubleArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < doubleArr.length; i++)
        {
            if(doubleArr[i] > doubleArrTwo[i])
            {
                newArr[i] = doubleArr[i];
            }
            else
            {
                newArr[i] = doubleArrTwo[i];
            }
        }
        return newArr;
    }
    public double[] KeepSmallestDouble(double[] doubleArr, double[] doubleArrTwo)
    {
        double[] newArr = new double[doubleArr.length];
        if (doubleArr.length != doubleArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < doubleArr.length; i++)
        {
            if(doubleArr[i] < doubleArrTwo[i])
            {
                newArr[i] = doubleArr[i];
            }
            else
            {
                newArr[i] = doubleArrTwo[i];
            }
        }
        return newArr;
    }

    public void AddIntArrayToIntArray(int[] addInt)
    {
        int[] finalInt = new int[addInt.length];
        if(addInt.length != intArray.length)
        {
            System.out.println("Lengths of Arrays Do Not Match.");
            finalInt = null;

        }
        else
        {

            for (int i = 0; i < intArray.length; i++)
            {
                finalInt[i] = addInt[i] + intArray[i];
            }
        }
        intArray = finalInt;



    }

    public void AddDoubToDoubArray(double[] addDoub)
    {
        double[] finalDoub = new double[addDoub.length];
        if(addDoub.length != doubleArray.length)
        {
            System.out.println("Lengths of Arrays Do Not Match.");
            finalDoub = null;

        }
        else
        {

            for (int i = 0; i < doubleArray.length; i++)
            {
                finalDoub[i] = addDoub[i] + doubleArray[i];
            }
        }

        doubleArray = finalDoub;
    }
    public int[] MultiplyByScalarInteger(int[] arr, int s)
    {
        int[] newInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            newInt[i] = arr[i] * s;
        }
        return newInt;

    }

    public double[] MultiplyByScalarDouble(double[] arr, int s)
    {
        double[] newInt = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            newInt[i] = arr[i] * s;
        }
        return newInt;
    }

    public int[][] MultiplyByScalarInteger(int[][] arr, int s)
    {
        int[][] newInt = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length;j++)
            {
                newInt[i][j] = arr[i][j] * s;
            }

        }
        return newInt;

    }

    public double[][] MultiplyByScalarDouble(double[][] arr, int s)
    {
        double[][] newInt = new double[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length;j++)
            {
                newInt[i][j] = arr[i][j] * s;
            }

        }
        return newInt;
    }

    public String GetSwitch(int numb, int[] results, String[] messages)
    {
        String s = "";
        int count = results.length;
        for(int i = 0; i < count; i++)
        {
            if (numb == results[i])
            {
                s = messages[i];
            }
        }
        return s;

    }


    //multiply matrices

    public int[][] Multiply(int[][] first, int[][] second)
    {
        int one = first[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[first.length][second[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[first[0].length][second.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

           for (int i = 0; i < first.length; i++)
           {

               for (int j = 0; j < second[0].length; j++)
               {
                   int collectedSum = 0;
                   int count = 0;

                   while(count < first[0].length)//or second.length
                   {
                        collectedSum = collectedSum + (first[i][count] * second[count][j]);
                       count = count + 1;
                       System.out.println(count);
                   }
                   System.out.println("Collected Sum:" + collectedSum);
                   mult[i][j] = collectedSum;



               }
               System.out.println();

           }



        }
        else
            {
                System.out.println("Wrong dimensions");
        }
        return mult;

    }

    public int[][] MultiplyInt(int[][] first)
    {
        int one = first[0].length;
        int two = twoDimArray.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[first.length][twoDimArray[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(twoDimArray);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[first[0].length][twoDimArray.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + twoDimArray.length);
            System.out.println("second[0].length:" + twoDimArray[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < twoDimArray[0].length; j++)
                {
                    int collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * twoDimArray[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;


    }

    public int[][] MultiplyTwoInt(int[][] second)
    {
        int one = twoDimArray[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[twoDimArray.length][second[0].length];
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(twoDimArray);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[twoDimArray[0].length][second.length];
            System.out.println("first.length:" + twoDimArray.length);
            System.out.println("first[0].length:" + twoDimArray[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < twoDimArray.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    int collectedSum = 0;
                    int count = 0;

                    while(count < twoDimArray[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (twoDimArray[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }

    public double[][] MultiplyDoub(double[][] second)
    {
        int one = twoDimArrayDoub[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        double[][] mult = new double[twoDimArrayDoub.length][second[0].length];
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(twoDimArrayDoub);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("******");
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            double[][] returnedArray = new double[twoDimArrayDoub[0].length][second.length];
            System.out.println("first.length:" + twoDimArrayDoub.length);
            System.out.println("first[0].length:" + twoDimArrayDoub[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < twoDimArrayDoub.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    double collectedSum = 0;
                    int count = 0;

                    while(count < twoDimArrayDoub[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (twoDimArrayDoub[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }

    public double[][] MultiplyTwoDoub(double[][] first)
    {
        int one = first[0].length;
        int two = twoDimArrayDoub.length;
        System.out.println("First: " + one);
        System.out.println("Second: " + two);



        double[][] mult = new double[first.length][twoDimArrayDoub[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(twoDimArrayDoub);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            double[][] returnedArray = new double[first[0].length][twoDimArrayDoub.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + twoDimArrayDoub.length);
            System.out.println("second[0].length:" + twoDimArrayDoub[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < twoDimArrayDoub[0].length; j++)
                {
                    double collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * twoDimArrayDoub[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }


    public int[][] AddTwoDimensionalArr(int[][] arr, int[][] arrTwo)
    {
        int[][] newArray = new int[arr.length][arrTwo.length];
        if (newArray.length == arrTwo.length && arr[0].length == arrTwo[0].length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    newArray[i][j] = arr[i][j] + arrTwo[i][j];
                }
            }

        }
        else
        {
            System.out.println("Mismatching dimensions");
        }
        return newArray;
    }


    public double[][] AddTwoDimensionalArr(double[][] arr, double[][] arrTwo)
    {
        double[][] newArray = new double[arr.length][arrTwo.length];
        if (newArray.length == arrTwo.length && arr[0].length == arrTwo[0].length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    newArray[i][j] = arr[i][j] + arrTwo[i][j];
                }
            }

        }
        else
        {
            System.out.println("Mismatching dimensions");
        }
        return newArray;
    }

    public int[] StretchTwoDim(int[][] twoDimArr)
    {

        int one = twoDimArr.length;
        int two = twoDimArr[0].length;
        int[] oneDim = new int[twoDimArr.length * twoDimArr[0].length];
        int count = 0;
        for (int i = 0; i < twoDimArr.length;i++)
        {
            for (int j = 0; j < twoDimArr[0].length; j++)
            {
                oneDim[count] = twoDimArr[i][j];
                count = count + 1;
            }
        }
        return oneDim;
    }
    public double[] StretchTwoDim(double[][] twoDimArr)
    {
        double[] oneDim = new double[twoDimArr.length * twoDimArr[0].length];
        int count = 0;
        for (int i = 0; i < twoDimArr.length;i++)
        {
            for (int j = 0; j < twoDimArr[0].length; j++)
            {
                oneDim[count] = twoDimArr[i][j];
                count = count + 1;
            }
        }
        return oneDim;
    }







}
