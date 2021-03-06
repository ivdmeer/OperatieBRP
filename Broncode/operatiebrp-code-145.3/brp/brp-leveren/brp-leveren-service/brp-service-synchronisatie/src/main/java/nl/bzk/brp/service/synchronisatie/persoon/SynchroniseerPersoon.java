/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.synchronisatie.persoon;

import nl.bzk.brp.service.synchronisatie.SynchronisatieVerzoek;

/**
 * Container interface voor specifieke synchroniseer persoon stappen.
 */
interface SynchroniseerPersoon {

    /**
     * Composite stap om alle logische stappen uit te voeren.
     */
    interface MaakSynchronisatieBerichtService {
        /**
         * @param verzoek verzoek
         * @return resultaat
         */
        MaakSynchronisatieBerichtResultaat verwerkVerzoek(final SynchronisatieVerzoek verzoek);
    }
}
