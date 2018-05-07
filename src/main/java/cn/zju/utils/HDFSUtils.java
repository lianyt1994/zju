package cn.zju.utils;

import com.google.common.primitives.Bytes;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;

public class HDFSUtils {

    public static final String HDFS_PATH = "hdfs://192.168.80.135:8020";
    static Configuration configuration = new Configuration();
    static FileSystem fileSystem;

    static {
        try {
            fileSystem = FileSystem.get(new URI(HDFS_PATH),configuration);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(MultipartFile file,String id){
        FSDataOutputStream fsDataOutputStream = null;
        try {
            fsDataOutputStream = fileSystem.create(new Path("/root/a/"+id));
            fsDataOutputStream.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fsDataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static byte[] getFile(String id){
        byte[] bytes = new byte[1204];
        try {
            FSDataInputStream fsDataInputStream = fileSystem.open(new Path("/root/a/" + id));
            fsDataInputStream.readFully(0, bytes);
            fsDataInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
