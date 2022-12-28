Вопрос 10

Имеется два класса:
//in file A.java
package p1;
public class A{
  protected int i = 10;
  public int getI() { return i; }
}

//in file B.java
package p2;
import p1.*;
public class B extends A{
  public void process(A a) {
    a.i = a.i*2;
  }
  public static void main(String[] args) {
    A a = new B();
    B b = new B();
    b.process(a);
    System.out.println( a.getI() );
  }
}

В результате выполнения класса В мы получим:

    Будет выведено «20»
    Будет выведено «10»
    Код не скомпилирутся
    Возникнет ошибка времени выполнения
    Все ответы неверны
    
 public class B extends A{
  public void process(A a) {
    a.i = a.i*2;
  }
  public static void main(String[] args) {
    A a = new B();
    B b = new B();
    b.process(a);
    System.out.println( a.getI() );
  }
}
 
Данный вопрос отражает важное свойство спецификатора доступа protected.
Во всех книгах и статьях пишут, что члены с доступом protected видны в данном пакете
и в подклассах других пакетов. Но мало кто уточняет, что за пределами пакета данные члены 
видны ТОЛЬКО ЧЕРЕЗ НАСЛЕДОВАНИЕ.

У самого класса B есть доступ к полю i, но он не может вызывать его на другом объекте, как это 
сделано в примере, 
что и приводит к ошибке компиляции.