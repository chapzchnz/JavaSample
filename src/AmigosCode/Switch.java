package AmigosCode;

public class Switch {
        public static void main(String [] args ){
            String gender = "MALE";
            switch(gender){
                case "FEMALE":
                    System.out.println("I am  female ");
                    break;
                case "MALE":
                    System.out.println("I am male ");
                    break;
                case "I don't want to say":
                    System.out.println("Prefer not to say ");
                    break;
                default:
                    System.out.println("Unknown");
            }
        }
}
