import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//import java.io.IOException;
//import java.net.Socket;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        //DECLARACIÓN DE CONSTANTES Y VARIABLES PARA FORMAR LA URL DE LA API Exchange Rate
        //EJEMPLO URL
        //https://v6.exchangerate-api.com/v6/1e7e888c8aa5eba9e754e811/pair/USD/ARS/50

        final String KEY = "1e7e888c8aa5eba9e754e811";
        final String URL_BASE = "https://v6.exchangerate-api.com/v6/";

        String currency1;
        String currency2;

        Scanner lectura = new Scanner(System.in);
        int opcion = 1;

        while (true) {
            System.out.println("Sea Bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real Brasileño");
            System.out.println("4) Real Brasileño ==> Dólar");
            System.out.println("5) Dólar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dólar");
            System.out.println("7) Otra Conversion");
            System.out.println("8) Salir");
            System.out.println("Elige una opción válida");

            opcion = lectura.nextInt();

            if (opcion == 8) {
                break;
            }

            if (opcion > 8 || opcion <= 0) {
                System.out.println(" ");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("INGRESA UNA OPCIÓN VÁLIDA POR FAVOR");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println(" ");
                continue;
            }

            System.out.println("INGRESA EL VALOR QUE DESEAS CONVERTIR");
            double cantidad = Double.parseDouble(lectura.next());

            if (opcion == 1) {
                String url = URL_BASE + KEY + "/pair/USD/ARS/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 2) {
                String url = URL_BASE + KEY + "/pair/ARS/USD/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 3) {
                String url = URL_BASE + KEY + "/pair/USD/BRL/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 4) {
                String url = URL_BASE + KEY + "/pair/BRL/USD/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 5) {
                String url = URL_BASE + KEY + "/pair/USD/COP/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 6) {
                String url = URL_BASE + KEY + "/pair/COP/USD/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (opcion == 7) {
                System.out.println("INGRESA LA DENOMINACIÓN DE LA MONEDA BASE");
                currency1 = lectura.next();

                System.out.println("INGRESA LA DENOMINACIÓN DE LA MONEDA A CONVERTIR");
                currency2 = lectura.next();

                String url = URL_BASE + KEY + "/pair/" + currency1 + "/" + currency2 + "/" + cantidad;

                try {
                    ConsumoAPI consumoAPI = new ConsumoAPI();
                    ConvierteDatos conversor = new ConvierteDatos();

                    var json = consumoAPI.obtenerDatos(url);
                    var datos = conversor.obtenerDatos(json, RMoneda.class);

                    System.out.println("************************************************");
                    System.out.println("EL VALOR DE: " + cantidad + " " + "[" + datos.moneda_base() + "]" + " EQUIVALE A: " + datos.resultado() + " " + "[" + datos.moneda_convertir() + "]");
                    System.out.println("************************************************");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            }
        }
}


