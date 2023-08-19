package PkgLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSample {
    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //Iterar   iterator
        int pos = 0;
        for (String item:taskList){
            System.out.println("Tarea:"+item);
            pos++;
        }

        //String PrimerElemento=taskList.get(0);
        //System.out.println("primer elemento =" +PrimerElemento);

        //System.out.println("elimina por 0:");
        //taskList.remove(0);
        //PrimerElemento=taskList.get(0);
        //System.out.println("primer elemento ="+PrimerElemento);

    }

    public void ejercicio() {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaEnteros = new ArrayList<>();
        System.out.println("ingreso un numero");
        int num = sc.nextInt();
        listaEnteros.add(num);
        listaEnteros.add(1000);
        listaEnteros.add(2000);
        listaEnteros.add(3000);
        listaEnteros.add(4000);

        int suma = 0;
        for (int n : listaEnteros) {
            suma += suma + n;
        }
        System.out.println("el total es:"+suma);
}


public void istaTareas(){
    List<ClsTaskList> tl=new ArrayList<>();
    ClsTaskList tarea = new ClsTaskList();

    tarea.setTaskName("ir a votar");
    tarea.setTaskDescription("escuela, mesa 5");
    tarea.setDone(false);
    tl.add(tarea);
    tarea=new ClsTaskList();

    tarea.setTaskName("sacar al chucho");
    tarea.setTaskDescription("llevar a firulais al parque");
    tarea.setDone(false);
    tl.add(tarea);
    tarea=new ClsTaskList();

    tarea.setTaskDescription("hacer la cama");
    tarea.setTaskDescription("mi mamá o mujer me regaña");
    tarea.setDone(false);
    tl.add(tarea);
    tarea=new ClsTaskList();

    for(ClsTaskList item:tl){
        System.out.println("tarea"+item.getTaskName());
    }


    }
}
