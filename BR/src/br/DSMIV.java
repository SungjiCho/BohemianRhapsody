package br;

import java.util.HashMap;

public class DSMIV {
	
	//�ֿ� ����� ���� ����(����, ������)
	private static final HashMap<Integer, String> Q1;
	static{
		Q1 = new HashMap<Integer, String>();
		Q1.put(0, "���� ������ ������ �ʴ´�.");
		Q1.put(1, "���� ������ ������.");
		Q1.put(2, "���� �׻� ������ �װ��� ���� ���� �� ����.");
		Q1.put(3, "���� �ʹ����� ������ �����ؼ� ������ �ߵ� �� ����.");		
	}
	
	private static final HashMap<Integer, String> Q2;
	static {
		Q2 = new HashMap<Integer, String>();
		Q2.put(0, "���� �ճ��� ���� Ư���� �������� �ʴ´�.");
		Q2.put(1, "���� �ճ��� ���ؼ� ���� ����� ���� ���ٰ� ������.");
		Q2.put(2, "���� �ճ��� ���� ����� ���� �ƹ��͵� ���ٰ� ������.");
		Q2.put(3, "���� �ճ��� �ϴ��Ͽ� ���� ����� ����.");		
	}
	
	private static final HashMap<Integer, String> Q3;
	static{
		Q3 = new HashMap<Integer, String>();
		Q3.put(0, "���� ���а� ���� ���� ������ �ʴ´�.");
		Q3.put(1, "���� �ٸ� ����麸�� ������ ������ �� ���ٰ� ������.");
		Q3.put(2, "���� ��ƿ� ���Ÿ� �ǵ��ƺ��� ���� �׻� ���� �Ͽ� ���и� �ߴ�.");
		Q3.put(3, "���� �� �ΰ����μ� ������ �����ߴٰ� ������.");		
	}
	
	private static final HashMap<Integer, String> Q4;
	static {
		Q4 = new HashMap<Integer, String>();
		Q4.put(0, "���� ���� �ٸ����� �ϻ��Ȱ���� �����ϰ� �ִ�.");
		Q4.put(1, "���� �ϻ��Ȱ�� ��ó�� ������� �ʴ�.");
		Q4.put(2, "���� �� �̻� � �Ϳ����� �������� ������ ���� ���Ѵ�.");
		Q4.put(3, "���� ��� ���� �� �Ҹ������� �����.");		
	}
	
	private static final HashMap<Integer, String> Q5;
	static {
		Q5 = new HashMap<Integer, String>();
		Q5.put(0, "���� Ư���� ���ǽ��� ������ �ʴ´�.");
		Q5.put(1, "���� ����  �ð� ���� ���ǽ��� ������.");
		Q5.put(2, "���� ��κ��� �ð� ���� ���ǽ��� ������.");
		Q5.put(3, "���� �׻� ���ǽ��� ������.");		
	}
	
	private static final HashMap<Integer, String> Q6;
	static {
		Q6 = new HashMap<Integer, String>();
		Q6.put(0, "���� ���� ���� �ް� �ִٰ� ������ �ʴ´�.");
		Q6.put(1, "���� ���� ���� �������� �𸥴ٰ� ������.");
		Q6.put(2, "���� ���� �޾ƾ� �Ѵٰ� ������.");
		Q6.put(3, "���� ���� ���� ���� �ް� �ִٰ� ������.");		
	}
	
	private static final HashMap<Integer, String> Q7;
	static{
		Q7 = new HashMap<Integer, String>();
		Q7.put(0, "���� �� �ڽſ� ���� �Ǹ����� �ʴ´�.");
		Q7.put(1, "���� �� �ڽſ� ���� �Ǹ��ϰ� �ִ�.");
		Q7.put(2, "���� �� �ڽ��� ���ܿ��ϰ� �ִ�.");
		Q7.put(3, "���� �� �ڽ��� �����Ѵ�.");		
	}
	
