
public class SchoolGradingSystem extends GradingSystem{
    
public void loadData(){
               
        do{
            Registros = Entrada.nextInt();
        }while(Registros<1);   
        
        Registro = new Double [Registros][4];
        Entrada.nextLine();
        for(int i = 1; i <= Registros; i++)
            
        { datos = Entrada.nextLine().split(" ");
          Registro [i-1][0] = Double.parseDouble(datos[0]);
          Registro [i-1][1] = Double.parseDouble(datos[1]);
          Registro [i-1][2] = Double.parseDouble(datos[2]);
          Registro [i-1][3] = Double.parseDouble(datos[3]);
        }
}
}
