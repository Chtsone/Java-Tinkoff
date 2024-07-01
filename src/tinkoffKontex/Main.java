package tinkoffKontex;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
    {
        public static void main(String[] args)
            {
                int[] mass = new int[]{5,4,2};
                Massive obj = new Massive(3,2,7);
                obj.setArray(mass);
                changePositiveArray(obj);
                System.out.printf(Arrays.toString(obj.getArray()));




            }
        public static Massive nullCountOr(Massive obj)
            {
                if( nullCounter(obj.getArray()) != 0)
                    {
                        nullCountMore(obj);
                        return  obj;
                    }

                else
                    {
                        obj.setCount(0);
                        return  obj;
                    }
            }
        public static Massive nullCountMore(Massive obj)
            {
                int negative = getNumberNegativeValue(obj.getArray());
                int[] mass = obj.getArray();
                int c = nullCounter(mass);
                if(negative != 0)
                    {
                        if (c % 2 == 1 && negative % 2 == 0 ){ for(int i = 0; i < mass.length;i++){if(mass[i] == 0){mass[i] = mass[i] - obj.getValue();}}}
                        else {for(int i = 0; i < mass.length;i++){if(mass[i] == 0){mass[i] = mass[i] + obj.getValue();}}}

                    }
                else
                    {
                        if (c % 2 == 1){ for(int i = 0; i < mass.length;i++){if(mass[i] == 0){mass[i] = mass[i] - obj.getValue();}}}
                        else
                        {
                            boolean flag = true;
                            for(int i = 0; i < mass.length;i++)
                            {
                                if(flag)
                                    {
                                        if (mass[i] == 0)
                                            {
                                                mass[i] = mass[i] - obj.getValue();
                                            }
                                        flag = false;
                                    }
                                else
                                    {
                                        if (mass[i] == 0)
                                            {
                                                mass[i] = mass[i] - obj.getValue();
                                            }
                                        flag = false;
                                    }
                            }
                        }
                    }

                return obj;
            }






        public static int  getIndexMinNegativeNumber(int[] arr){
            int temp = arr[0];
            int indexNegativeNumber = -1;
            for(int i = 0; i < arr.length; i ++){
                if(arr[i] < 0 && temp > arr[i]){
                    temp = arr[i];
                    indexNegativeNumber = i;
                }
            }
            return indexNegativeNumber;
        }
        public static int getIndexModuleMaximumValue(int[]arr){
            int index = 0;
            for(int i =0; i < arr.length; i ++){
                if(Math.abs(arr[index]) <= Math.abs(arr[i])) index = i;
            }
            return index;
        }
        public static int getIndexModuleMinValue(int[]arr){
            int index = 0;
            for(int i =0; i < arr.length; i ++){
                if(Math.abs(arr[index]) >= Math.abs(arr[i])) index = i;
            }
            return index;
        }
        public static int getIndexMinValue(int[]arr){
            int index = 0;
            for(int i =0; i < arr.length; i ++){
                if(arr[index] >= arr[i]) index = i;
            }
            return index;
        }
        public static void getChangedArray(Massive massive, int index){
            if(massive.getArray()[index] > 0) massive.getArray()[index] = massive.getArray()[index] + massive.getCount() * massive.getValue();
            else massive.getArray()[index] = massive.getArray()[index] - massive.getCount() * massive.getValue();
        }

        public static void changeNegativeArray(Massive massive){
            if(massive.getCount() != 0){
                int index = getIndexModuleMaximumValue(massive.getArray());
                getChangedArray(massive,index);
            }
        }
        public static void changePositiveArray(Massive massive){
            if(massive.getCount() != 0) {
                int[] arr = massive.getArray();
                int index = getIndexMinValue(arr);
                if (arr[index] >= massive.getValue() * massive.getCount()) {
                    arr[index] = arr[index] - massive.getCount() * massive.getValue();
                } else {
                    boolean canNext = false;
                    for (int i = 1; i <= massive.getCount() && !canNext; i++) {
                        if ((arr[index] - i * massive.getValue()) < 0) {
                            canNext = true;
                            arr[index] = arr[index] - i * massive.getValue();
                            massive.setCount(massive.getCount() - i);
                        }
                    }
                    if (massive.getCount() > 0) {
                        int indexMinModValue = getIndexModuleMinValue(massive.getArray());
                        getChangedArray(massive, indexMinModValue);
                    }
                }
            }
        }
        public static void changeMixedArray(Massive massive){
            if(massive.getCount() != 0){
                if(getNumberNegativeValue(massive.getArray()) % 2 == 0){
                    int indexNegativeNumber = getIndexMinNegativeNumber(massive.getArray());
                    if((massive.getArray()[indexNegativeNumber] + massive.getValue()*massive.getCount()) < 0){
                        massive.getArray()[indexNegativeNumber] = massive.getArray()[indexNegativeNumber] + massive.getValue()*massive.getCount();
                    }
                    else {
                        boolean canNext = false;
                        for(int i = 1 ; i <= massive.getCount() && !canNext; i ++){
                            if ((massive.getArray()[indexNegativeNumber] + i * massive.getValue()) > 0) {
                                canNext = true;
                                massive.getArray()[indexNegativeNumber] = massive.getArray()[indexNegativeNumber] + i * massive.getValue();
                                massive.setCount(massive.getCount() - i);
                            }
                        }
                        if (massive.getCount() > 0) {
                            int indexMaxModValue = getIndexModuleMaximumValue(massive.getArray());
                            getChangedArray(massive, indexMaxModValue);
                        }
                    }
                }
                else {
                    int index = getIndexModuleMaximumValue(massive.getArray());
                    getChangedArray(massive,index);
                }
            }

        } // Если число отриц, то надо отнимать, иначе добавлять











        public static int nullCounter(int[] mass)
            {
                int count = 0;
                for (int i = 0; i < mass.length; i++)
                    {
                        if(mass[i] == 0)
                            {
                                count++;
                            }
                    }
                return count;
            }
        public static int getNumberNegativeValue(int[] arr){
            int countNegativeNumber = 0;
            for(int i = 0; i < arr.length; i ++){
                if(arr[i] < 0) countNegativeNumber++;
            }
            return countNegativeNumber;
        }

    }

