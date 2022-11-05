package Test1.exceptinHandling;

public class travel {
    public static void main(String[] args) throws Exception {
        try {
            travelToOcean(Weather.WARM);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        try {
            travelToMountain(Weather.HOT);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void travelToOcean(Weather weather) {
        switch (weather) {
            case COLD:
                throw new RuntimeException("Weather is Cold. Not a good idea to go to ocean");
            case WARM:
                throw new RuntimeException("Weather is warm. better to wait until it is hot");
            case HOT:
                System.out.println("Weather is hot. good time for ocean");
                break;
        }
    }

    public static void travelToMountain(Weather weather) throws Exception {

        switch (weather) {
            case COLD:
                throw new Exception("Weather is Cold. too dangerous for hiking");
            case WARM:
                System.out.println("Weather is warm. it is the best time for hiking");
                break;
            case HOT:
                throw new Exception("Weather is hot. good time for ocean");

        }
    }
}
