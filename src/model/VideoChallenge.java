/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class VideoChallenge implements MultimediaChallenge
{
    private String videoUrl;

    public VideoChallenge(String url) 
    {
        this.videoUrl = url;
    }

    @Override
    public void startChallenge() 
    {
        // منطق بدء التحدي: تشغيل الفيديو
        System.out.println("بدء تشغيل تحدي الفيديو من الرابط: " + videoUrl);
    }

    @Override
    public boolean checkAnswer(String answer) 
    {
        return answer.equalsIgnoreCase("فيديو صحيح");
    }
}

