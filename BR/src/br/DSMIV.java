package br;

import java.util.HashMap;

public class DSMIV {
	
	//주요 우울증 진단 기준(문항, 선택지)
	private static final HashMap<Integer, String> Q1;
	static{
		Q1 = new HashMap<Integer, String>();
		Q1.put(0, "나는 슬픔을 느끼지 않는다.");
		Q1.put(1, "나는 슬픔을 느낀다.");
		Q1.put(2, "나는 항상 슬프고 그것을 떨쳐 버릴 수 없다.");
		Q1.put(3, "나는 너무나도 슬프고 불행해서 도저히 견딜 수 없다.");		
	}
	
	private static final HashMap<Integer, String> Q2;
	static {
		Q2 = new HashMap<Integer, String>();
		Q2.put(0, "나는 앞날에 대해 특별히 낙담하지 않는다.");
		Q2.put(1, "나는 앞날에 대해서 별로 기대할 것이 없다고 느낀다.");
		Q2.put(2, "나는 앞날에 대해 기대할 것이 아무것도 없다고 느낀다.");
		Q2.put(3, "나의 앞날은 암담하여 전혀 희망이 없다.");		
	}
	
	private static final HashMap<Integer, String> Q3;
	static{
		Q3 = new HashMap<Integer, String>();
		Q3.put(0, "나는 실패감 같은 것을 느끼지 않는다.");
		Q3.put(1, "나는 다른 사람들보다 실패의 경험이 더 많다고 느낀다.");
		Q3.put(2, "나의 살아온 과거를 되돌아보면 나는 항상 많은 일에 실패를 했다.");
		Q3.put(3, "나는 한 인간으로서 완전히 실패했다고 느낀다.");		
	}
	
	private static final HashMap<Integer, String> Q4;
	static {
		Q4 = new HashMap<Integer, String>();
		Q4.put(0, "나는 전과 다름없이 일상생활에서 만족하고 있다.");
		Q4.put(1, "나의 일상생활은 전처럼 즐겁지가 않다.");
		Q4.put(2, "나는 더 이상 어떤 것에서도 실제적인 만족을 얻지 못한다.");
		Q4.put(3, "나는 모든 것이 다 불만스럽고 지겹다.");		
	}
	
	private static final HashMap<Integer, String> Q5;
	static {
		Q5 = new HashMap<Integer, String>();
		Q5.put(0, "나는 특별히 죄의식을 느끼지 않는다.");
		Q5.put(1, "나는 많은  시간 동안 죄의식을 느낀다.");
		Q5.put(2, "나는 대부분의 시간 동안 죄의식을 느낀다.");
		Q5.put(3, "나는 항상 죄의식을 느낀다.");		
	}
	
	private static final HashMap<Integer, String> Q6;
	static {
		Q6 = new HashMap<Integer, String>();
		Q6.put(0, "나는 내가 벌을 받고 있다고 느끼지 않는다.");
		Q6.put(1, "나는 내가 벌을 받을지도 모른다고 느낀다.");
		Q6.put(2, "나는 벌을 받아야 한다고 느낀다.");
		Q6.put(3, "나는 현재 내가 벌을 받고 있다고 느낀다.");		
	}
	
	private static final HashMap<Integer, String> Q7;
	static{
		Q7 = new HashMap<Integer, String>();
		Q7.put(0, "나는 내 자신에 대해 실망하지 않는다.");
		Q7.put(1, "나는 내 자신에 대해 실망하고 있다.");
		Q7.put(2, "나는 내 자신을 역겨워하고 있다.");
		Q7.put(3, "나는 내 자신을 증오한다.");		
	}
	
	private static final HashMap<Integer, String> Q8;
	static{
		Q8 = new HashMap<Integer, String>();
		Q8.put(0, "나는 내가 다른 사람보다 못하다고 생각하지 않는다.");
		Q8.put(1, "나는 나의 약점이나 점수에 대해 내 자신을 비관하는 편이다.");
		Q8.put(2, "나는 나의 잘못에 대해 항상 내 자신을 비난한다.");
		Q8.put(3, "나는 주위에서 일어나는 모든 잘못된 일에 대해 내 자신을 비난한다.");		
	}
	
