public class Main {
    public static void main(String[] args) {
   Semya semya = new Hotel("Malik", "Kara-Zhygach",1000);
   Semya semya1 = new Hotel("Baiel","Djal",1000);
   Semya semya2 = new Hotel("Momun", "Kok-jar",1000);

   Semya [] hotel  = {semya,semya1,semya2};
        for (Semya hot: hotel ) {
            System.out.println(hot);
            System.out.println(hot.hotel());

        }

   Semya house1 = new House("Erzhigit","Archa-Beshik",800);
   Semya house2 = new House("Ruslan","Madina",900);
   Semya house3 = new House("Mirbek","Manas",1000);
   Semya house4 = new House("Kanymgul","Kanykey",700);
   Semya house5 = new House("Adilet","Kok-jar",1000);

   Semya[] house = {house1,house2,house2,house3,house4,house5};
        for (Semya home : house) {
            System.out.println(home);
            System.out.println(home.house());
        }

   Semya baatir1 = new Baatir("Baktiar","Bishkek",2000);
   Semya baaitr2 = new Baatir("Davran","Bishkek",2000);
   Semya [] baatir = {baatir1,baaitr2};
        for (Semya batr : baatir ) {
            System.out.println(batr);
            System.out.println(batr.baatir());
        }
        }

    }
