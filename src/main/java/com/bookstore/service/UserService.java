package com.bookstore.service;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	void creadePasswordResetTokenForUser(final User user, final String token);
}
