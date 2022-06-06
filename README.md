# COI-Recruitment-Task🖥
## 1. Czym różni się obiekt od klasy?
Klasa jest schematem do tworzenia nowych obiektów określonego typu i posiadających określone zachowanie. Obiekt utworzony na podstawie danej klasy nazywany jest jej instancją.
## 2.	Czy różni się klasa abstrakcyjna od interfejsu?
Klasa abstrakcyjna - Jest to klasa, z której nie można utworzyć obiektu, można po niej jedynie dziedziczyć. Klasa taka może mieć metody, które posiadają implementację, ale także metody abstrakcyjne czyli takie, które są jedynie deklaracją metody, która powinna zostać zaimplementowana w klasie potomnej. Klasa ta może być podstawą dla innych klas.  Potomne klasy dziedziczą wszystkie zachowania klasy abstrakcyjnej. W Javie jest ograniczenie dziedziczenia do jednej klasy, więc każda klasa potomna może dziedziczyć tylko raz. Jeżeli chcemy obejść to ograniczenie, musimy ułożyć klasy w postaci łańcucha, co zwykle nie jest za bardzo wygodne. Praca z takim łańcuchem jest coraz trudniejsza wraz ze wzrostem ilości klas. Natomiast Interfejsy to typy, które są bardzo podobne do klas, ale mogą zawierać jedynie stałe i deklaracje metod.Interfejsy nie mogą mieć stanu. Służą one do definiowania zachowania dla obiektów, ale inaczej niż w przypadku klasy abstrakcyjnej nie definiują tego zachowania. Każda klasa implementująca interfejs musi mieć implementację metod zawartych w interfejsie. Wprowadzenie metod default i statycznych pozwala zmieniać interfejsy, które zostały już zaimplementowane przez różne klasy, ale nie wymusza automatycznie zmian implementacji tych klas. Dzięki temu, twórcy Javy mogli zmieniać interfejsy takie jak List, czy Map bez zmiany wszystkich implementacji list i map w bibliotece standardowej.
## 3.	Proszę wyjaśnić mechanizm dziedziczenia w Javie. 
Dziedziczenie powoduje przekazanie pewnych cech innym klasom. Dzięki dziedziczeniu możemy ograniczyć ilość powielonego kodu poprzez definiowanie atrybutów, konstruktorów, metod w klasach bazowych. W Javie w nie występuje dziedziczenie wielokrotne. To znaczy, że klasa potomna może rozszerzać tylko jedną klasę bazową. Mechanizm ten pozwala na tworzenie przejrzystej struktury klas i obiektów, w której poszczególne klasy nie powielają niepotrzebnie tych samych atrybutów lub zachowań. Obiekty tworzone na podstawie klasy podrzędnej korzystać mogą nie tylko z cech klasy, na podstawie której zostały utworzone, ale także z cech klasy bazowej.
## 4.	Co należy zdefiniować w klasie podrzędnej
- a.	Nic
- b.	Tylko różnice między klasą podrzędną, a nadrzędną
- ***c. Wszystko co dotyczy tej klasy***
## 5.	W którym miejscu klasy można deklarować zmienne
- ***a. W dowolnym miejscu***
- b.	Po deklaracji klasy, ale przed pierwszą metodą
- c.	Poza metodami klasy
## 6.	Proszę omówić modyfikatory dostępu w Javie.
public – element oznaczony tym modyfikatorem dostępny jest “z zewnątrz” obiektu, stanowi jego interfejs,
private – element oznaczony tym modyfikatorem jest dostępna wyłącznie wewnątrz obiektu, także klasy pochodne nie mają do niego dostępu.
Protected - element poprzedzony tym atrybutem może być dostępny wewnątrz klasy bądź przez każdą inną klasę która po niej dziedziczy.
## 7.	Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally
- ***a.	return***
- b.	catch
- c.	while
## 8.	Mając listę String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” } proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków.
Rozwiązanie w postaci kodu COI-Recruitment-Task/src/main/Task_8.java
## 9.	Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.
MARA – składa się z 1 litery M, 2 liter A, 1 litery R
RAMA – składa się z 1 litery R, 2 liter A, 1 litery M
Podane przykłady składają się z tych samych liter.
Napisać podstawowe testy jednostkowe dla tej metody (jUnit).

Rozwiązanie w postaci kodu COI-Recruitment-Task/src/main/Task_9.java

## 10.	Proszę przedstawić wysokopoziomowy diagram systemu dostępnego przez przeglądarkę internetową, przechowującego informacje o sukcesach sportowych osób znajdujących się w systemie. 
Proszę zaproponować model logiczny bazy danych, oraz wysokopoziomowo komponenty systemu. Nie ma potrzeby schodzić na poziom kodu źródłowego.
W sytuacji wymagającej doszczegółowienia wymagań proszę przyjąć własne założenia i opisać je.

