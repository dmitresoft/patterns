Вопрос 8

public class Main {
  static void method(int... a) {
    System.out.println("inside int...");
  }
  static void method(long a, long b) {
    System.out.println("inside long");
  }
  static void method(Integer a, Integer b) {
    System.out.println("inside INTEGER");
  }
  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    method(a,b);
  }
}

В результате мы получим:

    Ошибку компиляции
    Ошибку времени выполнения
    «inside int...»
    «inside long»
    «inside INTEGER»

    
В данном случае вызовется метод, принимающий тип long.
Это сделано по той причине, что до 5й джавы не существовало ни методов с переменным 
количеством параметров, ни автоупаковки. Поэтому в старых версиях джавы вызвался бы метод long
как единственный возможный. Поскольку нововведения не должны влиять на выполнение старого кода, 
вполне логично, что запускается метод long.

Если бы у нас было только два метода, «inside int...» и «inside INTEGER», запустился бы последний. 
Таким образом, приоритет автоупаковки в Java выше, чем приоритет vararg'ов.