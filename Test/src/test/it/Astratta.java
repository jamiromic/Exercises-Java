package test.it;

//La classe è astratta quindi non è possibile istanziare elementi da questa classe ma è possibile derivarla
//Se esiste anche solo un metodo astratto la classe diventa astratta
public abstract class Astratta {
	//i metodi astratti non devono essere implementati, ma solo dichiarati, spetterà ad ogni derivazione l'implementazione
	public abstract void versoAnimale();
}

