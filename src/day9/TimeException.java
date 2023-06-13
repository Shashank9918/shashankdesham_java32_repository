package day9;

public class TimeException {

        int hours;
        int minutes;
        int seconds;

        public TimeException(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        public static void main(String[] args){
            TimeException time = new TimeException(10,80,25);
            try {
                setTime(time);
            } catch (CustomException e) {
                System.out.println(e);
            }
        }
        public static void setTime(TimeException time) throws CustomException{
            if (time.hours>0 && time.hours<=24 && time.minutes>0 && time.minutes<=60 && time.seconds>0 && time.seconds<=60){
                System.out.println("Time can be reset");
            }else {
                throw new CustomException("Invalid Time format");
            }
        }

}
