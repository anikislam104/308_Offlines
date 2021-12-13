package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sortingBlankList() {
        Sort sort=new Sort();
        int[] arr={};
        int size=0;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        //System.out.println(temp[0]);
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingOneNumber() {
        Sort sort=new Sort();
        int[] arr={2};
        int size=1;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;
        //temp2[0]=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr2[i]+"  "+temp2[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingTwoNumber() {
        Sort sort=new Sort();
        int[] arr={3,2};
        int size=2;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        //System.out.println(temp[0]);
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingRandomSize() {
        Sort sort=new Sort();
        int size= (int) Math.random()%100;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=size-i;
        }
        //int size=0;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingRandomNumbers() {
        Sort sort=new Sort();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=100-i;
        }
        int size=100;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingAscended() {
        Sort sort=new Sort();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=2*i;
        }
        int size=100;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingDescended() {
        Sort sort=new Sort();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=100-i;
        }
        int checkSort=1;
        int checkArrAlter=1;
        int size=100;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingEqual() {
        Sort sort=new Sort();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=100;
        }
        int size=100;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //temp2[0]=50;
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }

    @Test
    void sortingAllNegative() {
        Sort sort=new Sort();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=-i;
        }
        int size=100;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int[] temp2=sort.selectionSort(arr2);
        int checkSort=1;
        int checkArrAlter=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //System.out.println(arr[i]+"  "+temp[j]);
                if(arr[i]==temp2[j]){
                    temp2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        //temp2[0]=50;
        //System.out.println(temp[0]);
        if(arr.length!=temp2.length){
            System.out.println("Array altered");
            checkArrAlter=0;
        }
        for(int i=0;i<size;i++){
            if(temp2[i]!=Integer.MAX_VALUE){
                //System.out.println(temp2[i]);
                System.out.println("Array altered");
                checkArrAlter=0;
            }
        }
        int checkBoth=0;
        if(checkSort==1 && checkArrAlter==1){
            checkBoth=1;
        }
        if(checkBoth==1){
            System.out.println("Successfully tested");
        }
        else{
            assertEquals(1,0);
        }
    }
}