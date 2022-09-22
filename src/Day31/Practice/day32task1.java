package Day31.Practice;

import java.util.HashMap;

public class day32task1 {
    public static void main(String[] args) {

        HashMap<Integer,String> errorCode = new HashMap<>();
        errorCode.put(100,"Continue");
        errorCode.put(200,"OK");
        errorCode.put(302,"Found");
        errorCode.put(401,"Unauthorized");
        errorCode.put(404,"Not Found");

        System.out.println("errorCode = " + errorCode);
    }
}
