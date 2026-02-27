/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

// استيراد كافة الكلاسات من حزمة model للتمكن من استخدامها هنا
import model.*;

public class Main 
{
    public static void main(String[] args)
    {
        
        System.out.println("--- نظام منصة الوسائط المتعددة التعليمية ---");

        /* 
         * استخدام نمط المصنع (Factory Pattern) لإنشاء التحدي.
         * نمرر النوع "IMAGE" للمصنع ليقوم بإنشاء كائن من نوع ImageChallenge [149، 156].
         */
        MultimediaChallenge myChallenge = ChallengeFactory.createChallenge("IMAGE");
        
        // التحقق من أن المصنع قام بإنشاء الكائن بنجاح
        if (myChallenge != null)
        {
            // تشغيل التحدي (سيظهر في الكونسول: تحميل وتحدي الصورة...) [2]
            myChallenge.startChallenge();
            
            // محاكاة التحقق من إجابة الطالب
            boolean isCorrect = myChallenge.checkAnswer("صورة صحيحة");
            if (isCorrect)
            {
                System.out.println("النتيجة: إجابة الطالب صحيحة! التحدي يعمل بنجاح.");
            }
        } 
        else 
        {
            System.out.println("خطأ: لم يتم التعرف على نوع التحدي.");
        }
    }
}
