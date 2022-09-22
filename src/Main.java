public class Main {
    public static void main(String[] args) {

int a =200;
System.out.println ("Значение переменной  a " + "с типом  int равно  " + a);
byte b = 15;
System.out.println ("Значение переменной  b " + "с типом  byte равно  " + b);
 short c = -2500;
System.out.println ("Значение переменной  c " + "с типом  short равно  " + c);
long d = 55000L;
System.out.println ("Значение переменной  d " + "с типом  long равно  " + d);
double e = 2.555333999111888;
System.out.println ("Значение переменной  e " + "с типом  double равно  " + e);
float f = 15.1112223f;
System.out.println ("Значение переменной  f " + "с типом  float равно  " + f);



byte g = 2;
System.out.println("Значение переменной  g " + "с типом  byte равно  " + g);
short h = -159;
System.out.println("Значение переменной  h " + "с типом  short равно  " + h);
int i = 786;
System.out.println("Значение переменной  i " + "с типом  int равно  " + i);
long j = 987678965549L;
System.out.println("Значение переменной  j " + "с типом  long равно  " + j);
float k = 27.12f;
System.out.println("Значение переменной  k " + "с типом  float равно  " + k);
double l = 67;
System.out.println("Значение переменной  l " + "с типом  double равно  " + l);
boolean m = false;
System.out.println("Значение переменной  m " + "с типом  boolean равно  " + m);
short n = 569;
System.out.println("Значение переменной  n " + "с типом  short равно  " + n);
int o = 27897;
System.out.println("Значение переменной  o " + "с типом  int равно  " + o);



byte lyudmilaPavlovna = 23;
System.out.println(lyudmilaPavlovna);
short annaSergeevna = 27;
System.out.println(annaSergeevna);
int yekaterinaAndreevna = 30;
System.out.println(yekaterinaAndreevna);
int studentsAmount = lyudmilaPavlovna + annaSergeevna + yekaterinaAndreevna;
System.out.println("Всего   " + studentsAmount + "  участников");
int bought = 480;
System.out.println("Всего купили  " + bought + "   листов на всех");
int sheetsPerstudent = bought / studentsAmount;
System.out.println("На каждого ученика расчитано  " + sheetsPerstudent + "  листов бумаги");


int productionA = 16;
System.out.println(productionA + "   бутылок за 2 минуты");
int perMinute = productionA / 2;
System.out.println(perMinute + "  бутылок за минуту");
int twentyMinutes = perMinute * 20;
System.out.println(twentyMinutes + "  бутылок за 20 минут");
int minutesPerday = 60 * 24;
System.out.println(minutesPerday + "   минут в сутки");
int perDay = perMinute * minutesPerday;
System.out.println(perDay + "  бутылок за сутки");
int threeDays = perDay * 3 * perMinute;
System.out.println(threeDays + "   бутылок за 3 дня");
int month = minutesPerday * 30 * perMinute;
System.out.println(month + "   бутылок  за 1 месяц");




int total = 120;
System.out.println("Всего   " +  total + "   банок");
int oneClass = 2 + 4;
System.out.println("На один класс  " + oneClass + "   банок");
int classTotal = total / oneClass;
System.out.println("Всего   " + classTotal + "   классов");
int white = 2 * classTotal;
int brown = 4 * classTotal;
System.out.println("В школе, где   " + classTotal + "  классов, нужно   " + white + "  банок белой краски и  "+ brown + "   банок коричневой краски");




int bananaNumber = 5;
int bananaWeight = 80;
int bananasWeight = bananaNumber * bananaWeight;
System.out.println("Общий вес бананов   " + bananasWeight + "  гр");

int milkMl = 200;
int gram = 105;
int milkWeight = gram * 2;
System.out.println("Общий вес молока   " + milkWeight + "   гр");

int iceCream = 2;
int oneWeight = 100;
int iceCreamweight = iceCream * oneWeight;
System.out.println( "Общий вес мороженного  " + iceCreamweight + "  гр");

int eggs = 4;
int oneEgg = 70;
int eggWeight = oneEgg * eggs;
System.out.println( "Общий вес яиц   " + eggWeight + "  гр");

int totalWeight = bananasWeight + milkWeight + iceCreamweight + eggWeight;
System.out.println("Общий вес продуктов  " + totalWeight + "  грамм");

float oneKilo = 1000f;
float inkilo = totalWeight / oneKilo;
System.out.println("Общий вес продуктов  " + inkilo + "  кг");



int needLoose = 7;
int kilo = needLoose *1000;
System.out.println("Нужно сбросить 7 кг, что в граммах равен   " + kilo);
int firstOption = 250;
int firstVersiom = kilo / firstOption;
System.out.println("Если терять по 250 гр в день, то похудеет за  " + firstVersiom + "  дней");
int secondOption = 500;
int secondVersiom = kilo / secondOption;
System.out.println("Если терять по 500 гр в день, то похудеет за  " + secondVersiom + "  дней");




int masha = 67760;
System.out.println(masha);
int denis = 83690;
System.out.println(denis);
int kristina = 76230;
System.out.println(kristina);

float mashaUp = masha * 1.1f * 12f;
System.out.println("У Маши годовая зарплата стала  " + mashaUp + "  рублей");
float denisUp = denis * 1.1f * 12f;
System.out.println("У Дениса годовая зарплата стала  " + denisUp + "  рублей");
float kristinaUp = kristina * 1.1f * 12f;
System.out.println("У Кристины годовая зарплата стала  " + kristinaUp + "  рублей");

int yearMasha = masha * 12;
int yearDenis = denis * 12;
int yearKristina = kristina * 12;

float mashaDifference = mashaUp - yearMasha;
System.out.println("Годовой доход вырос у Маши на   " + mashaDifference + "   рублей");
float denisDifference = denisUp - yearDenis;
System.out.println("Годовой доход вырос у Дениса на   " + denisDifference + "   рублей");
float kristinaDifference = kristinaUp - yearKristina;
System.out.println("Годовой доход вырос у Дениса на   " + kristinaDifference + "   рублей");


}
}