package Gestion;

public class Cliente {
    private String nombre , direccion;
    private String id;
    private String email;
    private String  FechaNacimiento;
    private boolean usuarioBaseDatos;
    private boolean Contrasena_Base_Datos;
    private String  Nombre_BaseDatos;
    private String url_BaseDatos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public boolean isUsuarioBaseDatos() {
        return usuarioBaseDatos;
    }

    public void setUsuarioBaseDatos(boolean usuarioBaseDatos) {
        this.usuarioBaseDatos = usuarioBaseDatos;
    }

    public boolean isContrasena_Base_Datos() {
        return Contrasena_Base_Datos;
    }

    public void setContrasena_Base_Datos(boolean contrasena_Base_Datos) {
        Contrasena_Base_Datos = contrasena_Base_Datos;
    }

    public String getNombre_BaseDatos() {
        return Nombre_BaseDatos;
    }

    public void setNombre_BaseDatos(String nombre_BaseDatos) {
        Nombre_BaseDatos = nombre_BaseDatos;
    }

    public String getUrl_BaseDatos() {
        return url_BaseDatos;
    }

    public void setUrl_BaseDatos(String url_BaseDatos) {
        this.url_BaseDatos = url_BaseDatos;
    }


/* Constructor */

public Cliente (String id,String nombre,String  direccion, String email , String  FechaNacimiento, boolean usuarioBaseDatos,
                boolean Contrasena_Base_Datos , String Nombre_BaseDatos,  String url_BaseDatos  ){
    this.id = id;
    this.nombre = nombre;
    this.direccion = direccion;
    this.email = email;
    this. FechaNacimiento = FechaNacimiento;
    this.usuarioBaseDatos= usuarioBaseDatos;
    this.Contrasena_Base_Datos = Contrasena_Base_Datos;
    this.Nombre_BaseDatos = Nombre_BaseDatos;
    this.url_BaseDatos=  url_BaseDatos;

}

    /* Constructor

    public void  setFechaNacimiento ( ){
        if (  <=1 || >= 100) {
             =1 ;
            System.out.println("WARNING : El valor enviado  no se encunetra en el rango [1,99],  ");
        }
        this.setFechaNacimiento = ;
    }
*/


}