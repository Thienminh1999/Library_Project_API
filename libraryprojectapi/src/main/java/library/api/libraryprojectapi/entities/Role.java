package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLROLE")
public class Role {
    @Id
	@Column(name = "ROLEID", length = 10, nullable = false)
    private String roleID;
    @Column(name = "ROLENAME", length = 10, nullable = false)
    private String roleName;

    public Role(String roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    
}
