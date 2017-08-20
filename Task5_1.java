/*
 * Íàïèñàòü ïğîãğàììó îïğåäåëåíèÿ ñòîèìîñòè ğàçãîâîğà ïî òåëåôîíó 
 * ñ ó÷åòîì ñêèäêè 20%, ïğåäîñòàâëÿåìîé ïî ñóááîòàì è âîñêğåñåíüÿì

 */
public class Task5_1 {

	public static void main(String[] args) {
		int cost = 100;
		int day = 6;
		int minutes = 14;
		int prise = cost * minutes;
		if ((day > 0) && (day < 8)){
			switch (day)
			{
				case 6:
					System.out.println("Còîèìîñòü ğàçãîâîğà " + Math.round(prise * 0.8) + "\nñêèäêà " + Math.round(prise * 0.2));
					break;
				case 7:
					System.out.println("Còîèìîñòü ğàçãîâîğà " + Math.round(prise * 0.8) + "\nñêèäêà " + Math.round(prise * 0.2));
					break;
				default:
					System.out.println("Còîèìîñòü ğàçãîâîğà " + prise);
					break;				
			}
		}		
		else{
			System.out.println("İòî íå çåìíîé êàëåíäàğü");
		}
		

	}

}
