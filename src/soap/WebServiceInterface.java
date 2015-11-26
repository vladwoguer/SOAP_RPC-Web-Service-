package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * Interface do WebService
 * SOAP (Simple Object Access Protocol)
 * RPC (Remote Procedure Call)
 * 
 * @author Vladwoguer Bezerra
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface WebServiceInterface {
	/**
	 * Retorna uma mensagem referente ao numero de caracteres.
	 * 
	 * @param texto
	 * 				Texto sobre o qual vai ser realizada a contagem
	 * 
	 */
	@WebMethod
	String contaCaracteres(String texto);
}
