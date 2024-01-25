package academy.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hacer-algo")
    public String primeraPrueba(){
        // midominio.com/hacer-algo
        return "{\n" +
                "  \"responseStatus\":   \"fail\", \n" +
                "  \"responseHeader\": {\n" +
                "     \"now\": 1465840023574,\n" +
                "     \"status\": \"fail\",\n" +
                "     \"requestId\": null\n" +
                "   },\n" +
                "   \"responseData\": {\n" +
                "     \"errors\": [\n" +
                "       {\n" +
                "         \"field\": \"enable\",\n" +
                "         \"code\": \"enable.invalid\",\n" +
                "         \"message\": \"Container Mode is already enabled\"\n" +
                "       }\n" +
                "     ]\n" +
                "   }\n" +
                " } ";
    }

    @GetMapping("/generar-password")
    public String generarPassword(){
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);
        String password = "Jsdkd" + numeroAleatorio;
        return password;
    }

    @GetMapping("/transformar-a-codigo-morse/{texto}")
    public String codigoMorse(@PathVariable String texto){
        //String texto = "ABACABB";
        String codigoTransformado = "";

        String[] tablaAbc = {"A", "B", "C"};
        String[] tablaCodigoMorse = {".-", "-...", "-.-."};

        for(int i = 0; i<texto.length(); ++i){
            String letraDeTexto = "" + texto.charAt(i);

            for(int j = 0; j<tablaAbc.length; ++j){
                String letraTablaAbc = tablaAbc[j];
                if(letraTablaAbc.equals(letraDeTexto)){
                    String caracterEnCodigoMorse = tablaCodigoMorse[j];
                    codigoTransformado += " " + caracterEnCodigoMorse;
                }
            }

        }

        return codigoTransformado;
    }
}
