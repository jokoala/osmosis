/**
 * 
 */
package org.openstreetmap.osmosis.core.cli;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;

/**
 * @author johannes
 *
 */
public class OsmosisParsingException extends OsmosisRuntimeException {

        /**
         *
         */
        private static final long serialVersionUID = 606006077023684686L;
        private int m_pos;
        private String m_argument;
        private String m_errormessage;


        /**
         * 
         */
        public OsmosisParsingException(int pos, String argument, String errormessage) {
                super();
                m_pos = pos;
                m_argument = argument;
                m_errormessage = errormessage;
        }

        /**
         * @return the pos
         */
        public int get_pos() {
                return m_pos;
        }


        @Override
        public String getMessage() {
                return String.format("Parsing error in position %d: %s", m_pos, m_errormessage);
        }

        @Override
        public String getUserfriendlyMessage() {
                return String.format("Parsing error in position %d (%s): %s", m_pos, m_argument, m_errormessage);
        }

        /**
         * @return the m_pos
         */
        public int getM_pos() {
                return m_pos;
        }

        /**
         * @return the m_argument
         */
        public String getM_argument() {
                return m_argument;
        }

        /**
         * @return the m_errormessage
         */
        public String getM_errormessage() {
                return m_errormessage;
        }


}
