package soap;

import javax.xml.ws.Endpoint;

/**
 * Publisher de nosso WebService.
 * 
 * @author Vladwoguer Bezerra
 *
 */
public class WebServicePublisher {

	/**
	 * Coloca no ar.
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9012/ws/conta", new WebServiceImplementation());
		// Pode se acessar o WSDL desse WS atraves de http://localhost:9012/ws/conta?wsdl
		// Para gerar um cliente use o wsimport da jdk
		// wsimport -keep http://localhost:9012/ws/conta?wsdl
	}
}
