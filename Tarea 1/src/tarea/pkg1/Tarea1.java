package tarea.pkg1;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tarea1 {

    public static void main(String[] args) {
        int opcion = 0;
        int maxProd = 10;
        int totProd = 0;
        String enter;
        //int idProd;
        String[] listaProd = new String[maxProd]; 
        
        Scanner enterKey = new Scanner(System.in);
        Scanner input =  new Scanner(System.in);
        //Scanner idInput = new Scanner(System.in);
   
        do
        {   
            System.out.println("--------------------------");
            System.out.println("Administrador de productos");
            System.out.println("--------------------------");
            System.out.println("1. Crear");
            System.out.println("2. Imprimir");
            System.out.println("3. Editar");
            System.out.println("4. Borrar");
            System.out.print("Seleccione su opción: ");
            opcion = input.nextInt();
            
            switch (opcion)
        {
            //Agregar
            case 1:  
            Scanner addProd = new Scanner(System.in);
            if(totProd < maxProd)
            {
                //producto
                String producto;
                System.out.print("Ingrese descripción del producto: ");
                producto = addProd.nextLine();
                
                //precio
                String precio;
                System.out.print("Ingrese precio: ");
                precio = addProd.nextLine();
                
                //fecha de elaboracion
                String fechaElab;
                System.out.print("Ingrese la fecha de elaboración del producto(dd/MM/yy): ");
                fechaElab = addProd.nextLine();
                              
                //fecha de vencimiento
                String fechaExp;
                System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yy): ");
                fechaExp = addProd.nextLine();
                
                //fecha de registro
                Date fecha;
                fecha = new Date();
                SimpleDateFormat ad = new SimpleDateFormat("dd/MM/yy");
                   
                
                //agrega al array
                listaProd[totProd] = " | " +producto+ " | " +precio+ " | " +fechaElab+ " | " +fechaExp+ " | " +ad.format(fecha);
                
                System.out.println("Producto registrado con exito!");
                totProd++;   
                               
                System.out.print("Precione Enter para salir..."); 
                enter = enterKey.nextLine();
                if(enter.equals(""))
                {
                    opcion = 0;
                }
            }
            break;
            
            //Imprimir
            case 2:
                System.out.println("D | Producto | Precio | Fecha de Elaboración | Fecha de Expiración | Fecha de Registro");
                System.out.println("--------------------------------------------------------------------------------------");

                for(int i = 0; i < listaProd.length; i++)
                {
                    System.out.print(i+". ");
                    System.out.println(listaProd[i]);
                }
                
                System.out.print("Precione Enter para salir..."); 
                enter = enterKey.nextLine();
                if(enter.equals(""))
                {
                    opcion = 0;
                }
                break;
                
            //Modificar    
            case 3:    
                int idMod, selecResp;
                String prodMod, precMod, fElabMod, fVenMod, fIngMod; 
                String prodNew, precNew, fElabNew, fVenNew;
                Scanner idProd = new Scanner(System.in);
                System.out.print("Ingrese el ID del producto que desea modificar: ");
                idMod = idProd.nextInt();              
                
                StringTokenizer st = new StringTokenizer(listaProd[idMod], " | ");
                prodMod = st.nextToken();
                precMod = st.nextToken();
                fElabMod = st.nextToken();
                fVenMod = st.nextToken();
                fIngMod = st.nextToken();
                
                Scanner nuevo = new Scanner(System.in);
                
                Scanner respInput2 = new Scanner(System.in);
                
                System.out.println("1.Producto 2.Precio 3.Fecha de Elaboracion 4.Fecha de Vencimiento 5.Fecha de Ingreso");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Que desea modificar?: ");
                selecResp = respInput2.nextInt();
                
                switch (selecResp)
                {
                    case 1:
                        System.out.print("Ingrese el producto a modificar " +prodMod+ ": ");
                        prodNew = nuevo.nextLine();
                        System.out.println("Producto modificado con exito!");
                        listaProd[idMod] = " | " +prodNew+ " | " +precMod+ " | " +fElabMod+ " | " +fVenMod+ " | " +fIngMod;
                        System.out.print("Precione Enter para salir..."); 
                        enter = enterKey.nextLine();
                        if(enter.equals(""))              
                        {
                            opcion = 0;
                        }     
                        break;
                        
                    case 2:
                        System.out.print("Ingrese el precio a modificar " +precMod+ ": ");
                        precNew = nuevo.nextLine();
                        System.out.println("Producto modificado con exito!");
                        listaProd[idMod] = " | " +prodMod+ " | " +precNew+ " | " +fElabMod+ " | " +fVenMod+ " | " +fIngMod;
                        System.out.print("Precione Enter para salir..."); 
                        enter = enterKey.nextLine();
                        if(enter.equals(""))              
                        {
                            opcion = 0;
                        } 
                        break;
                        
                    case 3:
                        System.out.print("Ingrese la fecha de elaboración a modificar " +fElabMod+ ": ");
                        fElabNew = nuevo.nextLine();
                        System.out.println("Producto modificado con exito!");
                        listaProd[idMod] = " | " +prodMod+ " | " +precMod+ " | " +fElabNew+ " | " +fVenMod+ " | " +fIngMod;
                        System.out.print("Precione Enter para salir..."); 
                        enter = enterKey.nextLine();
                        if(enter.equals(""))              
                        {
                            opcion = 0;
                        } 
                        break;
                        
                    case 4:
                        System.out.print("Ingrese la fecha de vencimiento a modificar " +fVenMod+ ": ");
                        fVenNew = nuevo.nextLine();
                        System.out.println("Producto modificado con exito!");
                        listaProd[idMod] = " | " +prodMod+ " | " +precMod+ " | " +fElabMod+ " | " +fVenNew+ " | " +fIngMod;
                        System.out.print("Precione Enter para salir..."); 
                        enter = enterKey.nextLine();
                        if(enter.equals(""))              
                        {
                            opcion = 0;
                        } 
                        break;
                        
                }
                break;

                
            //Eliminar    
            case 4:
                Scanner respInput = new Scanner(System.in);
                int respuesta;
                Scanner idInput = new Scanner(System.in);
                int idDel;
                System.out.print("Ingrese el ID del producto que desea eliminar: ");
                idDel = idInput.nextByte();
                System.out.println(listaProd[idDel]);
                System.out.print("Está seguro que desea eliminar el producto seleccionado? 1.Si 2.No: ");
                respuesta = respInput.nextInt();
                if(respuesta == 1)
                {
                    System.out.println("Producto eliminado con exito!");
                    for(int i = idDel; i < maxProd - 1; i++)
                    {
                        listaProd[i] = listaProd[i+1];
                    }
                    listaProd[totProd - 1] = "null";
                    totProd--;
                }
                opcion = 0;
                break;
        }
        }while (opcion >4 || opcion < 1);
             
        
    }

    private static void nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scanner newScanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
