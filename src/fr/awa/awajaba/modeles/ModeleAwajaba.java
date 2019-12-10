/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba.modeles;

import fr.awa.awajaba.entities.EvaluationRepas;

/**
 *
 * @author root
 */
public class ModeleAwajaba  {
    private ModeleAwajaba modele = null;
    private EvaluationRepas Eval;

    public ModeleAwajaba(EvaluationRepas Eval) {
        this.Eval = Eval;
    }
    
    

    public ModeleAwajaba getModele() {
        return modele;
    }
    
    public EvaluationRepas getEvaluations() {
        return this.getEvaluations();
    }
    
    public void setEvaluations(EvaluationRepas uneEvaluation) {
        this.Eval.setNote(uneEvaluation.getNote());
        this.Eval.setCommentaire(uneEvaluation.getCommentaire());
        
    }
}
