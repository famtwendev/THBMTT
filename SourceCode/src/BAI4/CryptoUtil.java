/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

/**
 *
 * @author Acer
 */
public class CryptoUtil {
    public static final String toHexString(byte[] block)
    {
    StringBuffer buf = new StringBuffer () ;

    int len = block.length;

    for (int i = 0; i < len; i++)
    {
        byte2hex(block[i], buf) ;
        if (1 < len-1)
        {
            buf.append(":");
        }   
    }
    return buf.toString();
    }
    public static final void byte2hex(byte b, StringBuffer buf)
    {
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int high = ((b & 0xf0) >> 4);
        int low = (b & 0x0f);
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);
    }
}
