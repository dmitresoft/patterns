Дана сигнатура метода:
public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
Который вызывается как-то так:
result = doIt(in);

Какого типа должны быть result и in?

    ArrayList<String> in; List<CharSequence> result;
    List<String> in; List<Object> result;
    ArrayList<String> in; List result;
    List<CharSequence> in; List<CharSequence> result;
    ArrayList<Object> in; List<CharSequence> result;

Входной параметр был описан как List<E>, где E — это какой-то класс, наследующий CharSequence.
Таким образом ArrayList<String>, List<String>, или List<CharSequence> — подходящие варианты для 'in'.
Данный метод возвращает List<? super E>, что значит, что это List, содержащий какой-то суперкласс E. 
Притом, E будет привязано к типу, который используется для 'in'. 
Например, если вы объявили ArrayList<String> in, E будет типа String.

Важный момент, который нужно понять, что невозможно заранее определить, что вернет метод.
 То есть вы не можете тут указать ни один из Java-классов, даже Object.

Единственный возможный вариант — использовать нетипизированный список, например: List result.

Данная тема достаточно сложна, и у меня есть мысли посвятить нюансам работы с 
коллекциями в Java отдельную статью. Там я постараюсь осветить эти моменты подробнее