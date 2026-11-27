package JPT_Day03;

public class StringLearn {
    public static void main(String arg[]){
        /* char ch = 'S';
        String name = "Shubham";
 
        System.out.println(ch);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 5));
        System.out.println(name.compareTo("Shubham"));
        System.out.println(name.equals("Shubham"));
        System.out.println(name.equalsIgnoreCase("shubham"));
        System.out.println(name.trim());
  */
        //String Comparison
        String a = new String("Shubham");
        String b = new String("Shubham");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        //String Concatenation
        String name1 = "Shubham";
        int age = 20;

        String message = "items:" + name1 + ", Age" + age;
        System.out.println(message);

        //String immutability demonstration
        String text = "java";
        text.toUpperCase();
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);
    }

}
