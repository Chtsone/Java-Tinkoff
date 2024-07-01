package OlpAlgoritms;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class TwoTwoOne
    {

        public static void main(String[] args)
            {
                int[] i = new int[]{1,2,1,2,3,4,5,1};



                //List <Integer> list = Arrays.stream(i).filter((x) -> x >= 1 && x <= 2).sorted().boxed().toList();



                System.out.println(example5(i));

            }
        public static int example(int [] arr)
        {
            Set<Integer> mas = new HashSet<>();
            int counter = 0;
            for (int i = 0; i < arr.length;i++)
                {
                    if(!mas.add(arr[i]))
                        {
                            counter++;
                        }
                }
            return counter;
        }
        public static int[] example2(int [] arr, int v)
                {
                //{1,2,3,4,5}
                // 5 - 1 = 4
                //conteinst(4) return arr[]
                int [] a = new int[2];
                HashSet <Integer> hashSet = new HashSet<>();
                for (int i = 0; i < arr.length;i++)
                    {

                        if (hashSet.contains(v - arr[i]))
                            {
                                a[0] = arr[i];
                                a[1] = v - arr[i];
                                return a;
                            }
                        hashSet.add(arr[i]);
                    }


                    return null;
            }
        public static ArrayList example4(int [] arr, int a,int b)
            {
                ArrayList list = new ArrayList();
                for(int x: arr)
                    {
                        if (x >= a && x <= b )
                            {
                                list.add(x);
                            }
                    }
                Collections.sort(list);
                return list;
            }
        public static int example5(int [] arr)
            {
                int max = 0;
                int localMax = 0;
                for (int i = 0; i < arr.length - 1;i++ )
                    {
                        if (arr[i] < arr[i+1])
                            {
                                localMax++;
                            }
                        else
                            {
                                if( max < localMax)
                                    {
                                        max = localMax;
                                    }

                                localMax = 0;
                            }
                    }
                if (localMax > max){ max = localMax;}
                return max + 1;
            }

    }
