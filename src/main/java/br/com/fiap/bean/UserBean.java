package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.fiap.dao.UserDao;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {

	private User user = new User();
	private List<User> list;
	
	public UserBean() {
		list = this.list();
	}
	
	public void save() {
		System.out.println(this.user);
		new UserDao().create(user);
	}
	
	public List<User> list(){
		return new UserDao().listAll();
	}
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
