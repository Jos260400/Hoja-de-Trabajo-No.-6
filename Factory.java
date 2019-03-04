package Classes;
// Universidad del Valle de Guatemala
// Curso: Algoritmos y Estructuras de Datos
// Nombre: Fernando José Garavito Ovando	 Carné: 18071
// Hoja de Trabajo No. 6

// Importamos cada una de las líbrerias para nuestra interface
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


// Ponemos la llave y valor del Map que son en este caso las letras "F" y "G"
// Elegí esas dos porque son las letras de mi primero nombre y primer apellido
public class Factory<F,G>{

    public Map<F,G> SetType(String type){
        if(type.toUpperCase().equals("HashMap")){
            return new HashMap<>();
        }
        else if (type.toUpperCase().equals("TreeMap")){
            return new TreeMap<>();
        }
        else if(type.toUpperCase().equals("LinkedHashMap")){
            return new LinkedHashMap<>();
        }

        return null;
    }

}


//Código para hacer parte del Factory
//https://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/



