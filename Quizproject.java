***
import java.util.Scanner;
class q {
	int n=0,s=0,x=0,p=0;
	Scanner sc=new Scanner(System.in);
   int qs() {
	   System.out.println("how many main methon can a java class have");
	   System.out.println("a : 1");
	   System.out.println("b : 2");
	   System.out.println("c : 3");
	   System.out.println("d : 4");
	   if(s==0 ||x==0) {
	   System.out.println("e : life line");
	   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)){
		   if(s==0) {
		   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
		   System.out.println("b :  50/50 chances");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : 1");
		   System.out.println("b : 2");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 82%\noption b 17%\noption c 02%\noption d 31%");
			   s=1;
			   qs();
			   return 0;}
	   }
	   
	   if(k=='a') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='c'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz");
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz");
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs();
	   }
	   System.out.println();
	   return 0;
   }
}
class q1 extends q{
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	void getl() {System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your Gender MALE/FEMALE");
		String g=sc.next();
		System.out.println("Rules\nConduct 10 question in quiz\nEvery Question have 1 mark\nenter only valid inputs i.e a,b,c,d\nIn this have two life chances\n1. % of how many people vote on each option\n2. 50% chances question.");
		System.out.println();}
   int qs1() {
	   System.out.println("1 In which state our Indian capital is there");
	   System.out.println("a : Andhrapradesh");
	   System.out.println("b : MadhayaPradesh");
	   System.out.println("c : Hariyaana");
	   System.out.println("d : HimachalPradesh");
	   if(s==0 ||x==0 ||p==0) {
	   System.out.println("e : life line");
	   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
		   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
		   System.out.println("b :  50/50 chances");}
		   if(p==0) {
		   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("c : Hariyaana");
		   System.out.println("d : HimachalPradesh");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 17%\noption c 82%\noption d 31%");
			   s=1;
			   qs1();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;
	           return 0;}
	   
	   }
	   
