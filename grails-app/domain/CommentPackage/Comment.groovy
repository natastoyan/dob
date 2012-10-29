package CommentPackage

import UserPackage.User
import IssuePackage.Issue

class Comment {

    //fields
    Issue  issue
    User   author
    String comment
    
    //relationships
    
    //constrains
    static constraints = {
    }
}
