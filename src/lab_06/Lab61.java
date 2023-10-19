package lab_06;

public class Lab61 {
    public static void main(String[] args) {
        /*
        * LAB 6.1
        * Given input string: "2hrs and 5 minutes"
        * Please calculate how many minutes in total
        * */

        String str = "2hrs and 5 minutes";
        String[] strList = str.split(" ");
        int totalMinute = 0;
        int hours = 0;
        int minute = 0;
        for(int index = 0; index < strList.length; index++){
            if(strList[index].contains("hrs")){
                hours = Integer.parseInt(strList[index].replace("hrs", "")) ;
            }
            if(strList[index].contains("minutes")){
                minute = Integer.parseInt(strList[index-1]) ;
            }
        }
        totalMinute = hours * 60 + minute;
        System.out.println("Minute total = " + totalMinute);
    }
}
