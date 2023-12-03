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
    //Aquí están todos los enum: Periodo, Grupo, TipoPregunta, Medalla, Dificultad, Clasificacion
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
    
    public enum TipoPregunta {
        POR_ELEMENTO("¿Cuál es el nombre del elemento cuyo símbolo es este?"),
        POR_SIMBOLO("¿Cuál es el simbolo de este elemento?"),
        POR_NUM_MASA("¿Cuál es el número de masa de este elemento?"),
        POR_NUM_ATOMICO("¿Cuál es el número atómico de este elemento?"),
        POR_PERIODO("¿En qué periodo se encuentra este elemento?"),
        POR_GRUPO_RO("¿En qué grupo del sistema estadounidense se encuentra este elemento?"),
        POR_GRUPO_AR("¿En qué grupo, según la IUPAC, se encuentra este elemento?"),
        POR_CLASIFICACION("¿Qué tipo de elemento es este?"),
        POR_PESOA("¿Cuál es el peso atómico de este elemento?"),
        POR_ELECTRO("¿Qué elemento es más electronegativo?");
        
        
        public String getOracion() {
            return oracion;
        }
        private TipoPregunta (String oracion) {
            this.oracion = oracion;
        }
        
        private String oracion;
    }
    
    public enum Medalla {
        ORO,
        PLATA,
        BRONCE;
    }
    
    public enum Dificultad {
        FACIL(0),
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
    
    public enum Clasificacion {
        METAL("Metal"),
        METALOIDE("Metaloide"),
        NOMETAL("No metal"),
        HALOGENOS("Halógeno"),
        ACTINIDOS("Actínidos"),
        LACTINIDOS("Lactínidos"),
        GASES_NOBLES("Gas noble");
        
        private Clasificacion (String clasificacion) {
            this.clasificacion = clasificacion;
        }
        
        public String getClasificacion() {
            return clasificacion;
        }
        
        private String clasificacion;
    }
    
}
