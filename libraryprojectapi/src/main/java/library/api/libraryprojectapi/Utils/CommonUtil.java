package library.api.libraryprojectapi.Utils;

import java.util.Random;

public class CommonUtil {
    public static String getRandomPassoword(){
        Random random = new Random();
        String password = "";
        for(int i = 0; i<6; i++){
            password = password + random.nextInt(9);
        }
        return password;
    }
}
