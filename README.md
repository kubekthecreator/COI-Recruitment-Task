# COI-Recruitment-Task馃枼
## 1. Czym r贸偶ni si臋 obiekt od klasy?
Klasa jest schematem do tworzenia nowych obiekt贸w okre艣lonego typu i posiadaj膮cych okre艣lone zachowanie. Obiekt utworzony na podstawie danej klasy nazywany jest jej instancj膮.
## 2.	Czy r贸偶ni si臋 klasa abstrakcyjna od interfejsu?
Klasa abstrakcyjna - Jest to klasa, z kt贸rej nie mo偶na utworzy膰 obiektu, mo偶na po niej jedynie dziedziczy膰. Klasa taka mo偶e mie膰 metody, kt贸re posiadaj膮 implementacj臋, ale tak偶e metody abstrakcyjne czyli takie, kt贸re s膮 jedynie deklaracj膮 metody, kt贸ra powinna zosta膰 zaimplementowana w klasie potomnej. Klasa ta mo偶e by膰 podstaw膮 dla innych klas.  Potomne klasy dziedzicz膮 wszystkie zachowania klasy abstrakcyjnej. W Javie jest ograniczenie dziedziczenia do jednej klasy, wi臋c ka偶da klasa potomna mo偶e dziedziczy膰 tylko raz. Je偶eli chcemy obej艣膰 to ograniczenie, musimy u艂o偶y膰 klasy w postaci 艂a艅cucha, co zwykle nie jest za bardzo wygodne. Praca z takim 艂a艅cuchem jest coraz trudniejsza wraz ze wzrostem ilo艣ci klas. Natomiast Interfejsy to typy, kt贸re s膮 bardzo podobne do klas, ale mog膮 zawiera膰 jedynie sta艂e i deklaracje metod.Interfejsy nie mog膮 mie膰 stanu. S艂u偶膮 one do definiowania zachowania dla obiekt贸w, ale inaczej ni偶 w przypadku klasy abstrakcyjnej nie definiuj膮 tego zachowania. Ka偶da klasa implementuj膮ca interfejs musi mie膰 implementacj臋 metod zawartych w interfejsie. Wprowadzenie metod default i statycznych pozwala zmienia膰 interfejsy, kt贸re zosta艂y ju偶 zaimplementowane przez r贸偶ne klasy, ale nie wymusza automatycznie zmian implementacji tych klas. Dzi臋ki temu, tw贸rcy Javy mogli zmienia膰 interfejsy takie jak List, czy Map bez zmiany wszystkich implementacji list i map w bibliotece standardowej.
## 3.	Prosz臋 wyja艣ni膰 mechanizm dziedziczenia w Javie. 
Dziedziczenie powoduje przekazanie pewnych cech innym klasom. Dzi臋ki dziedziczeniu mo偶emy ograniczy膰 ilo艣膰 powielonego kodu poprzez definiowanie atrybut贸w, konstruktor贸w, metod w klasach bazowych. W Javie w nie wyst臋puje dziedziczenie wielokrotne. To znaczy, 偶e klasa potomna mo偶e rozszerza膰 tylko jedn膮 klas臋 bazow膮. Mechanizm ten pozwala na tworzenie przejrzystej struktury klas i obiekt贸w, w kt贸rej poszczeg贸lne klasy nie powielaj膮 niepotrzebnie tych samych atrybut贸w lub zachowa艅. Obiekty tworzone na podstawie klasy podrz臋dnej korzysta膰 mog膮 nie tylko z cech klasy, na podstawie kt贸rej zosta艂y utworzone, ale tak偶e z cech klasy bazowej.
## 4.	Co nale偶y zdefiniowa膰 w klasie podrz臋dnej
- a.	Nic
- b.	Tylko r贸偶nice mi臋dzy klas膮 podrz臋dn膮, a nadrz臋dn膮
- ***c. Wszystko co dotyczy tej klasy***
## 5.	W kt贸rym miejscu klasy mo偶na deklarowa膰 zmienne
- ***a. W dowolnym miejscu***
- b.	Po deklaracji klasy, ale przed pierwsz膮 metod膮
- c.	Poza metodami klasy
## 6.	Prosz臋 om贸wi膰 modyfikatory dost臋pu w Javie.
public 鈥? element oznaczony tym modyfikatorem dost臋pny jest 鈥渮 zewn膮trz鈥? obiektu, stanowi jego interfejs,
private 鈥? element oznaczony tym modyfikatorem jest dost臋pna wy艂膮cznie wewn膮trz obiektu, tak偶e klasy pochodne nie maj膮 do niego dost臋pu.
Protected - element poprzedzony tym atrybutem mo偶e by膰 dost臋pny wewn膮trz klasy b膮d藕 przez ka偶d膮 inn膮 klas臋 kt贸ra po niej dziedziczy.
## 7.	Kt贸re ze s艂贸w kluczowych powoduje przeskoczenie z bloku try do bloku finally
- ***a.	return***
- b.	catch
- c.	while
## 8.	Maj膮c list臋 String[] drzewa = {鈥瀊rzoza鈥?, 鈥瀖odrzew鈥?, 鈥瀏rab鈥?, 鈥瀊uk鈥?, 鈥瀢ierzba鈥? } prosz臋 zaproponowa膰 wy艣wietlenie jej na ekranie za pomoc膮 iteratora i za pomoc膮 generyk贸w.
Rozwi膮zanie w postaci kodu COI-Recruitment-Task/src/main/Task_8.java
## 9.	Prosz臋 zaproponowa膰 kod 藕r贸d艂owy metody weryfikuj膮cej czy podane 2 wyrazy sk艂adaj膮 si臋 z tych samych liter np.
MARA 鈥? sk艂ada si臋 z 1 litery M, 2 liter A, 1 litery R
RAMA 鈥? sk艂ada si臋 z 1 litery R, 2 liter A, 1 litery M
Podane przyk艂ady sk艂adaj膮 si臋 z tych samych liter.
Napisa膰 podstawowe testy jednostkowe dla tej metody (jUnit).

