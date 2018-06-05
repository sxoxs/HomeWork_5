package logik;

public class WorkClass {
    public void runHomeWork(){
        Person[] persons = new Person[5];
        persons[0] = new Person("Стив Джобс", "Менеджер по продажам",
                "SDjob@gmail.com", "89096578565", 300000, 42);
        persons[1] = new Person("Бил Гейтс", "Ген. директор",
                "BGts@gmail.com", "89265965875", 500000, 55);
        persons[2] = new Person("Павел Дуров", "Backend разработчик",
                "PDV@gmail.com", "86593546525", 150000, 35);
        persons[3] = new Person("Марк Цукенберг", "Fronted разработчик",
                "Mark@gmail.com", "89563256575", 150000, 27);
        persons[4] = new Person("Линус Торвальдс", "Начальник тех. отдела",
                "Linux@gmail.com", "89656578562", 400000, 48);

        for (Person pers: persons) {
            if (pers.getAge() >= 40) {
                pers.outToConsole();
            }
        }
    }
}
