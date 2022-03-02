public class Duplicate {
    public boolean hasDuplicate (int[][] arr)
    {
        for (int i = 0; i < arr[0].length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                int num = arr[j][i];
                for (int k = j + 1; k < arr.length; k++)
                {
                    if(num == arr[k][i])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

