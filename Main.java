public class Main {
  public static void main(String[] args) {
    double good_habit_rate;
    double bad_habit_rate = 100;
    double bad_habit_score = 100;

    for (int i = 1; i <= 365; i++) {
      good_habit_rate = 1.00 + i * 0.01;
      double good_habit_score = 100;
      good_habit_score = good_habit_score * good_habit_rate;
      System.out.println("毎日1%成長した結果" + i + "日後のScoreは" + (int) good_habit_score + "です");
    }
    for (int j = 1; j <= 365; j++) {
      // bad_habit_rate = 1.00 - j * 0.01;
      bad_habit_rate = (bad_habit_rate * 0.99) / 100;
      bad_habit_score = bad_habit_score * bad_habit_rate;
      System.out.println("毎日1%成長した結果" + j + "日後のScoreは" + (int) bad_habit_score + "です");
    }

  }
}
