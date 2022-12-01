public class Task8 {
    public static void main(String[] args) {
       var  overTime = 640;
       var  jobsClock = 8;
       var sum = overTime / jobsClock;
        System.out.println("Всего работников в компании - " + sum + " человек");
        var maxMans = sum + 94;
        var totalTime =overTime /  maxMans;
        System.out.println("Если в компании работает " + maxMans + " человек, то всего " + totalTime +" часов работы может быть поделено между сотрудниками");

    }
}
