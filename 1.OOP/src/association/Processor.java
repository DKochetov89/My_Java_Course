package association;

import java.util.List;

/*
Композиция — частный случаи ассоциации «часть-целое» - более строгий вариант агрегации. 
Дополнительно к требованию «part-of» накладывается условие, что экземпляр «части» может входить только в одно цело
*/

public class Processor {

    List<Core> cores;
    class Core {}
}
