

public class EnumDataType{

    enum Week{
       monday,tuesday,wednesday,thursday,friday,saturday,sunday
          // these are named constants 
    }

public static void main(String[] args) {

    Week week =Week.monday;
    System.out.println(week);
    System.out.println(week.ordinal());  //this method returns index values of named contants

    
}

}
