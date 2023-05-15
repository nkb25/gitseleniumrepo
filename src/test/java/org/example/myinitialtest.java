package org.example;






import org.example.HomePage;
import org.example.LoginPage;
import org.example.ParticipantDetailPage;
import org.example.Participants;
import org.openqa.selenium.By;
public class myinitialtest 
{
    public static void main(String[]args)
    {
        LoginPage loginpage=new LoginPage();
        HomePage homepage=new HomePage();
        Participants participants=new Participants();
        ParticipantDetailPage participantDetailPage=new ParticipantDetailPage();
        loginpage.openUrl("https://online.btes.co.in/login/index.php").enterUser("").enterPassword("").selectRememberMe().clickLoginButton().clickOnCourse("SDET");
    }
}