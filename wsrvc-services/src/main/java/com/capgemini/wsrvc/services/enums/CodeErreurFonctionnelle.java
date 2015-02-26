package com.capgemini.wsrvc.services.enums;

/**
 * Enumérateur contenant les code d'erreur fonctionnelle.
 */
public enum CodeErreurFonctionnelle {

    /** Declaration des erreurs fonctionnelles. **/
    CF11("11", "L'utilisateur n'existe pas", 403),
    CF36("36", "Un des champs a un format invalide", 403),
    CF12("12", "La ressource n'existe pas", 404);

    /**
     * Récupère une valeur de l'enum correspondant a une String passée en
     * paramètre
     * 
     * @param code
     *            le code a trouver
     * @return CodeErreurFonctionnelle
     */
    public static final CodeErreurFonctionnelle getByCode(final String code) {
        if (code != null) {
            for (CodeErreurFonctionnelle b : CodeErreurFonctionnelle.values()) {
                if (code.equalsIgnoreCase(b.code)) {
                    return b;
                }
            }
        }
        return null;
    }

    /** Le code associé à l'erreur. **/
    private String code;
    /** Le http status associé à l'erreur. **/
    private int httpStatus;

    /** Le libelle associé à l'erreur. **/
    private String libelle;

    /**
     * Le constructeur.
     * 
     * @param aCode
     *            le code de l'erreur fonctionnelle
     * @param aLibelle
     *            le libelle de l'erreur fonctionnelle
     * @param aHttpStatus
     *            le http status de l'erreur fonctionnelle
     */
    private CodeErreurFonctionnelle(final String aCode, final String aLibelle,
            final int aHttpStatus) {
        this.code = aCode;
        this.libelle = aLibelle;
        this.httpStatus = aHttpStatus;
    }

    /**
     * @return the code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @return the httpStatus
     */
    public final int getHttpStatus() {
        return httpStatus;
    }

    /**
     * @return the libelle
     */
    public final String getLibelle() {
        return libelle;
    }
}
