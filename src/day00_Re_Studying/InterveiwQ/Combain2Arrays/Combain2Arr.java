package day00_Re_Studying.InterveiwQ.Combain2Arrays;

import java.util.ArrayList;

public class Combain2Arr {
    public static void main(String[] args) {
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<arr1.length; i++){
            String eachElement=arr1[i];
            list.add(eachElement);//arr1
        }
        System.out.println(list);//[A, B, C]
        for (String eachElement: arr2){
            list.add(eachElement);
        }
        System.out.println(list);//[A, B, C, D, E, F, G]
    }
}
