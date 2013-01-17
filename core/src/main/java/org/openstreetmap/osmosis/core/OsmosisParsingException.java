/**
 * 
 */
package org.openstreetmap.osmosis.core;

/**
 * root class of all exceptions raised during command line parsing.
 *
 * @author Johannes Kolb
 *
 */
public class OsmosisParsingException extends OsmosisRuntimeException {
        /**
         *
         */
        private static final long serialVersionUID = -6662927657886744290L;

        /**
         * 
         */
        public OsmosisParsingException() {
                super();
        }

        /**
         * @param message
         */
        public OsmosisParsingException(String message) {
                super(message);
        }

        /**
         * @param cause
         */
        public OsmosisParsingException(Throwable cause) {
                super(cause);
        }

        /**
         * @param message
         * @param cause
         */
        public OsmosisParsingException(String message, Throwable cause) {
                super(message, cause);
        }

        /**
         * format an usable error message to present to the user
         */
        public String FormatErrorMessage() {
                return "Error while parsing parameters:\n" + getMessage();
        }

}