	   if(k=='c') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs1();
	   }
	   System.out.println();
	   return 0;
   }
}
class q2 extends q1{
	Scanner sc=new Scanner(System.in);
   int qs2() {
	   System.out.println("2 which team win ipl in 2022");
	   System.out.println("a : Rayal challengers");
	   System.out.println("b : Sunrises Hydrabad");
	   System.out.println("c : Gujarath Titans");
	   System.out.println("d : Mumbai indians");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
		   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
		   System.out.println("b :  50/50 chances");}
		   if(p==0) {
		   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("c : Gujarath Titans");
		   System.out.println("d : Mumbai indians");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 17%\noption c 82%\noption d 31%");
			   s=1;
			   qs2();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1; return 0;    }
	   }
	   if(k=='c') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs2();
	   }
	   System.out.println();
	   return 0;
   }
}
class q3 extends q2{
	Scanner sc=new Scanner(System.in);
   int qs3() {
	   System.out.println("3 Who wrote the play \"Romeo and Juliet\"?");
	   System.out.println("a : William Shakespeare");
	   System.out.println("b : Charles Dickens");
	   System.out.println("c : Mark Twain");
	   System.out.println("d : Jane Austen");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : William Shakespeare");
		   System.out.println("b : Charles Dickens");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 82%\noption b 17%\noption c 02%\noption d 31%");
			   s=1;
			   qs3();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1; return 0;    }
	   }
	   if(k=='a') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='c'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs3();
	   }
	   System.out.println();
	   return 0;
   }
}
class q4 extends q3{
	Scanner sc=new Scanner(System.in);
   int qs4() {
	   System.out.println("4 public class Quiz {\r\n"
	   		+ "    public static void main(String[] args) {\r\n"
	   		+ "        int x = 5;\r\n"
	   		+ "        int y = 10;\r\n"
	   		+ "        System.out.println((x > y) ? \"X is greater\" : \"Y is greater\");\r\n"
	   		+ "    }\r\n"
	   		+ "}");
	   System.out.println("a : X is greater");
	   System.out.println("b : Y is greater");
	   System.out.println("c : Compilation Error");
	   System.out.println("d : Runtime Error");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : X is greater");
		   System.out.println("b : Y is greater");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 77%\noption c 22%\noption d 31%");
			   s=1;
			   qs4();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;  return 0;   }
	   }
	   if(k=='b') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='c'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs4();
	   }
	   System.out.println();
	   return 0;
   }
}
class q5 extends q4{
	Scanner sc=new Scanner(System.in);
   int qs5() {
	   System.out.println("5 Which planet is known as the \"Red Planet\"?");
	   System.out.println("a : Mercury");
	   System.out.println("b : Venus");
	   System.out.println("c : Mars");
	   System.out.println("d : Jupiter");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("c : Mars");
		   System.out.println("d : Jupiter");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 17%\noption c 82%\noption d 31%");
			   s=1;
			   qs5();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;  return 0;   }
	   }
	   if(k=='c') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs5();
	   }
	   System.out.println();
	   return 0;
   }
}
class q6 extends q5{
	Scanner sc=new Scanner(System.in);
   int qs6() {
	   System.out.println("6 What is the capital city of Australia?");
	   System.out.println("a : Sydney");
	   System.out.println("b : Canberra");
	   System.out.println("c : Melbourne");
	   System.out.println("d : Brisbane");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : Sydney");
		   System.out.println("b : Canberra");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 97%\noption c 02%\noption d 31%");
			   s=1;
			   qs6();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;   return 0;  }
	   }
	   if(k=='b') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='c'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs6();
	   }
	   System.out.println();
	   return 0;
   }
}
class q7 extends q6{
	Scanner sc=new Scanner(System.in);
   int qs7() {
	   System.out.println("7 What is the chemical symbol for water?");
	   System.out.println("a : H2");
	   System.out.println("b : O2");
	   System.out.println("c : H2O");
	   System.out.println("d : CO2");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("c : H2O");
		   System.out.println("d : CO2");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 82%\noption b 17%\noption c 12%\noption d 31%");
			   s=1;
			   qs7();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1; return 0;    }
	   }
	   if(k=='c') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs7();
	   }
	   System.out.println();
	   return 0;
   }
}
class q8 extends q7{
	Scanner sc=new Scanner(System.in);
   int qs8() {
	   System.out.println("8 What does \"HTTP\" stand for in a website URL?");
	   System.out.println("a : HyperText Transfer Protocol");
	   System.out.println("b : High Text Transfer Protocol");
	   System.out.println("c : Hyperlink Text Processing");
	   System.out.println("d : HyperThread Transfer Process");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : HyperText Transfer Protocol");
		   System.out.println("b : High Text Transfer Protocol");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 72%\noption b 17%\noption c 02%\noption d 31%");
			   s=1;
			   qs8();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;  return 0;   }
	   }
	   if(k=='a') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='c'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs8();
	   }
	   System.out.println();
	   return 0;
   }
}
class q9 extends q8{
	Scanner sc=new Scanner(System.in);
   int qs9() {
	   System.out.println("9 How many players are there in a standard soccer team on the field?");
	   System.out.println("a : 10");
	   System.out.println("b : 11");
	   System.out.println("c : 12");
	   System.out.println("d : 09");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("a : 10");
		   System.out.println("b : 11");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 97%\noption c 02%\noption d 31%");
			   s=1;
			   qs9();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1;  return 0;   }
	   }
	   if(k=='b') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='c'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs9();
	   }
	   System.out.println();
	   return 0;
   }
}
class q10 extends q9{
	Scanner sc=new Scanner(System.in);
   int qs10() {
	   System.out.println("10 Which movie won the Oscar for Best Picture in 2023?");
	   System.out.println("a : Avatar: The Way of Water");
	   System.out.println("b : Top Gun: Maverick");
	   System.out.println("c : Everything Everywhere All At Once");
	   System.out.println("d : The Banshees of Inisherin");
	   if(s==0 ||x==0||p==0) {
		   System.out.println("e : life line");
		   }
	   System.out.println("f : exit to quiz");
	   char k=sc.next().charAt(0);
	   if((k=='e' && s==0)||(k=='e' && x==0)||(k=='e'&&p==0)){
		   if(s==0) {
			   System.out.println("a :  % of peoples voting");}
		   if(x==0) {
			   System.out.println("b :  50/50 chances");}
		   if(p==0) {
			   System.out.println("c :  want to swap question");}
		   k=sc.next().charAt(0);
	   if(k=='b' && x==0) {
		   System.out.println("c : Everything Everywhere All At Once");
		   System.out.println("d : The Banshees of Inisherin");
		   x=1;
		   k=sc.next().charAt(0);
	   }
		  else if(k=='a' && s==0){
			   System.out.println("option a 32%\noption b 17%\noption c 82%\noption d 31%");
			   s=1;
			   qs10();
			   return 0;}
		  else if(k=='c'&&p==0) {
	           qs();
	           p=1; return 0;    }
	   }
	   if(k=='c') {
		   System.out.println("correct answer got one point");
		   n+=1;
	   }
	   else if(k=='a'||k=='b'||k=='d') {
		   System.out.println("wrong answer");
		   System.out.println("Quiz is completed");
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.out.println("Your corrected answers are : "+n);
		   System.exit(0);
	   }
	   else if(k=='f') {
		   System.out.println("Thank You For Participate In This Quiz MR/MIS "+name);
		   System.exit(0);
	   }
	   else {
		   System.out.println("enter valid input");
		   qs10();
	   }
	   System.out.println();
	   return 0;
   }
   void dis() {
	   System.out.println("Congrates Mr/Mis "+name+"\nYou're correct answers are : "+n);
	   System.out.println("****************************************************************");
	   System.out.println("***********Thank You For Participate in this project************");
		System.out.println("                QUIZ ENDED \n");
		System.out.println("           Name          : "+this.name);
		System.out.println("           Right Answers : "+n);
		System.out.println("           Wrong Answers : "+(10-n));
		System.out.println("           Score         : "+(n*10)+"/100");
		System.out.println("\n************************************************************\n");
   }}
public class Quizproject {
public static void main(String[] args) {
	System.out.println("****************************welcome to sample quiz exam************************** ");
	System.out.println("Enter your Name");
	q10 a=new q10();
	a.getl();
	a.qs1();
	a.qs2();
	a.qs3();
	a.qs4();
	a.qs5();
	a.qs6();
	a.qs7();
	a.qs8();
	a.qs9();
	a.qs10();
	a.dis();
}}
***
