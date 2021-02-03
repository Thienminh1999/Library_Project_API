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

    public static String getRandomUserID(){
        Random random = new Random();
        String userID = "";
        for(int i = 0; i<9; i++){
            userID = userID + random.nextInt(9);
        }
        return userID;
    }
}
