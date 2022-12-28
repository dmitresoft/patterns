Результатом его компиляции и выполнения будет:
 
Ошибка компиляции 
Ошибка времени выполнения
«Object»
«FileNotFoundException»
«IOException»
 
Наверное, мой любимый вопрос. Большинство людей угадывает ответ с 5-го раза.
FileNotFoundException — последнее, о чем думаешь глядя на этот код. 
Но на самом деле всё просто. Начнем с того, что в любой метод можно передать null. 
А дальше компилятор выбирает наиболее узкую версию метода из возможных. 
В данном случае FileNotFoundException это подкласс IOException, который, в свою очередь, подкласс Object. Поэтому компилятор выбирает именно данный метод.

Вот немного другая ситуация:
public class Overload{
  public void method(Object o) {
    System.out.println("Object");
  }
  public void method(String s) {
    System.out.println("String");
  }
  public void method(StringBuffer sb) {
    System.out.println("StringBuffer");
  }
  public static void main(String args[]) {
    Overload test = new Overload();
    test.method(null);
  }
}

На первый взгляд код почти такой же, но он даже не скомпилируется, так как тут есть
два метода на одном уровне иерархии, и компилятор не может выбрать наиболее специфичный из них.