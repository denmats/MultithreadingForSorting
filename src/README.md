Zadanie do rozwiązania dla osób aspirujących na ocenę 4,5 lub 5.

Zadania do wysyłania rozwiązań:


Zadanie 1:


Generujemy plik zawierający wylosowane liczby. Plik ma posiadać 16 wierszy, w każdym 40.000 liczb z zakresu 0 do 2.000.000.000

lub:

wczytujemy dane do tablicy i tworzymy każdorazowo przed sortowaniem jej kopie. Dane sortujemy na kopii tablicy.


Następnie:

Zadanie 2:

W kolejnym programie wczytujemy liczby do tablicy [16][1000]

Sprawdzamy czas posortowania tablicy (dane sortujemy tylko w poszczególnych wierszach, dane między wierszami nie są sortowane).

W kolejnym kroku tworzymy program wielowątkowy.

Sprawdzamy czas wykonania sortowania dla 1,2,4,8, i 16 wątków.


Przykład posortowanej tablicy [3][10] z liczbami 1...500

{1,3,56,89,123,145,200,302,367,405}

{7,9,98,178,201,345,402,412,450,467}

{8,32,99,154,178,222,382,418,478,499}


Przykładowy opis sortowania (można zastosować inną metodę):

http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort/bubble-2-j.html


inne algorytmy sortowania: http://www.algorytm.org/algorytmy-sortowania/


jak losować:


import java.util.Random;


public class Main {


public static void main(String[] args) {



       Random los = new Random();

int liczbaWylosowana=los.nextInt(49)+1;



}

}