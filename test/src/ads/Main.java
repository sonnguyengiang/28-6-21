package ads;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++)
                dout.writeInt(a[i]);

            dout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
