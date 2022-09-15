import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
        int problema, leer;
        
     do{   
       
        
        System.out.print ("Seleccione el problema que observa en su comunidad" + "\n");
        System.out.print ("1. Contaminación del agua" + "\n" + "2. Contaminación por basura sólida" + "\n" + "3. Contaminación en el aire" + "\n");
        System.out.println("Ingrese 0 para salir");
        System.out.print ("El que pasa en su comunidad es:" + "\n") ;

        problema = entrada.nextInt();
        
        if (problema>=1 && problema<=3);
        
        {
                switch(problema)
                {
                    case 1:
                    {
                        System.out.print ("¿Quieres leer sobre las soluciones o el problema?" + "\n");
                        System.out.print ("1. Problema" + "\n");
                        System.out.print ("2. Soluciones" + "\n");
                        System.out.print ("Quiero:" + "\n");
                        
                        leer=entrada.nextInt();
                        
                        switch(leer)
                        {
                            case 1:
                            {
                                System.out.print ("Contaminación del agua" + "\n" + "Dentro de la contaminación del agua cabe recalcar cuáles son sus contaminantes y son: bacterias, virus, parásitos, fertilizantes, pesticidas, fármacos, nitratos, fosfatos, plásticos, desechos fecales y hasta sustancias radiactivas" + 
                                             "\n" +
                                                   "\n");
                                
                                break;
                            }
                            case 2:
                            {
                                System.out.print ("Soluciones:" + "\n" + "-Vigila tus productos de limpieza domésticos" + 
                                                    "\n" + "-Deposita cada residuo en su lugar correspondiente." + "\n" + 
                                                    "-Elige bien tus prendas." + 
                                                    "\n" + "-Involúcrate");
                                break;
                            }
                        }
                       break;     
                        
                    }
                    case 2:
                    { 
                        System.out.print ("¿Te interesa leer sobre la descripción del problema o soluciones?" + "\n");
                        System.out.print ("1. Problema" + "\n");
                        System.out.print ("2. Soluciones" + "\n");
                        System.out.print ("Quiero:" + "\n");
                              leer=entrada.nextInt();
                              
                              switch(leer)
                              {
                                  case 1:
                                  {
                                      System.out.print ("Contaminación por basura sólida" + "\n" + " Los desechos sólidos son conocidos comúnmente como “basura” y representan una amenaza por su producción excesiva e incontrolada" + "\n" +
                                                        "Algunas cosas que contaminan son; hojas, restos del jardín, papel, cartón, madera y materiales biodegradables en general. Residuos inorgánicos como vidrio, plástico, metales, cauchos, material inerte y otros.");
                                                        break;
                                  }
                                  case 2:
                                  {
                                      System.out.print ("Soluciones:" + "\n" + "-El sistema de bolsa de basura industrial Longopac." + "\n" +
                                                        "-La maquinaria de reciclaje." + "\n" +
                                                        "-Los equipos de compostaje industrial" + "\n");
                                                  break;
                                  }
                              }
                              break;
                    }
                    case 3:
                    {
                        System.out.print ("¿Te interesa leer sobre la descripción del problema o soluciones" + "\n");
                        System.out.print ("1. Problema" + "\n");
                        System.out.print ("2. Soluciones" + "\n");
                        System.out.print ("Quiero:" + "\n");
                        
                        leer=entrada.nextInt();
                        
                        switch(leer)
                        {
                            case 1:
                            {
                                System.out.print ("Contaminación en el aire" + "\n" + "La contaminación del aire es la alteración de la calidad normal del aire o de la atmósfera por gases, sustancias o agentes contaminantes" + "\n" + 
                                                  "tóxicos y nocivos que son liberados por las industrias, fabricas, actividades humanas y otros factores que deterioran la calidad de vida humana" + "\n");
                                break;
                            }  
                            case 2:
                            {
                                System.out.print ("Soluciones:" + "\n" +
                                                  "-Ventilar la casa y limpiar el aire." + "\n" +
                                                   "-Plantas para purificar el aire" + "\n" + 
                                                   "-Producir menos humo en casa" + "\n" +
                                                   "-Usar productos limpiadores ecológicos" + "\n" + 
                                                   "-Usar más la bicicleta y el transporte público");
                                break;
                            }
                        }
                    }
                }
        }
           
    }while (problema <=1 && problema <=3);
    
    }
}
