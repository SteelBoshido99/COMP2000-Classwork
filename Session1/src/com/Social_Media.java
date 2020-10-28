package com;

public class Social_Media {

    private static String message = "Having fun in the sun!";
    private static String photo = "Picture of me on the beach";
    private static String tags = "#sun, #beach, #seaside";


    static void startUp(){
        System.out.println("**Post to Social Media App**");
    }

    static void message(){
        if (message.equals("")) {
            System.out.println("Please Enter a message");
        } else {
            System.out.println("Message: " + message);
        }
    }

    static void photo(){
        if (!photo.equals("")) {
            System.out.println("Photo: " + photo);
        }
    }

    static void tag(){
        /*  INSTRUCTIONS */
        if(!tags.equals("")){
            System.out.println("Tags: " + tags);
        }
    }

    static void printOut(){
        System.out.println("Posting to Social Media");
    }



}