	private static final HashMap<Integer, String> Q9;
	static{
		Q9 = new HashMap<Integer, String>();
		Q9.put(0, "나는 자살할 생각 같은 것은 하지 않는다.");
		Q9.put(1, "나는 자살할 생각은 하고 있으나 실제 실행하지는 않을 것이다.");
		Q9.put(2, "나는 자살하고 싶다.");
		Q9.put(3, "나는 기회만 있으면 자살하겠다.");		
	}
	
	private static final HashMap<Integer, String> Q10;
	static{
		Q10 = new HashMap<Integer, String>();
		Q10.put(0, "나는 전보다 더 울지는 않는다.");
		Q10.put(1, "나는 전보다 더 많이 운다.");
		Q10.put(2, "나는 요즈음 많이 운다.");
		Q10.put(3, "나는 전에는 자주 울었지만 요즈음은 울래야 울 기력조차 없다.");		
	}
	
	private static final HashMap<Integer, String> Q11;
	static{
		Q11 = new HashMap<Integer, String>();
		Q11.put(0, "나는 전보다 화를 더 내지 않는다.");
		Q11.put(1, "나는 전보다 쉽게 화가 나고 짜증이 난다.");
		Q11.put(2, "나는 항상 화가 치민다.");
		Q11.put(3, "전에는 화를 내게 했던 일인데도 요즈음은 화조차 나지 않는다.");		
	}
	
	private static final HashMap<Integer, String> Q12;
	static{
		Q12 = new HashMap<Integer, String>();
		Q12.put(0, "나는 다른 사람에 대한 흥미를 잃지 않고 있다.");
		Q12.put(1, "나는 다른 사람들에게 흥미를 덜 느낀다.");
		Q12.put(2, "나는 다른 사람들에 대하여 거의 흥미를 잃었다.");
		Q12.put(3, "나는 다른 사람들에 대하여 완전히 흥미를 잃었다.");		
	}
	
	private static final HashMap<Integer, String> Q13;
	static{
		Q13 = new HashMap<Integer, String>();
		Q13.put(0, "나는 전과 같이 결정하는 일을 잘 해낸다.");
		Q13.put(1, "나는 어떤 일에 대해 결정을 못 내리고 머뭇거린다.");
		Q13.put(2, "나는 어떤 결정을 할 때 전보다 더 큰 어려움을 느낀다.");
		Q13.put(3, "나는 이제 아무 결정도 내릴 수가 없다.");		
	}
	
	private static final HashMap<Integer, String> Q14;
	static{
		Q14 = new HashMap<Integer, String>();
		Q14.put(0, "나는 전보다 내 모습이 나빠졌다고 느끼지 않는다.");
		Q14.put(1, "나는 내 용모에 대해 걱정한다.");
		Q14.put(2, "나는 남들에게 매력을 느끼게 할 용모를 지니고 있지 않다.");
		Q14.put(3, "나는 내가 추하고 불쾌하게 보인다고 생각한다.");		
	}
	
	private static final HashMap<Integer, String> Q15;
	static{
		Q15 = new HashMap<Integer, String>();
		Q15.put(0, "나는 전과 다름없이 일을 잘 할 수 있다.");
		Q15.put(1, "어떤 일을 시작하려면 전보다 더 힘이 든다.");
		Q15.put(2, "어떤 일을 시작하려면 굉장히 힘을 들이지 않으면 안 된다.");
		Q15.put(3, "나는 너무 지쳐서 아무런 일도 할 수가 없다.");		
	}
	
	private static final HashMap<Integer, String> Q16;
	static{
		Q16 = new HashMap<Integer, String>();
		Q16.put(0, "나는 전과 다름없이 잠을 잘 잔다.");
		Q16.put(1, "나는 전처럼 잠을 자지 못한다.");
		Q16.put(2, "나는 전보다 한두 시간 빨리 잠이 깨며, 다시 잠들기가 어렵다.");
		Q16.put(3, "나는 전보다 훨씬 빨리 잠이 깨며, 다시 잠들 수가 없다.");		
	}
	
