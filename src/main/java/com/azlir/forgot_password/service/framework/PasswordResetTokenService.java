package com.azlir.forgot_password.service.framework;

import com.azlir.forgot_password.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
