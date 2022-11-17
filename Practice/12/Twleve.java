// class child extends parent{

// }
// class parent{
//     void gaurav(){
//         System.out.println("Hello gaurav");
//     }
// }

// public class Twleve {
//     public static void main(String[] args) {
//         child c=new child();
//         c.gaurav();
//     }
// }

// import java.net.*;
// // import java.*;

// class Twleve {
//     public static void main(String args[])
//             throws UnknownHostException {
//         // The URL for which IP address needs to be fetched
//         String s = "https://www.google.com/";

//         try {
//             // Fetch IP address by getByName()
//             InetAddress ip = InetAddress.getByName(new URL(s).getHost());

//             // Print the IP address
//             System.out.println("Public IP Address of: " + ip);
//         } catch (MalformedURLException e) {
//             // It means the URL is invalid
//             System.out.println("Invalid URL");
//         }
//     }
// }

import java.net.*;
import java.io.*;

class Twleve {
    public static void main(String args[])
            throws UnknownHostException {
        String systemipaddress = "";
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");

            BufferedReader sc = new BufferedReader(
                    new InputStreamReader(url_name.openStream()));

            // reads system IPAddress
            systemipaddress = sc.readLine().trim();
        } catch (Exception e) {
            systemipaddress = "Cannot Execute Properly";
        }
        // Print IP address
        System.out.println("Public IP Address: "
                + systemipaddress + "\n");
    }
}