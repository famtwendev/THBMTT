/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.Buffer;
import java.security.interfaces.RSAPublicKey;

/**
 *
 * @author Acer
 */
public class Enc_RSA {
    public static void main(String[] args) throws Exception{
        String s="Nguyen Pham Tuyen";
        FileInputStream f = new FileInputStream("D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\RSA\\Skey_RSA_pub.dat");
        ObjectInputStream b = new ObjectInputStream(f);
        
        RSAPublicKey pbk = (RSAPublicKey)b.readObject();
        BigInteger e = pbk.getPublicExponent();
        BigInteger n = pbk.getModulus();
        System.out.println("e= "+e);
        System.out.println("n= "+n);
        byte ptext[]= s.getBytes("UTF8");
        BigInteger m = new BigInteger(ptext);
        BigInteger c=m.modPow(e, n);
        System.out.println("c= "+c);
        String cs = c.toString();
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\RSA\\Enc_RSA.dat")));
        out.write(cs,0,cs.length());
        out.close();
    }
}
