
public class ProgressTracker {

    public static void main(String[] args) {
        int totalTopics = 20;
        int completedTopics = 17;
        int dailyLearningHours = 3;

        int remainingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = dailyLearningHours * 5;
        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
