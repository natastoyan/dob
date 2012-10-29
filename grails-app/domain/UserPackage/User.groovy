package UserPackage
import RolePackage.Role

class User {

    //fields
    String email
    String password
    String firstName
    String lastName
    
   
    //relationships
    static hasRoles = [roles: Role]
    //constrains
    static constraints = {
        
    }
    
}
