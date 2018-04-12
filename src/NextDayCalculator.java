public class NextDayCalculator {
    public static boolean checkyear(int year){
        boolean checkyear =true;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return checkyear ==true;
                } else {
                    return checkyear==false;
                }
            } else {
                return checkyear==false;
            }
        } else {
            return checkyear==false;
        }
    }
    public static String nextDay(int day , int month, int year){
        int nextDay= day+1;
        switch (month) {
            // Các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(nextDay>31){
                    nextDay=1;
                    month++;
                }
                break;
            // Các tháng 4, 6, 9 và 11 có 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                if(nextDay>30){
                    nextDay=1;
                    month++;
                }
                break;
             case 12:
            if(nextDay>31){
                nextDay=1;
                month=1;
                year++;
            }
            break;
            //  Tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
            case 2:
                if(checkyear(year) ==true &&nextDay>29){
                    nextDay=1;
                    month++;
                }
                if (checkyear(year)==false && nextDay>28){
                    nextDay=1;
                    month++;
                }

                break;
            default:
        }

        String date = nextDay+"/"+month+"/"+year;
        return date;
    }
}