## 11.Napisać test dla poniższego fragmentu kodu.
```java
public void wyslijSms(String numerTel, String trescSms) { 
  smsGateway.send(new Sms(numerTel, trescSms));
}
```
##### Bramka rzuca wyjątek SMSGatewayException(„Bramka przeciążona”) w momencie, gdy jest zbyt duże obciążenie bramk.
```java
public class Test_Task_11 {

    @Test
    public void should_throw_SMSGatewayException_when_gate_is_overloaded(){
        //given
	private Task_11 task11;
	task11 = new Task_11();
        //when
        SMSGatewayException result = assertThrows(SMSGatewayException.class,
                this::testGateway);
        //then
        assertEquals(SMSGatewayEnum.GATE_OVERLOADED.getMessage(), result.getMessage());
    }
    private void testGateway() throws SMSGatewayException {
        for(;;){
            task11.wyslijSms(070043111, "testing");
        }
    }
}
```
## 12.	Zaprojektować kontrakt usługi REST w formacie OpenApi oraz małą aplikację springbootową, która zwraca listę książek (bez użycia bazy danych). Usługa powinna umożliwiać filtrowanie po części nazwy książki oraz po numerze IBAN.
## 13.	Czy zbiór (Set) może zawierać duplikaty?  
- a.	Tak
- ***b.	Nie***
## 14. Zaznaczyć metody należące do java.util.Set:
- ***a.	addAll***
- ***b.	contains***
- ***c.	isEmpty***
- ***d.	size***
- ***e.	remove***
- f.	indexOf
- g.	lastIndexOf
## 15.	Napisać zapytanie zwracające ilość pracowników bez przełożonych z poniższej tabeli.
![image](https://user-images.githubusercontent.com/50717269/172230367-a1c37680-c9b2-4a79-9a0d-28228da820c9.png)
SELECT COUNT(*) AS PRACOWNICY FROM ‘nazwa tabeli’ WHERE manager_id IS NULL GROUP BY manager_id;
## 16.	Z powyższej tabeli napisać zapytanie zwracające kwotę najmniejszego wynagrodzenia. 
SELECT MIN(salary) AS NAJNIZSZA FROM ‘nazwa tabeli’;
## 17.	Napisz fragment kodu w języku Java, który sprawdzi pełnoletność osoby. Parametrem wejściowym do obliczeń jest numer PESEL w postaci String.

## 18.	Poniższa metoda:
```java
private static String getElement(Object list, Integer number) {
  return ((List)list).get(number).toString();
}
```
zadziała dla poniższych danych
```java
public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
  System.out.print(getElement(list, 1));
}
```
W jakich przypadkach (dla innych danych wejściowych) metoda getElement może spowodować błąd i jak się przed tym zabezpieczyć?

Jeżeli jako argument podamy przkładowo Integer
```java
Integer i = 10;
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
System.out.print(getElement(i, 1));
```
Wtedy napotkamy na wyjątek:
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.util.List (java.lang.Integer and java.util.List are in module java.base of loader 'bootstrap')
	at main.getElement(main.java:9)
	at main.main(main.java:30)
Nie widzieliśmy początkowo błędu w kodzie ponieważ, jako argument przyjmujemy obiekt z klasy Object. By się przed tym zabezpieczyć możemy przyjąć docelowo argument jako Listę bez konieczności castowania.
```java
private static String getElement(List list, Integer number) {
    return (list).get(number).toString();
}
```
Rozwiązanie również w postaci kodu COI-Recruitment-Task/src/main/Task_18.java
## 19.	Czym różnią się poniższe zapisy i który jest preferowany oraz dlaczego:
```java
public void test(String wartosc) {
    /*1*/if (wartosc.equals(""));
W przypadku metody equals() porównywana jest wartość zmiennej wartosc i "". Niezależnie czy odwołują się one do tego samego miejsca w pamięci czy też nie (oraz przy założeniu że ich wartość jest identyczna) wynik wywołania metody equals() będzie równy true.
    /*2*/if ("".equals(wartosc));
Tutaj wykorzystana została ta sama metoda .equals() lecz teraz jej argumentem jest zmienna wartosc. Ten zapis będzie preferowany do porównywania Strignów ponieważ przy założeniu że ""   to stała w metodzie to 
String podany w argumencie metody equals musi zostać sprawdzony, ponieważ equals sprawdza czy nasz argument nie jeste nullem.

    /*3*/if (wartosc == "");
W przypadku operatora '==' porównywana jest przestrzeń pamięci naszej aplikacji. A dokładniej sprawdzane jest czy wartość stała w metodzie zapisane są w tym samym miejscu w pamięci naszej wirtualnej maszyny. Jeśli obie zmienne odwołują się do tego samego miejsca, wtedy wartość otrzymana będzie równa true. Jeśli natomiast wartości zmiennych będą identyczne, jednak zapisane w innych miejscach w pamięci - wtedy naszym wynikiem będzie false.
```

## 20.	Co to są obiekty immutable? Czy final sprawia że obiekt jest immutable i dlaczego?
Nie można modyfikować obiektów klasy immutable po ich utworzeniu. Innymi słowy, kiedy już je stworzysz, nie możesz ich zmienić. Jeśli spróbujesz zmodyfikować obiekt immutable, otrzymasz nowy obiekt (klon) i podmienisz ten klon podczas tworzenia.
Dobrym przykładem jest String w Javie jest immutable. Oznacza to, że nie możesz zmienić samego obiektu String, ale możesz zmienić odniesienie do obiektu.
Deklarując zmienne składowe jako „final” – kiedy deklarujemy je jako final , kompilator zmusza nas do ich zainicjowania. Możemy zainicjować bezpośrednio, domyślny konstruktor, za pomocą arg constructor i po zainicjowaniu nie możemy ich modyfikować, ponieważ są final.

## 21.	Czym różni się metoda http POST od GET?
GET pobiera określony zasób według określonego wcześniej identyfikatora, natomiast POST tworzy nowy zasób przykładowo wysyłając dane pod wyznaczony endpoint. POST może służyć również do pobierania danych w przypadku kiedy musimy w ramach body dostarczać dodatkowe parametry. 

## 22.	Jak powinna wyglądac sygnatura metody do której można przekazać dowolną ilość parametrów tego samego typu?
```java
public void test(String…args){}
```
Rpzwiązanie w postaci kodu COI-Recruitment-Task/src/main/Task_22.java
