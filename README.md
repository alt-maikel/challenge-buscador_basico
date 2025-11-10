# Buscador basico

**Nivel:** Fácil

1.  **Implementación de la Búsqueda:**
    *   El programa debe permitir al usuario ingresar un término de búsqueda.
    *   Debe realizar una búsqueda en un array de nombres de productos predefinido.
    *   La búsqueda debe ser insensible a mayúsculas y minúsculas (es decir, "manzana" debe coincidir con "Manzana").
    *   Debe mostrar todos los productos que contengan el término de búsqueda en su nombre.

2.  **Mejora de la Interfaz de Usuario:**
    *   Utiliza la clase `Scanner` para obtener la entrada del usuario desde la consola.
    *   Muestra un mensaje claro al usuario pidiéndole que ingrese el término de búsqueda.
    *   Muestra los resultados de la búsqueda de forma clara y legible.

3.  **Manejo de Resultados Vacíos:**
    *   Si no se encuentran productos que coincidan con el término de búsqueda, el programa debe mostrar un mensaje indicando que no se encontraron resultados.

### Ejemplo

**Catálogo de Productos:**

```java
String[] productos = {"Manzana", "Banana", "Naranja", "Mandarina", "Mango", "Pera"};
```

**Entrada del Usuario:**

```
man
```

**Salida Esperada:**

```
Resultados de la búsqueda para 'man':
Manzana
Mandarina
Mango
```

### Código Inicial

Aquí tienes un punto de partida para el código:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = {"Manzana", "Banana", "Naranja", "Mandarina", "Mango", "Pera"};

        System.out.println("Ingrese el término de búsqueda:");
        String busqueda = scanner.nextLine();

        // Implementa la lógica de búsqueda aquí

        scanner.close();
    }
}
```

### Pistas

*   Utiliza un bucle `for` para iterar sobre el array de productos.
*   Utiliza el método `toLowerCase()` para realizar una búsqueda insensible a mayúsculas y minúsculas.
*   Utiliza el método `contains()` para verificar si un producto contiene el término de búsqueda.
*   Considera usar una variable booleana para rastrear si se encontraron resultados.

¡Buena suerte!

---
**Elaborado por Aritza Salazar, mail: aritza.salazar@walmart.com. Estos códigos son ejemplos para incentivar el desarrollo de la comunidad tech pero NO forman parte del stack tecnológico de Walmart. 🙂**