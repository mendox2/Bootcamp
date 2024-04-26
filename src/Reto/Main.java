package Reto;

import java.util.Scanner;

public class Main {

    static Carrito cr = new Carrito();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Desea meter productos en el carrito?" +
                "\n'true' para si 'false' para no");
        cr.qest = sc.nextBoolean();
        deployCarrito();
        cuest();
        System.out.println("Deseas volver a ver las opciones? ");
        cr.qest = sc.nextBoolean();
        if(cr.qest == true){
            cuest();
        }
        cond();
    }
    public static void deployCarrito(){
        while(cr.qest == true){
            System.out.println("Nombre del producto #"+(cr.aum+1));
            cr.producto = sc.next();
            cr.prods[0] = cr.producto;
            System.out.println("cantidad de "+cr.producto);
            cr.cantProd = sc.nextInt();
            String canprod =""+cr.cantProd;
            cr.prods[1] = canprod;
            System.out.println("precio de "+cr.producto);
            cr.precio = sc.nextDouble();
            String precio =""+cr.precio;
            cr.prods[2] = precio;
            System.out.println("Deseas agregar otro producto al carrito? ");
            cr.qest = sc.nextBoolean();
            System.out.println("Datos del producto "+(cr.aum+1)+"" +
                    "\nNombre de producto: "+cr.prods[0]+"" +
                    "\nCantidad de producto: "+cr.prods[1]+"" +
                    "\nPrecio de producto: "+cr.prods[2]);
            cr.aum++;
        }
    }
    public static void ultimosDatosAgg(){
        System.out.println("Datos del ultimo producto "+(cr.aum+1)+"" +
                "\nNombre de producto: "+cr.prods[0]+"" +
                "\nCantidad de producto: "+cr.prods[1]+"" +
                "\nPrecio de producto: "+cr.prods[2]);
    }
    public static void cuest(){
        System.out.println("1 para ver la suma de los productos" +
                "\n2 para ver los ultimos datos ingresados");
        cr.op = sc.nextInt();
        switch(cr.op) {
            case 1:
                System.out.println(cr.cantProd*cr.precio);
                break;
            case 2:
                ultimosDatosAgg();
                break;
            default:
                System.out.println("Opción no valida, intentalo luego");
        }
    }
    public static void cond(){
        if(cr.cantProd>5){
            double total = cr.cantProd*cr.precio;
            double desc = cr.cantProd*cr.precio*0.1;
            System.out.println("al tener "+ cr.cantProd +" productos tienes un descuento del 10% " +
                    "\nEl cual seria de "+desc+"$ para un total de "+(total-desc));
        }
    }
}
