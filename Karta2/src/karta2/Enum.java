/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

/**
 *
 * @author nisit
 */
public class Enum {
    public enum Periodo {
        PERIODO1,
        PERIODO2,
        PERIODO3,
        PERIODO4,
        PERIODO5,
        PERIODO6,
        PERIODO7;
    }
    
    public enum Grupo {
        IA(1),
        IIA(2),
        IIIB(3),
        IVB(4),
        VB(5),
        VIB(6),
        VIIB(7),
        VIIIB_8(8),
        VIIIB_9(9),
        VIIIB_10(10),
        IB(11),
        IIB(12),
        IIIA(13),
        IVA(14),
        VA(15),
        VIA(16),
        VIIA(17),
        VIIIA(18);

        public int getNumGrupo() {
            return numGrupo;
        }

        private Grupo (int numGrupo) {
            this.numGrupo = numGrupo;
        }

        private int numGrupo;
    }
    
    public enum Pregunta {
        POR_SIMBOLO(1),
        POR_PERIODO(2),
        POR_GRUPO(3),
        POR_CLASIFICACION(4),
        POR_PESOA(5),
        POR_ELECTRO(6);

        public int getNum() {
            return num;
        }

        private Pregunta (int num) {
            this.num = num;
        }

        private int num;
    }
    
    public enum Medalla {
        ORO,
        PLATA,
        BRONCE;
    }
    
    public enum Dificultad {
        FACIL(10),
        MEDIO(5),
        DIFICIL(3);
        
        private Dificultad (int repetir) {
            this.repetir = repetir;
        }
        
        public int getRepetir() {
            return repetir;
        }
        
        private int repetir;
    }
    
    
}
