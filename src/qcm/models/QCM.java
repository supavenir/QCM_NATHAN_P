package qcm.models;

import java.util.Scanner;

public class QCM {
	public void poser(Question question) {
		System.out.println(question.getIntitule());
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		if(question.estValide(s)) {
			System.out.println("R�ponse valide");
		}else {
			System.out.println("R�ponse fausse");
		}
	}
}