	private static final HashMap<Integer, String> Q8;
	static{
		Q8 = new HashMap<Integer, String>();
		Q8.put(0, "���� ���� �ٸ� ������� ���ϴٰ� �������� �ʴ´�.");
		Q8.put(1, "���� ���� �����̳� ������ ���� �� �ڽ��� ����ϴ� ���̴�.");
		Q8.put(2, "���� ���� �߸��� ���� �׻� �� �ڽ��� ���Ѵ�.");
		Q8.put(3, "���� �������� �Ͼ�� ��� �߸��� �Ͽ� ���� �� �ڽ��� ���Ѵ�.");		
	}
	
	private static final HashMap<Integer, String> Q9;
	static{
		Q9 = new HashMap<Integer, String>();
		Q9.put(0, "���� �ڻ��� ���� ���� ���� ���� �ʴ´�.");
		Q9.put(1, "���� �ڻ��� ������ �ϰ� ������ ���� ���������� ���� ���̴�.");
		Q9.put(2, "���� �ڻ��ϰ� �ʹ�.");
		Q9.put(3, "���� ��ȸ�� ������ �ڻ��ϰڴ�.");		
	}
	
	private static final HashMap<Integer, String> Q10;
	static{
		Q10 = new HashMap<Integer, String>();
		Q10.put(0, "���� ������ �� ������ �ʴ´�.");
		Q10.put(1, "���� ������ �� ���� ���.");
		Q10.put(2, "���� ������ ���� ���.");
		Q10.put(3, "���� ������ ���� ������� �������� �﷡�� �� ������� ����.");		
	}
	
	private static final HashMap<Integer, String> Q11;
	static{
		Q11 = new HashMap<Integer, String>();
		Q11.put(0, "���� ������ ȭ�� �� ���� �ʴ´�.");
		Q11.put(1, "���� ������ ���� ȭ�� ���� ¥���� ����.");
		Q11.put(2, "���� �׻� ȭ�� ġ�δ�.");
		Q11.put(3, "������ ȭ�� ���� �ߴ� ���ε��� �������� ȭ���� ���� �ʴ´�.");		
	}
	
	private static final HashMap<Integer, String> Q12;
	static{
		Q12 = new HashMap<Integer, String>();
		Q12.put(0, "���� �ٸ� ����� ���� ��̸� ���� �ʰ� �ִ�.");
		Q12.put(1, "���� �ٸ� ����鿡�� ��̸� �� ������.");
		Q12.put(2, "���� �ٸ� ����鿡 ���Ͽ� ���� ��̸� �Ҿ���.");
		Q12.put(3, "���� �ٸ� ����鿡 ���Ͽ� ������ ��̸� �Ҿ���.");		
	}
	
	private static final HashMap<Integer, String> Q13;
	static{
		Q13 = new HashMap<Integer, String>();
		Q13.put(0, "���� ���� ���� �����ϴ� ���� �� �س���.");
		Q13.put(1, "���� � �Ͽ� ���� ������ �� ������ �ӹ��Ÿ���.");
		Q13.put(2, "���� � ������ �� �� ������ �� ū ������� ������.");
		Q13.put(3, "���� ���� �ƹ� ������ ���� ���� ����.");		
	}
	
	private static final HashMap<Integer, String> Q14;
	static{
		Q14 = new HashMap<Integer, String>();
		Q14.put(0, "���� ������ �� ����� �������ٰ� ������ �ʴ´�.");
		Q14.put(1, "���� �� ��� ���� �����Ѵ�.");
		Q14.put(2, "���� ���鿡�� �ŷ��� ������ �� ��� ���ϰ� ���� �ʴ�.");
		Q14.put(3, "���� ���� ���ϰ� �����ϰ� ���δٰ� �����Ѵ�.");		
	}
	
	private static final HashMap<Integer, String> Q15;
	static{
		Q15 = new HashMap<Integer, String>();
		Q15.put(0, "���� ���� �ٸ����� ���� �� �� �� �ִ�.");
		Q15.put(1, "� ���� �����Ϸ��� ������ �� ���� ���.");
		Q15.put(2, "� ���� �����Ϸ��� ������ ���� ������ ������ �� �ȴ�.");
		Q15.put(3, "���� �ʹ� ���ļ� �ƹ��� �ϵ� �� ���� ����.");		
	}
	
