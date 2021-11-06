public class Main {
  public static void main(String[] args) {
    double good_habit_rate;
    double bad_habit_rate;

    for (int i = 1; i <= 365; i++) {
      good_habit_rate = 1.00 + i * 0.01;
      for (int day = 0; day < 365; day++) {
        double good_habit_score = 100;
        good_habit_score = good_habit_score * good_habit_rate;
        // System.out.println("毎日1%成長した結果は" + (int) good_habit_score);
        System.out.println("毎日1%成長した結果" + day + "日後のScoreは" + (int) good_habit_score + "です");
      }
    }
    for (int j = 1; j <= 365; j++) {
      bad_habit_rate = 1.00 - j * 0.01;
      for (int day = 0; day < 365; day++) {
        double bad_habit_score = 1000000;
        bad_habit_score = bad_habit_score * bad_habit_rate;
        System.out.println("毎日1%退化した結果" + day + "日後のScoreは" + (int) bad_habit_score + "です");
      }
    }
  }
}
