LEZIONE 1, INTRO E BASI LINGUAGGIO JAVA

Java è un linguaggio compilato, uno dei piu utilizzti al mondo per la creazione di siti lato back-end, applicazioni e videogiochi.
E' un linguaggio compilato, ossia previene gli errori nella compilazione del codice in quanto lo legge prima di essere eseguito.( i programmi interpretati vengono letti una volta in runtime, riga per riga).

Java è scritto in un modo e letto da ogni tipo di software e hardware, cosi che puo essere universale. La JVM è la componente che consente questo processo, fa parte del JRE.
Il codice sorgente .java viene scritto e compilato grazie al comando .javac, questo permette la trasformazione del codice in un codice sorgente bytecode .class che è intermedio alla piattaforma e leggile ovunque. La JVM carica il .class con il Class loader che verifica e prepara le classi per l'esecuzione, che poi vengono eseguite dal compilatore del JVM in metodo Just in Time.

BASI LINGUAGGIO

NUMERI INTERI: long, int, short, byte in ordine di grandezza che queste variabili possono assumere
NUMERI DECIMALI: float, double
CHAR: singolo carattere solo con singoli apic ' '
BOOLEAN: TRUE O FALSE

FINAL: costante, valore non modificabile

ENUM: insime di costanti  enum Size{xl,l, m, s, xs}


OPERATORI: somma, sottrazione, moltiplicazione, divisione e modulo
abbreviazioni += -= ..ecc    ++    --

operatori di confronto > < == !

operatori booleani ||or &&and !not ^xor(true se solo una delle due e falsy, se entrambe sono falsy o entrambe sono truthy allora sarà false)

operatori bitwise??

STRINGHE Metodi Fondamentali
equals, equalsIgnoreCase, lenght, charAt, indexOf, isEmpty, isBlank, trim, replace.

ARRAY
int[] numeri = new int[8]; array di 8 numeri interi;
int[] numeri = {5 , 5 ,....,4};

METODO PER STAMPARE ARRAY 

Arrays.toString(nome_array) del pacchetto java.util (import java.util.Arrays)

METODI FONDAMENTALI  Arrays.
Lenght, copyOf, sort, fill, 

CONTROLLI DI FLUSSO, Condizioni
If else
Else if 
Switch

CICLI
For
While
Do While
ForEach

TYPE SYSTEM
INSIEME DEI tipi di dato del  linguaggio e di come vengono gestiti, diviso in comem vengono effetuate le verifiche sui tipo di dati, e sulla corretteza di dati; 

2 modalita sulla verifica sui tipi di dati
Verifica statica avviene prima cje il programma venga eseguito, cioe nel momento in cui viene genrato il bytecode .class (quando lancio javac)
Verifica dinamica durante il runtime ( linguaggi compilati)

per la verifica sulla correttezza dei dati in base alla tipizzazione:
Forte: devo indicare il tipo della variabile quanod le dichiaro, che devo indicare il valore di ritorno di una funzione e il tipo di dato che riceve una funzione;
Debole: conversioni in maniera automatica

JAVA E UN LINGUAGGIO A TIPIZZAZIONE STATICA E FORTE.

CONVERISONE DEL TIPO DEL DATO
CASTING ESPLICITO: forziamo una variabile da uno pou piccolo a uno piu grande, short x = 1; int y = (int) x == qui sto trasformando lo short x in un int y
CASTING IMPLICITO: in automatico int x=10; double y = x;

CASTING TRA TIPI INCOMPATIBILI es tra una stringa e un int

CLASSE WRAPPER trasforma un dato primitivo in un un oggetto, servono per avere i metodi e quando si lavora sulle collezioni

modificatori di accesso, PUBLIC, PROTECTED, DEFAULT, PRIVATE (WORLD, SUBCLASS, PACCHETTO, CLASSE)
# Aulab_Java1
