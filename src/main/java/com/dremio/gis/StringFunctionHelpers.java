package com.dremio.gis;

public class StringFunctionHelpers {
    public static String toStringFromUTF8(int start, int end, org.apache.arrow.memory.ArrowBuf buffer) {
        byte[] buf = new byte[end - start];
        buffer.getBytes(start, buf, 0, end - start);
        String s = new String(buf, com.google.common.base.Charsets.UTF_8);
        return s;
    }
}
