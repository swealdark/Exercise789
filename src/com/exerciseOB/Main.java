package com.exerciseOB;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Numero 0
        System.out.println(reverse("hola mundo"));
        //Numero 1
        String[] arrayUnidimensional = {"hi", "lo", "ra","fu","ny"};
        recorrer(arrayUnidimensional);
        //Numero 2
        int[][] arrayBidi = {{1,2,3},{4,5,6},{7,8,9}};
        recorrerArrBi(arrayBidi);
        //Numero 3
        Vector<String> vector = new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        vector.add("e");
        deleteElements(vector);
        //Numero 4
        System.out.println("El problema de utilizar un vector si tuvieramos 1000 elementos que añadir\n" +
                "es que usariamos muchos recursos, lo cual volveria lento el programa");
        //El problema de utilizar un vector si tuvieramos 1000 elementos que añadir
        // es que usariamos muchos recursos, lo cual volveria lento el programa
        //Numero 5
        List<String> elements = new ArrayList<>();
        elements.add("elemen1");
        elements.add("elemen2");
        elements.add("elemen3");
        elements.add("elemen4");
        LinkedList<String> elementsLinkList = new LinkedList<>(elements);
        recorrerList(elements);
        recorrerList(elementsLinkList);
        //Numero 6
        List<Integer> enteros = new ArrayList<>();
        rellenar(enteros);
        borrarPares(enteros);

        //Numero 7
        dividePorCero();
        //Numero 8
        try{
            transfer("c//","d.txt");
        }catch (IOException e){
            System.out.println("intentelo mas tarde");
        }
        //Numero 9
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        myProgram(map);
    }
    public static String reverse(String texto){
        String newText = "";
        for(int i = texto.length()-1; i >= 0; i--){
            //alamacenar caracter por caracter en una nueva variable
            char temporary = texto.charAt(i);
            newText = newText.concat(String.valueOf(temporary));

        }
        return newText;
    }
    public static void recorrer(String[] arrayUnid){
        for(int i= 0; i < arrayUnid.length; i++){
            System.out.println(arrayUnid[i]);
        }
    }

    public static void recorrerArrBi(int[][] array){
        for(int i=0; i < array.length;i++){
            for(int j=0; j < array[i].length; j++){

                System.out.println("Posicion: " +"["+ i + "]"+ "[" + j +"] "+ "Valor: " + array[i][j]);
            }
        }
    }
    public static void deleteElements(Vector vector) {
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);
    }
    public static void recorrerList(List<String> list){
        for(String element: list){
            System.out.println(element);
        }
    }
    public static void rellenar(List<Integer> listInt){
        int count = 1;
        while (count <= 10){
            listInt.add(count);

            count++;
        }
        System.out.println(listInt);
    }
    public static void borrarPares(List<Integer> listInt){
        for(int i = 0; i < listInt.size();i++){
            if (listInt.get(i)%2 == 0){
                listInt.remove(i);
            }

        }
        System.out.println(listInt);
    }
    public static void dividePorCero(){
        try{
            int a = 5/0;
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
    public static void transfer(String fileIn, String fileOut) throws IOException{

        try{
            InputStream fileInput = new FileInputStream(fileIn);
            byte[] datos = fileInput.readAllBytes();
            PrintStream fileOuput = new PrintStream(fileOut);
            fileOuput.write(datos);
        }catch (FileNotFoundException e){
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
    }
    public static void myProgram(HashMap map){
        try{
            InputStream in = new FileInputStream(map.toString());
            PrintStream out = new PrintStream("salida.txt");
            try{
                byte[] datos = in.readAllBytes();
                out.write(datos);
            }catch (IOException e){
                System.out.println("Error" + e.getMessage());
            }

        }catch(FileNotFoundException e){
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
