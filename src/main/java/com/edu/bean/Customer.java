package com.edu.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
   
    private Integer id;

    
    private String userName;

   
    private String userAddress;

  
    private String userPwd;
    
    private String[] loves;
    
    private List<String> lists;
    
    private Map<String,Object> maps;
    
    private Set<String> sets;
    
    private Properties props;
    
    
    
    public Customer() {
    	System.out.println("customer±»ÊµÀý»¯");
    	
    }
 

	public Customer(Integer id, String userName, String userAddress, String userPwd) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPwd = userPwd;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String[] getLoves() {
		return loves;
	}


	public void setLoves(String[] loves) {
		this.loves = loves;
	}


	public List<String> getLists() {
		return lists;
	}


	public void setLists(List<String> lists) {
		this.lists = lists;
	}


	public Map<String, Object> getMaps() {
		return maps;
	}


	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}


	public Set<String> getSets() {
		return sets;
	}


	public void setSets(Set<String> sets) {
		this.sets = sets;
	}


	public Properties getProps() {
		return props;
	}


	public void setProps(Properties props) {
		this.props = props;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", userAddress=" + userAddress + ", userPwd=" + userPwd
				+ ", loves=" + Arrays.toString(loves) + ", lists=" + lists + ", maps=" + maps + ", sets=" + sets
				+ ", props=" + props + "]";
	}


	
     

	


	
    
    

   
}