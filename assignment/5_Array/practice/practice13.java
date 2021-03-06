public class ArrayPractice {
	public void pracitce13() {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		// 1~10 사이의 난수(랜덤)를 발생시켜 중복없이 배열에 초기화하여 출력
		// 1. int[10] 배열에 난수 집어넣기
		// 2. 중복제거 && 겹치지 않게 난수 재대입
		
		int[] arr = new int[10];
		boolean[] isUsed = new boolean[arr.length+1]; // 1칸부터 시작해서 인덱스 1부터 시작해서 10칸 되려면 11되야 함
		
		int random;
		int count = 0;
		do {
			random = (int)(Math.random()*10+1);
			if(!(isUsed[random])) {
				isUsed[random] = true;	// random 숫자 사용 여부 확인
				arr[count] = random;
				count++;
			}
		} while(count < arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	} // practice 13 end
} // class end
