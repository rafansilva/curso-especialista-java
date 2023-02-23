import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nf = new NotaFiscal("abc", 500);
        var nfBolaFutebol = new NotaFiscalProduto("Bola de Futebol", 300, 50);
        var nfReparoRoda = new NotaFiscalServico("Reparo da Roda", 1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoRoda, nf);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoRoda.calcularImpostos());
    }
}
