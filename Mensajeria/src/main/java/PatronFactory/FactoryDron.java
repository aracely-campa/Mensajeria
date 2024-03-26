
package PatronFactory;

import dominio.Dron;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 *
 * @author arace
 * Esta clase implementa la interfaz `iFactoryTransporte` para crear objetos de tipo `Dron`.
 */
public class FactoryDron implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto de tipo `Dron`.
     *
     * @return Un nuevo objeto `Dron`.
     */
    @Override
    public Transporte crearTransporte() {
        return new Dron();
    }
}
