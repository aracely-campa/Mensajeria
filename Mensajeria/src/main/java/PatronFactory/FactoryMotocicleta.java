
package PatronFactory;

import dominio.Motocicleta;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 *
 * @author arace
 * Esta clase implementa la interfaz `iFactoryTransporte` para crear objetos de tipo `Motocicleta`.
 */
public class FactoryMotocicleta implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto de tipo `Motocicleta`.
     *
     * @return Una nueva `Motocicleta`.
     */
    @Override
    public Transporte crearTransporte() {
        return new Motocicleta();
    }
}
