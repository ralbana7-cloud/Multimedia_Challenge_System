/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class ImageChallenge implements MultimediaChallenge 
{
    // خاصية خاصة لتخزين مسار الصورة (Information Hiding)
    private String imagePath;

    // مشيد الكلاس (Constructor) لتعيين مسار الصورة عند الإنشاء
    public ImageChallenge(String path)
    {
        this.imagePath = path;
    }

    @Override
    public void startChallenge()
    {
        // منطق بدء التحدي: عرض الصورة للطالب
        System.out.println("تحميل وتحدي الصورة من المسار: " + imagePath);
    }

    @Override
    public boolean checkAnswer(String answer)
    {
        // التحقق مما إذا كانت إجابة الطالب مطابقة للحل الصحيح
        return answer.equalsIgnoreCase("صورة صحيحة");
    }
}
