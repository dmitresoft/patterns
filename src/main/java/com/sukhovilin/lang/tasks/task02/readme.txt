public class Program {
	public static void main(String[] args) {
		Float f1 = new Float(Float.NaN);
		Float f2 = new Float(Float.NaN);
		System.out.println("" + (f1 == f2) + " " + f1.equals(f2) + " " + (Float.NaN == Float.NaN));
	}
}

Что будет выведено в результате выполнения данного куска кода:

    false false false
    false true false
    true true false
    false true true
    true true true

    
C первым выражением вроде всё ясно. Разные объекты, поэтому false. А вот дальше…
В Java NaN'ы несравнимы между собой. Но есть два исключения в работе класса Float:

    Если f1 и f2 оба представляют Float.NaN, тогда метод equals возвращает true, 
    в то время как Float.NaN==Float.NaN принимает значение false.
    
    Если f1 содержит +0.0f в то время как f2 содержит -0.0f, метод equal возвращает false, 
    в то время как 0.0f==-0.0f возвращает true.
