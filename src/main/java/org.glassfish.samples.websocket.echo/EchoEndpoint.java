package org.glassfish.samples.websocket.echo;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 * Echo endpoint.
 *
 * @author Pavel Bucek (pavel.bucek at oracle.com)
 */
@ServerEndpoint("/echo")
public class EchoEndpoint {

    @OnMessage
    public ByteBuffer echo(String message) throws IOException {
        //return message;

        InputStream is=null;
        ByteBuffer returnVideo=null;
        try {
            is = new FileInputStream("/home/dimitris/NetBeansProjects/Echo/target/ali.mp4");
            returnVideo=readToByteBuffer(is);
            is.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnVideo;
    }
    
    static ByteBuffer readToByteBuffer(InputStream inStream) throws IOException {
     int bufferSize = 0x80000;//~500K
    byte[] buffer = new byte[bufferSize];
    ByteArrayOutputStream outStream = new ByteArrayOutputStream(bufferSize);
    int read;
    while (true) {
      read = inStream.read(buffer);
      if (read == -1)
        break;
      outStream.write(buffer, 0, read);
    }
    ByteBuffer byteData = ByteBuffer.wrap(outStream.toByteArray());
    return byteData;
      //  ByteBuffer myVideo= new ByteBuffer();
    }
    
}
