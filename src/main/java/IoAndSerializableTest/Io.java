package IoAndSerializableTest;

import java.io.*;

public class Io {
    public static void main(String[] args) throws Exception{
        //importMyFile();
        ObjectIo();
    }

    public static void ObjectIo(){
        testObject obj = new testObject("Io",23);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("G:说明.txt");
            FileInputStream fileInputStream = new FileInputStream("G:说明.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objectOutputStream.writeObject(obj);
            //把缓冲区的内容刷到文件中 , 但不会关闭io流
            objectOutputStream.flush();
            //在io流不用的时候就把io流关闭
            objectOutputStream.close();
            System.out.println(obj);
            obj = (testObject) objectInputStream.readObject();
            System.out.println(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void importMyFile(){
        try{
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("G:说明.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("G:/说明2.txt"));
            byte[] bytes = new byte[8];
            int len = 0 ;
            while(len > -1) {
                len = bufferedInputStream.read(bytes);
                if(len > -1) {
                    bufferedOutputStream.write(bytes, 0, len);
                }
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            System.out.println(new String(bytes));
        }catch(Exception ex){
            System.out.println(ex);
        }
    }


}
