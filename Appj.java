public class App {
    public static void main(String [] args){
        
        SchoolGradingSystem objeto = new SchoolGradingSystem();
        
        objeto.loadData();
        objeto.stat1();
        objeto.stat2();
        objeto.stat3();
        objeto.stat4();
        
        double varianza = objeto.stat1();
        System.out.println((Math.round(varianza*100.0)/100.0));
        double PorcentajeSobr = objeto.stat2();
        System.out.println(+Math.round(PorcentajeSobr*100.0)/100.0);
        String gen = objeto.stat3();
        System.out.println(gen);
        String n = objeto.stat4();
        System.out.println(n);        
    }
}
