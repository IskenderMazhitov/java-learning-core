package com.company.AAAJavaCollections;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
public class m {
    public static void main(String[] args) {
        System.out.println("Before generics:");

        List ls = Arrays.asList(new Integer[] {1, new Integer(2), new Integer(3)});
        int s = 0;
        for (Iterator it = ls.iterator(); it.hasNext();){
            int n = ((Integer)it.next()).intValue();
            s += n;
        }
        System.out.println(s);
        System.out.println("After generics:");
        List<Integer> ints = Arrays.asList(1,2,3);
        int ans = 0;
        for(Integer elem:ints){
            ans += elem;
        }
        System.out.println(ans);
    }


}
