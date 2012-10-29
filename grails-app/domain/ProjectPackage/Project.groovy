package ProjectPackage

import UserPackage.User
import IssuePackage.Issue
import MemberPackage.Member

class Project {
    
    //fields
    String  name
    User    author
    String  description
    Date    created_on
    
    //relationships
    static hasIssues = [issues: Issue]
    static hasMembers = [members: Member]
    //constrains
    static constraints = {
    }
    
}
