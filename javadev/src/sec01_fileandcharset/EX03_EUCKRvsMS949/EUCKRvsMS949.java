package sec01_fileandcharset.EX03_EUCKRvsMS949;

import java.io.UnsupportedEncodingException;

/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: 교재p761
 * 		EUC-KR 문자셋과 MS949 문자셋의 비교
 * 
 * */
public class EUCKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//#EUC-KR vs. MS949
		byte[] b1 = "a".getBytes("EUC-KR"); //문자열 --> byte[]
		byte[] b2 = "a".getBytes("MS949"); //문자열 --> byte[]
		
		System.out.println(b1.length); //1
		System.out.println(b2.length); //1
		
		
		System.out.println(new String(b1, "EUC-KR")); //byte[] --> 문자열
		System.out.println(new String(b2, "MS949")); //byte[] --> 문자열
		System.out.println();
		
		byte[] b3 = "가".getBytes("EUC-KR"); //문자열-->byte[]
		byte[] b4 = "가".getBytes("MS949"); //문자열-->byte[]
		
		System.out.println(b3.length); //2
		System.out.println(b4.length); //2
		
		byte[] b5 = "봵".getBytes("EUC-KR"); //문자열--> byte[]
		byte[] b6 = "봵".getBytes("MS949");  //문자열--> byte[]
		
		System.out.println(b5.length); //1 ?
		System.out.println(b6.length); //2
		
		System.out.println(new String(b5, "EUC-KR"));  //byte[] --> 문자열
		System.out.println(new String(b6, "MS949"));  //byte[] --> 문자열
		System.out.println();		
		
		
	}

}
