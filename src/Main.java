public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxerFirstWeight = 78.2;
        var boxerSecondWeight = 82.7;
        var totalWeight = boxerFirstWeight + boxerSecondWeight;
        System.out.println(totalWeight);
        var diffWeight = boxerFirstWeight - boxerSecondWeight;
        System.out.println(diffWeight);

        var overWeight = boxerSecondWeight % boxerFirstWeight;
        System.out.println(overWeight);

        var totalHours = 640;
        var employeeHours = 8;
        var totalEmployees = totalHours / employeeHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * employeeHours;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours +
                " часов работы может быть поделено между сотрудниками");


    }
}
