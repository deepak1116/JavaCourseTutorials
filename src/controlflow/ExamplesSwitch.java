package controlflow;

public class ExamplesSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension){
            case "docx":
                System.out.println("This is word document.");
                break;
            case "pptx":
                System.out.println("This is presentation.");
                break;
            case "pdf":
                System.out.println("This is PDF.");
                break;
            case "txt":
                System.out.println("This is text file.");
                break;
            default:
                System.out.println("We do not support this file.");
                break;
        }

        int month = -1;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;
            case 2 :
                System.out.println("This month has either 28 or 29 days.");
                break;
            default:
                System.out.println("Given entry is not month.");
                break;
        }

    }
}
