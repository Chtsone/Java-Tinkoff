import java.util.*;

public class t1
    {

//        int[] mass = new int[] {2,4,1,1,3,6,5,1 };
//        int start = 1 ;
//        int end = 4;
//        int[] newmass = Arrays.copyOfRange(mass,start,end+1);
//                System.out.printf(Arrays.toString(newmass));
//        boolean isUbave = false;
//        boolean isVozrastaet = false;
//        boolean temp = true;
//                for (int i = 0;i < newmass.length - 1;i++)
//        {
//            if(temp){
//                if (newmass[i] >= newmass[i + 1])
//                    {
//                        isUbave = true;
//                    } else
//                    {
//                        temp = false;
//                    }
//            }
//
//            if(isUbave )
//                {
//                    if (newmass[i] <= newmass[i + 1])
//                        {
//                            isVozrastaet = true;
//                        }
//                    else
//                        {
//                            System.out.print("Yes");
//                            break;
//                        }
//                }
//            else
//                {
//                    System.out.print("Yes");
//                    break;
//                }
//        }
//
//
//
//                if(isVozrastaet )
//        {
//            System.out.printf("No");
//        }
//                else
//        {
//            System.out.printf("Yes");
//        }
//
//

        public static void funct1()
            {

                int countData = 10;
                int countServer = 3;
                int help = countServer;
                while (countData >= countServer)
                    {
                        countData -= countServer;

                        countServer--;
                        if (countServer == 0)
                            {

                                countServer = help;
                            }
                        System.out.println(countData);
                    }
            }


    public static void funct2()
        {

            String password = "dsddddssa";
            int countDelete = 3;
            if(countDelete >= password.length()){
                // return 0;
            }
            else {
                HashMap<Character,Integer> hm = new HashMap<>();
                for(int i = 0; i < password.length(); i++){
                    if(hm.containsKey(password.charAt(i))){
                        hm.put(password.charAt(i),hm.get(password.charAt(i))+1);
                    }
                    else hm.put(password.charAt(i),1);
                }
                List <Integer> list = (List<Integer>)hm.values();
                Collections.sort(list);



            }




        }



    }



