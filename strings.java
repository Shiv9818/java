class strings{
    public static void main(String[] args){
    //concatenation
        String s1 = "Hello World";
        String s2 = "How are you";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        //length
        System.out.println(s3.length());
        //charAt
        for(int i=0;i<s3.length();i++){
            System.out.println(s3.charAt(i));
        }
        //compare
        System.out.println(s1.compareTo(s2));
        //contains
        System.out.println(s3.contains("Hello"));
        //equals
        System.out.println(s1.equals(s2));
        //replace
        System.out.println(s3.replace("Hello","Hi"));
        //substring
        System.out.println(s3.substring(0,5));
    }
}