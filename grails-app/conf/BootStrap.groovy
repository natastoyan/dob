import  UserPackage.User
//import  ProjectPackage.Project
import  IssueTypePackage.IssueType
import  IssueStatusPackage.IssueStatus


class BootStrap {

    def init = { servletContext ->
        
        //создаем пару проектов
 
        
        //создаем админа
        //new User(email: "admin@dob.com", firstName: "Admin", lastName: "Adminov").save()
        
        //создаем типы задач
        new IssueType(type: "Проектироваие").save()
        new IssueType(type: "Разработка").save()
        new IssueType(type: "Тестирование").save()
        new IssueType(type: "Документация").save()
        new IssueType(type: "Ошибка").save()
        new IssueType(type: "Поддержка").save()
        new IssueType(type: "Улучшение").save()
        
        //создаем статусы задач
        new IssueStatus(status: "Создана").save()
        new IssueStatus(status: "Назачена").save()
        new IssueStatus(status: "Выполняется").save()
        new IssueStatus(status: "Готова").save()
        new IssueStatus(status: "Протестирована").save()
        new IssueStatus(status: "Закрыта").save()
    }
    
    def destroy = {
    }
}
