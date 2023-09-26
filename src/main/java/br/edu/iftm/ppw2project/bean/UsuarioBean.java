package br.edu.iftm.ppw2project.bean;

import br.edu.iftm.ppw2project.entidade.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class UsuarioBean implements Serializable {
    
    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void salvar() {
        usuarios.add(usuario);
        usuario = new Usuario();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistema:", "Salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