	private static final HashMap<Integer, String> Q17;
	static{
		Q17 = new HashMap<Integer, String>();
		Q17.put(0, "나는 전보다 더 피곤하지 않다.");
		Q17.put(1, "나는 전보다 더 쉽게 피곤해진다.");
		Q17.put(2, "나는 무슨 일을 하든지 곧 피곤해진다.");
		Q17.put(3, "나는 너무나 피곤해서 아무 일도 할 수가 없다.");		
	}
	
	private static final HashMap<Integer, String> Q18;
	static{
		Q18 = new HashMap<Integer, String>();
		Q18.put(0, "내 식욕은 전보다 나빠지지 않았다.");
		Q18.put(1, "내 식욕이 전처럼 좋지 않다.");
		Q18.put(2, "내 식욕은 요즈음 매우 나빠졌다.");
		Q18.put(3, "요즈음에는 전혀 식욕이 없다.");		
	}
	
	private static final HashMap<Integer, String> Q19;
	static{
		Q19 = new HashMap<Integer, String>();
		Q19.put(0, "요즈음 나는 몸무게가 줄지 않았다.");
		Q19.put(1, "나는 전보다 몸무게가 줄은 편이다.");
		Q19.put(2, "나는 전보다 몸무게가 많이 줄었다.");
		Q19.put(3, "나는 전보다 몸무게가 너무 많이 줄어서, 건강에 위협을 느낄 정도이다.");		
	}
	
	private static final HashMap<Integer, String> Q20;
	static{
		Q20 = new HashMap<Integer, String>();
		Q20.put(0, "나는 전보다 건강에 대해 더 염려하지는 않는다.");
		Q20.put(1, "나는 두통, 소화불량 또는 변비 등의 현상이 잦다.");
		Q20.put(2, "나는 내 건강에 대하여 매우 염려하기 때문에 제대로 일을 하기가 어렵다.");
		Q20.put(3, "나는 내 건강에 대하여 너무 염려하기 때문에 다른 일을 거의 생각할 수가 없다.");		
	}
	
	private static final HashMap<Integer, String> Q21;
	static{
		Q21 = new HashMap<Integer, String>();
		Q21.put(0, "나는 요즈음도 이성에 대한 관심에 변화가 없다고 생각한다.");
		Q21.put(1, "나는 이전보다 이성에 대한 흥미가 적다.");
		Q21.put(2, "나는 요즈음 이성에 대한 흥미를 상당히 잃었다.");
		Q21.put(3, "나는 이성에 대한 흥미를 완전히 잃었다.");		
	}
	
	//주요 우울증 진단 기준(문항, 질문)
	private static final HashMap<Integer, HashMap<Integer, String>> Question;
	static{
		Question = new HashMap<Integer, HashMap<Integer, String>>();
		Question.put(1, Q1);
		Question.put(2, Q2);
		Question.put(3, Q3);
		Question.put(4, Q4);
		Question.put(5, Q5);
		Question.put(6, Q6);
		Question.put(7, Q7);
		Question.put(8, Q8);
		Question.put(9, Q9);
		Question.put(10, Q10);
		Question.put(11, Q11);
		Question.put(12, Q12);
		Question.put(13, Q13);
		Question.put(14, Q14);
		Question.put(15, Q15);
		Question.put(16, Q16);
		Question.put(17, Q17);
		Question.put(18, Q18);
		Question.put(19, Q19);
		Question.put(20, Q20);
		Question.put(21, Q21);
	}

	public static HashMap<Integer, HashMap<Integer, String>> getQuestion() {
		return Question;
	}

	public static void introduceTest() {
		System.out.println("\n*** 백 우울척도 진단검사(Beck Depression Inventory) ***");
		System.out.println("\n본 검사 도구는 자기스스로 보고하는 형식으로 우울의 심각도를 알아보는 도구로써 "
				+ "\n1961년 Beck에 의해 개발된 이래 전 세계적으로 널리 사용되고 있는 Beck 우울척도의 한국판입니다.");
		System.out.println("(연구 및 임상장면 외 무단 사용되지 않습니다.)");
		System.out.println("\n총 21문항으로 자신의 현재 상태와 가장 가까운 번호를 입력해 주십시오.\n");	
	}

}
