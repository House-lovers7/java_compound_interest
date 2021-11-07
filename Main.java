public class Main {
  public static void main(String[] args) {

    double bad_habit_rate = 0.01;
    double good_habit_score = 100;

    double good_habit_rate = 0.01;
    double bad_habit_score = 100;

    for (int i = 1; i <= 365; i++) {
      good_habit_score = good_habit_score * (1 + good_habit_rate);
      if (i == 365) {
        System.out.println("おめでとうございます!!毎日1%成長した結果" + i + "日後のScoreは" + (int) good_habit_score + "です");
      }
    }
    for (int j = 1; j <= 365; j++) {
      bad_habit_score = bad_habit_score * (1 - bad_habit_rate);
      if (j == 365) {
        System.out.println("お気をつけください!!毎日1%退化した結果" + j + "日後のScoreは" + (int) bad_habit_score + "です");
      }
    }
  }
}
