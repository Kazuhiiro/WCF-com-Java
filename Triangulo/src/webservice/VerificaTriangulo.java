package webservice;

public class VerificaTriangulo
{
    public static String verificarTriangulo(java.lang.String lado1, java.lang.String lado2, java.lang.String lado3) {
        webservice.Service1 service = new webservice.Service1();
        webservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.verificarTriangulo(lado1, lado2, lado3);
    }
}
