
package PatronFactory;

import dominio.Paquete;
import dominio.Sobre;
import interfaces.iFactoryPaquete;

/**
 *
 * @author arace
 * Esta clase implementa la interfaz `iFactoryPaquete` para crear objetos de tipo `Sobre`.
 */
public class FactorySobre implements iFactoryPaquete {

    /**
     * Crea un nuevo objeto de tipo `Sobre`.
     *
     * @return Un nuevo `Sobre`.
     */
    @Override
    public Paquete crearPaquete() {
        return new Sobre();
    }
}

