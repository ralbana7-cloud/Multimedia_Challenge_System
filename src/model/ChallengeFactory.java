/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class ChallengeFactory 
{
    
    /**
     * دالة ستاتيك لإنشاء التحديات. 
     * نستخدم static لكي نتمكن من استدعاء الدالة مباشرة باسم الكلاس دون الحاجة لإنشاء كائن من المصنع [1].
     */
    public static MultimediaChallenge createChallenge(String type) 
    {
        if (type == null) 
        {
            return null;
        }
        
        // منطق الاختيار بناءً على النوع الممرر
        if (type.equalsIgnoreCase("IMAGE"))
        {
            return new ImageChallenge("assets/multimedia_image.png");
        }
        else if (type.equalsIgnoreCase("VIDEO")) {
            return new VideoChallenge("assets/multimedia_video.mp4");
        }
        
        return null; // في حال كان النوع غير مدعوم
    }
}
