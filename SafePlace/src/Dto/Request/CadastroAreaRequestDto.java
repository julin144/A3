/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto.Request;

/**
 *
 * @author Jack
 */
public class CadastroAreaRequestDto 
{

    private String descricao;
    private int dosesRequisitadas;


    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getDosesRequisitadas() 
    {
        return dosesRequisitadas;
    }

    public void setDosesRequisitadas(int dosesRequisitadas) 
    {
        this.dosesRequisitadas = dosesRequisitadas;
    }
 
}
