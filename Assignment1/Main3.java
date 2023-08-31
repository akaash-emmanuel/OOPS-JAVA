//the snippet of code, modified with my file name is as follows

public class Main3
{
    public static void main(String[] args)
    {
        int N = 10;
        int M = 100000;
        for(int i =0; i< N; i++)
        {
            int[ ] box = new int[M];
        }
    }
}

/*
basically the code is only impacting my systems memory usage
and performance as the arrays being created and discarded in
the for loop are not being used for any purpose apart from
their creation in the loop
 */

/*
the size of each array is 4M bytes (each int taking 4 bytes of
memory) and as the code creates a new integer array 'box' with
a length M in each iteration of the loop there are large values of N
for which this program may not work.
Memory consumption for each iteration is: '4MN'
if 4MN > memory available, the code may delay/lag my system
 */