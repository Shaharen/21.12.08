package Exam03;

public class DollMain {

	public static void main(String[] args) {
		
		Machine ma = new Machine();
		Pika pika = new Pika();
		Piri piri = new Piri();
		Kkobuk kkobuk = new Kkobuk();
		
		// 머신을 통해서 피카츄 인형을 뽑고싶어요
//		ma.getPika(pika);
		
		// 업캐스팅
		ma.getDoll(pika);
		ma.getDoll(piri);
		ma.getDoll(kkobuk);
		
		
	}

}
