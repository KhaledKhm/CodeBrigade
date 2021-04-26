/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.entities;

/**
 *
 * @author OneEffect007
 */
public class Quiz {
    private int id,idEvaluation,reponse;
    private String question,choix1,choix2,choix3;

    public Quiz() {
    }

    public Quiz(int idEvaluation, int reponse, String question, String choix1, String choix2, String choix3) {
        this.idEvaluation = idEvaluation;
        this.reponse = reponse;
        this.question = question;
        this.choix1 = choix1;
        this.choix2 = choix2;
        this.choix3 = choix3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getReponse() {
        return reponse;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoix1() {
        return choix1;
    }

    public void setChoix1(String choix1) {
        this.choix1 = choix1;
    }

    public String getChoix2() {
        return choix2;
    }

    public void setChoix2(String choix2) {
        this.choix2 = choix2;
    }

    public String getChoix3() {
        return choix3;
    }

    public void setChoix3(String choix3) {
        this.choix3 = choix3;
    }

    @Override
    public String toString() {
        return "Quiz{" + "id=" + id + ", idEvaluation=" + idEvaluation + ", reponse=" + reponse + ", question=" + question + ", choix1=" + choix1 + ", choix2=" + choix2 + ", choix3=" + choix3 + '}';
    }
    
    
    
}
