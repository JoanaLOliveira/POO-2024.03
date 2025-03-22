package listClassesAbstratasPolimorfismoInterfaces.Exame;

import java.util.ArrayList;
import java.util.List;

public class AgendarExame {
    public static void main(String[] args) {
        List<Exame> examesPaciente = new ArrayList<>();
        examesPaciente.add(new GlicemiaJejum());
        examesPaciente.add(new EcografiaTireoide());
        for (Exame exame: examesPaciente){
            exame.mostrarPreparo();
        }
    }
}
