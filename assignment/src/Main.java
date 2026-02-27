class leap {
    public static void main(String[] args) {
        int year = 2025;


        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "  is a leap");

        }else{
                System.out.println(year + " is not leap");
            }


        if(year==2025){
            System.out.println("it is false year");
        }else{
            System.out.println("it good year to chase to your mission");
        }
        }
    }
