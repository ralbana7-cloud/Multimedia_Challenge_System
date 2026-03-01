/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 * واجهة برمجية تحدد السلوك العام لكافة أنواع التحديات التعليمية.
 * تضمن هذه الواجهة أن أي نوع تحدي جديد سيحتوي على الدوال الأساسية المطلوبة.
 */
public interface MultimediaChallenge {
    
    // دالة مسؤولة عن بدء التحدي وعرض الوسائط الخاصة به
    void startChallenge();

    // دالة مسؤولة عن استقبال إجابة الطالب والتحقق من صحتها
    boolean checkAnswer(String answer);
}
