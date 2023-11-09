import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            // 体重の入力
            System.out.println("体重(kg)を入力してください：");
            double weight = sc.nextDouble();

            // 身長の入力
            System.out.println("身長(m)を入力してください：");
            double height = sc.nextDouble();

            // BMIの計算
            double bmi = calculateBMI(weight, height);

            // 結果を表示
            System.out.printf("BMIは %.2f です。\n", bmi);

            // BMIの評価
            evaluationBMI(bmi);
   
        sc.close();
    }

    // BMIを計算するメソッド
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // BMIを評価するメソッド
    private static void evaluationBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("低体重");
            System.out.println("もっと食べろ");
        } else if (bmi < 25) {
            System.out.println("普通体重");
            System.out.println("あなたは普通");
        } else if (bmi < 30) {
            System.out.println("肥満(1度)");
            System.out.println("ぽっちゃり");
        } else if (bmi < 35) {
            System.out.println("肥満(2度)");
            System.out.println("アメリカ基準だと平均");
        } else if (bmi < 40) {
            System.out.println("肥満(3度)");
            System.out.println("痩せろ");
        } else {
            System.out.println("肥満(4度)");
            System.out.println("痩せなきゃ死にます。");
        }
    }
}