/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import static jdk.vm.ci.riscv64.RISCV64.f1;

/**
 *
 * @author Acer
 */
public class Skey_RSA {
    public static void main(String[] args) throws Exception{
        KeyPairGenerator kpg=KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        KeyPair kp=kpg.genKeyPair();
        PublicKey pbkey = kp.getPublic();
        PrivateKey prkey = kp.getPrivate();
        FileOutputStream f1= new FileOutputStream("D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\RSA\\Skey_RSA_pub.dat");
        ObjectOutputStream b1 = new ObjectOutputStream(f1);
        b1.writeObject(pbkey);
        FileOutputStream f2 = new FileOutputStream("D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\RSA\\Skey_RSA_priv.dat");
        ObjectOutputStream b2 = new ObjectOutputStream(f2);
        b2.writeObject(prkey);
    }
}
