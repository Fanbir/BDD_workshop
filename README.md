
1) Для того, чтобы начать разрабатывать сценарии необходимо заинсталлить:

    Intellij Idea - 
    https://www.jetbrains.com/ru-ru/idea/download/#section=windows
    
    JDK - 
    https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    
    Maven 3.6.0 - 
    https://maven.apache.org/download.cgi
    
    Allure 2.7.0 - 
    https://bintray.com/qameta/generic/allure2/view/files/io/qameta/allure/allure/2.7.0#files/io/qameta/allure/allure/2.7.0
    
    
2) После правильной установки (прописав пути в "системные переменные" и пр...)

    набрав в cmd команды: 
  
    JDK
    
    ![Image alt](https://github.com/Fanbir/BDD_workshop/blob/master/screen/java.jpg)
    
    Maven
    
    ![Image alt](https://github.com/Fanbir/BDD_workshop/blob/master/screen/maven.jpg)
    
    Allure
    
    ![Image alt](https://github.com/Fanbir/BDD_workshop/blob/master/screen/allure.jpg)

 
3) Класс для запуска сценариев CucumberRunner, указываем нужный tags = {"@test4"} для требуемого сценария.

4) После прогона сценарие формируется папка "target" -> "allure-results" 

5) Для генерации "allure report" необходимо перейти в target открыть cmd и выполнить команду "allure serve" => 
   откроется браузер с allure отчетом
   
