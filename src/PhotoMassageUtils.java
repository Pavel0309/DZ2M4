import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class PhotoMassageUtils {

    public static list<String> savePhoto(List<File> Files,String botToken)throws IOException{
        Random random = new Random();
        ArrayList<String> paths = new ArrayList<>();
    for (File file: files){
        final String imageUrl ="https://api.telegram.org/file/bot" + botToken +"/" + file.getFilePath;
        final String localFileName = "image/"+ new Date().getTime()+random.nextLong()+".jpeg";
        saveImage(imageUrl,localFileName);
        paths.add(localFileName);
    }
return  paths;
    }

public static void saveImage(String url, String fileName)throws IOException {
        URl urlModel= new URL(url);
    InputStream inputStream= urlModel.openStream();
    OutputStream outputStream = new FileOutputStream(fileName);
    byte[] b = new byte[2048];
    int length;
    while ((length = inputStream.read(b)) !=-1){
        outputStream.write(b,0,length);
    }
    inputStream.close();
    outputStream.close();
    }



}
