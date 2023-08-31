public class Main3Part2
{
    public static void main (String[] args)
    {
        int N = 10;
        int M = 100000;
        int[ ][ ] boxes = new int[N][];
        for(int i =0; i< N; i++)
        {
            int[ ] box = new int[M];
            boxes[i] = box;
        }
    }
}

/*
the array 'boxes' is an array of arrays where each sub-array
is from the array created in 'box' of length M.
Its more memory efficient than the previous version of the code
given.

This code is different from the other version as this version
reuses the memory by storing references to existing arrays.

I can increase the value of N comparatively larger than in the
first version of the code as the memory efficiency gained by
using an array of arrays would allow me to test N with a hundred thousands
or even higher

For my machine, N = 1000000000 is the limit as far as I have tested.

 */