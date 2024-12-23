package com.yusufcandmrz.textblocks;

public class Main {

    public static String getFormattedText(String variable) {
        return """
                Some variable: %s
                """.formatted(variable);
    }

    public static void main(String[] args) {

        // https://www.baeldung.com/java-text-blocks

//        // Defining a text block
//        String example = """
//                example text""";

//        // Defining a html code with using text block
//        String exampleTwo = """
//                <html>
//                    <body>
//                        <span>example text></span>
//                    </body>
//                </html""";

//        // Defining a html code without using text block
//        String exampleThree = "<html>\n"
//                + "    <body>\n"
//                + "        <span>example text></span>\n"
//                + "    </body>\n"
//                + "</html>";

//        // Using \n
//        String exampleFour = """
//                Indent
//                """;
//        System.out.println(exampleFour.equals("Indent\n"));

//        // escaping double-quotes
//        String exampleFive = """
//                "fun" with
//                whitespace
//                and other escapes \"""
//                """;
//        System.out.println(exampleFive);

//        // escaping line terminators
//        String exampleSix = """
//                separated with\r
//                carriage return""";
//        System.out.println(exampleSix.equals("separated with\r\ncarriage return"));

//        String exampleSeven = """
//                This is a long test which looks to \
//                have a newline but actually does not""";
//        System.out.println(exampleSeven);

//        // escaping spaces
//        String exampleEight = """
//                line 1...
//                line 2...\s
//                """;
//        System.out.println(exampleEight.equals("line 1...\nline 2...        \n"));

//        // formatting
//        System.out.println(getFormattedText("hello"));
    }
}
