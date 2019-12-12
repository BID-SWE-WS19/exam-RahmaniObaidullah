package BID.SWE;

import java.io.*;

public class Exercise4Impl implements Exercise4
{

    @Override
    public Object Method1() {
        ByteArrayOutputStream s = new ByteArrayOutputStream();
        DataOutputStream sw = new DataOutputStream(s);
        try {
            sw.writeUTF("Frohe Weihnachten");
            sw.writeInt(42);
            sw.writeBoolean(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(s.toByteArray());
    }

    @Override
    public Object Method2(Object o) {
        InputStream s = (InputStream) o;
        DataInputStream sr = new DataInputStream(s);
        try {
            sr.readInt();
            sr.readBoolean();
            sr.read();
            return sr.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
