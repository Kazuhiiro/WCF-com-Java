using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TesteWCF.modelo;

namespace TesteWCF.Modelo
{
    public class Controle
    {
        public String mensagem;

        public String executar(String lado1, String lado2, String lado3)
        {
            this.mensagem = "";
            Validacao validacao = new Validacao();
            validacao.validar(lado1, lado2, lado3);
            if(validacao.mensagem.Equals(""))
            {
                Triangulo triangulo = new Triangulo();
                this.mensagem = triangulo.verificarTriangulo(validacao.l1, validacao.l2, validacao.l3);
            }
            else
            {
                this.mensagem = validacao.mensagem;
            }
            return mensagem;
        }
    }
}