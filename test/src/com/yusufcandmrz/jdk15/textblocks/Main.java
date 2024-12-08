package com.yusufcandmrz.jdk15.textblocks;

public class Main {

    // Multiline Strings

    public static void main(String[] args) {

        /*
        - java 15'de gelen text blocks özelliği, çok satırlı String kullanımını
        kolaylaştıran bir özelliktir.
        - java 13'de tanıtıldı. java 13 ve java 14'de kullanabilmek için "preview
        feature" olarak aktif etmemiz gerekiyordu.
        - text blocks """ ile başlayıp """ ile biter.
        - çıktı da bir değişiklik olmaz, sadece String tanımlamasını daha esnek
        hale getirir.
        - text blocks içerisinde
         */

        String textBlock = """
                Hello textBlock
                """;
        System.out.println(textBlock);

        System.out.println(getBlockOfHtml());
        System.out.println(getOldStyleMultilineString());
        System.out.println(getTextWithEscapes());
        System.out.println(getTextWithCarriageReturns());
        System.out.println(getFormattedText("hello"));
    }

    public static String getBlockOfHtml() {
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>
                """;
    }

    public static String getOldStyleMultilineString() {
        return "<html>\n"
                + " <body>\n"
                + "  <span>example test</span>\n"
                + " </body>\n"
                + "</html>";
    }

    public static String getTextWithEscapes() {
        return """
                "fun" with whitespace
                and other escapes \"""
                """;
    }

    public static String getTextWithCarriageReturns() {
        return """
                seperated with\r
                carriage returns""";
    }

    public static String getFormattedText(String parameter) {
        return """
                Some parameter: %s""".formatted(parameter);
    }
}