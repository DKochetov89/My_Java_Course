package association;

import java.util.List;

/*
Агрегация предполагает, что объекты связаны взаимоотношением «part-of» (часть). 
Агрегация — частный случаи ассоциации «часть-целое».
*/

public class Server {

    List<ModuleRAM> serverRAM;
    class ModuleRAM {}
}
