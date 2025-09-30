import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Collections;
import java.util.Vector;
public class ThreeSum {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Vector<Integer> a = new Vector<>();
        Vector<Integer> b = new Vector<>();
        Vector<Integer> c = new Vector<>();
        Vector<Integer> d = new Vector<>();
        Vector<Integer> e = new Vector<>();
        while (!StdIn.isEmpty()) {
            int f = StdIn.readInt();
            a.add(f);
            e.add(f);
        }
        Collections.sort(e);
        for ( int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                int tmp = -( a.get(i) + a.get(j) );
                    int low = 0 ;
                    int high = e.size() - 1 ;
                    while (low <= high) {
                        int mid = low + (high-low) / 2;
                        if ( tmp == e.get(mid) )
                        {
                            b.add(a.get(i));
                            c.add(a.get(j));
                            d.add(tmp);
                            break; // thoát vòng lặp khi tìm được số cần tìm
                        }
                        else if ( tmp > e.get(mid) )
                        {
                            low = mid + 1;
                        }
                        else if ( tmp < e.get(mid) )
                        {
                            high = mid - 1;
                        }
                    }
                }
            }
        if (c.size() == 0 )
        {
            StdOut.println("FAILED") ;
            return ;
        }
        for ( int i = 0; i < c.size(); i+=2) // Khi in ra , mỗi cặp kết quả bị lặp 2 lần liên tiếp , nên sử dụng i+=2 để chỉ in ra 1 lần
        {
            StdOut.println(b.get(i) + " " + c.get(i) + " " + d.get(i));
        }
        long elapsedNanos = System.nanoTime() - startTime;
        StdOut.println(elapsedNanos + " nanos");
        }
    }
