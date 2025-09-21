
    package natalia.diaz.c12.tp3;
    //importar libreria necesari para el ejercicio
    import java.time.Year;

    public class Libro {
        private String titulo;
        private String autor;
        private int añoPublicacion;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getAñoPublicacion() {
            return añoPublicacion;
        }

        //Modifica el año de publicacion con validacion
        public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue();
        if (nuevoAño >= 1900 && nuevoAño <= añoActual) {
            this.añoPublicacion = nuevoAño;
            System.out.println("Anio de publicacion actualizado: " + nuevoAño); 
        } else {
            System.out.println("Error: El anio debe estar entre 1900 y " + añoActual);
        }
        }
        public void mostrarInfo () {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Anio de publicacion: " + añoPublicacion);
        }
    }
