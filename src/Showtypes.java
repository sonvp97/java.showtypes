public class Showtypes {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật");
        for (int i = 0;i < 3;i++){
                System.out.println("* * * * * * *");
        }
        System.out.println("Hình tam giác vuông");
        String result = "";
        String result1 = "";
        for (int i = 1;i <= 5;i++){
            for (int j = 0;j < i;j++){
                result += "* ";

            }
            System.out.printf("%s", result);
            System.out.println();
            result = "";
        }
        System.out.println("Hình tam giác vuông ngược");
        for (int i = 0;i < 5;i++){
            for (int j = 0; j < 5 - i; j++){
                result += "* ";
            }
            System.out.printf("%s", result);
            System.out.println();
            result = "";
        }
        System.out.println("Hình tam giác cân");
        for (int i = 1;i < 6;i++){
            for (int j = 1;j < 6-i;j++){
                result1 += " ";
            }
            for (int j = 0;j < i;j++){
                result +="* ";
            }
            System.out.printf("%s", result1+result);
            System.out.println();
            result1 = "";
            result = "";
        }
    }
}