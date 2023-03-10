public class Main {
    public static void main(String[] args) {

        var dog  = 8.0;
         var cat  = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog+4;
         cat = cat+4;
         paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend*2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight1 + boxerWeight2);
        System.out.println("Разница в весе"+ " "+ (boxerWeight2 - boxerWeight1));
        System.out.println("Разница в весе"+" "+ (boxerWeight2 % boxerWeight1));

        var totalHours = 640;
        var forEachEmployeeHours = 8;
        var employees = totalHours / forEachEmployeeHours  ;
        System.out.println("Всего работников в компании"+" "+ employees+" "+"человек." );

        employees = employees + 94;
        totalHours = employees * forEachEmployeeHours;


        System.out.println("Если в компании работает" +" "+ employees+" " +"человек,то всего"+" "+totalHours+" часов работы может быть поделено между сотрудниками.");















    }
}