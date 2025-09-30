import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Collections;
import java.util.Vector ;
public class TwoSum {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>();
        Vector<Integer> b = new Vector<>();
        Vector<Integer> c = new Vector<>();
        Vector<Integer> d = new Vector<>();
        while (!StdIn.isEmpty()) {
             int f = StdIn.readInt();
             a.add(f);
             d.add(f);
        }
        Collections.sort(d);
        for (int i = 0; i < a.size(); i++) {
            int tmp = -a.get(i);
            int low = 0;
            int high = a.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ( d.get(mid) == tmp ) {
                    b.add(a.get(i));
                    c.add(tmp);
                    break;
                }
                if (d.get(mid) > tmp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
            for ( int i = 0 ; i < b.size()/2 ; i++ ) {
                StdOut.println(b.get(i) + " " + c.get(i));
            }
        }
    }
