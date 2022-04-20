package com.azlir.forgot_password.service.framework;

import com.azlir.forgot_password.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
