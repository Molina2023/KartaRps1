/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.util.ArrayList;


public class ElementosObj {
    ArrayList<Elemento> arrayEle = new ArrayList<Elemento>();
    
    
    public ElementosObj (){
        arrayEle.add(new Elemento (1, "H", "el Hidrógeno", Periodo.PERIODO1, Grupo.IA, "gas", 1.008, 2.1));
        arrayEle.add(new Elemento(2, "He", "Helio", Periodo.PERIODO1, Grupo.VIIIA, "Gas", 4.0026, 0));
        arrayEle.add(new Elemento(3, "Li", "Litio", Periodo.PERIODO2, Grupo.IA, "Sólido", 6.94, 0.98));
        arrayEle.add(new Elemento(4, "Be", "Berilio", Periodo.PERIODO2, Grupo.IIA, "Sólido", 9.0122, 1.57));
        arrayEle.add(new Elemento(5, "B", "Boro", Periodo.PERIODO2, Grupo.IIIA, "Sólido", 10.81, 2.04));
        arrayEle.add(new Elemento(6, "C", "Carbono", Periodo.PERIODO2, Grupo.IVA, "Sólido", 12.011, 2.55));
        arrayEle.add(new Elemento(7, "N", "Nitrógeno", Periodo.PERIODO2, Grupo.VA, "Gas", 14.007, 3.04));
        arrayEle.add(new Elemento(8, "O", "Oxígeno", Periodo.PERIODO2, Grupo.VIA, "Gas", 15.999, 3.44));
        arrayEle.add(new Elemento(9, "F", "Flúor", Periodo.PERIODO2, Grupo.VIIA, "Gas", 18.998, 3.98));
        arrayEle.add(new Elemento(10, "Ne", "Neón", Periodo.PERIODO2, Grupo.VIIIA, "Gas", 20.180, 0));
        arrayEle.add(new Elemento(11, "Na", "Sodio", Periodo.PERIODO3, Grupo.IA, "Sólido", 22.990, 0.93));
        arrayEle.add(new Elemento(12, "Mg", "Magnesio", Periodo.PERIODO3, Grupo.IIA, "Sólido", 24.305, 1.31));
        arrayEle.add(new Elemento(13, "Al", "Aluminio", Periodo.PERIODO3, Grupo.IIIA, "Sólido", 26.982, 1.61));
        arrayEle.add(new Elemento(14, "Si", "Silicio", Periodo.PERIODO3, Grupo.IVA, "Sólido", 28.085, 1.9));
        arrayEle.add(new Elemento(15, "P", "Fósforo", Periodo.PERIODO3, Grupo.VA, "Sólido", 30.974, 2.19));
        arrayEle.add(new Elemento(16, "S", "Azufre", Periodo.PERIODO3, Grupo.VIA, "Sólido", 32.06, 2.58));
        arrayEle.add(new Elemento(17, "Cl", "Cloro", Periodo.PERIODO3, Grupo.VIIA, "Gas", 35.45, 3.16));
        arrayEle.add(new Elemento(18, "Ar", "Argón", Periodo.PERIODO3, Grupo.VIIIA, "Gas", 39.948, 0));
        arrayEle.add(new Elemento(19, "K", "Potasio", Periodo.PERIODO4, Grupo.IA, "Sólido", 39.098, 0.82));
        arrayEle.add(new Elemento(20, "Ca", "Calcio", Periodo.PERIODO4, Grupo.IIA, "Sólido", 40.078, 1));
        arrayEle.add(new Elemento(21, "Sc", "Escandio", Periodo.PERIODO4, Grupo.IIIA, "Sólido", 44.956, 1.36));
        arrayEle.add(new Elemento(22, "Ti", "Titanio", Periodo.PERIODO4, Grupo.IVA, "Sólido", 47.867, 1.54));
        arrayEle.add(new Elemento(23, "V", "Vanadio", Periodo.PERIODO4, Grupo.VA, "Sólido", 50.942, 1.63));
        arrayEle.add(new Elemento(24, "Cr", "Cromo", Periodo.PERIODO4, Grupo.VIA, "Sólido", 51.996, 1.66));
        arrayEle.add(new Elemento(25, "Mn", "Manganeso", Periodo.PERIODO4, Grupo.VIIA, "Sólido", 54.938, 1.55));
        arrayEle.add(new Elemento(26, "Fe", "Hierro", Periodo.PERIODO4, Grupo.VIIIB, "Sólido", 55.845, 1.83));
        arrayEle.add(new Elemento(27, "Co", "Cobalto", Periodo.PERIODO4, Grupo.VIIIB, "Sólido", 58.933, 1.88));
        arrayEle.add(new Elemento(28, "Ni", "Níquel", Periodo.PERIODO4, Grupo.VIIIB, "Sólido", 58.693, 1.91));
        arrayEle.add(new Elemento(29, "Cu", "Cobre", Periodo.PERIODO4, Grupo.IB, "Sólido", 63.546, 1.9));
        arrayEle.add(new Elemento(30, "Zn", "Zinc", Periodo.PERIODO4, Grupo.IIB, "Sólido", 65.38, 1.65));
        arrayEle.add(new Elemento(31, "Ga", "Galio", Periodo.PERIODO4, Grupo.IIIA, "Sólido", 69.723, 1.81));
        arrayEle.add(new Elemento(32, "Ge", "Germanio", Periodo.PERIODO4, Grupo.IVA, "Sólido", 72.630, 2.01));
        arrayEle.add(new Elemento(33, "As", "Arsénico", Periodo.PERIODO4, Grupo.VA, "Sólido", 74.922, 2.18));
        arrayEle.add(new Elemento(34, "Se", "Selenio", Periodo.PERIODO4, Grupo.VIA, "Sólido", 78.971, 2.55));
        arrayEle.add(new Elemento(35, "Br", "Bromo", Periodo.PERIODO4, Grupo.VIIA, "Líquido", 79.904, 2.96));
        arrayEle.add(new Elemento(36, "Kr", "Kriptón", Periodo.PERIODO4, Grupo.VIIIA, "Gas", 83.798, 3));
        arrayEle.add(new Elemento(37, "Rb", "Rubidio", Periodo.PERIODO5, Grupo.IA, "Sólido", 85.468, 0.82));
        arrayEle.add(new Elemento(38, "Sr", "Estroncio", Periodo.PERIODO5, Grupo.IIA, "Sólido", 87.620, 0.95));
        arrayEle.add(new Elemento(39, "Y", "Itrio", Periodo.PERIODO5, Grupo.IIIA, "Sólido", 88.906, 1.22));
        arrayEle.add(new Elemento(40, "Zr", "Circonio", Periodo.PERIODO5, Grupo.IVA, "Sólido", 91.224, 1.33));
        arrayEle.add(new Elemento(41, "Nb", "Niobio", Periodo.PERIODO5, Grupo.VA, "Sólido", 92.906, 1.6));
        arrayEle.add(new Elemento(42, "Mo", "Molibdeno", Periodo.PERIODO5, Grupo.VIA, "Sólido", 95.950, 2.16));
        arrayEle.add(new Elemento(43, "Tc", "Tecnecio", Periodo.PERIODO5, Grupo.VIIA, "Sólido", 98.000, 1.9));
        arrayEle.add(new Elemento(44, "Ru", "Rutenio", Periodo.PERIODO5, Grupo.VIIIB, "Sólido", 101.070, 2.2));
        arrayEle.add(new Elemento(45, "Rh", "Rodio", Periodo.PERIODO5, Grupo.VIIIB, "Sólido", 102.906, 2.28));
        arrayEle.add(new Elemento(46, "Pd", "Paladio", Periodo.PERIODO5, Grupo.VIIIB, "Sólido", 106.420, 2.20));
        arrayEle.add(new Elemento(47, "Ag", "Plata", Periodo.PERIODO5, Grupo.IB, "Sólido", 107.868, 1.93));
        arrayEle.add(new Elemento(48, "Cd", "Cadmio", Periodo.PERIODO5, Grupo.IIB, "Sólido", 112.414, 1.69));
        arrayEle.add(new Elemento(49, "In", "Indio", Periodo.PERIODO5, Grupo.IIIA, "Sólido", 114.818, 1.78));
        arrayEle.add(new Elemento(50, "Sn", "Estaño", Periodo.PERIODO5, Grupo.IVA, "Sólido", 118.710, 1.96));
        arrayEle.add(new Elemento(51, "Sb", "Antimonio", Periodo.PERIODO5, Grupo.VA, "Sólido", 121.760, 0));
        arrayEle.add(new Elemento(52, "Te", "Telurio", Periodo.PERIODO5, Grupo.VIA, "Sólido", 127.600, 0));
        arrayEle.add(new Elemento(53, "I", "Yodo", Periodo.PERIODO5, Grupo.VIIA, "Sólido", 126.904, 0));
        arrayEle.add(new Elemento(54, "Xe", "Xenón", Periodo.PERIODO5, Grupo.VIIIA, "Gas", 131.294, 0));
        arrayEle.add(new Elemento(55, "Cs", "Cesio", Periodo.PERIODO6, Grupo.IA, "Sólido", 132.905, 0));
        arrayEle.add(new Elemento(56, "Ba", "Bario", Periodo.PERIODO6, Grupo.IIA, "Sólido", 137.327, 0));
        arrayEle.add(new Elemento(57, "La", "Lantano", Periodo.PERIODO6, Grupo.IIIB, "Sólido", 138.905, 0));
        arrayEle.add(new Elemento(58, "Ce", "Cerio", Periodo.PERIODO6, Grupo.IVB, "Sólido", 140.116, 0));
        arrayEle.add(new Elemento(59, "Pr", "Praseodimio", Periodo.PERIODO6, Grupo.VB, "Sólido", 140.907, 0));
        arrayEle.add(new Elemento(60, "Nd", "Neodimio", Periodo.PERIODO6, Grupo.VIB, "Sólido", 144.242, 0));
        arrayEle.add(new Elemento(61, "Pm", "Prometio", Periodo.PERIODO6, Grupo.VIIB, "Sólido", 145.000, 0));
        arrayEle.add(new Elemento(62, "Sm", "Samario", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 150.360, 0));
        arrayEle.add(new Elemento(63, "Eu", "Europio", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 151.964, 0));
        arrayEle.add(new Elemento(64, "Gd", "Gadolinio", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 157.250, 0));
        arrayEle.add(new Elemento(65, "Tb", "Terbio", Periodo.PERIODO6, Grupo.IB, "Sólido", 158.925, 0));
        arrayEle.add(new Elemento(66, "Dy", "Disprosio", Periodo.PERIODO6, Grupo.IIB, "Sólido", 162.500, 0));
        arrayEle.add(new Elemento(67, "Ho", "Holmio", Periodo.PERIODO6, Grupo.IIIA, "Sólido", 164.930, 0));
        arrayEle.add(new Elemento(68, "Er", "Erbio", Periodo.PERIODO6, Grupo.IVA, "Sólido", 167.259, 0));
        arrayEle.add(new Elemento(69, "Tm", "Tulio", Periodo.PERIODO6, Grupo.VA, "Sólido", 168.934, 0));
        arrayEle.add(new Elemento(70, "Yb", "Iterbio", Periodo.PERIODO6, Grupo.VIA, "Sólido", 173.045, 0));
        arrayEle.add(new Elemento(71, "Lu", "Lutecio", Periodo.PERIODO6, Grupo.VIIA, "Sólido", 174.966, 0));
        arrayEle.add(new Elemento(72, "Hf", "Hafnio", Periodo.PERIODO6, Grupo.IVB, "Sólido", 178.490, 1.3));
        arrayEle.add(new Elemento(73, "Ta", "Tantalio", Periodo.PERIODO6, Grupo.VB, "Sólido", 180.948, 1.5));
        arrayEle.add(new Elemento(74, "W", "Wolframio", Periodo.PERIODO6, Grupo.VIB, "Sólido", 183.840, 2.36));
        arrayEle.add(new Elemento(75, "Re", "Renio", Periodo.PERIODO6, Grupo.VIIB, "Sólido", 186.207, 1.9));
        arrayEle.add(new Elemento(76, "Os", "Osmio", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 190.230, 2.2));
        arrayEle.add(new Elemento(77, "Ir", "Iridio", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 192.217, 2.2));
        arrayEle.add(new Elemento(78, "Pt", "Platino", Periodo.PERIODO6, Grupo.VIIIB, "Sólido", 195.084, 2.28));
        arrayEle.add(new Elemento(79, "Au", "Oro", Periodo.PERIODO6, Grupo.IB, "Sólido", 196.967, 2.54));
        arrayEle.add(new Elemento(80, "Hg", "Mercurio", Periodo.PERIODO6, Grupo.IIB, "Líquido", 200.592, 2));
        arrayEle.add(new Elemento(81, "Tl", "Talio", Periodo.PERIODO6, Grupo.IIIA, "Sólido", 204.380, 1.62));
        arrayEle.add(new Elemento(82, "Pb", "Plomo", Periodo.PERIODO6, Grupo.IVA, "Sólido", 207.200, 1.87));
        arrayEle.add(new Elemento(83, "Bi", "Bismuto", Periodo.PERIODO6, Grupo.VA, "Sólido", 208.980, 2.02));
        arrayEle.add(new Elemento(84, "Po", "Polonio", Periodo.PERIODO6, Grupo.VIA, "Sólido", 209.000, 2));
        arrayEle.add(new Elemento(85, "At", "Astato", Periodo.PERIODO6, Grupo.VIIA, "Sólido", 210.000, 2.2));
        arrayEle.add(new Elemento(86, "Rn", "Radón", Periodo.PERIODO6, Grupo.VIIIA, "Gas", 222.000, 0));
        arrayEle.add(new Elemento(87, "Fr", "Francio", Periodo.PERIODO7, Grupo.IA, "Sólido", 223.000, 0.7));
        arrayEle.add(new Elemento(88, "Ra", "Radio", Periodo.PERIODO7, Grupo.IIA, "Sólido", 226.000, 0.9));
        arrayEle.add(new Elemento(89, "Ac", "Actinio", Periodo.PERIODO7, Grupo.IIIB, "Sólido", 227.000, 0));
        arrayEle.add(new Elemento(90, "Th", "Torio", Periodo.PERIODO7, Grupo.IVB, "Sólido", 232.038, 0));
        arrayEle.add(new Elemento(91, "Pa", "Protactinio", Periodo.PERIODO7, Grupo.VB, "Sólido", 231.036, 0));
        arrayEle.add(new Elemento(92, "U", "Uranio", Periodo.PERIODO7, Grupo.VIB, "Sólido", 238.029, 0));
        arrayEle.add(new Elemento(93, "Np", "Neptunio", Periodo.PERIODO7, Grupo.VIIB, "Sólido", 237.000, 0));
        arrayEle.add(new Elemento(94, "Pu", "Plutonio", Periodo.PERIODO7, Grupo.VIIIB, "Sólido", 244.000, 0));
        arrayEle.add(new Elemento(95, "Am", "Americio", Periodo.PERIODO7, Grupo.VIIIB, "Sólido", 243.000, 0));
        arrayEle.add(new Elemento(96, "Cm", "Curio", Periodo.PERIODO7, Grupo.VIIIB, "Sólido", 247.000, 0));
        arrayEle.add(new Elemento(97, "Bk", "Berkelio", Periodo.PERIODO7, Grupo.IB, "Sólido", 247.000, 0));
        arrayEle.add(new Elemento(98, "Cf", "Californio", Periodo.PERIODO7, Grupo.IIB, "Sólido", 251.000, 0));
        arrayEle.add(new Elemento(99, "Es", "Einstenio", Periodo.PERIODO7, Grupo.IIIA, "Sólido", 252.000, 0));
        arrayEle.add(new Elemento(100, "Fm", "Fermio", Periodo.PERIODO7, Grupo.IVA, "Sólido", 257.000, 0));
        arrayEle.add(new Elemento(101, "Md", "Mendelevio", Periodo.PERIODO7, Grupo.VA, "Sólido", 258.000, 0));
        arrayEle.add(new Elemento(102, "No", "Nobelio", Periodo.PERIODO7, Grupo.VIA, "Sólido", 259.000, 0));
        arrayEle.add(new Elemento(103, "Lr", "Laurencio", Periodo.PERIODO7, Grupo.VIIA, "Sólido", 262.000, 0));
        arrayEle.add(new Elemento(104, "Rf", "Rutherfordio", Periodo.PERIODO7, Grupo.IVB, "Sólido", 267.000, 0));
        arrayEle.add(new Elemento(105, "Db", "Dubnio", Periodo.PERIODO7, Grupo.VB, "Sólido", 270.000, 0));
        arrayEle.add(new Elemento(106, "Sg", "Seaborgio", Periodo.PERIODO7, Grupo.VIB, "Sólido", 271.000, 0));
        arrayEle.add(new Elemento(107, "Bh", "Bohrio", Periodo.PERIODO7, Grupo.VIIB, "Sólido", 270.000, 0));
        arrayEle.add(new Elemento(108, "Hs", "Hassio", Periodo.PERIODO7, Grupo.VIIIB, "Desconocido", 277.000, 0));
        arrayEle.add(new Elemento(109, "Mt", "Meitnerio", Periodo.PERIODO7, Grupo.VIIIB, "Desconocido", 276.000, 0));
        arrayEle.add(new Elemento(110, "Ds", "Darmstadio", Periodo.PERIODO7, Grupo.VIIIB, "Desconocido", 281.000, 0));
        arrayEle.add(new Elemento(111, "Rg", "Roentgenio", Periodo.PERIODO7, Grupo.IB, "Desconocido", 280.000, 0));
        arrayEle.add(new Elemento(112, "Cn", "Copernicio", Periodo.PERIODO7, Grupo.IIB, "Desconocido", 285.000, 0));
        arrayEle.add(new Elemento(113, "Nh", "Nihonio", Periodo.PERIODO7, Grupo.IIIA, "Desconocido", 284.000, 0));
        arrayEle.add(new Elemento(114, "Fl", "Flerovio", Periodo.PERIODO7, Grupo.IVA, "Desconocido", 289.000, 0));
        arrayEle.add(new Elemento(115, "Mc", "Moscovio", Periodo.PERIODO7, Grupo.VA, "Desconocido", 288.000, 0));
        arrayEle.add(new Elemento(116, "Lv", "Livermorio", Periodo.PERIODO7, Grupo.VIA, "Desconocido", 293.000, 0));
        arrayEle.add(new Elemento(117, "Ts", "Tenesino", Periodo.PERIODO7, Grupo.VIIA, "Desconocido", 294.000, 0));
        arrayEle.add(new Elemento(118, "Og", "Oganesón", Periodo.PERIODO7, Grupo.VIIIA, "Desconocido", 294.000, 0));




    }
    
    private Preguntas DeterminarElemento(){
        int numElemento = (int) (Math.random() * 0);
        int tipoPregunta = (int) (Math.random() * 6);
        System.out.println(tipoPregunta);
        Preguntas item = new Preguntas();
        item.ElementFind = arrayEle.get(0);
        item.QuestionType = Pregunta.values()[tipoPregunta];
        return item;
    }
    
    public ArrayList<Preguntas> DeterminarPregunta (int numPreguntas) {
        ArrayList<Preguntas> item = new ArrayList<Preguntas>();
        
        for (int i = 0; i < numPreguntas; i++) {
            item.add(DeterminarElemento());
            System.out.println(item.get(i).getElementFind());
            System.out.println(item.get(i).getQuestionType());
        }
        return item;
    }
    
    
}
