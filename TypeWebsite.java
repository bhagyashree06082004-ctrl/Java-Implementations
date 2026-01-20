public class TypeWebsite {
    public static void main(String[] args) {
        
        String url = "http://www.google.com";  

        System.out.println("URL: " + url);


        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

    
        String ext = url.substring(url.lastIndexOf(".") + 1);
        switch (ext) {
            case "com" -> System.out.println("Commercial");
            case "org" -> System.out.println("Organisation");
            case "net" -> System.out.println("Network");
            default -> {
            }
        }
    }
}