	private static final HashMap<Integer, String> Q16;
	static{
		Q16 = new HashMap<Integer, String>();
		Q16.put(0, "���� ���� �ٸ����� ���� �� �ܴ�.");
		Q16.put(1, "���� ��ó�� ���� ���� ���Ѵ�.");
		Q16.put(2, "���� ������ �ѵ� �ð� ���� ���� ����, �ٽ� ���Ⱑ ��ƴ�.");
		Q16.put(3, "���� ������ �ξ� ���� ���� ����, �ٽ� ��� ���� ����.");		
	}
	
	private static final HashMap<Integer, String> Q17;
	static{
		Q17 = new HashMap<Integer, String>();
		Q17.put(0, "���� ������ �� �ǰ����� �ʴ�.");
		Q17.put(1, "���� ������ �� ���� �ǰ�������.");
		Q17.put(2, "���� ���� ���� �ϵ��� �� �ǰ�������.");
		Q17.put(3, "���� �ʹ��� �ǰ��ؼ� �ƹ� �ϵ� �� ���� ����.");		
	}
	
	private static final HashMap<Integer, String> Q18;
	static{
		Q18 = new HashMap<Integer, String>();
		Q18.put(0, "�� �Ŀ��� ������ �������� �ʾҴ�.");
		Q18.put(1, "�� �Ŀ��� ��ó�� ���� �ʴ�.");
		Q18.put(2, "�� �Ŀ��� ������ �ſ� ��������.");
		Q18.put(3, "���������� ���� �Ŀ��� ����.");		
	}
	
	private static final HashMap<Integer, String> Q19;
	static{
		Q19 = new HashMap<Integer, String>();
		Q19.put(0, "������ ���� �����԰� ���� �ʾҴ�.");
		Q19.put(1, "���� ������ �����԰� ���� ���̴�.");
		Q19.put(2, "���� ������ �����԰� ���� �پ���.");
		Q19.put(3, "���� ������ �����԰� �ʹ� ���� �پ, �ǰ��� ������ ���� �����̴�.");		
	}
	
	private static final HashMap<Integer, String> Q20;
	static{
		Q20 = new HashMap<Integer, String>();
		Q20.put(0, "���� ������ �ǰ��� ���� �� ���������� �ʴ´�.");
		Q20.put(1, "���� ����, ��ȭ�ҷ� �Ǵ� ���� ���� ������ ���.");
		Q20.put(2, "���� �� �ǰ��� ���Ͽ� �ſ� �����ϱ� ������ ����� ���� �ϱⰡ ��ƴ�.");
		Q20.put(3, "���� �� �ǰ��� ���Ͽ� �ʹ� �����ϱ� ������ �ٸ� ���� ���� ������ ���� ����.");		
	}
	
	private static final HashMap<Integer, String> Q21;
	static{
		Q21 = new HashMap<Integer, String>();
		Q21.put(0, "���� �������� �̼��� ���� ���ɿ� ��ȭ�� ���ٰ� �����Ѵ�.");
		Q21.put(1, "���� �������� �̼��� ���� ��̰� ����.");
		Q21.put(2, "���� ������ �̼��� ���� ��̸� ����� �Ҿ���.");
		Q21.put(3, "���� �̼��� ���� ��̸� ������ �Ҿ���.");		
	}
	
	//�ֿ� ����� ���� ����(����, ����)
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
		System.out.println("\n*** �� ���ô�� ���ܰ˻�(Beck Depression Inventory) ***");
		System.out.println("\n�� �˻� ������ �ڱ⽺���� �����ϴ� �������� ����� �ɰ����� �˾ƺ��� �����ν� "
				+ "\n1961�� Beck�� ���� ���ߵ� �̷� �� ���������� �θ� ���ǰ� �ִ� Beck ���ô���� �ѱ����Դϴ�.");
		System.out.println("(���� �� �ӻ���� �� ���� ������ �ʽ��ϴ�.)");
		System.out.println("\n�� 21�������� �ڽ��� ���� ���¿� ���� ����� ��ȣ�� �Է��� �ֽʽÿ�.\n");	
	}

}
