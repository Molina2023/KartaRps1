/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;*/
import java.util.ArrayList;
import java.util.Random;


public class TablaPeriodica {
    //Aquí terminó el ElementosObj, ya no tiene métodos
    public ArrayList<Elemento> arrayTablaPeriodica = new ArrayList<Elemento>();
   
    
    public TablaPeriodica ()
    {
        arrayTablaPeriodica.add(new Elemento (1, "H", "el Hidrógeno", Enum.Periodo.PERIODO1, Enum.Grupo.IA, "gas", 1.008, 2.1));
        arrayTablaPeriodica.add(new Elemento(2, "He", "Helio", Enum.Periodo.PERIODO1, Enum.Grupo.VIIIA, "Gas", 4.0026, 0));
        arrayTablaPeriodica.add(new Elemento(3, "Li", "Litio", Enum.Periodo.PERIODO2, Enum.Grupo.IA, "Sólido", 6.94, 0.98));
        arrayTablaPeriodica.add(new Elemento(4, "Be", "Berilio", Enum.Periodo.PERIODO2, Enum.Grupo.IIA, "Sólido", 9.0122, 1.57));
        arrayTablaPeriodica.add(new Elemento(5, "B", "Boro", Enum.Periodo.PERIODO2, Enum.Grupo.IIIA, "Sólido", 10.81, 2.04));
        arrayTablaPeriodica.add(new Elemento(6, "C", "Carbono", Enum.Periodo.PERIODO2, Enum.Grupo.IVA, "Sólido", 12.011, 2.55));
        arrayTablaPeriodica.add(new Elemento(7, "N", "Nitrógeno", Enum.Periodo.PERIODO2, Enum.Grupo.VA, "Gas", 14.007, 3.04));
        arrayTablaPeriodica.add(new Elemento(8, "O", "Oxígeno", Enum.Periodo.PERIODO2, Enum.Grupo.VIA, "Gas", 15.999, 3.44));
        arrayTablaPeriodica.add(new Elemento(9, "F", "Flúor", Enum.Periodo.PERIODO2, Enum.Grupo.VIIA, "Gas", 18.998, 3.98));
        arrayTablaPeriodica.add(new Elemento(10, "Ne", "Neón", Enum.Periodo.PERIODO2, Enum.Grupo.VIIIA, "Gas", 20.180, 0));
        arrayTablaPeriodica.add(new Elemento(11, "Na", "Sodio", Enum.Periodo.PERIODO3, Enum.Grupo.IA, "Sólido", 22.990, 0.93));
        arrayTablaPeriodica.add(new Elemento(12, "Mg", "Magnesio", Enum.Periodo.PERIODO3, Enum.Grupo.IIA, "Sólido", 24.305, 1.31));
        arrayTablaPeriodica.add(new Elemento(13, "Al", "Aluminio", Enum.Periodo.PERIODO3, Enum.Grupo.IIIA, "Sólido", 26.982, 1.61));
        arrayTablaPeriodica.add(new Elemento(14, "Si", "Silicio", Enum.Periodo.PERIODO3, Enum.Grupo.IVA, "Sólido", 28.085, 1.9));
        arrayTablaPeriodica.add(new Elemento(15, "P", "Fósforo", Enum.Periodo.PERIODO3, Enum.Grupo.VA, "Sólido", 30.974, 2.19));
        arrayTablaPeriodica.add(new Elemento(16, "S", "Azufre", Enum.Periodo.PERIODO3, Enum.Grupo.VIA, "Sólido", 32.06, 2.58));
        arrayTablaPeriodica.add(new Elemento(17, "Cl", "Cloro", Enum.Periodo.PERIODO3, Enum.Grupo.VIIA, "Gas", 35.45, 3.16));
        arrayTablaPeriodica.add(new Elemento(18, "Ar", "Argón", Enum.Periodo.PERIODO3, Enum.Grupo.VIIIA, "Gas", 39.948, 0));
        arrayTablaPeriodica.add(new Elemento(19, "K", "Potasio", Enum.Periodo.PERIODO4, Enum.Grupo.IA, "Sólido", 39.098, 0.82));
        arrayTablaPeriodica.add(new Elemento(20, "Ca", "Calcio", Enum.Periodo.PERIODO4, Enum.Grupo.IIA, "Sólido", 40.078, 1));
        arrayTablaPeriodica.add(new Elemento(21, "Sc", "Escandio", Enum.Periodo.PERIODO4, Enum.Grupo.IIIA, "Sólido", 44.956, 1.36));
        arrayTablaPeriodica.add(new Elemento(22, "Ti", "Titanio", Enum.Periodo.PERIODO4, Enum.Grupo.IVA, "Sólido", 47.867, 1.54));
        arrayTablaPeriodica.add(new Elemento(23, "V", "Vanadio", Enum.Periodo.PERIODO4, Enum.Grupo.VA, "Sólido", 50.942, 1.63));
        arrayTablaPeriodica.add(new Elemento(24, "Cr", "Cromo", Enum.Periodo.PERIODO4, Enum.Grupo.VIA, "Sólido", 51.996, 1.66));
        arrayTablaPeriodica.add(new Elemento(25, "Mn", "Manganeso", Enum.Periodo.PERIODO4, Enum.Grupo.VIIA, "Sólido", 54.938, 1.55));
        arrayTablaPeriodica.add(new Elemento(26, "Fe", "Hierro", Enum.Periodo.PERIODO4, Enum.Grupo.VIIIB_8, "Sólido", 55.845, 1.83));
        arrayTablaPeriodica.add(new Elemento(27, "Co", "Cobalto", Enum.Periodo.PERIODO4, Enum.Grupo.VIIIB_9, "Sólido", 58.933, 1.88));
        arrayTablaPeriodica.add(new Elemento(28, "Ni", "Níquel", Enum.Periodo.PERIODO4, Enum.Grupo.VIIIB_10, "Sólido", 58.693, 1.91));
        arrayTablaPeriodica.add(new Elemento(29, "Cu", "Cobre", Enum.Periodo.PERIODO4, Enum.Grupo.IB, "Sólido", 63.546, 1.9));
        arrayTablaPeriodica.add(new Elemento(30, "Zn", "Zinc", Enum.Periodo.PERIODO4, Enum.Grupo.IIB, "Sólido", 65.38, 1.65));
        arrayTablaPeriodica.add(new Elemento(31, "Ga", "Galio", Enum.Periodo.PERIODO4, Enum.Grupo.IIIA, "Sólido", 69.723, 1.81));
        arrayTablaPeriodica.add(new Elemento(32, "Ge", "Germanio", Enum.Periodo.PERIODO4, Enum.Grupo.IVA, "Sólido", 72.630, 2.01));
        arrayTablaPeriodica.add(new Elemento(33, "As", "Arsénico", Enum.Periodo.PERIODO4, Enum.Grupo.VA, "Sólido", 74.922, 2.18));
        arrayTablaPeriodica.add(new Elemento(34, "Se", "Selenio", Enum.Periodo.PERIODO4, Enum.Grupo.VIA, "Sólido", 78.971, 2.55));
        arrayTablaPeriodica.add(new Elemento(35, "Br", "Bromo", Enum.Periodo.PERIODO4, Enum.Grupo.VIIA, "Líquido", 79.904, 2.96));
        arrayTablaPeriodica.add(new Elemento(36, "Kr", "Kriptón", Enum.Periodo.PERIODO4, Enum.Grupo.VIIIA, "Gas", 83.798, 3));
        arrayTablaPeriodica.add(new Elemento(37, "Rb", "Rubidio", Enum.Periodo.PERIODO5, Enum.Grupo.IA, "Sólido", 85.468, 0.82));
        arrayTablaPeriodica.add(new Elemento(38, "Sr", "Estroncio", Enum.Periodo.PERIODO5, Enum.Grupo.IIA, "Sólido", 87.620, 0.95));
        arrayTablaPeriodica.add(new Elemento(39, "Y", "Itrio", Enum.Periodo.PERIODO5, Enum.Grupo.IIIA, "Sólido", 88.906, 1.22));
        arrayTablaPeriodica.add(new Elemento(40, "Zr", "Circonio", Enum.Periodo.PERIODO5, Enum.Grupo.IVA, "Sólido", 91.224, 1.33));
        arrayTablaPeriodica.add(new Elemento(41, "Nb", "Niobio", Enum.Periodo.PERIODO5, Enum.Grupo.VA, "Sólido", 92.906, 1.6));
        arrayTablaPeriodica.add(new Elemento(42, "Mo", "Molibdeno", Enum.Periodo.PERIODO5, Enum.Grupo.VIA, "Sólido", 95.950, 2.16));
        arrayTablaPeriodica.add(new Elemento(43, "Tc", "Tecnecio", Enum.Periodo.PERIODO5, Enum.Grupo.VIIA, "Sólido", 98.000, 1.9));
        arrayTablaPeriodica.add(new Elemento(44, "Ru", "Rutenio", Enum.Periodo.PERIODO5, Enum.Grupo.VIIIB_8, "Sólido", 101.070, 2.2));
        arrayTablaPeriodica.add(new Elemento(45, "Rh", "Rodio", Enum.Periodo.PERIODO5, Enum.Grupo.VIIIB_9, "Sólido", 102.906, 2.28));
        arrayTablaPeriodica.add(new Elemento(46, "Pd", "Paladio", Enum.Periodo.PERIODO5, Enum.Grupo.VIIIB_10, "Sólido", 106.420, 2.20));
        arrayTablaPeriodica.add(new Elemento(47, "Ag", "Plata", Enum.Periodo.PERIODO5, Enum.Grupo.IB, "Sólido", 107.868, 1.93));
        arrayTablaPeriodica.add(new Elemento(48, "Cd", "Cadmio", Enum.Periodo.PERIODO5, Enum.Grupo.IIB, "Sólido", 112.414, 1.69));
        arrayTablaPeriodica.add(new Elemento(49, "In", "Indio", Enum.Periodo.PERIODO5, Enum.Grupo.IIIA, "Sólido", 114.818, 1.78));
        arrayTablaPeriodica.add(new Elemento(50, "Sn", "Estaño", Enum.Periodo.PERIODO5, Enum.Grupo.IVA, "Sólido", 118.710, 1.96));
        arrayTablaPeriodica.add(new Elemento(51, "Sb", "Antimonio", Enum.Periodo.PERIODO5, Enum.Grupo.VA, "Sólido", 121.760, 0));
        arrayTablaPeriodica.add(new Elemento(52, "Te", "Telurio", Enum.Periodo.PERIODO5, Enum.Grupo.VIA, "Sólido", 127.600, 0));
        arrayTablaPeriodica.add(new Elemento(53, "I", "Yodo", Enum.Periodo.PERIODO5, Enum.Grupo.VIIA, "Sólido", 126.904, 0));
        arrayTablaPeriodica.add(new Elemento(54, "Xe", "Xenón", Enum.Periodo.PERIODO5, Enum.Grupo.VIIIA, "Gas", 131.294, 0));
        arrayTablaPeriodica.add(new Elemento(55, "Cs", "Cesio", Enum.Periodo.PERIODO6, Enum.Grupo.IA, "Sólido", 132.905, 0));
        arrayTablaPeriodica.add(new Elemento(56, "Ba", "Bario", Enum.Periodo.PERIODO6, Enum.Grupo.IIA, "Sólido", 137.327, 0));
        arrayTablaPeriodica.add(new Elemento(57, "La", "Lantano", Enum.Periodo.PERIODO6, Enum.Grupo.IIIB, "Sólido", 138.905, 0));
        arrayTablaPeriodica.add(new Elemento(58, "Ce", "Cerio", Enum.Periodo.PERIODO6, Enum.Grupo.IVB, "Sólido", 140.116, 0));
        arrayTablaPeriodica.add(new Elemento(59, "Pr", "Praseodimio", Enum.Periodo.PERIODO6, Enum.Grupo.VB, "Sólido", 140.907, 0));
        arrayTablaPeriodica.add(new Elemento(60, "Nd", "Neodimio", Enum.Periodo.PERIODO6, Enum.Grupo.VIB, "Sólido", 144.242, 0));
        arrayTablaPeriodica.add(new Elemento(61, "Pm", "Prometio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIB, "Sólido", 145.000, 0));
        arrayTablaPeriodica.add(new Elemento(62, "Sm", "Samario", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_8, "Sólido", 150.360, 0));
        arrayTablaPeriodica.add(new Elemento(63, "Eu", "Europio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_9, "Sólido", 151.964, 0));
        arrayTablaPeriodica.add(new Elemento(64, "Gd", "Gadolinio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_10, "Sólido", 157.250, 0));
        arrayTablaPeriodica.add(new Elemento(65, "Tb", "Terbio", Enum.Periodo.PERIODO6, Enum.Grupo.IB, "Sólido", 158.925, 0));
        arrayTablaPeriodica.add(new Elemento(66, "Dy", "Disprosio", Enum.Periodo.PERIODO6, Enum.Grupo.IIB, "Sólido", 162.500, 0));
        arrayTablaPeriodica.add(new Elemento(67, "Ho", "Holmio", Enum.Periodo.PERIODO6, Enum.Grupo.IIIA, "Sólido", 164.930, 0));
        arrayTablaPeriodica.add(new Elemento(68, "Er", "Erbio", Enum.Periodo.PERIODO6, Enum.Grupo.IVA, "Sólido", 167.259, 0));
        arrayTablaPeriodica.add(new Elemento(69, "Tm", "Tulio", Enum.Periodo.PERIODO6, Enum.Grupo.VA, "Sólido", 168.934, 0));
        arrayTablaPeriodica.add(new Elemento(70, "Yb", "Iterbio", Enum.Periodo.PERIODO6, Enum.Grupo.VIA, "Sólido", 173.045, 0));
        arrayTablaPeriodica.add(new Elemento(71, "Lu", "Lutecio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIA, "Sólido", 174.966, 0));
        arrayTablaPeriodica.add(new Elemento(72, "Hf", "Hafnio", Enum.Periodo.PERIODO6, Enum.Grupo.IVB, "Sólido", 178.490, 1.3));
        arrayTablaPeriodica.add(new Elemento(73, "Ta", "Tantalio", Enum.Periodo.PERIODO6, Enum.Grupo.VB, "Sólido", 180.948, 1.5));
        arrayTablaPeriodica.add(new Elemento(74, "W", "Wolframio", Enum.Periodo.PERIODO6, Enum.Grupo.VIB, "Sólido", 183.840, 2.36));
        arrayTablaPeriodica.add(new Elemento(75, "Re", "Renio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIB, "Sólido", 186.207, 1.9));
        arrayTablaPeriodica.add(new Elemento(76, "Os", "Osmio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_8, "Sólido", 190.230, 2.2));
        arrayTablaPeriodica.add(new Elemento(77, "Ir", "Iridio", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_9, "Sólido", 192.217, 2.2));
        arrayTablaPeriodica.add(new Elemento(78, "Pt", "Platino", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIB_10, "Sólido", 195.084, 2.28));
        arrayTablaPeriodica.add(new Elemento(79, "Au", "Oro", Enum.Periodo.PERIODO6, Enum.Grupo.IB, "Sólido", 196.967, 2.54));
        arrayTablaPeriodica.add(new Elemento(80, "Hg", "Mercurio", Enum.Periodo.PERIODO6, Enum.Grupo.IIB, "Líquido", 200.592, 2));
        arrayTablaPeriodica.add(new Elemento(81, "Tl", "Talio", Enum.Periodo.PERIODO6, Enum.Grupo.IIIA, "Sólido", 204.380, 1.62));
        arrayTablaPeriodica.add(new Elemento(82, "Pb", "Plomo", Enum.Periodo.PERIODO6, Enum.Grupo.IVA, "Sólido", 207.200, 1.87));
        arrayTablaPeriodica.add(new Elemento(83, "Bi", "Bismuto", Enum.Periodo.PERIODO6, Enum.Grupo.VA, "Sólido", 208.980, 2.02));
        arrayTablaPeriodica.add(new Elemento(84, "Po", "Polonio", Enum.Periodo.PERIODO6, Enum.Grupo.VIA, "Sólido", 209.000, 2));
        arrayTablaPeriodica.add(new Elemento(85, "At", "Astato", Enum.Periodo.PERIODO6, Enum.Grupo.VIIA, "Sólido", 210.000, 2.2));
        arrayTablaPeriodica.add(new Elemento(86, "Rn", "Radón", Enum.Periodo.PERIODO6, Enum.Grupo.VIIIA, "Gas", 222.000, 0));
        arrayTablaPeriodica.add(new Elemento(87, "Fr", "Francio", Enum.Periodo.PERIODO7, Enum.Grupo.IA, "Sólido", 223.000, 0.7));
        arrayTablaPeriodica.add(new Elemento(88, "Ra", "Radio", Enum.Periodo.PERIODO7, Enum.Grupo.IIA, "Sólido", 226.000, 0.9));
        arrayTablaPeriodica.add(new Elemento(89, "Ac", "Actinio", Enum.Periodo.PERIODO7, Enum.Grupo.IIIB, "Sólido", 227.000, 0));
        arrayTablaPeriodica.add(new Elemento(90, "Th", "Torio", Enum.Periodo.PERIODO7, Enum.Grupo.IVB, "Sólido", 232.038, 0));
        arrayTablaPeriodica.add(new Elemento(91, "Pa", "Protactinio", Enum.Periodo.PERIODO7, Enum.Grupo.VB, "Sólido", 231.036, 0));
        arrayTablaPeriodica.add(new Elemento(92, "U", "Uranio", Enum.Periodo.PERIODO7, Enum.Grupo.VIB, "Sólido", 238.029, 0));
        arrayTablaPeriodica.add(new Elemento(93, "Np", "Neptunio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIB, "Sólido", 237.000, 0));
        arrayTablaPeriodica.add(new Elemento(94, "Pu", "Plutonio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_8, "Sólido", 244.000, 0));
        arrayTablaPeriodica.add(new Elemento(95, "Am", "Americio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_9, "Sólido", 243.000, 0));
        arrayTablaPeriodica.add(new Elemento(96, "Cm", "Curio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_10, "Sólido", 247.000, 0));
        arrayTablaPeriodica.add(new Elemento(97, "Bk", "Berkelio", Enum.Periodo.PERIODO7, Enum.Grupo.IB, "Sólido", 247.000, 0));
        arrayTablaPeriodica.add(new Elemento(98, "Cf", "Californio", Enum.Periodo.PERIODO7, Enum.Grupo.IIB, "Sólido", 251.000, 0));
        arrayTablaPeriodica.add(new Elemento(99, "Es", "Einstenio", Enum.Periodo.PERIODO7, Enum.Grupo.IIIA, "Sólido", 252.000, 0));
        arrayTablaPeriodica.add(new Elemento(100, "Fm", "Fermio", Enum.Periodo.PERIODO7, Enum.Grupo.IVA, "Sólido", 257.000, 0));
        arrayTablaPeriodica.add(new Elemento(101, "Md", "Mendelevio", Enum.Periodo.PERIODO7, Enum.Grupo.VA, "Sólido", 258.000, 0));
        arrayTablaPeriodica.add(new Elemento(102, "No", "Nobelio", Enum.Periodo.PERIODO7, Enum.Grupo.VIA, "Sólido", 259.000, 0));
        arrayTablaPeriodica.add(new Elemento(103, "Lr", "Laurencio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIA, "Sólido", 262.000, 0));
        arrayTablaPeriodica.add(new Elemento(104, "Rf", "Rutherfordio", Enum.Periodo.PERIODO7, Enum.Grupo.IVB, "Sólido", 267.000, 0));
        arrayTablaPeriodica.add(new Elemento(105, "Db", "Dubnio", Enum.Periodo.PERIODO7, Enum.Grupo.VB, "Sólido", 270.000, 0));
        arrayTablaPeriodica.add(new Elemento(106, "Sg", "Seaborgio", Enum.Periodo.PERIODO7, Enum.Grupo.VIB, "Sólido", 271.000, 0));
        arrayTablaPeriodica.add(new Elemento(107, "Bh", "Bohrio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIB, "Sólido", 270.000, 0));
        arrayTablaPeriodica.add(new Elemento(108, "Hs", "Hassio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_8, "Desconocido", 277.000, 0));
        arrayTablaPeriodica.add(new Elemento(109, "Mt", "Meitnerio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_9, "Desconocido", 276.000, 0));
        arrayTablaPeriodica.add(new Elemento(110, "Ds", "Darmstadio", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIB_10, "Desconocido", 281.000, 0));
        arrayTablaPeriodica.add(new Elemento(111, "Rg", "Roentgenio", Enum.Periodo.PERIODO7, Enum.Grupo.IB, "Desconocido", 280.000, 0));
        arrayTablaPeriodica.add(new Elemento(112, "Cn", "Copernicio", Enum.Periodo.PERIODO7, Enum.Grupo.IIB, "Desconocido", 285.000, 0));
        arrayTablaPeriodica.add(new Elemento(113, "Nh", "Nihonio", Enum.Periodo.PERIODO7, Enum.Grupo.IIIA, "Desconocido", 284.000, 0));
        arrayTablaPeriodica.add(new Elemento(114, "Fl", "Flerovio", Enum.Periodo.PERIODO7, Enum.Grupo.IVA, "Desconocido", 289.000, 0));
        arrayTablaPeriodica.add(new Elemento(115, "Mc", "Moscovio", Enum.Periodo.PERIODO7, Enum.Grupo.VA, "Desconocido", 288.000, 0));
        arrayTablaPeriodica.add(new Elemento(116, "Lv", "Livermorio", Enum.Periodo.PERIODO7, Enum.Grupo.VIA, "Desconocido", 293.000, 0));
        arrayTablaPeriodica.add(new Elemento(117, "Ts", "Tenesino", Enum.Periodo.PERIODO7, Enum.Grupo.VIIA, "Desconocido", 294.000, 0));
        arrayTablaPeriodica.add(new Elemento(118, "Og", "Oganesón", Enum.Periodo.PERIODO7, Enum.Grupo.VIIIA, "Desconocido", 294.000, 0));
    }
    
    
    
    
    /* 
    public  void Evaluacion(Ronda ronda) {
        int total = ronda.arrayPreguntas.size();
        int correctas = 0;
        for (int i = 0; i < ronda.arrayPreguntas.size(); i++) {
            if (ronda.arrayPreguntas.get(i).Es_Correcta == true) {
                correctas++;
            }
        }
        double porcentaje = (correctas*100)/total;
        if (porcentaje<=10) {
            ronda.setMedalla() = Enum.Medalla.BRONCE;
        } else if (porcentaje <=5) {
            ronda.setMedalla() = Enum.Medalla.PLATA;
        } else {
            ronda.Medalla = Enum.Medalla.ORO;
        }
    }
    */
    
    /*
    public void GuardarUsuario(String nombreUsuario, String contraseña, int medallas_ORO, int medallas_PLATA, int medallas_BRONCE, String logros) throws FileNotFoundException, IOException {
        Usuario user = new Usuario(nombreUsuario, contraseña, medallas_ORO, medallas_PLATA, medallas_BRONCE, logros);
        arrayUsuarios.add(user);
        FileOutputStream fos= new FileOutputStream("Usuarios.txt");
        ObjectOutputStream oos= new ObjectOutputStream (fos);
        oos.writeObject(arrayUsuarios);
        System.out.println(arrayUsuarios.size());
    }
    */
    
}
