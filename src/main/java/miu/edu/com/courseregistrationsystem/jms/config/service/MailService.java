package miu.edu.com.courseregistrationsystem.jms.config.service;


import miu.edu.com.studentregistrationsystem.jms.config.Mail;

public interface MailService {
    void sendEmail(Mail mail);
}
