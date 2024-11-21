public class Libro {

    // Propiedades
    private String titulo;
    private long isbn;
    private Genero genero;

    // Constructor con tres parámetros
    public Libro(String titulo, long isbn, Genero genero) {
        this.titulo = titulo;
        setIsbn(isbn);
       // this.isbn = esValidoISBN(isbn) ? isbn : 0; // Validar el ISBN
        /*if(esValidoISBN(isbn))
            this.isbn = isbn;
        else
            this.isbn = 0;*/
        this.genero = genero; // Asignar el género
    }

    // Constructor con dos parámetros (genera VARIOS como género por defecto)
    public Libro(String titulo, long isbn) {
        this(titulo, isbn, Genero.VARIOS);
        //también
        /*this.titulo = titulo;
       setIsbn(isbn); // Validar el ISBN
        this.genero = Genero.VARIOS; // Género por defecto*/
    }

    // getter y setter
    public String getTitulo() {
        return titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public Genero getGenero() {
        return genero;
    }

    // Métodos setters opcionales
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(long isbn) {
        this.isbn = esValidoISBN(isbn) ? isbn : 0;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método  para comprobar si el ISBN es válido
     * @param isbn a comprobar
     * @return true si es válido, false en caso contrario
      */

   private boolean esValidoISBN(long isbn) {
      int digitoControl=(int) (isbn%10);
      long isbnSinControl=isbn/10;
      int suma=0;
      int digitoActual;

      //sabemos que tenemos 10 digitos y queremos multiplica de 10..1
      for(int i=10;i>=1;i--){
          //extraemos digito
          digitoActual=(int) (isbnSinControl%10);
          //quitamos dígito
          isbnSinControl=isbnSinControl/10;
          //acumulamos
          suma+=digitoActual*i;
      }

      return (suma%10)==digitoControl;
    }

    // Método toString para representar el objeto como texto
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", genero=" + genero +
                '}';
    }

    public static void probarLibros(){
        Libro quijote = new Libro("El Quijote", 84206818655L, Genero.AVENTURA);
        quijote.setGenero(Genero.VARIOS);
        System.out.println(quijote.getTitulo());
    }
}
