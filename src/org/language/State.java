package org.language;

public class State {
public void tamilNadu() {
	System.out.println("Tamilnadu");
}
public void keral() {
	System.out.println("Kerala");
}
public static void main(String[] args) {
	State s=new State();
	s.tamilNadu();
	s.keral();
	Languages l=new Languages();
	l.tamilLanguage();
	l.englichLanguage();
	l.hindiLanguage();
}
}
