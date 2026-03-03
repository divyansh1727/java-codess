package oops.enums;

public class Basic {
    enum Week {
        m, t, w, th, f, sat, sun;
        //enum constant, all are public static , final, cant create child enums as are enums

        Week() {
            System.out.println("con called for " + this);
            //not public, protected
            //??->dont want to create new obj
            //this is not enum concept i.e, not used
            //internally to undrstnd--> public static final Week m=new Week();
            }
        }

        public static void main(String[] args) {
            Week week;
            week = Week.m;
            for (Week day : Week.values()) {
//            System.out.println(day);
//            System.out.println(week);
            }

        }

    }

