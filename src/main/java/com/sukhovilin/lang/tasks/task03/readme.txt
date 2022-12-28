class Mountain {
  static String name = "Himalaya";
  static Mountain getMountain() {
    System.out.println("Getting Name ");
    return null;
  }
  public static void main(String[ ] args) {
    System.out.println( getMountain().name );
  }
}

Что произойдет при попытке выполнения данного кода:

    Будет выведено «Himalaya» но НЕ будет выведено "Getting Name"
    Будет выведено "Getting Name" и «Himalaya»
    Ничего не будет выведено
    Будет выброшен NullPointerException
    Будет выведено «Getting Name », а потом выброшено NullPointerException


Тут всё просто: для всех static полей и методов компилятор заменяет название объекта на название класса,
и во время выполнения уже не имеет никакого значения, была ссылка нулевой или нет.
То есть mountain.name меняется на Mountain.name.
Вообще рекомендуют при обращении к статик-членам класса всегда 
ссылаться на них именно через имя класса, а не объекта.