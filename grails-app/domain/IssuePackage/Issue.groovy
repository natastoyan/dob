package IssuePackage

import  UserPackage.User
import  ProjectPackage.Project
import  IssueTypePackage.IssueType
import  IssueStatusPackage.IssueStatus
import  CommentPackage.Comment



class Issue {
    
    //fields
      Project       project
      String        name
      String        description
      User          author
      IssueType     issueType
      IssueStatus   issueStatus
      
      
    //relationships 
      static hasComments = [comments: Comment]
    
    //constrains
        static constraints = {
    }
    
}