Rozwi膮zanie w postaci kodu COI-Recruitment-Task/src/main/Task_9.java

## 10.	Prosz臋 przedstawi膰 wysokopoziomowy diagram systemu dost臋pnego przez przegl膮dark臋 internetow膮, przechowuj膮cego informacje o sukcesach sportowych os贸b znajduj膮cych si臋 w systemie. 
Prosz臋 zaproponowa膰 model logiczny bazy danych, oraz wysokopoziomowo komponenty systemu. Nie ma potrzeby schodzi膰 na poziom kodu 藕r贸d艂owego.
W sytuacji wymagaj膮cej doszczeg贸艂owienia wymaga艅 prosz臋 przyj膮膰 w艂asne za艂o偶enia i opisa膰 je.

## 11.Napisa膰 test dla poni偶szego fragmentu kodu.
```java
public void wyslijSms(String numerTel, String trescSms) { 
  smsGateway.send(new Sms(numerTel, trescSms));
}
```
##### Bramka rzuca wyj膮tek SMSGatewayException(鈥濨ramka przeci膮偶ona鈥?) w momencie, gdy jest zbyt du偶e obci膮偶enie bramk.
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
## 12.	Zaprojektowa膰 kontrakt us艂ugi REST w formacie OpenApi oraz ma艂膮 aplikacj臋 springbootow膮, kt贸ra zwraca list臋 ksi膮偶ek (bez u偶ycia bazy danych). Us艂uga powinna umo偶liwia膰 filtrowanie po cz臋艣ci nazwy ksi膮偶ki oraz po numerze IBAN.
## 13.	Czy zbi贸r (Set) mo偶e zawiera膰 duplikaty?  
- a.	Tak
- ***b.	Nie***
## 14. Zaznaczy膰 metody nale偶膮ce do java.util.Set:
- ***a.	addAll***
- ***b.	contains***
- ***c.	isEmpty***
- ***d.	size***
- ***e.	remove***
- f.	indexOf
- g.	lastIndexOf
## 15.	Napisa膰 zapytanie zwracaj膮ce ilo艣膰 pracownik贸w bez prze艂o偶onych z poni偶szej tabeli.
![image](https://user-images.githubusercontent.com/50717269/172230367-a1c37680-c9b2-4a79-9a0d-28228da820c9.png)
SELECT COUNT(*) AS PRACOWNICY FROM 鈥榥azwa tabeli鈥? WHERE manager_id IS NULL GROUP BY manager_id;
## 16.	Z powy偶szej tabeli napisa膰 zapytanie zwracaj膮ce kwot臋 najmniejszego wynagrodzenia. 
SELECT MIN(salary) AS NAJNIZSZA FROM 鈥榥azwa tabeli鈥?;
## 17.	Napisz fragment kodu w j臋zyku Java, kt贸ry sprawdzi pe艂noletno艣膰 osoby. Parametrem wej艣ciowym do oblicze艅 jest numer PESEL w postaci String.

## 18.	Poni偶sza metoda:
```java
private static String getElement(Object list, Integer number) {
  return ((List)list).get(number).toString();
}
```
zadzia艂a dla poni偶szych danych
```java
public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
  System.out.print(getElement(list, 1));
}
```
W jakich przypadkach (dla innych danych wej艣ciowych) metoda getElement mo偶e spowodowa膰 b艂膮d i jak si臋 przed tym zabezpieczy膰?

Je偶eli jako argument podamy przk艂adowo Integer
```java
Integer i = 10;
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
System.out.print(getElement(i, 1));
```
Wtedy napotkamy na wyj膮tek:
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.util.List (java.lang.Integer and java.util.List are in module java.base of loader 'bootstrap')
	at main.getElement(main.java:9)
	at main.main(main.java:30)
Nie widzieli艣my pocz膮tkowo b艂臋du w kodzie poniewa偶, jako argument przyjmujemy obiekt z klasy Object. By si臋 przed tym zabezpieczy膰 mo偶emy przyj膮膰 docelowo argument jako List臋 bez konieczno艣ci castowania.
```java
private static String getElement(List list, Integer number) {
    return (list).get(number).toString();
}
```
Rozwi膮zanie r贸wnie偶 w postaci kodu COI-Recruitment-Task/src/main/Task_18.java
## 19.	Czym r贸偶ni膮 si臋 poni偶sze zapisy i kt贸ry jest preferowany oraz dlaczego:
```java
public void test(String wartosc) {
    /*1*/if (wartosc.equals(""));
W przypadku metody equals() por贸wnywana jest warto艣膰 zmiennej wartosc i "". Niezale偶nie czy odwo艂uj膮 si臋 one do tego samego miejsca w pami臋ci czy te偶 nie (oraz przy za艂o偶eniu 偶e ich warto艣膰 jest identyczna) wynik wywo艂ania metody equals() b臋dzie r贸wny true.
    /*2*/if ("".equals(wartosc));
Tutaj wykorzystana zosta艂a ta sama metoda .equals() lecz teraz jej argumentem jest zmienna wartosc. Ten zapis b臋dzie preferowany do por贸wnywania Strign贸w poniewa偶 przy za艂o偶eniu 偶e ""   to sta艂a w metodzie to 
String podany w argumencie metody equals musi zosta膰 sprawdzony, poniewa偶 equals sprawdza czy nasz argument nie jeste nullem.

    /*3*/if (wartosc == "");
W przypadku operatora '==' por贸wnywana jest przestrze艅 pami臋ci naszej aplikacji. A dok艂adniej sprawdzane jest czy warto艣膰 sta艂a w metodzie zapisane s膮 w tym samym miejscu w pami臋ci naszej wirtualnej maszyny. Je艣li obie zmienne odwo艂uj膮 si臋 do tego samego miejsca, wtedy warto艣膰 otrzymana b臋dzie r贸wna true. Je艣li natomiast warto艣ci zmiennych b臋d膮 identyczne, jednak zapisane w innych miejscach w pami臋ci - wtedy naszym wynikiem b臋dzie false.
```

## 20.	Co to s膮 obiekty immutable? Czy final sprawia 偶e obiekt jest immutable i dlaczego?
Nie mo偶na modyfikowa膰 obiekt贸w klasy immutable po ich utworzeniu. Innymi s艂owy, kiedy ju偶 je stworzysz, nie mo偶esz ich zmieni膰. Je艣li spr贸bujesz zmodyfikowa膰 obiekt immutable, otrzymasz nowy obiekt (klon) i podmienisz ten klon podczas tworzenia.
Dobrym przyk艂adem jest String w Javie jest immutable. Oznacza to, 偶e nie mo偶esz zmieni膰 samego obiektu String, ale mo偶esz zmieni膰 odniesienie do obiektu.
Deklaruj膮c zmienne sk艂adowe jako 鈥瀎inal鈥? 鈥? kiedy deklarujemy je jako final , kompilator zmusza nas do ich zainicjowania. Mo偶emy zainicjowa膰 bezpo艣rednio, domy艣lny konstruktor, za pomoc膮 arg constructor i po zainicjowaniu nie mo偶emy ich modyfikowa膰, poniewa偶 s膮 final.

## 21.	Czym r贸偶ni si臋 metoda http POST od GET?
GET pobiera okre艣lony zas贸b wed艂ug okre艣lonego wcze艣niej identyfikatora, natomiast POST tworzy nowy zas贸b przyk艂adowo wysy艂aj膮c dane pod wyznaczony endpoint. POST mo偶e s艂u偶y膰 r贸wnie偶 do pobierania danych w przypadku kiedy musimy w ramach body dostarcza膰 dodatkowe parametry. 

## 22.	Jak powinna wygl膮dac sygnatura metody do kt贸rej mo偶na przekaza膰 dowoln膮 ilo艣膰 parametr贸w tego samego typu?
```java
public void test(String鈥rgs){}
```
Rpzwi膮zanie w postaci kodu COI-Recruitment-Task/src/main/Task_22.java
